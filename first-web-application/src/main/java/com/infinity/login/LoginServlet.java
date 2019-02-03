package com.infinity.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infinity.login.LoginService;
import com.infinity.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet { //Login servlet handles doGet and doPost

	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String name = request.getParameter("name"); //Gets parameter from browser to
		// servlet (here: stores in variable). Servlet puts it as an attribute in
		// request.
		// request.setAttribute("name", request.getParameter("name"));

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response); // Forwarding request to
																								// JSP
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name"); // Taking request and putting in variable
		String password = request.getParameter("password");

		boolean isUserValid = userValidationService.isUserValid(name, password);

		if (isUserValid) // if user is valid, send him to welcome.jsp
		{
			request.getSession().setAttribute("name", name); //Sets attribute in request (here: session) before redirecting
			response.sendRedirect("/list-todo.do"); //Sends user to Todo servlet via URL
		} else {
			request.setAttribute("errorMessage", "Invalid credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}
