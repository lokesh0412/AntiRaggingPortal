package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserLogin;
import model.UserLoginDAO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		UserLogin userLogin = new UserLogin();
		userLogin.setUsername(username);
		userLogin.setPassword(password);
	    String validateUser=new UserLoginDAO().authenticateUser(userLogin);
	    if(validateUser.equals("admin_type")) {
	    	HttpSession session = request.getSession();
	    	session.setMaxInactiveInterval(1*60);
	    	session.setAttribute("username", username);
	    	session.setAttribute("password", password);
	        request.getRequestDispatcher("/admin_home.jsp").forward(request, response);
	    }
	    else if(validateUser.equals("student_type")) {
	    	HttpSession session = request.getSession();
	    	session.setMaxInactiveInterval(10*60);
	    	session.setAttribute("username", username);
	    	session.setAttribute("password", password);
	        request.getRequestDispatcher("/student_home.jsp").forward(request, response);	    	
	    }
	    else
	    {
	     request.setAttribute("errMessage", validateUser);
	     request.getRequestDispatcher("/login.html").forward(request, response);
	    }
	
	}
}