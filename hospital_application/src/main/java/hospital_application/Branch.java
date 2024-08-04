package hospital_application;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	
	@Id
	private int id;
	private String name;
	private String location ;
	
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital ;
	
	@OneToOne(mappedBy="branch")
	private Address address ;
	
	@OneToMany(mappedBy="branch_id")
	private List<Counter> counter ;

	public List<Counter> getCounter() {
		return counter;
	}

	public void setCounter(List<Counter> counter) {
		this.counter = counter;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	
	

}
