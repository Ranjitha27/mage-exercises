## Problem Statement
Compare Employees

Create a class Employee with fields id, name, salary, and commission. Create appropriate constructors, setters and getters. Write a static method called "compare" that takes the following parameters:

1. String "field" (must be one of "id", "name", "salary", "commission")
2. Employee emp1
3. String "operator" (must be one of "<", "<=", ">", ">=", "==", "!=" )
4. Employee emp2

This method should compare the members in emp1 and emp2 corresponding to the "field", and the "operator" specified. The return value is boolean, the result of comparison.

For example, Employee.compare("salary", e1, "<" e2) should evaluate and return return e1.getSalary() < e2.getSalary(). Similarly Employee.compare("name", e1, "==", e2) should evaluate and return e1.getName().equals(e2.getName()) and so on.

The method should also throw a custom exception "InvalidParameterException", if the parameters "field" and "operator" receive invalid inputs.

If you are testing the code using command line arguments, the arguments should be passed in the following sequence:

    id1 name1 salary1 commission1 id2 name2 salary2 commission2 field operator

For example,

    7788 Scott 2000 20.9 7654 Miller 2400 0 salary <

If the arguments are not supplied as expected, the application prints the following messages:

    Not enough arguments
    Invalid data
    InvalidParameterException

## Instructions
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding
- Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
- Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them  
- Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
- Always test the program thoroughly, before saving/submitting exercises/project
- For any issues with your exercise, contact your coach

## Warnings
- Take care of whitespace/trailing whitespace
- Trim the output and avoid special characters
- Avoid printing unnecessary values other than expected/asked output

## Hints/Tips
    Use Comparator interface conditionally