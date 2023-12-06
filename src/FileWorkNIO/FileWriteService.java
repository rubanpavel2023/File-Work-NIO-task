package FileWorkNIO;

import java.io.IOException;
import java.nio.file.*;

public class FileWriteService {
    void writeToFile(Path filePath, String text) {
        try {
            Files.write(filePath, text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




