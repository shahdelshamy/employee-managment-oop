package TheProgram;

public class CommissionEmployee extends Employee implements displayable {

	private double gross;
	private double commission_rate;
	
	                 //constractor with no signature	
	public CommissionEmployee() {
		super();
	}
	
	                 //constractor with  signature
	public CommissionEmployee(String n,String a,int ag,double gross, double commission_rate) {
		//super for call parent class
		super(n,a,ag);
		this.gross = gross;
		this.commission_rate = commission_rate;
	}

	              //setters and getters
	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double getCommission_rate() {
		return commission_rate;
	}

	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}
	

	@Override    //this method override on abstract method in parent class
	public double earning() {
		return gross*commission_rate;
	}
	
	
	@Override   //this method override  method in parent class
	public String toString() {
		return "CommissionEmployee [gross=" + gross + ", commission_rate=" + commission_rate + "]";
	}
	
	@Override   // for print the data in this class(commission class) and override on method in interface
	public void DisplayAllDetails(int index) {
		System.out.println(super.toString(index));
		System.out.println(toString());
	}
	
	@Override       //this method is override on method in interface 
	public void DisplayEarning() {
		System.out.println(earning());
	}
	
	
	
}
