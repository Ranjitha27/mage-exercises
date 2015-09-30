## Problem Statement
Write a function "rotate" that accepts a string 'str' and int 'n'. The function should rotate the words in in the input string 'n' times.

For example, if str='my name is vinod' and n=3, then the first rotation will make str as 'vinod my name is', second rotation will make str as 'is vinod my name' and the third rotation makes the str as 'name is vinod my'

If the second parameter is equal to the no.of words in the first parameter, then the return value must be same as the first parameter. 

If the second parameter is -ve, it should be converted into its absolute value.
If the input string is empty or null, the same thing should be returned.

##Examples:
	Input:
		this is a test 1
	Output:
		test this is a

	Input:
		this is a test -2
	Output:
		a test this is

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
	Write a function that can take the last word in the sentence and add it as the first one. Then call this function n number of times.
