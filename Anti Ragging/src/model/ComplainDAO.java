package model;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;

public class ComplainDAO {
	public Session getSession() {
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		Session session = con.buildSessionFactory().openSession();
		return session;
	}
	
	public void addComplain(Complain complain) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.persist(complain);
		transaction.commit();
		session.close();
	}
	
	public Complain getComplainById(int id) {
		Session session = getSession();
		Complain comp = (Complain) session.get(Complain.class, id);
		session.close();
		return comp;
	}
	
	public void getAllComplains() {
		Session session = getSession();
		Query q = session.createQuery("FROM complain");
			session.close();
	}
	public int getComplainsCount() {
		Session session = getSession();
		int n = (int)session.createCriteria("Complain").setProjection(Projections.rowCount()).uniqueResult();
		session.close();
		return n;
	}
}

