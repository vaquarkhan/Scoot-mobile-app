package com.google.a.b;

import com.google.a.af;
import com.google.a.am;
import com.google.a.b.a.z;
import com.google.a.d.a;
import com.google.a.d.d;
import com.google.a.d.e;
import com.google.a.w;
import com.google.a.x;
import com.google.a.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class ag
{
  public static w a(a parama)
  {
    int i = 1;
    try
    {
      parama.f();
      i = 0;
      parama = (w)z.P.b(parama);
      return parama;
    }
    catch (EOFException parama)
    {
      if (i != 0) {
        return y.a;
      }
      throw new af(parama);
    }
    catch (e parama)
    {
      throw new af(parama);
    }
    catch (IOException parama)
    {
      throw new x(parama);
    }
    catch (NumberFormatException parama)
    {
      throw new af(parama);
    }
  }
  
  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer)) {
      return (Writer)paramAppendable;
    }
    return new ai(paramAppendable, null);
  }
  
  public static void a(w paramw, d paramd)
  {
    z.P.a(paramd, paramw);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */