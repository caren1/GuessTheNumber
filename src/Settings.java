import java.util.Random;
import java.util.Scanner;

public class Settings {


   private DifficultyLevel difficultyLevel;

    private int lifeCounter;
    private int numberToGuess;

    public void  setSettings(){
        System.out.println("###### W E L C O M E    I N     R A N D O M      N U M B E R ######"+ "\n\r");
        Scanner sc = new Scanner(System.in);
       numberToGuess= generateRandomNumber();

        System.out.println("Please choose desired difficulty level : ( EASY ; NORMAL ; HARD )");
        String dificultyLevel = sc.nextLine();
        setDifficultyLevel(DifficultyLevel.fromString(dificultyLevel));
        System.out.println("~~~~~~~~~~! EVERYTHING IS SET NOW, READY TO GO? !~~~~~~~~~~ " + "\n\r" );
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public int getLifeCounter() {
        return lifeCounter;
    }

    public void setLifeCounter(int lifeCounter) {
        this.lifeCounter = lifeCounter;
    }


    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        if (difficultyLevel == DifficultyLevel.EASY) {
            setLifeCounter(99);
        } else if (difficultyLevel == DifficultyLevel.NORMAL) {
            setLifeCounter(15);
        } else if (difficultyLevel == DifficultyLevel.HARD) {
            setLifeCounter(5);
        }
        System.out.println("You've chosen the difficulty : " + difficultyLevel);
    }

    private int generateRandomNumber() {
        int scopeLower;
        int scopeHigher;
        System.out.println("I will generate a random number for you now.. " + "\n\r");
        System.out.println("Please provide the lower scope for the numbers : "+ "\n\r");
        Scanner scopeInput = new Scanner(System.in);
        scopeLower = scopeInput.nextInt();
        System.out.println("Please provide a higher scope for the numbers : "+ "\n\r");
        scopeHigher = scopeInput.nextInt();

        Random random = new Random();
        int numberToGuess = random.nextInt((scopeHigher - scopeLower) + 1) + scopeLower;
        System.out.println("I've generated a RANDOM NUMBER for you, from scope of : " + scopeLower + " - " + scopeHigher);
        return numberToGuess;
    }
}
