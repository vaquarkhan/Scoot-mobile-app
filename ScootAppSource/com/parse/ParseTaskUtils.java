package com.parse;

import a.a;
import a.ac;
import a.o;
import java.util.concurrent.CancellationException;

class ParseTaskUtils
{
  static o<Void> callbackOnMainThreadAsync(o<Void> paramo, ParseCallback1<ParseException> paramParseCallback1)
  {
    return callbackOnMainThreadAsync(paramo, paramParseCallback1, false);
  }
  
  static o<Void> callbackOnMainThreadAsync(o<Void> paramo, ParseCallback1<ParseException> paramParseCallback1, boolean paramBoolean)
  {
    if (paramParseCallback1 == null) {
      return paramo;
    }
    return callbackOnMainThreadAsync(paramo, new ParseTaskUtils.1(paramParseCallback1), paramBoolean);
  }
  
  static <T> o<T> callbackOnMainThreadAsync(o<T> paramo, ParseCallback2<T, ParseException> paramParseCallback2)
  {
    return callbackOnMainThreadAsync(paramo, paramParseCallback2, false);
  }
  
  static <T> o<T> callbackOnMainThreadAsync(o<T> paramo, ParseCallback2<T, ParseException> paramParseCallback2, boolean paramBoolean)
  {
    if (paramParseCallback2 == null) {
      return paramo;
    }
    ac localac = new ac();
    paramo.a(new ParseTaskUtils.2(paramBoolean, localac, paramParseCallback2));
    return localac.a();
  }
  
  static <T> T wait(o<T> paramo)
  {
    try
    {
      paramo.h();
      if (!paramo.e()) {
        break label75;
      }
      paramo = paramo.g();
      if ((paramo instanceof ParseException)) {
        throw ((ParseException)paramo);
      }
    }
    catch (InterruptedException paramo)
    {
      throw new RuntimeException(paramo);
    }
    if ((paramo instanceof a)) {
      throw new ParseException(paramo);
    }
    if ((paramo instanceof RuntimeException)) {
      throw ((RuntimeException)paramo);
    }
    throw new RuntimeException(paramo);
    label75:
    if (paramo.d()) {
      throw new RuntimeException(new CancellationException());
    }
    paramo = paramo.f();
    return paramo;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseTaskUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */