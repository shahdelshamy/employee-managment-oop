package TheProgram;
import java.util.Scanner;
public class TheMain {
	
	static Scanner scan=new Scanner (System.in);
	public static void main(String[] args) {
		
		department emp=new department();
    while(true) {
	int input,input1, input6;	
	SalariedEmployee e1 ;
	CommissionEmployee e3 ;
	HourlyEmployee e2 ;
	
	//at first the user need to add employees
	if(emp. Num_Employee()==0) {
		System.out.println(" \t ****Add the employees****");
		System.out.println("The employee is:\n1.Salaried_Employee\t2.Hourly_Employee\n3.Commission_Employee");
		System.out.println("Please Enter Your Choise:");
		input=scan.nextInt();
		                  //this switch for add at first*******
		switch(input) { 
		                   //this case for add salaried employee at first
		case(1):
	    e1 =new SalariedEmployee();
	   	System.out.println("enter the name:");
		e1.setName(scan.next());
		System.out.println("enter the address:");
		e1.setAddress(scan.next());
		System.out.println("enter the age:");
		e1.setAge(scan.nextInt());
		System.out.println("enter the salary:");
		e1.setSalary(scan.nextDouble());
		System.out.println("enter the bouns:");
		e1.setBouns(scan.nextDouble());
		System.out.println("enter the deduction:");
		e1.setDeduction(scan.nextDouble());
		emp.add_list(e1);
		System.out.println("\t***********");
		break;	
		               //this case for add hourly employee at first
		case (2) :
		e2=new HourlyEmployee();
		System.out.println("enter the name:");
		e2.setName(scan.next());
		System.out.println("enter the address:");
		e2.setAddress(scan.next());
		System.out.println("enter the age:");
		e2.setAge(scan.nextInt());
		System.out.println("enter the number of hours:");
		e2.setHours(scan.nextDouble());
		System.out.println("enter the hours rate:");
		e2.setHour_rate(scan.nextDouble());
		emp.add_list(e2);
		System.out.println("\t***********");	
		break;
		                  //this case for add commission employee at first
		case (3) :
		e3=new CommissionEmployee();
		System.out.println("enter the name:");
		e3.setName(scan.next());
		System.out.println("enter the address:");
		e3.setAddress(scan.next());
		System.out.println("enter the age:");
		e3.setAge(scan.nextInt());
		System.out.println("enter the gross:");
		e3.setGross(scan.nextDouble());
		System.out.println("enter the gross rate:");
		e3.setCommission_rate(scan.nextDouble());
		emp.add_list(e3);
		System.out.println("\t***********");
			break;				
	}	
	} 
	                   //when size of arraylist not equal 0  
		else {
			System.out.println("\t****the options are****");
	System.out.println("1.Add\n\t---------------\n2.Update\n\t---------------\n3.Remove\n\t---------------\n4.Get All Data\n\t---------------\n5.Get Data By ID\n\t---------------\n6.Get Informatoin About All commission Employees\n\t---------------\n7.Get Informatoin About All Salaried Employees\n\t---------------\n8.Get Informatoin About All Hourly Employees\n\t---------------\n9.Number of Employees\n\t------------------\n10.EXIT\n\t---------------\n");
	System.out.println("Please Enter Your Choise:");
	input1=scan.nextInt();
	int input3;
	                         //this switch for operations    
	switch(input1) {
	                         //this case add employee second
	case(1):
	System.out.println("The employee is:\n1.Salaried_Employee\t2.Hourly_Employee\n3.Commission_Employee");
	System.out.println("Please Enter Your Choise:");
	input=scan.nextInt();

                           //this switch for type of employee
	switch(input) {
	                       //this case for add salaried employee      
	case(1):
    e1 =new SalariedEmployee();
   	System.out.println("enter the name:");
	e1.setName(scan.next());
	System.out.println("enter the address:");
	e1.setAddress(scan.next());
	System.out.println("enter the age:");
	e1.setAge(scan.nextInt());
	System.out.println("enter the salary:");
	e1.setSalary(scan.nextDouble());
	System.out.println("enter the bouns:");
	e1.setBouns(scan.nextDouble());
	System.out.println("enter the deduction:");
	e1.setDeduction(scan.nextDouble());
	emp.add_list(e1);
	System.out.println("\t***********");
break;
                             //this case for add hourly employee 
	case (2) :
	e2=new HourlyEmployee();
	System.out.println("enter the name:");
	e2.setName(scan.next());
	System.out.println("enter the address:");
	e2.setAddress(scan.next());
	System.out.println("enter the age:");
	e2.setAge(scan.nextInt());
	System.out.println("enter the number of hours:");
	e2.setHours(scan.nextDouble());
	System.out.println("enter the hours rate:");
	e2.setHour_rate(scan.nextDouble());
	emp.add_list(e2);
	System.out.println("\t***********");	
break;
                   //this case for add commission employee 
	case (3) :
	e3=new CommissionEmployee();
	System.out.println("enter the name:");
	e3.setName(scan.next());
	System.out.println("enter the address:");
	e3.setAddress(scan.next());
	System.out.println("enter the age:");
	e3.setAge(scan.nextInt());
	System.out.println("enter the gross:");
	e3.setGross(scan.nextDouble());
	System.out.println("enter the gross rate:");
	e3.setCommission_rate(scan.nextDouble());
	emp.add_list(e3);
	System.out.println("\t***********");
break;
	}
	break;
	
	           //this case for update bata of employee 
	case(2):
		do {
		int input2;
		String name;
	System.out.println("Enter the Employee name:");
    name=scan.next();
                //method of update
    emp.Update(name);
      System.out.println("You want another update?\nIf yes please press 1,if no please press 0");
      input6=scan.nextInt();
	   }while(input6==1);
		while (input6==0) {
	break;
		}
break;
	            
		       //this case for  remove by id
	case(3):
	emp.PrintAllDetails();
	System.out.println("Enter the ID you want remove :");
	int id=scan.nextInt();
	              //method of remove   
	emp.remove_list(id);
	emp.PrintAllDetails();
break;
	
	 
                     //this case for print data
	case(4):
		emp.PrintAllDetails();
 break;
     
 
                         //this case for  print data by id
	case(5):
	System.out.println("Enter the Id of employee who you want to show his data:");
	int id1=scan.nextInt();
	emp.Getemployee(id1);
     break;
      
                      //this case for print all commission employees
	case(6):
     emp.GetCommission();
     break;
      
                        //this case for print all salaried employees
	case(7):
	     emp.GetSalaried();
	     break;
     
                  	   //this case for print all hourly employees
	case(8):
	     emp.GetHourly();
	     break;    
	  
    	   //this case for print number of employees
	case(9):
		System.out.println("the number of employees is :"+emp.Num_Employee());
	     break;
	
	             //this case for out from proramm
	case(10):
	     break;    
	    }	
	
	}
	}	
}
}