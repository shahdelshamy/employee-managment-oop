package TheProgram;

                 //the parent class 

public abstract class Employee 
{
	private String name;
	private String address;
	private double age;
	
	                   //constractor with signature
	public Employee() {
	}
	public Employee(String name, String address, double age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	                 //setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	  
	               //abstract method
	public abstract double earning() ;
	
	             //method to print the data of employee class
	public String toString(int index) {
		return "***Employee [id="+index+", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
		

}
