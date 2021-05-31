# Freshers-Assignment
# Freshers-Assignment-MVC

# Part 1 - Java assignments
Completed by Shubhransh Gupta()

# ASSIGNMENT #1
Topics Covered: Java I/O, String.

Write a java program that accepts details (item name,item type, item prize) of different items from
Command line and outputs the item name, item prize,sales tax liability per item, ﬁnal prize (salestax + item prize) to the console. The input should be accepted with following command line options:
-name <ﬁrst item name>
-price <price of ﬁrst item>
-quantity <quantity of ﬁrst item>
-type <type of ﬁrst item>
The following functionalities/behavior is expected:
● All options other than item name can come in any orderi.e. after -name you can have -price, -type option.Item type is a mandatory option. ● The system should provide functionality to add morethan one items i.e. Once the details of the ﬁrstitem is entered it should display a message saying:
Do you want to enter details of any other item (y/n):
Appropriate behavior is required to be implementedas per user input for this question.
● Make use of java's object oriented capabilities forimplementing this business logic. ● Item type can have 3 possible values: raw, manufacturedand imported. ● Tax rules for the 3 types are as follows: ○ raw: 12.5% of the item cost ○ manufactured: 12.5% of the item cost + 2% of (itemcost + 12.5% of the item cost)
imported: 10% import duty on item cost + a surcharge(surcharge is: Rs. 5 if the ﬁnal cost after applyingtax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 200and 5% of the ﬁnal cost if it exceeds 200).
Real Life Scenario:
Inventory management system.
Key Points:
1. Use Java’s I/O capabilities to accept input from users. 2. Use Java’s String functionalities to parse input strings. 3. Coding conventions should be followed. 4. Proper validation / info messages should be thrownon console. 5. Do appropriate exception handling wherever required. 6. Where ever required please write comments in the codeto make it more understandable. 7. TDD methodology should be used

# ASSIGNMENT #2
(1 days)
## Topics Covered: Java Serialization, Sorting.

Write a menu driven command line java program thatprovides the following menu options:

1. Add User details. 2. Display User details. 3. Delete User details 4. Save User details. 5. Exit
The option (1) should ask for the following user details.All the following details are mandatory and the programshould perform the required validations (like blank data, integer value for age,roll number etc). Roll Number is a key to identifythe uniqueness among the students.

1. Full Name 2. Age 3. Address 4. Roll Number 5. Set of courses he is interested to enroll. There are a total of 6 courses (Course A, B, C, D, E and F).It is mandatory for each student to choose 4 out of 6 courses.
Once the validations are passed the user details shouldbe added to an in memory data structure. The data structure should always keep the records sorted in ascending order. By default therecords should be sorted on full name. If the nameis the same for two students then sorting should be based on the roll number.
The option (2) should display the user details inthe following format. Also the user should be providedwith an option to sort the results (either in ascending or descending order) based onname, roll number, age, address.
--------------------------------------------------------------------------------------------------------------------------------
Name    Roll Number                       Age Address                        Courses
--------------------------------------------------------------------------------------------------------------------------------
A            43 1                        22 A, GGn A, C, D, E
The option (3) should ask for roll number and deletethe student details corresponding to that roll number.Throw a proper user friendly message in case the roll number entered by the userdoes not exist.
The option (4) should save the in memory details ofall the users to a disk. Use java’s serializationcapabilities to serialize the in memory data to disk. If the user terminates the program afterchoosing this option the user’s data should be savedto disk and next time the user runs the program the in-memory collection should be pre populatedwith data already stored on the disk.
The option (5) should terminate the program but beforetermination it should ask the user if he wants tosave his latest changes (additions, deletions of users) to disk.
Key Points:
1. Use Java’s serialization mechanism to save user detailsto disk. 2. Use Java’s comparable and comparator interfaces forsorting. 3. Coding conventions should be followed. 4. Proper validation / info messages should be thrownon console. 5. Student Info, course info, serialization code andcommand line menu code should be encapsulated in separateindependent java classes. 6. Where ever required please write comments in the codeto make it more understandable. 7. TDD methodology should be used

# ASSIGNMENT #3
Topics Covered: Java Collections.

Design a Data Structure using Java’s Collection Frameworkthat represents a dependency graph.
Dependency Graph is an acyclic multi root directionalgraph with the exception of a root node, which hasno parents.
Real Life Scenario:
Family Tree


Terminology used:
Parent: For edge A->B, A is a parent of B. There may be multiple parents for a child.
Child: For edge A->B, B is a child of A. There may be multiple children of a parent.
Ancestor: parent or grand-parent or grand-grand-parentand so on
Descendant: child or grand-child or grand-grand-childand so on
Basically the data structure should allow you to storethe parent child relationship and this can go tothe nth level.
Design:
The node information, which we will store, is:
Node Id --- This has to be unique.
Node Name. Need not be distinct.
Additional Information --- In the form of a key valuepairs and this can be different for each node.

Operations:
Get the immediate parents of a node, passing the nodeid as input parameter.
Get the immediate children of a node, passing thenode id as input parameter.
Get the ancestors of a node, passing the node id asinput parameter.
Get the descendants of a node, passing the node idas input parameter.
Delete dependency from a tree, passing parent nodeid and child node id.
Delete a node from a tree, passing node id as inputparameter. This should delete all the dependencies of the node.
Add a new dependency to a tree, passing parent nodeid and child node id. This should check for cyclic dependencies.
Add a new node to tree. This node will have no parents and children. Dependency will be established by callingthe 7 number API.

Key Points:
Use Java’s collection framework to implement FamilyTree.
Proper validation / info messages should be thrownon console.
Do appropriate exception handling wherever required.
Where ever required please write comments in the codeto make it more understandable.
TDD methodology should be used
