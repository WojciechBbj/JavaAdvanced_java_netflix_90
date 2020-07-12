package recources;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class FileSystemVideoCatalog extends UniqueVideoCassetteCatalog {

    public static void main(String[] args) {
        FileSystemVideoCatalog catalog = new FileSystemVideoCatalog();

        System.out.println("Katalog: " + catalog.getVideoCassettes());
    }

    private final Path file = Paths.get("cassetts.txt");

    private final ObjectMapper objectMapper = new ObjectMapper();

    public FileSystemVideoCatalog() {
        try (BufferedReader bufferedReader = Files.newBufferedReader(file)) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                VideoCassette cassette = objectMapper.readValue(line, VideoCassette.class);
                super.addVideoCassette(cassette);
            }
        } catch (IOException | CassetteAddException e) {
            System.out.println(e.getMessage());
            throw new CassetteReadException("Cannot read file");
        }
    }

    @Override
    public void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException {
        super.addVideoCassette(videoCassette);
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            String string = objectMapper.writeValueAsString(videoCassette);
            bufferedWriter.write(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        }
    }

    @Override
    public void addAllVideoCassettes(VideoCassette... videoCassette) throws CassetteAddException {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(file, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (VideoCassette cassette : videoCassette) {
                super.addVideoCassette(cassette);
                String string = objectMapper.writeValueAsString(cassette);
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            String string = objectMapper.writeValueAsString(videoCassette);
            bufferedWriter.write(string);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new CassetteAddException(e.getMessage());
        }
    }
}
