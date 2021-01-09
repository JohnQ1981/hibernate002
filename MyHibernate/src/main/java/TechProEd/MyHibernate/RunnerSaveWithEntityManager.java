package TechProEd.MyHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RunnerSaveWithEntityManager {

	public static void main(String[] args) {
		// in hibernate we were creating SessionFactory, in JPA we will create EntityManagerFactory
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("pu");
		//in hibernate we were creating Session object by Using SessionFactory object
		// in JPA , we will create EntitiyManager object by using EntitiyManagerFactory object
		
		EntityManager em= emf.createEntityManager();

		
		//In Hibernate we were beginiingn transaction by using session object
		//in JPA, we will begin Transaction by using EntityManager object
		
		em.getTransaction().begin();
		
		//In hibernate after begining Trnsaction we were commiting it
		// The same will be done in JPA
		//*Most of the Times we will use JPA for DML Statements in DB.
		
		
		
		
		
		
		
		
		em.getTransaction().commit();
		
		
			
	}

}
