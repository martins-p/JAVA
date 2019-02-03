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

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet { // Login servlet handles doGet and doPost

	private TodoService todoService = new TodoService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String newTodo = request.getParameter("todo"); //saves input/parameter as String
		todoService.addTodo(new Todo(newTodo)); //assigns value of string to new "todo" object |This part stores the "todo"
		
		response.sendRedirect("/list-todo.do"); //Because of this POST is not executed, only GET (page can be refreshed, Submit is not duplcated)
	}
}
