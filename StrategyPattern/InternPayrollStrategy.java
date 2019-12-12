public class InternPayrollStrategy implements PayrollStrategy {
    
    double payPerHour;
    
    public InternPayrollStrategy() {
		this.payPerHour=100.0;
	}
	
	public void paySalary(String name,int totalHours) {
	    System.out.println("Intern " + name + "  salary is " + this.payPerHour*totalHours);
	}
}