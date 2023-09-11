public class Main {
      public static void main(String[] args) {
     //datetype[][] Arrayname = {Matrix elements}
     //نوع المصفوفة [][] اسم المصفوفة = {عناصر المصفوفة} 
        int [][] EX1={{0,0},{1,1},{2,2}};
        for (int row=0; row<EX1.length; row++){
            for(int col=0; row<EX1.length; col++){
              System.out.print(EX1[row][col] +" ");
            }
            System.out.println();
        }
        
    }
}
