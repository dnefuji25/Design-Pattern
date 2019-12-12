public class Main
{
	public static void main(String[] args) {
		System.out.println("---------Payroll---------");
		Employee manager= new Employee("110","Tony Stark","Manager",40);
		Employee developer= new Employee("120","Doctor Strange","Developer",50);
		Employee intern= new Employee("130","Ant Man","Intern",42);
		
		manager.paySalary(new ManagerPayrollStrategy());
		developer.paySalary(new DeveloperPayrollStrategy());
		intern.paySalary(new InternPayrollStrategy());
		
	}
}
