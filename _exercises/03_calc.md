---
title: Calculate
number: 3
lesson: 3
status: reviewed
authors: thanf
---

### Description
Create a class which can take two numbers (float or int, you can decide) and an arithmetic operator as a String (`"+"`, `"*"`, `"-"` and `"/"` should be sufficient). These attributes can be set via the constructor or Setter functions. The class should also have a method which does the calculation on the two number specified by the operator. The result can be printed out or given back to the caller.

Example:
- given (3,4,"+") the result should be 7.
- given (2,2,"*") the result should be 4.
- given (6,-8,"-") the result should be 14.


### Exercise
1. Create a class named `Calc`.
2. Give the class the needed attributes.
2. Define and implement the needed methods for the class. 
3. Create another class named `Main` with a `main` function.
4. Inside the `main` function create an object of type `Calc`, set the two numbers and the operator and call the function to do the calculation.
5. Verify the correctness of the result.

### Hints
- use only one function to do the calculation
- the file containing a class should have the same name as the class
- try using the constructor and later changing the attributes with the setter functions