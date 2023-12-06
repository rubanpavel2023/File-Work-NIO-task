package FileWorkNIO;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static FileWorkNIO.BaseURL.BASE_URL;


public class FileCreat {
    static void runCreatFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scan.nextLine();
        System.out.println("Select 1 - CREATE or 2 - READ file");
        int selected = scan.nextInt();
        scan.nextLine();
        Path filePath = Paths.get(BASE_URL + fileName + ".txt");
        FileWriteService writer = new FileWriteService();
        FileReadService reader = new FileReadService();
        switch (selected) {
            case 1:
                System.out.println("Enter text to write to file:");
                String text = scan.nextLine();
                writer.writeToFile(filePath, text);
                break;
            case 2:
                String output = reader.readFromFile(filePath);
                System.out.println("file text: " + output);
                break;
            default:
                System.out.println("Input Error. Choose 1 or 2");
        }
        scan.close();
    }
}

