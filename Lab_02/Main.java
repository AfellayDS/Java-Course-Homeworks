import java.util.Scanner;

/* The program reads words (characters separated by spaces)
from standard input until it encounters the word "exit". */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter string: ");

        String word;
        while (console.hasNext()) {
            word = console.next();
            if (word.equals("exit"))
                break;
            System.out.println(word);
        }

        console.close();
    }
}
