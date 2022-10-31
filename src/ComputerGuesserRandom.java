import java.util.Random;
public class ComputerGuesserRandom implements IGuesser {
    private int min;
    private int max;

    private int currentGuess;

    public void yourTurn() {}

    public String getName()
    {
        return "Computer guesser";
    }

    public void newGame(int min, int max, String opponent, String type)
    {
        this.min = min;
        this.max = max;
    }

    public int makeGuess()
    {

        Random r1 = new Random();
        currentGuess = r1.nextInt(min, max);
        return currentGuess;
        //return (min + max) / 2;
    }

    public void guessFeedback(Answer answer)
    {
        switch(answer)
        {

            case TOO_LOW:
                min = currentGuess + 1;
                //min = ((min + max) / 2) + 1;
                break;
            case TOO_HIGH:
                max = currentGuess - 1;
                break;
            case CORRECT:
                break;
            default:
                throw new RuntimeException("This should never happen!");
        }
    }

    public boolean endOfGame(int numberOfGuesses, String opponent)
    {
        return true;
    }

}
