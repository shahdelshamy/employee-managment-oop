package TheProgram;

import java.util.ArrayList;
import java.util.Scanner;
public class department extends Employee {
     
	private String dname;
	private int dno;
	
	
	ArrayList <Employee>emplist=new ArrayList <Employee>();
	
	public department() {
		super();
	}
	public department(String dname, int dno) {
		super();
		this.dname = dname;
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	       //setters and getters
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
	public void add_list(Employee e) {
		emplist.add(e);
	}
	public void add_list(int index,Employee e) {
		emplist.add(index,e);
	}
	
	
	     //this method for remove 
	public void remove_list(int index) {
		Scanner scan=new Scanner (System.in);
		System.out.print("Are you sure you want to remove  ");
		System.out.print(emplist.get(index).toString(index)+"\n");
		System.out.println("if yes press 1,if no press 0");
		int b=scan.nextInt();
		if(b==1)
		emplist.remove(index);
		else {
			
		}
	}
	
	        //this method for get employee by id
	public void Getemployee(int index) {
		System.out.println(emplist.get(index).toString(index)+" , "+emplist.get(index).toString());
	}
	
	            //this method for update
	public void Update(String name1) {
	Scanner scan=new Scanner (System.in);
	
	//for and if to check if the name entered is equal to the names in arraylist
	for(int i=0;i<emplist.size();i++) {
	if(name1.equals(emplist.get(i).getName())) {
		
		// if the name entered is slalried
	  if(emplist.get(i) instanceof SalariedEmployee ) {
		System.out.println("you want update:");
	    System.out.println("1.the address\t2.the age\n3.the salary\t4.the bouns\n5.the deduction");
	    System.out.println("Please enter your choise:");
    	  int input2=scan.nextInt();
    	  
    	         //switch to known any data he want update 
		  switch(input2) {
		  case(1):
	      System.out.println("Enter the new address:");
//&&&&&&&&&&&&
		  emplist.get(i).setAddress(scan.next());	
    break;
		  case(2):
		   System.out.println("Enter the new age:");
		   emplist.get(i).setAge(scan.nextDouble());
    break;			    
	      case(3):
		    System.out.println("Enter the new salary:");
//&&&&&&&&&&&&
	        ((SalariedEmployee)emplist.get(i)).setSalary(scan.nextDouble()); 
     break;
   	     case(4):
		    System.out.println("Enter the new bouns:");
		    ((SalariedEmployee)emplist.get(i)).setBouns(scan.nextDouble());;
	  break;
	      case(5):
	      System.out.println("Enter the new deduction:");
	      ((SalariedEmployee)emplist.get(i)).setDeduction(scan.nextDouble());
	  break;
	  }//end switch
  break;//break for
	  }//end if
	  
     		// if the name entered is houriy
   else if(emplist.get(i) instanceof HourlyEmployee ) {
	   int input4;
	    System.out.println("you want update:");
	    System.out.println("1.the address\t2.the age\n3.the number of hours\t4.the hour rate");
	    System.out.println("Please enter your choise:");
	   input4=scan.nextInt();
		     
		     //switch to known any data he want update 
	 switch(input4) {
	    case(1):
		    System.out.println("Enter the new address:");
		    emplist.get(i).setAddress(scan.next());	
	  break;
        case(2):
	    System.out.println("Enter the new age:");
       emplist.get(i).setAge(scan.nextInt());
	  break;
	    case(3):
	  	System.out.println("Enter the new number hours:");
	    ((HourlyEmployee)emplist.get(i)).setHours(scan.nextDouble());   
	  break;
	    case(4):
	    System.out.println("Enter the new hour rate:");
	    ((HourlyEmployee)emplist.get(i)).setHour_rate(scan.nextDouble());   
		break;
	    }//end of switch
	break;//break for
		}		//end else if
		
	  
         	// if the name entered is houriy
	else if(emplist.get(i) instanceof CommissionEmployee ) {
		int input5;
		  System.out.println("you want update:");
       	 System.out.println("1.the address\t2.the age\n3.the number of gross\t4.the commission rate");
       	 System.out.println("Please enter your choise:");
	     input5=scan.nextInt();
	      //switch to known any data he want update
	 switch(input5) {
	  case(1):
	   System.out.println("Enter the new address:");
	  emplist.get(i).setAddress(scan.next());	
  break;
       case(2):
	   System.out.println("Enter the new age:");
        emplist.get(i).setAge(scan.nextInt());
  break;   
        case(3):
	    System.out.println("Enter the new number gross:");
	    ((CommissionEmployee)emplist.get(i)).setGross(scan.nextDouble());    
   break;    
	    case(4):
	    System.out.println("Enter the new commission rate :");
		((CommissionEmployee)emplist.get(i)).setCommission_rate(scan.nextDouble());    
	    //add_list(emplist.get(i));
	   break;
	   }//end switch
	 break;//end for
	   }//end if
	  
	  
	}//end if
	}//end for
	}//end method
	
	         //to return the size
	public int Num_Employee() {
		return emplist.size();
	} 
	
	           //to GetCommission employees
	public void GetCommission() {
		for(int i=0;i<emplist.size();i++) {
			if(emplist.get(i) instanceof CommissionEmployee ) {
		((CommissionEmployee)emplist.get(i)). DisplayAllDetails(i) ;
	}
	}
	}
	
	   //to GetCommission employees
	public void GetSalaried() {
		for(int i=0;i<emplist.size();i++) {
			if(emplist.get(i) instanceof SalariedEmployee ) {
		((SalariedEmployee)emplist.get(i)). DisplayAllDetails(i) ;
	}
	}
	}
	
	    //to GetCommission employees
	public void GetHourly() {
		for(int i=0;i<emplist.size();i++) {
			if(emplist.get(i) instanceof HourlyEmployee ) {
		((HourlyEmployee)emplist.get(i)). DisplayAllDetails(i) ;
	}
	}
	}
	
	     //to PrintAlldata
	 public void PrintAllDetails() {
     for(int i=0;i<emplist.size();i++) {
    	if(emplist.get(i) instanceof SalariedEmployee )  
    	 ((SalariedEmployee)emplist.get(i)).DisplayAllDetails(i);
    	else if(emplist.get(i) instanceof HourlyEmployee )  
       	 ((HourlyEmployee)emplist.get(i)).DisplayAllDetails(i);
    	else if(emplist.get(i) instanceof CommissionEmployee )  
       	 ((CommissionEmployee)emplist.get(i)).DisplayAllDetails(i);
    	
    	
     }
	 }
	 public double earning()
	 {
		 return 0;
	 }	
	

}
