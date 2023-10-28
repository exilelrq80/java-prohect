package rivewfinlly;
public class Rivewfinlly {
    
 /*Define a method that print sum of integers from 1 to 10, from 20 to 37, and from
 35 to 49, respectively */
    public static void main(String[] args) {
        System.out.println("from 1 to 10:\t" +sum(1,10));
        System.out.println("from 20 to 37:\t" + sum(20,37));
        System.out.println("from 35 to 49:\t" + sum(35,49));
}
    // method
   public static int sum(int x, int y)  {
       int result = 0;
       for(int i=x; i<=y; i++)
           result += i ;
             return result;
       
   }
}
