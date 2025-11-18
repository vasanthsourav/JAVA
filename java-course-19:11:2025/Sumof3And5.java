public class Sumof3And5
{
    public static void main(String[] args) {
        int countofmatches=0;
        int sumofmatches=0;
        for(int i=1; i<=1000; i++)
        {
            if((i % 3 ==0) && (i % 5==0) )
            {
                countofmatches++;
                sumofmatches += i;
                System.out.println("found" +i) ;
            }
            if (countofmatches ==5) {
                break;
               
            }
             }
              System.out.println("sum is" +sumofmatches);
       
    }
}