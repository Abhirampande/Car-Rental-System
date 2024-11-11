package Model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {
	private int Id;
	private User user;
	private Car car;
	private LocalDateTime dateTime;
	private int hours;
	private double total;
	private String status;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM hh:mm");
	
	
	public Rent() {
		dateTime = LocalDateTime.now();
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int newId) {
		Id = newId;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User newUser) {
		user = newUser;
	}
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car newCar) {
		car = newCar;
	}
	
	
	public String getDateTime() {
		return formatter.format(dateTime);
	}
	public void setDatetime(String newdateTimeString) {
		dateTime = LocalDateTime.parse(newdateTimeString, formatter);
	}
	
	
	public int getHours() {
		return hours;
	}
	public void setHours(int newhours) {
		hours = newhours;
	}
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double newtotal) {
		total = newtotal;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String newstatus) {
		status = newstatus;
	}
	
	
	
}
