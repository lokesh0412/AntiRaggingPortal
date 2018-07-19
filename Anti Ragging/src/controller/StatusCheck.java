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
	    Complain complain = new ComplainDAO().findComplainStatusByComplainId(complainID);
		PrintWriter out = response.getWriter();
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(d);
		String status=complain.getResponse().getStatus();
		d=complain.getRegisteredOn();
		out.print("<table border=0><tr><th>");
		out.print("CompalainId");
		out.print("</th><th>");
		out.print("Date Of Complain");
		out.print("</th><th>");
		out.print("Status");
		out.print("</th></tr><tr>");
		out.print("<td>");
		out.print(complainID+"</td");
		out.print("<td>"+date+"</td>");
		if(complain.getResponse()!=null) {
		out.print("<td>"+status+"</td>");
		}
		else
		{
			out.print("<td>"+"currently no status"+"</td>");
		}
		out.print("</tr></table>");
		}
}
