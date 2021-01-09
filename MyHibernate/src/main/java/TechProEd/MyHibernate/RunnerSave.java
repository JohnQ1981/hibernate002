package TechProEd.MyHibernate;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {

	public static void main(String[] args) {
		
		
		Students12 st2= new Students12();

Configuration con = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Students12.class);

	SessionFactory sf = con.buildSessionFactory();
	
	Session session = sf.openSession();
	
	Transaction tx = session.beginTransaction();
	st2.setSt_name("Veli Can");
	st2.setStd_id(102);
	st2.setSsn("123456789");
	st2.setState("TX");
	session.save(st2);
	Random r = new Random();
	for(int i=1; i<15; i++) {
		Students12 st1= new Students12();
		st1.setStd_id(i);
		st1.setSt_name("Name" + i);
		st1.setMathGrade(r.nextInt(100));
		st1.setSsn("12345"+r.nextInt(i)+"654");
		st1.setState("MO");
		session.save(st1);
		
	}
	
	for(int k =16; k<50; k++) {
		Students12 st3 = new Students12();
		st3.setStd_id(k);
		st3.setMathGrade(k+25);
		st3.setSt_name("Seniors: "+ k);
		st3.setMathGrade(r.nextInt(250));
		st3.setSsn("987654"+r.nextInt(k)+"654");
		st3.setState("MO");
		session.save(st3);
	}
	
	
	tx.commit();
	
	sf.close();
	session.close();
	
	

	}

}
