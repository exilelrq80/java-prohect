
package javaapplication٤٩;
public class JavaApplication٤٩ {
    public static void main(String[] args) {
        int [][] array = new int [5][4];
        for (int row=0; row<array.length; row++){
            for (int col=0; col<array[row].length; col++){
                array[row][col]=5;
        }}
        for (int row=0; row<array.length; row++){
            for (int col=0; col<array[row].length; col++){
                System.out.print(array[row][col]+"/t");
                
            }
        }
    }
    
}
