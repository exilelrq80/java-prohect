package mo12;
public class Mo12 {
    public static void main(String[] args) {
        //Creating Strings 
        char [] helloArray= {'h','e','l','l','o'};
        System.out.println(helloArray);
        //String Comparisons
        String s1= new String("Wellcome to java");
        String s2= "Wellcome to java";
        System.out.println("s1 == s2 " + (s1 == s2)); // False becanuse == use with intger
        System.out.println("s1.equals(s2)"+ (s1.equals(s2)));
        //String Length 
        String W1 ="Wellcome to Java II";
        int len = W1.length();
        System.out.println(len);
        //Concatenating Strings 
        String x ="maha" , y ="Reem" ;
        System.out.println(x.concat(y));
        System.out.println("hello,"+"world");
        String string1 = "saw I was "; 
        System.out.println("Dot " + string1 + "Tod");
        //method
        System.out.println(x.charAt(0)); // number of char
        System.out.println(x.toUpperCase());
        System.out.println(x.concat(s2));
        System.out.println(x.trim()); //تحذف المسافه من البدايه والنهايه
        //Converting Strings to Numbers 
        String v="90";
        int f=99;
        System.out.println(Integer.parseInt(v));
        System.out.println(Double.parseDouble(y));
        // method
   System.out.println("isDigit('a') " + Character.isDigit('a'));
   System.out.println("isLetter('a')"+Character.isLetter('a'));
   System.out.println("isLowerCase('a')"+Character.isLowerCase('a'));
   System.out.println("isUpperCase('a')"+Character.isUpperCase('a'));
   System.out.println("toLowerCase('a')"+Character.toLowerCase('a'));
   System.out.println("toUpperCase('a')"+Character.toUpperCase('a'));
}
   }
