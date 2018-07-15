package controller;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anti.ragging.ComplainIdGenerator;

import model.Complain;
import model.ComplainDAO;

/**
 * Servlet implementation class ComplainServlet
 */
@WebServlet("/ComplainServlet")
public class ComplainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComplainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String 	ComplainantName = request.getParameter("complaintName");
		String victimName = request.getParameter("victimName");
		String	email = request.getParameter("email");
		String	mobileNumber = request.getParameter("phoneNo");
		String	collegeName = request.getParameter("college");
		String 	yourAddress = request.getParameter("city");
		int	pincode = Integer.parseInt(request.getParameter("pinCode"));
		String 	state = request.getParameter("state");
		Date date = new Date();
		String raggingDetails = request.getParameter("complaint");
	    byte[]	photoProof=new byte[0];
	    int id=new ComplainIdGenerator().generateComplainId();
	    Complain complain=new Complain(id,ComplainantName,victimName,email,mobileNumber,collegeName,yourAddress,pincode,state,date,raggingDetails,photoProof);
	    		ComplainDAO cdao=new ComplainDAO();
	    		cdao.addComplain(complain);
	}

}
