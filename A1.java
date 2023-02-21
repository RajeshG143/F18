import java.util.Scanner;
public class A1
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int count = 1;
        for (int i = 0; i < words.length; i++)
 {
            for (int j = i + 1; j < words.length; j++)
 {
                if (words[i].equals(words[j]) ) 
{
                    count++;
                    words[j] = "0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "-" + count);
            count = 1;
        }
    }
}


