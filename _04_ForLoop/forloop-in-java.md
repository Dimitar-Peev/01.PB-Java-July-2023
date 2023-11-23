## For loop in java

### Introduction to Loops
Loops are fundamental constructs in programming, allowing repeated execution of a block of code either a set number of times or until a certain condition is met. They are incredibly useful for processing collections of data, performing repetitive operations, or simply saving the effort of writing redundant code.

In Java, as in most programming languages, there are several types of loops, but one of the most used is the `for` loop. It's particularly suited for scenarios where the number of iterations is known in advance or can be easily determined. The `for` loop has three main components: initialization, continuation condition, and iteration step. These components control the start, continuation, and end of the loop.

### Standard `for` Loop:
```java
for (initialization; condition; iteration) {
    // code to be executed in each iteration
}
```
- **Initialization**: Setting an initial value.
- **Condition**: Loop continues as long as this condition is true.
- **Iteration**: Update the value for the next iteration.

**Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println("The value of i is: " + i);
}
```

### Enhanced `for` Loop (For-Each):
Used to iterate through elements of a collection or array.
```java
for (DataType item : collection) {
    // code executed for each element
}
```
**Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

### Infinite `for` Loop:
A loop that runs indefinitely unless interrupted (e.g., with a `break`).
```java
for (;;) {
    // code that runs indefinitely
}
```

### Nested `for` Loops:
A loop inside another loop. The inner loop completes before the outer loop continues to its next iteration.
```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.println("i = " + i + ", j = " + j);
    }
}
```