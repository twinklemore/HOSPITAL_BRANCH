package com.jsp.hospital.branch;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalZone {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("devesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch=new Branch();
		branch.setBranch_name("Nerul-branch");
		branch.setBranch_city("NERUL");
		branch.setC_no(87690854);
		
		Hospital hospital1=new Hospital();
		hospital1.setHospital_name("APOLLO");
		hospital1.setCity("VASHI");
		
		Hospital hospital2=new Hospital();
		hospital2.setHospital_name("D.Y.PATIL.HOSPITAL");
		hospital2.setCity("PUNE");
		
		Hospital hospital3=new Hospital();
		hospital3.setHospital_name("FORTIS HEALTHCARE");
		hospital3.setCity("GURGOAN");
		
		Hospital hospital4=new Hospital();
		hospital4.setHospital_name("AIIMS");
		hospital4.setCity("DELHI");
		
		ArrayList<Hospital>hospitals=new ArrayList<Hospital>();
		hospitals.add(hospital1);
		hospitals.add(hospital2);
		hospitals.add(hospital3);
		hospitals.add(hospital4);
		
		//to get all the list in the table
		branch.setHospitals(hospitals);
		
		entityTransaction.begin();
		entityManager.persist(hospital1);
		entityManager.persist(hospital2);
		entityManager.persist(hospital3);
		entityManager.persist(hospital4);
		entityManager.persist(branch);
		entityTransaction.commit();
		
	}

}
