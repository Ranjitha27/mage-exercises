## Problem Statement
Create a class "Player" with the following members:

- firstName: String
- lastName: String
- Player(firstName: String, lastName: String)
- getName(): String
- abstract getRating(): int

The method getName() should return the fullname of the player which is a combination of firstName and lastName separated by a single space.


Create a subclass "CricketPlayer" with the following members:

- averageRuns: double
- CricketPlayer(firstName: String, lastName: String, averageRuns: double) 
- getRating(): int

The rating of a cricket player is based on the following slab:

- if averageRuns > 55 then 7
- if averageRuns > 50 then  6
- if averageRuns > 40 then 5
- if averageRuns > 30 then 3
- if averageRuns > 20 then 2
- if averageRuns <=20 then 1

Create a subclss "FootballPlayer" with the following members: 

- goals: int
- FootballPlayer(firstName: String, lastName: String, goals: int)
- getRating(): int

The rating of a football player is based on the following slab:

- if goals > 20 then 5
- if goals > 15 then 4
- if goals > 10 then 3
- if goals > 5 then 2
- if goals <=5 then 1

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

## Note:
	This exercise does not have any black box tests
	