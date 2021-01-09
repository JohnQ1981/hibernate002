package TechProEd.MyHibernate;





import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch09 {

	public static void main(String[] args) {
		Students09 st1 = new Students09();
		Students09 student = new Students09();

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students09.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		/*
		 CRUD= create, read , update , delete

		 1) Create:==> @Entity+@Id+RunnerSave Class + Execute.
		 2) to Create Records:  Create Object + use setters + save().


		 Read:==>  1) HQL Query + createQuery() + getResultList() , getSingleResult(), list(), uniqueResult().
		 			2) Use session methods like get()

		 Update : ==> we will learn it today.

		 Delete: 1) HQL Query + createQuery() + executeUpdate();
		 		2) Use session methods like delete(Object Name>) or delete (<"Entity Name">, <Object Name>)



	Alter is done, 
	we need to Learn UPDATE

	to Ways to Update
	1 use hql
	2. use setter




		 */


		//1)Update the name of the student whose id is 11
		//1st way to UPDATE
		//		String hql1 = "UPDATE  Students09 s SET s.name ='Ali Can' WHERE s.id =11";
		//		int numberof=session.createQuery(hql1).executeUpdate();
		//		System.out.println("Number of effected Records: "+ numberof);


		//2nd Way: Fetch the record--> use setter -->use update() to update the record


		//		st1= session.get(Students09.class, 12);
		//		st1.setName("Veli Han");
		//		session.update(st1);

		//2)Update the math grades 
		//of the students to 100 whose mathGrades are more than 90

		//		String hql2="UPDATE Students09 s SET s.mathGrade =100 WHERE s.mathGrade >90";
		//		int set100=session.createQuery(hql2).executeUpdate();
		//		System.out.println(set100);


		//2)Update the math grades 
		//of the students to 100 whose mathGrades are less than 50

		//		String hql3= "FROM Students09 s  WHERE s.mathGrade <50";
		//		List<Students09>rs1= session.createQuery(hql3).getResultList();
		//
		//		for(Students09 w: rs1) {
		//			w.setMathGrade(500);
		//			session.update(w);
		//
		//
		//		}

		//		st1= session.get(Students09.class, st1.getMathGrade());
		//		st1.setMathGrade(100);



		//Update the names of the students to "Juniors" whose id ares less than 12
		String hql4="UPDATE Students09 s SET s.name ='Juniors' WHERE s.id<5 ";
		int n4=session.createQuery(hql4).executeUpdate();
		System.out.println(n4);


		String hql5="FROM Students09 s WHERE s.id>45";
		List<Students09>rs2=session.createQuery(hql5).getResultList();
		for(Students09 w: rs2) {
			w.setName("Juniors");
			session.update(w);
		}

		for(int i =1 ; i<11;i++) {
			student = session.get(Students09.class, i);
			student.setName("Junior");
			session.update(student);
		}


		tx.commit();

	}

}
