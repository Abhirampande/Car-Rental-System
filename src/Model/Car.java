package Model;

public class Car { //class car have properties
	private int Id;
	private String Brand;
	private String Model;
	private String Color;
	private int year;
	private double Price;
	private boolean available;
	
	public Car() {  //constructor
		
	}
	
	public int getId() {  //encapsulation
		return Id;
	}
	
	public void setId(int NewId) {
		Id = NewId;
	}
	
	
	public String getBrand() {
		return Brand;
	}
	public void SetBrand(String NewBrand) {
		Brand = NewBrand;
	}
	
	
	public String getModel() {
		return Model;
	}
	public void setModel(String NewModel) {
		Model = NewModel;
	}
	
	
	public String getColor() {
		return Color;
	}
	public void setColor(String NewColor) {
		Color = NewColor;
	}
	
	
	public int getyear() {
		return year;
	}
	public void setyear(int Newyear) {
		year = Newyear;
	}
	
	
	public double getPrice() {
		return Price;
	}
	public void setPrice(double NewPrice) {
		Price = NewPrice;
	}
	
	
	public boolean getavailable() {
		return available;
	}
	
	public void setavailable(boolean Newavailable) {
		available = Newavailable;
	}
	
	
	
}
