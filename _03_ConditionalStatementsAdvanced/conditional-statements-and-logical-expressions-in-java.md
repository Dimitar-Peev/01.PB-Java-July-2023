## Conditional Statements and Logical Operators

### Conditional Statements

**if statement**
```java
if (condition) {
    // block of code to be executed if the condition is true
}
```

**if-else statement**
```java
if (condition) {
    // block of code to be executed if the condition is true
} else {
    // block of code to be executed if the condition is false
}
```

**if-else-if ladder**
```java
if (condition1) {
    // block of code to be executed if condition1 is true
} else if (condition2) {
    // block of code to be executed if condition2 is true
} else {
    // block of code to be executed if all previous conditions are false
}
```

**switch statement**
```java
switch (variable) {
    case value1:
        // code to be executed for value1
        break;
    case value2:
        // code to be executed for value2
        break;
    ...
    default:
        // code to be executed if none of the values match
}
```

### Logical Operators

**&& (logical AND)**
```java
if (condition1 && condition2) {
    // block of code to be executed if both conditions are true
}
```

**|| (logical OR)**
```java
if (condition1 || condition2) {
    // block of code to be executed if at least one of the conditions is true
}
```

**! (logical NOT)**
```java
if (!condition) {
    // block of code to be executed if the condition is false
}
```

### Comparison Operators

**== (equal to)**
```java
if (a == b) {
    // code to be executed if a is equal to b
}
```

**!= (not equal to)**
```java
if (a != b) {
    // code to be executed if a is not equal to b
}
```

**> (greater than)**
```java
if (a > b) {
    // code to be executed if a is greater than b
}
```

**< (less than)**
```java
if (a < b) {
    // code to be executed if a is less than b
}
```

**>= (greater than or equal to)**
```java
if (a >= b) {
    // code to be executed if a is greater than or equal to b
}
```

**<= (less than or equal to)**
```java
if (a <= b) {
    // code to be executed if a is less than or equal to b
}
```

### Ternary Operator

```java
variable = (condition) ? expression1 : expression2;
```
The ternary operator is a shorthand for `if-else` and assigns a value to a variable based on the result of the condition.