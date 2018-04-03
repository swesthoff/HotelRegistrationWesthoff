package edu.dmacc.spring.hotelregistration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


	private int id;
	private HotelName hotelName;
	private String cityName;
	private RoomType roomType;
	private int numberOfAdults;
	private int numberOfChildren;
	private double cost;
	final String SINGLE = "SINGLE";
	final String DOUBLE = "DOUBLE";
	final String KING = "KING";
	final String SUITE = "SUITE";
	
	/*public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public HotelName getHotelName() {
		return hotelName;
	}

	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
//		this.cost = cost;
		this.cost = 100.00;
	}
	
//	public void setCost(int numberOfAdults, int numberOfChildren, String roomType) {
//		this.cost = calcCostOfRoom(numberOfAdults,numberOfChildren, roomType);
//	}
//
//	private double calcCostOfRoom(int numberOfAdults, int numberOfChildren, String roomType) {
//	Double totalAdultCost;
//	
//	if (this.numberOfAdults > 4) {
//		totalAdultCost = 40.0;
//	} else if (this.numberOfAdults > 1) {
//		totalAdultCost = 30.00;
//	} else {
//		totalAdultCost = 10.0;
//	}
//
//	Double totalChildCost;
//	
//	if (this.numberOfChildren > 4) {
//		totalChildCost = 40.0;
//	} else if (this.numberOfChildren > 1) {
//		totalChildCost = 30.00;
//	} else {
//		totalChildCost = 10.0;
//	}
//	
//	Double totalCostOfRoom = 0.0;
////	if (this.roomType = SINGLE) {
////		totalCostOfRoom = 80.0;
////	} else if (this.roomType = "DOUBLE") {
////		totalCostOfRoom = 90.0;
////	} else if {this.roomType = "KING" {
////		totalCostOfRoom = 100.0;
////	}else
////	
////		totalCostOfRoom = 150.0;
//	
//	totalCostOfRoom = totalCostOfRoom + totalAdultCost + totalChildCost;
//	
////1		totalCostOfParticipation = 599.99;
//	return totalCostOfRoom;
//
//	
//}
}

	

	
