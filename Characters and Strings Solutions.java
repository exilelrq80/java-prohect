public class Lap2 {
    public static void main(String[] args) {
         String x= "Java Exercises!";
         System.out.println("The character at position 0 is "+ x.charAt(0));
         System.out.println("The character at position 10 is "+ x.charAt(10));
         // 2
         String x1= "PHP Exercises and";
         String x2=" Python Exercises";
         System.out.println("The concatenated string: "+ x1.concat(x2));
         //3
          String x3= "The Quick BroWn FoX!";
          System.out.println("String in lowercase: " +x3.toLowerCase());
          //4
          System.out.println("String in uppercase: "+ x3.toUpperCase());
          //5
          String hannah = "Did Hannah see bees? Hannah did.  ";
          System.out.println(hannah.length());
          System.out.println(hannah.charAt(12));
          System.out.println(hannah.charAt(15));
          //System.out.println(hannah.indexOf('b'));
          //6
          System.out.println(hannah.trim());
              }
