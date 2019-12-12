public class ManagerPayrollStrategy implements PayrollStrategy {
    
    double payPerHour;
    
    public ManagerPayrollStrategy() {
		this.payPerHour=1000.0;
	}
	
	public void paySalary(String name,int totalHours) {
	    System.out.println("Manager " + name + " salary is " + (this.payPerHour*totalHours + 10000));
	}
}