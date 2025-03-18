# Java tutorial

# Introduction
```commandline
    public static void main(String[] args) {

    }
```
- need this method for the program to run

### running the program
- click the green arrow on the top right
- shortcut to run Setting > Keymap > main menu > Run > Run
  - currently set to shift + R
- if successful, should have no errors
- exit code 0 = everything is running fine
- without the main method, could not actually run the program

will end statements with semicolon

`
System.out.println("word");
`
will print line, now the string will be printed on separate lines instead of continuous

`System.out.print("word\n");`

The `\n` is an escape sequence for a new line.
will also work to print on separate lines

### comments
use `//`
- good for notes
- will not run

multiline comment `/* comment */`

### changing the ouput font
file > settings > color scheme > console colors

console > standard output


### shortcut with intellij
sout => `System.out.println()`


# 2. Variables
variable = a reusable container for a value

declaration + assignment = variable
```commandline
int age = 21;
```

if assigned a different type = incompatible
- if declared a variable to store int, can only store int

```commandline
System.out.println("The year is " + year);
```

variable naming convention in Java = camelCase

```commandline
if (isStudent) {
    System.out.println("You are a student")
}
```

assigning value to variable:
- single quote ('') for char
- double quote ("") for string

# user input 
## scanner 
- object that allow us to accept user input in Java
- need to import from package `util`

```commandline
import java.util.Scanner
```
- create a scanner object to get user input 

```commandline
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your name: ")
String name = scanner.nextLine();

System.out.println("Hello " + name)
scanner.close()

```
- `Scanner` = the object
- `scanner` = the name of the object we will be working with
- `new Scanner(System.in)` = the scanner object can read user input
- `scanner.close()` = close the scanner when finished using it
  - if not closed can lead to unexpected behaviours
- `scanner.nextLine()` = user can type in text 
  - read input from user including any spaces
  - if dont want spaces = `scanner.next()`

for taking in integer input `scanner.nextInt()`
- will get an error when input double in an int input line

`
scanner.nextDouble()
` for double input


### common issues
```commandline
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter favourite colour: ");
        String colour = scanner.nextLine();

        System.out.println("age: " + age);
        System.out.println("colour: " + colour);
```
- pressing enter after inputing the integer
- the next line method picks up the new line character `\n` with enter and using it as the input

solution:
- add `scanner.nextLine()` after the integer and not assigning to a variable
  - input buffer

# arithmetic operator
+, - , *, /, %

# augmented assignment operator
`x+= y` is the same as `x = x + y` 

- if the variable is assigned as integer, when dividing will not be able to store the decimal portion

# increment and decrement operator
`x++` is the same as `x+= 1`
`x--` is the same as `x-= 1`

# order of operations
P-E-M-D-A-S

# if statement
```commandline
if (condition) {
    // some code
} else if(condition) {
    // some code
}
else {
    // some code
}
```

`==` is direct comparison
- the if statements will check top down
- if the first condition is true, will skip the rest

`string.isEmpty()`
- checks if a string is empty

emoji = command + control + space


# random numbers
```commandline
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    
        Random random = new Random()
        
        int number = random.nextTint()
        
    }
}
```

- will produce a very large random integer
- range -2 bil-2 bil

```commandline
number = random.nextInt(1,6)
```

- get a random number 1-5
- first number inclusive
- second number exclusive

can also generate random doubles
```commandline
number = random.nextDouble()
```
- random number between 0-1

```commandline
isHeads = random.nextBoolean()
```

# math methods
```commandline
Math.PI
Math.E
```
- Returns the value of pi
- e = exponential constant / Euler's number

```commandline
Math.pow(2, 3)
```
- raise 2 to the power of 3
- 2³

```commandline
Math.abs(-5)
```
- the absolute value of -5
- gives the value of the number but positive
- the distance from 0

```commandline
Math.sqrt(9)
```
- returns the square root of 9

```commandline
Math.round(3.14)
```
- will return 3.0
- round to the nearest integer

```commandline
Math.ceil(3.14)
```
- rounds up
- will return 4.0

```commandline
Math.floor(3.99)
```
- round down
- return 3.0

```commandline
Math.max(10,20)
Math.min(10,20)
```
- return max and min   


```commandline
System.out.printf("%.1fcm", 3.1448973897);
```
- will return `3.1cm`

# printf statement
- used to format output
- insert a variable 
  - add a placeholder `%`

  - `%[flags][width][.precision][specifier-character]`

```commandline
System.out.printf("Hello %s", name);
```
- `%s` = defined that the variable is a string 
- `%c` = char variable
- need to manually insert new line character
- `%d` = integers
- `%f` = double
- `%b` = boolean

```commandline
%+.1f
%,.1f
%(.1f
% .1f
```
- the `[.precision]` is inserted before the `[specifier-character]`
- adding `+` display + for positive numbers
- adding `,` separate the numbers with a comma
- adding `(` will enclose negative numbers in a `( )`
- adding space ` ` will add space in front of a positive number and `-` in front of a negative number

```commandline
%04d
%4d
%-4d
```
- will pad the numbers with 0
- need to add how many numbers to pad, `4` in this example
- will result in numbers like
  - 0001
  - 0023
  - 0456
  - 7899
- can remove the `0`, to pad with only spaces
- `-` will left justify the numbers

# string methods
```commandline
string.length()
```
- get length of string

```commandline
string.charAt(index)
```
- give the character at `index`

```commandline
string.indexOf("o");
```
- return the index of the first occurrence of the letter 'o'

```commandline
string.lastIndexOf("o");
```
- return the last index of a character
- the index number of the last occurrence of a character

```commandline
string.toUpperCase()
string.toLowerCase()
string.trim()
```

```commandline
string.replace("o", "a");
```
- replaces any 'o' with 'a'

```commandline
string.isEmpty()
```
- return boolean if string is empty

```commandline
string.contains(" ");
```
- return boolean if a string contains a character

```commandline
string.equals("password");
```
- return boolean if 2 string matches
- does not account to case sensitivity
- `string.equalsIgnoreCase("password")` is case insensitive 


# string substring methods
- can create new string from portions of a string

```commandline
string.substring(startIndex, endIndex)
```
- `startIndex` inclusive
- `endIndex` exclusive
  - not necessary to give an `endIndex`
  - if not provided, will get the rest of the string

```commandline
String username = email.substring(0, email.indexOf("@"));
```
- `string.indexof()` returns the index of the given character
- 