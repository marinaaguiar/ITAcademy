# ITAcademy

# Sprint 1

## Task 1

[Level 1 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task1/n1exercise1)

In a music group there are different types of musical instruments. There are wind, string and percussion instruments.
All instruments have their name and price as attributes. Also, they have a method called touch(). This is abstract in the instrument class and must therefore be implemented in child classes. If a wind instrument is being played, the method must display to the console: "A wind instrument is being played", if a string instrument is being played: "A string instrument is being played" and if playing a percussion instrument: "A percussion instrument is playing".
The process of loading a class takes place only once. Shows that the load can be caused by the creation of the first instance of this class or by accessing a static member of this class. 
Find information about initialization blocks and static blocks in Java.

[Level 1 - Exercise 2](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task1/n1exercise2)

Create a class "Car" with the attributes: make, model and power. Brand must be static final, model static and power final. Show the difference between the three. Is there one that can be initialized in the class constructor?

Add two methods to the "Car" class. A static method called slow() and a non-static method called accelerate(). The accelerate method must show by console: “The vehicle is accelerating” and the brake() method must show: “The vehicle is braking”. 

Demonstrate how to invoke static and non-static method from main() of main class.

[Level 2 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task1/n2exercise1)

Create a class called "Phone" with the make and model attributes, and the call() method. This method should receive a String with a phone number. The method should display a console message saying that the number received by the parameter is being called. 
Create an interface called "Camera" with the photograph() method, and another interface called Clock with the alarm() method.
Create a class called "Smartphone" that is a subclass of "Phone" and implements both the "Camera" and "Watch" interfaces.
The photographing() method must display on the console: “A picture is being taken” and the alarm() method must display: “The alarm is sounding”.
From the main() of the application, create a Smartphone object and call the above methods.

## Task 2 

[Level 1 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task2/n1exercise1)

Create a class called "Product" with the name and price attributes, and another class called "Sale". This class has as attributes a collection of products and the total price of the sale.
The "Sale" class has a method called calculateTotal() that throws the custom exception SaleEmptyException and displays "To make a sale you must first add products" if the collection of products is empty. If the collection has products, then it must loop through the collection and store the sum of all the product prices in the totalsaleprice attribute.
The custom exception SaleEmptyException must be a child of the Exception class. To its constructor we must pass the message “To make a sale you must first add products” and when we catch the exception, we must display it on the screen with the getMessage() method of the exception.
Write the necessary code to generate and catch an exception of type ArrayIndexOutOfBoundsException.

[Level 2 - Exercise 2](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task2/n2exercise1)

Create a class called "Input". This class must be used to control the different exceptions that can appear in Java when entering data by keyboard using the Scanner class.
The first thing to do is instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard. 

All methods receive a String with the message to be displayed to the user, for example: "Enter your age", and return the appropriate data entered by the user in each method, for example: a byte with the user's age.

Methods to be implemented by catching the exception of the InputMismatchException class:
- public static byte readByte(String message);
- public static int readInt(String message);
- public static float readFloat(String message);
- public static double readDouble(String message);

  Methods to be implemented by catching the exception of the Exception class:
- public static char readChar(String message);
- public static String readString(String message);
- public static boolean readIfNo(String message), if the user enters "s", it returns "true", if the user enters "n", it returns "false".


## Task 3

[Level 1 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task3/n1exercise1)

Create a class called Month with a "name" attribute (which will store the name of the month of the year). Add 11 Month objects (each with a different attribute) to an ArrayList, except for the object with the "August" attribute. It then inserts into the place corresponding to that month and shows that the ArrayList maintains the correct order.
Convert the ArrayList from the previous exercise to a HashSet and make sure it doesn't allow duplicates.
Iterate through the list with a for and an iterator.


[Level 1 - Exercise 2](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task3/n1exercise2)

Create and populate a List<Integer>. 
Create a second List<Integer> and insert the elements of the first list into the second list in reverse order. 
Use ListIterator objects to read the elements of the first list and insert them into the second.

[Level 1 - Exercise 3](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task3/n1exercise3)

Given the file countries.txt (check the resources section) that contains countries and capitals. The program must read the file and store the data in a HashMap<String, String>. The program asks for the user's name, and then it must show a random country, saved in the HashMap. It is about what the user has to write the name of the capital of the country in question. If you get it right, you get a point. This action is repeated 10 times. Once the capitals of 10 countries have been requested randomly, then the name of the user and their score must be saved in a file called classificacio.txt.

[Level 2 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task3/n2exercise1)

Create a class called Restaurant with two attributes: name(String) and score(int). Implement the necessary methods so that Restaurant objects with the same name and the same score cannot be entered in a HashSet created in the main() of the application.

[Level 2 - Exercise 2](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task3/n2exercise2) 

Using the program class above, create the necessary implementation so that the objects of the Restaurant class are sorted by name and by score in ascending order. 
Example: 
name: restaurant1, score: 8
name: restaurant1, rating: 7

## Task 4

[Level 1 - Exercise 1](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task4/n1exercise1)

Create a Java class that inserts the names of the months of the year into an ordered list.
Verify with jUnit that the list has 12 positions, that it is not null and that position 8 contains the name 'August'.

[Level 1 - Exercise 2](https://github.com/marinaaguiar/ITAcademy/tree/main/src/main/java/io/alecrim/itacademy/sprint1/task4/n1exercise2)

Create a class called CalculoDni that calculates the letter of the DNI by receiving the number as a parameter.
Create a jUnit class that verifies its correct operation, parameterizing it so that the test receives a wide spectrum of data and validates if the calculation is correct for 10 predefined ID numbers.

Level 1 - Exercise 3

Create a class with a method that throws an ArrayIndexOutOfBoundsException.
Verify its correct operation with a jUnit test.













