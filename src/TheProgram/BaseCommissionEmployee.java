package TheProgram;

public class BaseCommissionEmployee extends CommissionEmployee {

	
	private double base;
	

	public BaseCommissionEmployee() {
		super();
	}

	public BaseCommissionEmployee(double base) {
		super();
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double earning() {
		return base+super.earning();
	}
	 
	@Override
	public String toString() {
		return "BaseCommissionEmployee [base=" + base + "]";
	}

	public void DisplayAllDetails(int index) {
		super.DisplayAllDetails(index);
		System.out.println(toString());
	}
	
	public void DisplayEarning() {
		System.out.println(toString());
	}
	
	
	
	
	
}
