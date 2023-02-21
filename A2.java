import java.io.*;
import java.util.*;

public class A2 
{
public static void main(String[] args) 
 {
        Scanner sc= new Scanner(System.in);
        String input="";
        String line = null;
        Map<String, String> map = new HashMap<String, String>();
        try 
            {
            FileReader fr = new FileReader("/home/rajesh/java/MVI/f18/Items.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) 
            {
                String content [] = line.split(",");
                map.put(content[0],content[1]);
            }
            br.close();
        } 
catch (IOException e) 
        {
            e.printStackTrace();
        }

        System.out.println(map);
        System.out.println("Enter the product ID");
       input = sc.nextLine();
        System.out.println(map.get(input));

   }
}
