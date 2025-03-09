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