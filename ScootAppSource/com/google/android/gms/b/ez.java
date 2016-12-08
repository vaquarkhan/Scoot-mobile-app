package com.google.android.gms.b;

import com.google.android.gms.common.internal.b;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ez
  implements ThreadFactory
{
  private final String a;
  private final int b;
  private final AtomicInteger c = new AtomicInteger();
  private final ThreadFactory d = Executors.defaultThreadFactory();
  
  public ez(String paramString)
  {
    this(paramString, 0);
  }
  
  public ez(String paramString, int paramInt)
  {
    this.a = ((String)b.a(paramString, "Name must not be null"));
    this.b = paramInt;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = this.d.newThread(new fa(paramRunnable, this.b));
    String str = this.a;
    int i = this.c.getAndIncrement();
    paramRunnable.setName(String.valueOf(str).length() + 13 + str + "[" + i + "]");
    return paramRunnable;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */