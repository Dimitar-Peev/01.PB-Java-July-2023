## Modulo operation

Modulo operation, at its core, is like regular division, but instead of telling you how many times one number fits into another, it tells you what's left over. If you divide 10 apples between 2 baskets, it's clear that each basket will have 5 apples. But if you divide 10 apples between 3 baskets, each will have 3 apples with 1 apple left over. This one apple that doesn't fit into the baskets and remains outside is the "remainder" from the modulo operation.

Here are a few examples of how modulo operation can be used in real life:

1. **Event Planning**: If you have 25 guests and 4 tables, and you want to know if everyone can sit evenly, modulo operation can help you find out that 1 person will be left standing (25 % 4 = 1).

2. **Programming Alarms**: If you want your alarm to ring every 3 hours, you can use modulo operation to check if the current hour divided by 3 doesn't leave a remainder (for example, if it's 10 AM, the alarm won't ring because 10 % 3 is 1).

3. **Card Games**: In card games, if you're dealing cards to 4 players and there are a total of 52 cards, modulo operation can tell you if the cards will be dealt evenly or if someone will get more (52 % 4 = 0, which means an even distribution).

4. **Computer Science**: In hashing, when you want to store data in a hash table, modulo operation helps you determine which slot in the table to put the data in (for instance, the hash value 1000 % 10 tells you to place the data in slot 0 of the table).

### Example 1: Remainder when dividing a smaller number by a larger one

```java
# We have two numbers
int a = 10;
int b = 3;

# We use the modulo operation to find the remainder
int remainder = a % b;

System.out.printf("The remainder of dividing {a} by {b} is {remainder}.", a, b);
```
**Explanation:** When we divide 10 by 3, we have 3 whole numbers in the quotient and a remainder of 1. The modulo operation gives us this remainder.

### Example 2: Remainder when dividing a larger number by a smaller one

```python
# We switch the values from the previous example
a = 3
b = 10

# We again use the modulo operation
remainder = a % b

print(f"The remainder of dividing {a} by {b} is {remainder}.")
```
**Explanation:** When dividing 3 by 10, we cannot have a whole number because 3 is less than 10. Therefore, the result of the modulo operation is the number itself, 3.

### Example 3: Modulo division with 0

```python
# Attempt at modulo division by 0
a = 5
b = 0

# We try to perform the modulo operation
try:
    remainder = a % b
    print(f"The remainder of dividing {a} by {b} is {remainder}.")
except ZeroDivisionError:
    print("Division by zero is not possible.")
```
**Explanation:** Modulo division by zero is undefined and will cause an error because you cannot divide a number by zero.

### Example 4: Finding the remainder when dividing a negative number

```python
# We have a negative and a positive number
a = -7
b = 5

# We perform the modulo operation
remainder = a % b

print(f"The remainder of dividing {a} by {b} is {remainder}.")
```
**Explanation:** When dividing a negative number by a positive one, Python adds b until it reaches the next number below zero that is divisible by b without a remainder. In this case, `-7 % 5` gives us `3`, because `-7 + 5 = -2`, and `-2 + 5 = 3`, which is the first non-negative number obtained by adding multiples of 5 to -7.