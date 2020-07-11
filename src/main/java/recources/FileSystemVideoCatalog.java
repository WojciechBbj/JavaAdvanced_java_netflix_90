package recources;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCatalog extends UniqueVideoCassetteCatalog {

    private final Path file = Paths.get("cassetts.txt");


    @Override
    public void addVideoCassette(VideoCassette videoCassette) {
        super.addVideoCassette(videoCassette);
        try {
            BufferedWriter bufferedWriter = Files.newBufferedWriter(file,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassettrAddException(e.getMessage());
        }
    }
}
