package recources;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static recources.Gender.FEMALE;
import static recources.Gender.MALE;

class VideoCassetteTest {

    @Test
    public void shouldVideoCassettesEqual() {
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

        //when
        boolean result = videoCassette1.equals(videoCassette2);
        int v1HashCode = videoCassette1.hashCode();
        int v2HashCode = videoCassette2.hashCode();
        //then
        Assertions.assertThat(result).isTrue();
        Assertions.assertThat(v1HashCode).isEqualTo(v2HashCode);

    }
    @Test
    public void shouldVideoCassettesNotEqual() {
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
                "VID002",
                BigDecimal.valueOf(20),
                "THE ROOM",
                new Director("Tommy", "Wiseau", MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", MALE), new Actor("Juliette", "Danielle", FEMALE), new Actor("Greg", "Sestero", MALE))
        );

        //when
        boolean result = videoCassette1.equals(videoCassette2);
        int v1HashCode = videoCassette1.hashCode();
        int v2HashCode = videoCassette2.hashCode();
        //then
        Assertions.assertThat(result).isFalse();
        Assertions.assertThat(v1HashCode).isNotEqualTo(v2HashCode);

    }
}