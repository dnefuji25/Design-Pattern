public class Employee {
    
    	private String empno;
   	private String name;
   	private String designation;
   	private int totalHours;
   	private float totalPay;
	
        public Employee( String empno, String name, String designation, int totalHours) {
		this.empno=empno;
		this.designation=designation;
		this.name=name;
		this.totalHours=totalHours;
	}
	
	public void paySalary(PayrollStrategy payrollStrategy)	{
	    payrollStrategy.paySalary(name,totalHours);
	    
	}

}
