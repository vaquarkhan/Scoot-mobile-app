package retrofit.http;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface RestMethod
{
  boolean hasBody() default false;
  
  String value();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\http\RestMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */