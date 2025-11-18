public class challenge {
    public static void main(String[] args) {
     int gamescore = 100;
     int levelcompleted = 8;
     int bonus = 200; boolean gameover = true;
     int finalscore = gamescore + (levelcompleted * bonus);
     if (gameover==true) 
     {
            System.out.println("Your final score was " + finalscore);   
     }
    }
}
