package model;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class UserDetailDAO {
		public Session getSession() {
			AnnotationConfiguration con = new AnnotationConfiguration();
			con.configure("hibernate.cfg.xml");
			Session session = con.buildSessionFactory().openSession();
			return session;
		}

		public void addUserDetail(UserDetail user) {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();
			session.close();
		}
		
		public UserDetail getUserDetailById(int id) {
			Session session = getSession();
			UserDetail user = (UserDetail) session.get(UserDetail.class, id);
			session.close();
			return user;
		}
		
		public int removeUserDetailById(int id) {
			Session session = getSession();
			Transaction transaction = session.beginTransaction();
			Query q = session.createQuery("DELETE UserDetail WHERE id = :ID");
			q.setParameter("ID", id);
			int result = q.executeUpdate();
			transaction.commit();
			session.close();
			return result;
		}

	}

