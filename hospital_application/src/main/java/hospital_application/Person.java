package hospital_application;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String name;
	private String gender;
	
	@OneToMany(mappedBy="person")
	private List<Counter> counter_person;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Counter> getCounter_person() {
		return counter_person;
	}

	public void setCounter_person(List<Counter> counter_person) {
		this.counter_person = counter_person;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", gender=" + gender + ", counter_person="
				+ counter_person + "]";
	}
	
	

}
