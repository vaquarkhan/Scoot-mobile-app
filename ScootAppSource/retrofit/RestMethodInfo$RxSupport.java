package retrofit;

import java.lang.reflect.Type;
import rx.Observable;

final class RestMethodInfo$RxSupport
{
  public static Type getObservableType(Type paramType, Class paramClass)
  {
    return Types.getSupertype(paramType, paramClass, Observable.class);
  }
  
  public static boolean isObservable(Class paramClass)
  {
    return paramClass == Observable.class;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\retrofit\RestMethodInfo$RxSupport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */