package TheProgram;

public class SalariedEmployee extends Employee implements displayable  {

	private double salary;
	private double bouns;
	private double deduction;

                //constractor with no signature	
	public SalariedEmployee() {
		super();
	}
                  
	          //constractor with  signature
	public SalariedEmployee(String n,String a,int ag,double salary, double bouns, double deduction) {
		//super for call parent class
		super(n,a,ag);
		this.salary = salary;
		this.bouns = bouns;
		this.deduction = deduction;
	}

	              //setters and getters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBouns() {
		return bouns;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}
	
	@Override    //this method override on abstract method in parent class
	public double earning() {
		return salary+bouns-deduction;
	}
	
	
	@Override    //this method override  method in parent class
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", bouns=" + bouns + ", deduction=" + deduction + "]";
	}

	@Override   // for print the data in this class(salaried class) and override on method in interface
	public void DisplayAllDetails(int index) {
		System.out.println(super.toString(index));
		System.out.println(toString());
	}
	 
	@Override                //this method is override on method in interface  
	public void DisplayEarning() {
		System.out.println(earning());
	}

	
	
	
	
	
	
	
}
