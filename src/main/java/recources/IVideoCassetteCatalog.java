package recources;

import java.util.ArrayList;
import java.util.List;

public interface IVideoCassetteCatalog {


    void addVideoCassette(VideoCassette videoCassette);
    void addVideoCassette(VideoCassette... videoCassette);

    List<VideoCassette> getVideoCassettes();

}
