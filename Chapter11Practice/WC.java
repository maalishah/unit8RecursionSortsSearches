import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class WC
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
        File inputFile = new File("R&J.txt");
        Scanner s = new Scanner(inputFile);
        int wordCount = 0;
        s.useDelimiter("[^A-Za-z]+");
        while(s.hasNext())
        {
            String value = s.next();
            wordCount++;
        }
        s.close();
        
        System.out.println(wordCount);
    }
}
