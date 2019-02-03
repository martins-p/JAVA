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

@WebServlet(urlPatterns = "/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet { // Login servlet handles doGet and doPost

	private TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		todoService.deleteTodo(new Todo(request.getParameter("todo")));
		response.sendRedirect("/list-todo.do");
	}
}
