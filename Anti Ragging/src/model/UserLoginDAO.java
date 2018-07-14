package model;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
public class UserLoginDAO {

	public Session getSession() {
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		Session session = con.buildSessionFactory().openSession();
		return session;
	}
	public void addUserLogin(UserLogin userLogin) {
		Session session = getSession();
		Transaction trans = session.beginTransaction();
		session.persist(userLogin);
		trans.commit();
		session.close();
	}
	public UserLogin findUserLoginByUserName(String username) {
		Session session = getSession();
		Query q = session.createQuery("SELECT userLogin FROM UserLogin userLogin WHERE userLogin.userName=:u");
		q.setString("u",username);
		UserLogin u=null;
		for(Object x:q.list()) {
			 u=(UserLogin)x;
		}
		return u;
	}
	public String authenticateUser(UserLogin userLogin) {
		System.out.println(userLogin);
		String validateUser="credentials does not exits";
		Session session = getSession();
		Query q = session.createQuery("SELECT user FROM UserLogin user WHERE user.username=:u and user.password=:p");
		q.setString("u", userLogin.getUsername());
		q.setString("p", userLogin.getPassword());
		List result = q.list();
		UserLogin user=null;
		for(Object x:result) {
			user=(UserLogin) x;
		}
		System.out.println(user);
		if(user!=null) {
			if(user.getUserRole().getRoleType().equals("admin")) {
				validateUser="admin_type";
			}
			else if(user.getUserRole().getRoleType().equals("student")) {
				validateUser="student_type";
			}
		}
		System.out.println(validateUser);
		return validateUser;
	}
}
