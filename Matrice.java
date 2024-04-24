import java.util.*;
public class Matrice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
     int m1=sc.nextInt();
     int n1=sc.nextInt();
        int m2=sc.nextInt();
        int n2=sc.nextInt();

     int[][] mat1=new int[m1][n1];
     int[][] mat2=new int[m2][n2];
     int[][] res=new int[m1][n2];
        if(n2!=m1){
            System.out.println("Multiplication is not possible");
        }
     System.out.println("Enter values for matrice1:");
     for(int i=0;i<m1;i++)
     {
         for(int j=0;j<n1;j++)
         {
             mat1[i][j]=sc.nextInt();
         }
     }

        System.out.println("Enter values for matrice2:");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                for(int k=0;k<n1;k++)
                {
                    res[i][j]=res[i][j]+mat1[i][k]*mat2[k][j];
                }
            }
        }
        System.out.println("the result is:");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }




    }
}
