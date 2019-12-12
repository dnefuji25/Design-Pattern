# Factory-Pattern

Factory Pattern is a creational design pattern. In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface. The new operator is fine as far as it goes, but when your object creation code changes a lot, it is a good practice to factor it out into factory objects.

When to use : When a  class cannot anticipate the type of objects it needs to create beforehand.When a class requires its subclasses to specify the objects it creates.

Sample Scenario : Tour Package - When are different types of tour packages and it will only be decided which tour package to be displayed. It is best to separate them into different classes and create a object only for the subclasses. We have created a Tour interface. SummerPackage, WinterPackage, AutumnPackage implement the method packageDetails(). TourFactory based on the type creates an object of the subclasses. The respective methods are called and the details of the package are displayed.   
