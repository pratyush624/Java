``THIS``
- The this keyword in Java is a reference to the current object — the instance of the class that is calling the method or accessing variables.
- The this keyword becomes important when dealing with values passed through objects, especially when there is potential for ambiguity between class variables (fields) and method parameters or local variables.
- To Invoke Other Constructors: You can use this() to call another constructor within the same class, helping to avoid code duplication
- To Pass the Current Object as a Parameter: Sometimes, we need to pass the current object to another method, often in external classes, using this
- To Return the Current Object: You might use this when you need a method to return the current instance of a class (commonly seen in method chaining)

```static```
The static keyword allows you to call a method (or access a variable) without creating an instance of the class. In other words, static members (variables, methods, blocks) belong to the class itself, not to individual objects. So, they can be accessed using the class name directly.