## Problem Statement

Create class called Customer with fields customerId, name, city, phone and email. 
The customerId is of type "int" and others are of "String". Add a default constructor and an overloaded constructor with all fields. 
Provide getters and setters for all the fields. 
Finally, override the "equals" method with proper implementation.


##Testing
	Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
	Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

	c1.equals(c2) --> should return true
	c2.equals(c1) --> should return true

	c1.setEmail("vinod@mailinator.com");
	c1.equals(c2) --> should return false
	c2.equals(c1) --> should return false

	c2.setEmail("vinod@mailinator.com");
	c1.equals(c2) --> should return true
	c2.equals(c1) --> should return true



## Instructions
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding
- Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
- Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them  
- Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
- Always test the program thoroughly, before saving/submitting exercises/project
- For any issues with your exercise, contact your coach


Note: There is no black box test for this