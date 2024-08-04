package hospital_application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("avadesh");
		EntityManager em = emf.createEntityManager();
		
		Person person = em.find(Person.class,3335 );
		
		
		System.out.println(person);
		
		System.out.println("----------------Counter----------------------------");
		
		List<Counter> counter = person.getCounter_person();
		for(Counter ele : counter)
		{
			System.out.println("Counter Id :"+ele.getCounterId());
			System.out.println("Counter Location :"+ele.getCounterLocation());
			System.out.println("Counter Type :"+ele.getCounterType());
			
			List<MedOrders> orders = ele.getMedOrders();
			
			for(MedOrders ele1 : orders)
			{
				System.out.println("Order Id :" +ele1.getOrderId());
				System.out.println("Order Type :" +ele1.getOrderType());
				System.out.println("Order Cost :" +ele1.getOrderCost());
				
				
				List<Item> item = ele1.getItem();
				
				for(Item ele3 : item)
				{
					System.out.println("Item id :" +ele3.getItemId());
					System.out.println("Item Type :" +ele3.getItemType());
					System.out.println("Item Cost:" +ele3.getItemCost());
				}
			}
			
		}
		
		
		
	}

}
