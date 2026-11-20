import java.util.*;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
    public static String[] words = {"envelope","cantaloupe","the","hello","microphone","elephant","biscuit","hammer","went","cap"};

    public static void main(String[] args) throws InterruptedException{
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for(int i = 0; i < 10; i++)
            System.out.print(words[rand.nextInt(words.length)] + " ");
        System.out.println();

        Scanner scnr = new Scanner(System.in);
        long start = System.nanoTime();
        if (!scnr.hasNextLine()) {
            return;
        }
        String typedWords = scnr.nextLine();
        double seconds = (System.nanoTime() - start) / 1_000_000_000.0;
        int wpm = (int) (typedWords.length() / 5.0 * 60 / seconds);
        System.out.println("Your wpm is "+wpm+"!");
    }
}
