import java.util.Scanner;

public class A3
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String sentence = sc.next();
        String word[]=sentence.split(" ");
        String reversedWord = "";

        for (int i =word.length-1; i>=0; i--) 
        {

            reversedWord = reversedWord + word[i]+" ";
        }
        System.out.println("The word in reverse order is: " + reversedWord);

    }
}
