## Working with percentages in programming

1. **Calculating a percentage of a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = (number * percent) / 100;
   System.out.println(result);  
   Output: 20.0
   ```

2. **Adding a percentage to a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number + (number * percent) / 100;
   System.out.println(result);
   Output: 120.0
   ```

3. **Subtracting a percentage from a given number:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number - (number * percent) / 100;
   System.out.println(result);  
   Output: 80.0
   ```

4. **Finding the percentage of one number relative to another:**
   ```java
   int number1 = 20;
   double number2 = 100;
   double result = (number1 / number2) * 100;
   System.out.println(result); 
   Output: 20.0
   ```

5. **Increasing a number by a percentage:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number * (1 + percent / 100);
   System.out.println(result); 
   Output: 120.0
   ```

6. **Decreasing a number by a percentage:**
   ```java
   int number = 100;
   double percent = 20;
   double result = number * (1 - percent / 100);
   System.out.println(result);  
   Output: 80.0
   ```

7. **Percentage change between two numbers:**
   ```java
   int startNumber = 100;
   double endNumber = 120;
   double percentChange = ((endNumber - startNumber) / startNumber) * 100;
   System.out.println(percentChange); 
   Output: 20.0
   ```

8. **Reverse calculating percentage:**
   If you know the end number and the percentage applied, you can find the original number with the following formula:
   ```java
   int endNumber = 120;
   double percent = 20;
   double startNumber = endNumber / (1 + percent / 100);
   System.out.println(startNumber); 
   Output: 100.0;
   ```
