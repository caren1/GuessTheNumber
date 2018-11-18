import java.util.Scanner;

public class GameOperator {

    public void rePlay(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to play again? ( Y / N )");
        String answer = sc.nextLine();

        if (answer.equals("Y")){
            System.out.println("Let's play again!");
            ZgadnijLiczbe zgadnijLiczbe = new ZgadnijLiczbe();
            zgadnijLiczbe.play();

        }
        if (answer.equals("N")){
            System.out.println("Thank you for playing! See you next time!");

        }
    }

}
