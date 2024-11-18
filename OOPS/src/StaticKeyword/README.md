```static```
The static keyword allows you to call a method (or access a variable) without creating an instance of the class. In other words, static members (variables, methods, blocks) belong to the class itself, not to individual objects. So, they can be accessed using the class name directly.

```Static Methods```
- Can be called without creating an object.
- Can only access other static variables or methods.
- Cannot directly access non-static (instance) variables or methods.

```Static Variables```
- Belong to the class, and there is only one copy shared by all instances of the class.
- Useful for constants or shared resources.