package hospital_application;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	
	@Id
	private int itemId;
	private String itemType;
	private double itemCost;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "item_id"), 
    inverseJoinColumns = @JoinColumn(name = "med_id") )
	private List<MedOrders> orders ;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	public List<MedOrders> getOrders() {
		return orders;
	}

	public void setOrders(List<MedOrders> orders) {
		this.orders = orders;
	}
	
	

}
