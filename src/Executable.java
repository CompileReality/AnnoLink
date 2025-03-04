import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// The Annotation class with a key for addressing the correct method. 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Executable {
    String key();
}
