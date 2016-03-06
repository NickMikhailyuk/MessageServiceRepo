package com.ms.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
        PrintWriter pw = response.getWriter();
        pw.println(              
        		
        		"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                "http://www.w3.org/TR/html4/loose.dtd\">\n" +
            "<html> \n" +
              "<head> \n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                  "charset=ISO-8859-1\"> \n" +
                "<title> Message Service  </title> \n" +
              "</head> \n" +
              "<body> <div align='center'> \n" +
                "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                  "Username: " + username + " <br> " + 
                  "Password: " + password +
              "</font></body> \n" +
            "</html>");
	}
}

