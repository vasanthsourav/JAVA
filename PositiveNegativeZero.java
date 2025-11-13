public class PositiveNegativeZero {
    // write code InheritableThreadLocal
   public static void main (String[] args)
   {
       checkNumber(22);
   }
    public static void checkNumber(int Number)
    {
        //int Number;
        if (Number > 0)
        {
            System.out.println("Positive");
        }
        else if (Number < 0)
        {
            System.out.println("Negative");
        }else
        {
        System.out.println("Zero");
        }
            
        }
    
}