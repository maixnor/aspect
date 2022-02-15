package at.spengergasse.library.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AddToBilling {
}