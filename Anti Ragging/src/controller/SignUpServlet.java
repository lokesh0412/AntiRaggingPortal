package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.ibm.icu.text.SimpleDateFormat;

import model.UserDetail;
import model.UserDetailDAO;
import model.UserLogin;
import model.UserLoginDAO;
import model.UserRole;
import model.UserRoleDAO;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("signup servlet is called");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String college=request.getParameter("college");
		String dob=request.getParameter("dob");
		System.out.println(dob);
		String course=request.getParameter("course");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		System.out.println(email);
		String password=request.getParameter("password");
		String phoneNumber=request.getParameter("phoneNo");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			date=sdf.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    UserLogin user=new UserLogin(email,password);
	    UserRole urole=new UserRole("student","active");
	    user.setUserRole(urole);
	    //UserRoleDAO urdao=new UserRoleDAO();
	    UserLoginDAO uldao=new UserLoginDAO();
	    UserDetail udetail=new UserDetail(fname, lname,date, college,  course, address, email,phoneNumber );
	    user.setUserDetail(udetail);
	    uldao.addUserLogin(user);
	    request.getRequestDispatcher("index.html").forward(request, response);
	}

}
