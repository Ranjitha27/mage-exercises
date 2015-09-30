## Problem Statement
Write a function called addDate() that accepts 3 parameters. 

- First parameter is a string containing a date in "DD/MM/YYYY" format. 
- The second parameter is a positive integer representing the number of days, months or years. 
- The third parameter is a character 'D', 'M', 'Y' representing day, month and year. 

The function should add the input number (as days, months or years based on third parameter) to the input date (first parameter). The return value is a string representing the result of addition in YYYY-MM-DD format. 

Throw InvalidParameterException, a custom exception, if any of the inputs are invalid.

##Example
	Input:
		20/01/1974 10 D
	Output:
		1974-01-30

	Input:
		20/01/1974 10 M
		1974-11-20

	Input:
		20/01/1974 10 X
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
    Use java.util.Calendar if needed.
