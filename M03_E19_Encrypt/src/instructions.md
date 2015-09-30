## Problem Statement
Write a function "encrypt" that accepts 3 string parameters. The first string is the sentence to be encrypted. Second is a group of some alphabets and the last is a group of special characters.

String encrypt(String input, String chars, String code){
	// complete your code here
}

The length of "chars" must match the length of "code". If not, return the input string itself.
Each letter of "chars" found in "input" must be replaced with the corresponding letters in "code".

##Example:
	Input:
		"my name is vinod kumar" "aeiou" "*&^%$"
	Output:
		"my n*m& ^s v^n%d k$m*r"

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
	No hints available