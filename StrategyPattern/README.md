# Strategy-Pattern

Strategy is a behavioral design pattern. In Strategy pattern, a class behavior or its algorithm can be changed at run time. It lets the programmer to define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it. 

When to use : When you have volatile code that you can separate out of your application for easy maintenance. When you want to change the algorithm you use for a task at runtime.

Sample Scenario : Employee Payroll - Consider a company where there are people working at different job Levels. Therefore, their pay would also differ. In this scenario, we calculate the salary based on the designation and total hours worked. For a manager, the pay Per hour would differ from that of a developer. So the strategy to calculate salary differs. We get to know the designation only at runtime. So the strategy should also be defined at runtime. We have created a PayrollStrategy interface. ManagerPayrollStrategy, DeveloperPayrollStrategy, InternPayrollStrategy will implement the paySalary() method of the interface with different approach. In main(), the Employee objects will be created and a call to the appropriate strategy will be done. The salary will be calculated and displayed based on their designation. 
