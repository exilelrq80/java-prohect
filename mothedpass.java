package mo4;
public class Mo4 {
    public static void main(String[] args) {
        int t = 3;
        System.out.println("befor call," + "t is " + t);
        nprint("maha",t);
        System.out.println("after call," + "t is " + t);

    }
    public static void nprint(String message,int t){
        System.out.println("The mthod nprint is called "); 
        if (t > 0){
        System.out.println("t ="+ t);
        System.out.println(message); t--;
        }
    
    
    }
    
}
