package Question88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    // NOTE: FILE IS LOCATED IN OUTSIDE THE SRC FOLDER
    // FILE NAME IS anshu or anshu.txt or ANSHU or ANSHU.TXT
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in the world of ReadFile.");
        System.out.print("Enter your file name: ");
        String filename = input.next();

        try(FileReader reader = new FileReader(filename)){
            int singleChar;

            while ((singleChar = reader.read()) != -1){
                System.out.print((char) singleChar);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%S not found! Please check the filename.\n",filename);
            System.out.println("full error is: "+e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
