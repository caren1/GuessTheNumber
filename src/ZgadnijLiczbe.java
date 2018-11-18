import java.util.Scanner;

public class ZgadnijLiczbe implements Playable {

    private int lifesLeft;
    private int numberToGuess;
    GameOperator gameOperator = new GameOperator();

    private void setStartingValues(Settings settings) {
        lifesLeft = settings.getLifeCounter();
        numberToGuess = settings.getNumberToGuess();

    }

    @Override
    public void play() {
        Settings settings = new Settings();
        settings.setSettings();
        setStartingValues(settings);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you think is my number?" + "\n\r");

        boolean hasWon = false;

        while (lifesLeft > 0 && !hasWon) {

            int userLiczba = scanner.nextInt();

            if (userLiczba > numberToGuess) {
                System.out.println("Try again! YOUR NUMBER is HIGHER  than mine. Try again!" + "\n\r");
                lifesLeft--;
            }

            if (userLiczba < numberToGuess) {
                System.out.println("Try again! Unfortunately, YOUR NUMBER is LOWER than mine. Try again!"+ "\n\r");
                lifesLeft--;
            }
            if (userLiczba == numberToGuess) {
                hasWon = true;
                System.out.println("$$$$$$$$ EXCELLENT! YOU'VE GUESSED THE NUMBER! CONGRATULATIONS! $$$$$$$$");
                System.out.println("$$$$$$$$ MY NUMBER WAS " + numberToGuess + " $$$$$$$$ " + "\n\r");
                gameOperator.rePlay();

            }

        }
        if (lifesLeft == 0) {
            System.out.println(" --- GAME OVER --- ");
            System.out.println("You've lost all your lives." + "\n\r");
            gameOperator.rePlay();

            if (!hasWon) {
                System.out.println(" --- GAME OVER --- " + "\n\r");
                gameOperator.rePlay();


            }
        }

    }
}

