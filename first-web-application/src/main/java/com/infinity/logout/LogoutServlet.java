package com.infinity.logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infinity.login.LoginService;
import com.infinity.todo.TodoService;

@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet { //Login servlet handles doGet and doPost


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response); // Forwarding request to
																								// JSP
	}
}
