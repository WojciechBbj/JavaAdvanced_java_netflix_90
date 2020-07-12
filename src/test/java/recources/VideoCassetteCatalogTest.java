package recources;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static recources.Gender.FEMALE;
import static recources.Gender.MALE;

class VideoCassetteCatalogTest {

    //test sprawdza czy utworzony katalog jest wyjsciowo pusty

    @Test
    public void thatShouldCreateCatalogThatIsEmpty() {

        //given
        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();

        //when


        //then

        Assertions.assertThat(catalog.getVideoCassettes()).isEmpty();
    }

    @Test
    public void thatShouldAddVideoCassetteToCatalog() throws CassetteAddException {

        //given

        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "THE ROOM",
                new Director("Tommy", "Wiseau", MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", MALE), new Actor("Juliette", "Danielle", FEMALE), new Actor("Greg", "Sestero", MALE))
        );

        //when

        catalog.addVideoCassette(videoCassette);

        //then

        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(1);
    }

    @Test
    public void thatShouldAdd2VideoCassettesToCatalog() throws CassetteAddException {

        //given

        IVideoCassetteCatalog catalog = new VideoCassetteCatalog();
        VideoCassette videoCassette1 = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "THE ROOM",
                new Director("Tommy", "Wiseau", MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", MALE), new Actor("Juliette", "Danielle", FEMALE), new Actor("Greg", "Sestero", MALE))
        );


        VideoCassette videoCassette2 = new VideoCassette(
                "VID001",
                BigDecimal.valueOf(20),
                "THE ROOM",
                new Director("Tommy", "Wiseau", MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", MALE), new Actor("Juliette", "Danielle", FEMALE), new Actor("Greg", "Sestero", MALE))
        );

        //when
        catalog.addAllVideoCassettes(videoCassette1, videoCassette2);

        //then

        Assertions.assertThat(catalog.getVideoCassettes()).hasSize(2);
    }

}