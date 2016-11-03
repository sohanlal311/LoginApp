package com.sohan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sohan.dto.User;
import com.sohan.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userId, passwd);
		if (result) {
			User user = loginService.getUser(userId);
			// request.getSession().setAttribute("user", user);
			// response.sendRedirect("success.jsp");
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
