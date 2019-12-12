public class Main
{
	public static void main(String[] args) {
	 	
		System.out.println("Hello World");
		EmployeeDetails e1 = new EmployeeDetails.Builder(1059818)
            						.withName("Mathew")
            						.workingAs("Manager")
            						.receivingSalary(60000)
            						.incentive(5000)
            						.build();
        	e1.show();
    	
    		EmployeeDetails e2 = new EmployeeDetails.Builder(1059333)
            						.withName("AJ")
            						.incentive(3000)
            						.receivingSalary(40000)
            						.workingAs("Developer")
            						.build();
        	e2.show();
        
	    	EmployeeDetails e3 = new EmployeeDetails.Builder(1067111)
            						.withName("Sam")
            						.workingAs("Intern")
            						.receivingSalary(8000)
            						.build();
        	e3.show();
	}
}
