import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();


        System.out.println(sentence.replace("oops", "***")
                .replace("dang", "***")
                .replace("yikes", "***")
                .replace("nuts", "***"));
    }
}
