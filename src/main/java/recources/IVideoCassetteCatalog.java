package recources;

import java.util.ArrayList;
import java.util.List;

public interface IVideoCassetteCatalog {


    void addVideoCassette(VideoCassette videoCassette) throws CassetteAddException;
    void addAllVideoCassettes(VideoCassette... videoCassette) throws CassetteAddException;

    List<VideoCassette> getVideoCassettes();

}
