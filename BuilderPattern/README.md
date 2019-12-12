# Builder-Pattern

Builder pattern is a creational design pattern. It builds a complex object using simple objects and using a step by step approach. A Builder class builds the final object step by step. This builder is independent of other objects. It lets the programmer to separate the construction of a complex object from its representation so that the same construction processes can create different representations. 

When to use : when you want to build different immutable objects using same object building process and approach is independent of the parts that make up the object and how they are assembled.

Sample Scenario : Employee Details - Consider a EmployeeDetails class with a number of instance variables. It is not possible for the programmer to write parameterized constructors for different types of employees. And it is possible that the object state turns incorrect. A Builder class is created with all the fields required. We will configure all of the fields that we want on the Builder, and then we'll use the builder to create employees. At the same time, we'll remove the public constructor from the EmployeeDetails class and replace it with a private constructor so that accounts can only be created via the builder.
