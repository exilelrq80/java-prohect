/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearectangal1;

import java.util.Scanner;
public class Arearectangal1 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      System.out.print("Enter the length:");
      int len=input.nextInt();
      System.out.print("Enter the width:");
      int wid=input.nextInt();
      int area=len*wid;
      System.out.print("The area of Rectangle is: "+area);
    }
    
}
