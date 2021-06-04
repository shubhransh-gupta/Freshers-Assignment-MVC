A command-line application with an entrypoint in `lib/`, and example unit test in `test/`.
Code Coverage : ![Coverage](https://raw.githubusercontent.com/shubhransh-gupta/Freshers-Assignment-MVC/using-TDD-Approach/coverage_badge.svg?sanitize=true)
#Assignment 1
Write a dart program that accepts details (item name, item type, item prize) of different items from
Command line and outputs the item name, item prize, sales tax liability per item, final prize (sales tax + item prize) to the console. The input should be accepted with following command line options:
-name <first item name>
-price <price of first item>
-quantity <quantity of first item>
-type <type of first item>
The following functionalities/behavior is expected:
All options other than item name can come in any order i.e. after -name you can have -price, -type option. Item type is a mandatory option.
The system should provide functionality to add more than one items i.e. Once the details of the first item is entered it should display a message saying:
Do you want to enter details of any other item (y/n):
  	Appropriate behavior is required to be implemented as per user input for this question.
Make use of dart’s object oriented capabilities for implementing this business logic.
Item type can have 3 possible values: raw, manufactured and imported.
Tax rules for the 3 types are as follows:
raw: 12.5% of the item cost
manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of the item cost)
imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost after applying tax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200 and 5% of the final cost if it exceeds 200).
Key Points:
Use dart’s I/O capabilities to accept input from users.
Use dart’s String functionalities to parse input strings.
Coding conventions should be followed.
Proper validation / info messages should be thrown on console.
Do appropriate exception handling wherever required.
Where ever required please write comments in the code to make it more understandable.
TDD methodology should be used
