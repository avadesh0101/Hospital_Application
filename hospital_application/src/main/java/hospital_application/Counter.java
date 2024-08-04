package hospital_application;

import javax.persistence.*;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Counter {
	
	@Id
	private int counterId;
	private String counterLocation;
	private String counterType;
	
	@ManyToOne
	@JoinColumn(name="branch_id")
	private Branch branch_id ;
	
	@OneToMany(mappedBy="counter")
	private List<MedOrders> medOrders;
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person ;

	public int getCounterId() {
		return counterId;
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}

	public String getCounterLocation() {
		return counterLocation;
	}

	public void setCounterLocation(String counterLocation) {
		this.counterLocation = counterLocation;
	}

	public String getCounterType() {
		return counterType;
	}

	public void setCounterType(String counterType) {
		this.counterType = counterType;
	}

	public Branch getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Branch branch_id) {
		this.branch_id = branch_id;
	}

	public List<MedOrders> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrders> medOrders) {
		this.medOrders = medOrders;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	
    
}
