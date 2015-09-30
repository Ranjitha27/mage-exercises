## Problem Statement
Alphabatical index of words

Write a function that takes a String input and returns a Map<String, Set<String>> object. 
The Map contains a single letter as key and for each key a set of words starting with that letter. 

If the input is an empty string or null, the return value should be null.

##Example 1
	Input:
		"mahesh and manish are friends"
	Output:
		{a=[and, are], f=[friends], m=[mahesh, manish]}


##Example 2
    Input: 
		"The Map contains a single letter as key and for each key a set of words starting with that letter"
	Output:
		{M=[Map], T=[The], a=[a, and, as], c=[contains], e=[each], f=[for], k=[key], l=[letter], o=[of], s=[set, single, starting], t=[that], w=[with, words]}

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
