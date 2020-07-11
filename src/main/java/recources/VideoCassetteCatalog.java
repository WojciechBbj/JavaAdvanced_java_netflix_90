package recources;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class VideoCassetteCatalog implements IVideoCassetteCatalog {

    public final List<VideoCassette> cassettes = new ArrayList<>();

    @Override
    public void addVideoCassette(VideoCassette videoCassette) {
        cassettes.add(videoCassette);
    }

    @Override
    public void addVideoCassette(VideoCassette... videoCassette) {
        for (VideoCassette cassette : videoCassette) {
                addVideoCassette(cassette);
        }
    }

    @Override
    public List<VideoCassette> getVideoCassettes() {
        return cassettes;
    }
}
