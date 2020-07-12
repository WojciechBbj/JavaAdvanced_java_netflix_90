package recources;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystemVideoCatalog extends UniqueVideoCassetteCatalog {

    private final Path file = Paths.get("cassettes.txt");

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException {
        super.addVideoCassette(videoCassette);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String string = objectMapper.writeValueAsString(videoCassette);
            bufferedWriter.write(string);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        }
    }
}
