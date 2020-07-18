package szachy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface annotation {

    @Retention(value = RetentionPolicy.RUNTIME)
    @Target(value =
            {
                    ElementType.CONSTRUCTOR,
                    ElementType.METHOD
            })
    public  @interface Test1 {

    }

}
