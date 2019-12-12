public class DeveloperPayrollStrategy implements PayrollStrategy {
    
    double payPerHour;
    
    public DeveloperPayrollStrategy() {
		this.payPerHour=500.0;
	}
	
    public void paySalary(String name,int totalHours) {
	    System.out.println("Developer " + name + " salary is " + (this.payPerHour*totalHours + 5000));
	}
}