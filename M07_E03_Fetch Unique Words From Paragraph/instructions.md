## Problem Statement
Write a function that accepts two parameters. The first parameter is a String representing a bunch of sentences (like a paragraph) and the second parameter is an int. The function should return a List<String> of unique words, from the input string. The list should be sorted based on the second parameter. If the second parameter is 1, then the list is ordered in alphabetical order. If it is 2, then the list is ordered based on the word length. If the word lengths of two or more words are same, then they must be ordered alphabetically.

## Warnings
- Take care of whitespace/trailing whitespace
- Trim the output and avoid special characters
- Avoid printing unnecessary values other than expected/asked output

## Hints/Tips
	Use a Set