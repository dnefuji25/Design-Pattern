public class EmployeeDetails {
        long employeeNumber; 
        String name;
        String designation;
        double salary;
        double incentive;
        
    public static class Builder {
        private long employeeNumber; 
        private String name;
        private String designation;
        private double salary;
        private double incentive;

        public Builder(long employeeNumber) {
            this.employeeNumber = employeeNumber;
        }
        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Builder workingAs(String designation){
            this.designation = designation;
            return this;
        }
        public Builder receivingSalary(double salary){
            this.salary=salary;
            return this;
        }
        public Builder incentive(double incentive){
            this.incentive = incentive;
            return this;
        }
        public EmployeeDetails build(){
            EmployeeDetails e = new EmployeeDetails();
            e.employeeNumber = this.employeeNumber;
            e.name = this.name;
            e.designation = this.designation;
            e.salary = this.salary;
            e.incentive = this.incentive;
            return e;
        }
    }
    private EmployeeDetails() {
    }
    public void show()
    {
        System.out.println("Employee Number : " + this.employeeNumber);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Designation : " + this.designation);
        System.out.println("Salary : " + this.salary);
        System.out.println("Incentive(if any) : " + this.incentive);
        System.out.println();
    }
    
}