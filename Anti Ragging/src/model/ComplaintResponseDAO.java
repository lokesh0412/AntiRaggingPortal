package model;

import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;

public class ComplaintResponseDAO {
		public Session getSession() {
			AnnotationConfiguration con = new AnnotationConfiguration();
			con.configure("hibernate.cfg.xml");
			Session session = con.buildSessionFactory().openSession();
			return session;
		}
		
	public void addComplaintResponse(ComplaintResponse response) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.persist(response);
		transaction.commit();
		session.close();
	}
	
	public ComplaintResponse getResponseByComplaintId(int id) {
		Session session = getSession();
		ComplaintResponse response = (ComplaintResponse) session.get(ComplaintResponse.class, id);
		session.close();
		return response;
	}
	
	public int getComplaintResponseCount() {
		Session session = getSession();
		int n = (int)session.createCriteria("ComplaintResponse").setProjection(Projections.rowCount()).uniqueResult();
		session.close();
		return n;
	}
}

