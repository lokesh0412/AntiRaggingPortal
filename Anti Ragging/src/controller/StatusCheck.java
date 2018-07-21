package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.icu.text.SimpleDateFormat;

import model.Complain;
import model.ComplainDAO;
import model.ComplaintResponse;
import model.ComplaintResponseDAO;

@WebServlet("/StatusCheck")
public class StatusCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StatusCheck() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int complainID=Integer.parseInt(request.getParameter("complainId"));
	    ComplaintResponse result = new ComplaintResponseDAO().getResponseByComplaintId(complainID);
	    if(result!=null) {
	    	request.setAttribute("complainId", result.getComplain().getId());
	    	request.setAttribute("status", result.getStatus());
	    	request.setAttribute("message", result.getAction());
	    	response.getWriter().print(result.getStatus());
	    	//request.getRequestDispatcher("status.jsp").include(request, response);
	    }
	}
}
