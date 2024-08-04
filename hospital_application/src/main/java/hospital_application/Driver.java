package hospital_application;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("avadesh");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital1 = new Hospital();
		hospital1.setId(101);
		hospital1.setName("Aimms");
		hospital1.setAddress("Delhi");
		
		Branch branch1 = new Branch();
		branch1.setId(1);
		branch1.setLocation("Delhi");
		branch1.setName("Bq4");
		branch1.setHospital(hospital1);
		
		Branch branch2 = new Branch();
		branch2.setId(2);
		branch2.setLocation("Pune");
		branch2.setName("Bq4");
		branch2.setHospital(hospital1);
		
		
	    List<Branch> branch = new ArrayList<>();
	    branch.add(branch1);
	    branch.add(branch2);
	    
	    hospital1.setBranch(branch);
	    
	    
//	    et.begin();
//	    em.persist(hospital1);
//	    em.persist(branch1);
//	    em.persist(branch2);
//	    et.commit();
//	    
	    
	    Address address1 = new Address();
	    address1.setAid(123);
	    address1.setAddress("Local Street 123");
	    address1.setBranch(branch1);
	    
	    Address address2 = new Address();
	    address2.setAid(124);
	    address2.setAddress("Upper Street 123");
	    address2.setBranch(branch2);
	    
	    branch1.setAddress(address1);
	    branch2.setAddress(address2);
	    
	    
	    Counter counter1 = new Counter();
	    counter1.setCounterId(12345);
	    counter1.setCounterLocation("1st floor");
	    counter1.setCounterType("Medical");
	    counter1.setBranch_id(branch1);
	    counter1.setBranch_id(branch2);
	    
	    Counter counter2 = new Counter();
	    counter2.setCounterId(1208);
	    counter2.setCounterLocation("2st floor");
	    counter2.setCounterType("General Store");
	    counter2.setBranch_id(branch2);
	    counter2.setBranch_id(branch1);
	    
	    List<Counter> counter = new ArrayList<>();
	    counter.add(counter1);
	    counter.add(counter2);
	    
	    branch1.setCounter(counter);
	    branch2.setCounter(counter);
	    
	    
	     MedOrders order1 = new MedOrders();
	     order1.setOrderId(3434);
	     order1.setOrderType("Medecine");
	     order1.setOrderCost(2232);
	     order1.setCounter(counter1);
	   
	     MedOrders order2 = new MedOrders();
	     order2.setOrderId(4645);
	     order2.setOrderType("Snacks");
	     order2.setOrderCost(225);
	     order2.setCounter(counter2);
	     
	     List<MedOrders> orders = new ArrayList<>();
	     orders.add(order1);
	     orders.add(order2);
	     
	     counter1.setMedOrders(orders);
	     counter2.setMedOrders(orders);
	     
	     Item item1 = new Item();
	     item1.setItemId(23123);
	     item1.setItemType("Paracetamol");
	     item1.setItemCost(100);
	     item1.setOrders(orders);
	     
	   
	     Item item2 = new Item();
	     item2.setItemId(2442);
	     item2.setItemType("Oil");
	     item2.setItemCost(100);
	     item1.setOrders(orders);
	     
	     List<Item> items = new ArrayList<>();
	     items.add(item1);
	     items.add(item2);
		
	     order1.setItem(items);
	     order2.setItem(items);
	     
	     Person person1 = new Person();
	     person1.setPersonId(4545);
	     person1.setName("yah");
	     person1.setGender("Male");
	     person1.setCounter_person(counter);
	     counter1.setPerson(person1);
	     
	     
	     Person person2 = new Person();
	     person2.setPersonId(3335);
	     person2.setName("yash");
	     person2.setGender("Male");
	     person2.setCounter_person(counter);
	     counter2.setPerson(person2);
	     
	     et.begin();
	     em.persist(hospital1);
	     em.persist(branch1);
	     em.persist(branch2);
	     em.persist(address1);
	     em.persist(address2);
	     em.persist(counter1);
	     em.persist(counter2);
	     em.persist(order1);
	     em.persist(order2);
	     em.persist(item1);
	     em.persist(item2);
         em.persist(person1);
         em.persist(person2);
         et.commit();
         
         System.out.println("Inserted Sucessfully");
	     
	}

}
