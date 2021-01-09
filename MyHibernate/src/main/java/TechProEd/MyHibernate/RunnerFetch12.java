package TechProEd.MyHibernate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class RunnerFetch12 {

	public static void main(String[] args) {

		//Students12 st1 = new Students12();
		Students12 st2 = new Students12();
		
		Random r = new Random();
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Students12.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction tx = session.beginTransaction();
		
//		String hql1="FROM Students12 s WHERE s.std_id>10";
//		List<Students12> rs=session.createQuery(hql1).getResultList();
//		for(Students12 w: rs) {
//			w.setSt_name("Junior");
//			session.update(w);			
//		}
		
//		for(int i=1; i<5; i++) {
//			st1=session.get(Students12.class, i);
//			st1.setMathGrade(200);
//			st1.setSt_name("MyFriends"+i);
//		}
		
//		for(int k =40; k<50; k++) {
//			st2=session.get(Students12.class, k);
//			st2.setMathGrade(300+k);
//			st2.setSt_name("MIT:"+ k );
//			st2.setMathGrade(r.nextInt(k));
//		}
//		
		
//		for(int j=1; j<50; j++) {
//			st2=session.get(Students12.class, j);
//			st2.setSsn("1234"+j+"4541");
//			st2.setState("It is of Course:" +r.nextInt(j)+"MO");
//		}
		String hql2="SELECT s.ssn FROM Students12 s ";
		List<Students12>rs1= session.createQuery(hql2).getResultList();
		System.out.println(rs1);
//		for(Students12 w: rs1) {
//			w.setSsn("1234");
//			//w.setState("It is of Course:" +r.nextInt(45)+"MO");
//			session.update(w);
//			
//		}
		for (int t=1;t<5; t++) {
			st2=session.get(Students12.class, t);
			st2.setState("MO");
			//st2.setSsn("987654321");
			session.update(st2);
			
		}
		
		tx.commit();
		sf.close();
		session.close();
		

	}

}
