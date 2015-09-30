## Problem Statement
Write a function that accepts 3 integers representing parts of date (d, m, y). The function should return the number of days elapsed since 1/1/1900. 

###Invalidity rules:
- If year in <=0 then return -1
- If the year is valid, but month is <1 or >12, return -2
- If the year and month are valid, but day is <1 or > max days in the given month/year, return -3

##Examples
	Input:
		13 2 2015
	Output:
		42047

	Input:
		20 1 1974
	Output:
		27048

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
	Use for loops
