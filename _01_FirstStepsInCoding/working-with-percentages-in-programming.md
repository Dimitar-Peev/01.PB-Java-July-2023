## Working with percentages in programming

1. **Calculating a percentage of a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = (number * percent) / 100;
   System.out.println(result);  // # Output: 20.0
   ```

2. **Adding a percentage to a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number + (number * percent) / 100;
   System.out.println(result);  // # Output: 120.0
   ```

3. **Subtracting a percentage from a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number - (number * percent) / 100;
   System.out.println(result);  // # Output: 80.0
   ```

4. **Finding the percentage of one number relative to another:**
   ```python
   number1 = 20
   number2 = 100
   result = (number1 / number2) * 100
   print(result)  # Output: 20.0
   ```

5. **Increasing a number by a percentage:**
   ```python
   number = 100
   percent = 20
   result = number * (1 + percent / 100)
   print(result)  # Output: 120.0
   ```

6. **Decreasing a number by a percentage:**
   ```python
   number = 100
   percent = 20
   result = number * (1 - percent / 100)
   print(result)  # Output: 80.0
   ```

7. **Percentage change between two numbers:**
   ```python
   start_number = 100
   end_number = 120
   percent_change = ((end_number - start_number) / start_number) * 100
   print(percent_change)  # Output: 20.0
   ```

8. **Reverse calculating percentage:**
   If you know the end number and the percentage applied, you can find the original number with the following formula:
   ```python
   end_number = 120
   percent = 20
   start_number = end_number / (1 + percent / 100)
   print(start_number)  # Output: 100.0
   ```
