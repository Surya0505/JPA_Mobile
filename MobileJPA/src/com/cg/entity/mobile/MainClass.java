package com.cg.entity.mobile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Mobile mobile = new Mobile();
		mobile.setMobileName("OnePlus 7T");
		mobile.setPrice(45000);
		mobile.setImeiNo("IMEI159632478");
		manager.persist(mobile);
		
		Mobile mobile1 = new Mobile();
		mobile1.setMobileName("Nokia");
		mobile1.setPrice(15000);
		mobile1.setImeiNo("IMEI357896214");
		manager.persist(mobile1);
		
		Mobile mobile2 = new Mobile();
		mobile2.setMobileName("Samsung");
		mobile2.setPrice(40000);
		mobile2.setImeiNo("IMEI951236478");
		manager.persist(mobile2);
		
		Mobile mobile3 = new Mobile();
		mobile3.setMobileName("Redmi");
		mobile3.setPrice(15000);
		mobile3.setImeiNo("IMEI753214698");
		manager.persist(mobile3);
		
		Mobile mobile4 = new Mobile();
		mobile4.setMobileName("Vivo");
		mobile4.setPrice(25000);
		mobile4.setImeiNo("IMEI852147963");
		manager.persist(mobile4);
		
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Details Added");
		factory.close();
	}

}
