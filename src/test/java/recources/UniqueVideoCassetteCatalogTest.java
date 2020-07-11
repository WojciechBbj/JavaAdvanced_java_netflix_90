package recources;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static recources.Gender.FEMALE;
import static recources.Gender.MALE;

class UniqueVideoCassetteCatalogTest {

    @Test

    public void thatShouldAddSameIdVideoCassette() {
        //given
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

        IVideoCassetteCatalog catalog = new UniqueVideoCassetteCatalog();
        //when
        catalog.addVideoCassette(videoCassette1, videoCassette2);
        //then
        assertThat(catalog.getVideoCassettes()).hasSize(1);
    }

}