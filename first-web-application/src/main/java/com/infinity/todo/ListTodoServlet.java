package com.infinity.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infinity.login.LoginService;
import com.infinity.todo.TodoService;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet { // Login servlet handles doGet and doPost

	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("todos", todoService.retrieveTodos()); // getSession = create session | setting
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response); // Forwarding request to JSP
	}
}
