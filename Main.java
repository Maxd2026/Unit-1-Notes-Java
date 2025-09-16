// Every Java file is a CLASS
public class Main {
   // main METHOD is the ENTRYWAY to run the program
   public static void main(String []args) {
      System.out.println("Welcome to Java!");
      System.out.println("hiiii");

      // 1. DECLARE a new variable
      int score; 
      // 2. ASSIGN a value to the variable
      score = 72; 
      // INITIALIZE combines declaring + assigning
      String pokemon = "Pikachu";
      double healthPercent = 0.75;
      boolean isAlive = true; 

      // Use the plus sign to CONCATENATE (combine) Strings
      String greeting = "Hello "           + "World";
      System.out.println(greeting);
      // Quotation marks contain STRING LITERALS

      // OUTPUT: difference between .print & .pringln

      System.out.print("Hi");
      System.out.println("there");
      System.out.print("!");
      // .println displays the message THEN goes to next line

      // ESCAPE: use \ (backslash) to include special characters, use \n for line break
      String message = "\nI woke up and said, \"HELLO WORLD\" ";
      System.out.println(message);

      //ARITHMETIC expressions with operators
      System.out.println(4 + 3);
      System.out.println( 4 - 1);
      System.out.println(6 * 7);
      System.out.println(5 / 3); //TRUNCATED
      // Interger division results in TRUNCATION, which is basically throwing away the decimal places
      System.out.println(5.0 / 3);

      //COMPOUND expressions follow PEMDAS
      double result = 2 + (3 * 2 - 6);
      System.out.println(result);

      // REMAINDER % operator
      int remain = 23 % 2; // 1 -> means ODD number
      System.out.println(remain);
      System.out.println(628 % 2); // 0 -> means EVEN

      // Watch out for the plus sign!
      System.out.println(3 + "3"); // int + String 
      
      // You can set one variables to another's value
      int zach_age = 16;
      int aaniyah_age = zach_age;
      // both variables aboce contain the same value

      // Practice copying & re-assigning values
      int x = 15;
      int y = 21;
      int z = 2;
      x = y; // x now stores the same value as y
      y = y * 2;
      z = 27;
      System.out.println("X is " + x);
      System.out.println("Y is " + y);
      System.out.println("Z is " + z);

      // type mismatch error
      double num1 = 3; // int would cause an error below!
      double num2 = 3.14;
      num1 = 2 * num2; // cant fit a double in an int
      System.out.println(num1);

      // INCREMENT: add on to current value
      int points = 0;
      points = points + 1;
      // DECREMENT: decrease an existing value
      points = points - 15;
      System.out.println(points);


   }
}