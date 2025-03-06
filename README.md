# AnnoLink

**AnnoLink** is a lightweight Java framework that enables **annotation-based method execution** using reflection. It allows dynamic function invocation without hardcoding method names, making it ideal for **command systems, scripting, and plugin-based architectures**.

## Features

✔ **Annotation-driven execution** – Uses `@Executable` to mark methods for dynamic invocation.  
✔ **Reflection-based method lookup** – Finds and executes methods based on an assigned key.  
✔ **Lightweight and flexible** – No external dependencies, works seamlessly with any Java project.  
✔ **Encapsulated execution** – Cleanly handles method calls without exposing internal logic.  

---

## Installation

Simply copy `Function.java` and `Executable.java` into your Java project. No external dependencies are required.  

---

## Usage

### 1. Define Executable Methods

Mark methods with `@Executable`, assigning a unique key for identification.

```java
public class MyClass {

    @Executable(key = "greet")
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    @Executable(key = "add")
    public int add(int a, int b) {
        return a + b;
    }
}
```

### 2. Create and Execute Functions

Use the `Function` class to dynamically execute methods based on their assigned key.

```java
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Creating a Function instance for "greet"
        Function greetFunction = new Function("greet", obj);
        Object result = greetFunction.execute(new Object[]{"John"});
        System.out.println(result); // Output: Hello, John!

        // Creating a Function instance for "add"
        Function addFunction = new Function("add", obj);
        Object sum = addFunction.execute(new Object[]{5, 10});
        System.out.println(sum); // Output: 15
    }
}
```

---

## Class & Annotation Overview

### `@Executable` Annotation

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Executable {
    String key();
}
```
- Marks a method for dynamic execution.  
- Requires a **unique key** to identify the method.  

### `Function` Class

```java
public class Function {
    private final String KEY;
    private final Object Class;

    public Function(String key, Object Class) { ... }

    public Object execute(Object[] param) { ... }
}
```
- Searches for methods annotated with `@Executable`.  
- Matches the method using the provided key.  
- Executes the method using Java reflection.  

---

## Use Cases

🔹 **Command Execution Systems** – Run functions dynamically based on user input.  
🔹 **Plugin-based Architectures** – Load and execute methods from external modules.  
🔹 **Scripting & Automation** – Invoke different functions dynamically using script instructions.  
🔹 **Event-driven Applications** – Trigger actions dynamically based on runtime conditions.  

---

## License
This project is licensed under the **Apache License 2.0**.  
See the [LICENSE](LICENCE.txt) file for details.

---

## Notes

- The method signature must match the provided parameters.  
- If no matching method is found, the function returns `null`.  
- If the method returns `void`, the return value should be ignored.  
