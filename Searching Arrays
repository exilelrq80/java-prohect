package mo9;
import java.util.Scanner;
public class Mo9 {
    public static void main(String[] args) {
        int [] x={5,6,4,3,7,8,9,1,2,0};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number search for:");
        int R=input.nextInt();
        int index=sequentialSearch(R,x);
        
        if(index==-1)
            System.out.println("number Not FOUND");
        else
            System.out.println("number FOUND at location: "+index);
    }
    public static int sequentialSearch(int R, int[] x) {
        for(int i=0;i<x.length; i++){
        if(x[i]==R)
            return i;
        }
       return -1;   
    } 
}
