# AnnoLink
**AnnoLink** is Light weight java library for replacing explicit functional interfaces.This library is based on annotation based Method passing. This type of Method execution can be performed dynamically also.


# Features
1. Annotation-Based Method Passing
2. Type-Safe and Flexible
3. Works with Any Method
4. Clean and Readable Code
5. Lightweight and Fast
6. Compatible with Existing Java Code
7. Ideal for Functional and Driven Programming


# How It Works
1. Annotate the method which is to be called, with `@Executable(key = "[KEY]")`.
2. Now Create a instance of `Function` with same key as above i.e. [KEY].
3. Now call `execute` method of `Function` class and pass the list of Arguments required to the method which is to be called.
4. The method will be executed on same thread and return the result.
    
   > Replace [KEY] with any string you want.


# Contributions
Contribution are welcome! If you'd like to improve **AnnoLink**, feel free to submit a pull request.

# About
Created by Prathmesh kumbhar.
If you have any questions or suggestion, feel free to reach out. 
Gmail ID : kumbharprathmesh213@gmail.com
