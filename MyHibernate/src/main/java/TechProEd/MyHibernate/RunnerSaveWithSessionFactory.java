package TechProEd.MyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSaveWithSessionFactory {

	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students12.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();

			Students12 student1 = new Students12();
			student1.setStd_id(1001);
			student1.setSt_name("Ali Can");
			student1.setMathGrade(87);
			student1.setSsn("852852852");
			student1.setState("NY");
			
			Students12 student2 = new Students12();
			student2.setStd_id(1002);
			student2.setSt_name("Kemal Kuzu");
			student2.setMathGrade(93);
				
		    session.save(student1);	 
		    session.save(student2);
		
			tx.commit();
			
	}

}