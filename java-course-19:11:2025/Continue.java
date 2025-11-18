public class Continue {
    public static void main(String[] args) {
        int number=10;
        while(number<200)
        {
            number+= 20;
             if(number %50 ==0){
                continue;
            }
            System.err.print(number + " _");
           
        }
    }
}
