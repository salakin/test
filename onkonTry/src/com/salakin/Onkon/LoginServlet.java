package com.salakin.Onkon;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String UserName = request.getParameter("userName");
		
		String Password = request.getParameter("password");
		DBupdate oDBupdate = new DBupdate();
		oDBupdate.Update(UserName, Password);
		
		

	}

}
