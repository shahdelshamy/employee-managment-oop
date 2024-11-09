package TheProgram;

public class HourlyEmployee extends Employee implements displayable {
        
	private double hours;
	private double hour_rate;
	
	
	            //constractor with no signature	
	public HourlyEmployee() {
		super();
	}

	            //constractor with  signature
	public HourlyEmployee(String n,String a,int ag,double hours, double hour_rate) {
		//super for call parent class
		super(n,a,ag);
		this.hours = hours;
		this.hour_rate = hour_rate;
	}
 
	                //setters and getters
	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setHour_rate(double hour_rate) {
		this.hour_rate = hour_rate;
	}
   
	
	public double getHours() {
		return hours;
	}

	public double getHour_rate() {
		return hour_rate;
	}

	@Override    //this method override on abstract method in parent class
	public double earning() {
		return (hours*hour_rate);
	}
	
	
	@Override    //this method override  method in parent class
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", hour_rate=" + hour_rate + "]";
	}

	@Override   // for print the data in this class(hourly class) and override on method in interface
	public void  DisplayAllDetails(int id) {
		System.out.println(super.toString(id));
		System.out.println(toString());
	}
	
	@Override         //this method is override on method in interface 
	public void DisplayEarning() {
		System.out.println(earning());
	}
	
}
