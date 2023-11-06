package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try {
                Scanner scanner = new Scanner(new File("src/main/java/Step4/input.txt"));

                while(scanner.hasNext()){
                    String[] lineIn = scanner.nextLine();

                }

            }
            catch(IOException e){
                System.out.println("File not found!");
            }
        }
}