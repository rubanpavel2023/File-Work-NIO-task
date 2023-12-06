package FileWorkNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    String readFromFile(Path filePath) {
        try {
            return new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return "  ";
        }

    }
}
