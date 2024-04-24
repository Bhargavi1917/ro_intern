public class twoPair {
    public static void main(String[] args){
        for(int i=10;i<=99;i++)
        {
            for(int j=10;j<=99;j++)

                if(i+j==60 && i-j==14)
                {
                    System.out.println(i+" "+j);
                }
            }

        }
    }

