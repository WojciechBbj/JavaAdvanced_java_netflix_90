package recources;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class VideoCassette {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoCassette that = (VideoCassette) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private String id;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category; //typ wyliczeniowy
    private Set<Actor> actors; //<Actor> typ generyczy - o  pisanie rzeczywisotści w abstrakcyjny sposób;


    public VideoCassette(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

    public void printOut () {
        StringBuilder builder = new StringBuilder();
            builder.append ("|")
                    .append(this.id)
                    .append ("|")
                    .append(this.title)
                    .append ("|")
                    .append(this.category)
                    .append ("|")
                    .append(this.price )
                    .append ("|")
                    .append(this.director.toString() )
                    .append ("|")
                    .append(this.actors.toString() )
                    .append ("|");
        System.out.println(builder.toString());
    }

}
