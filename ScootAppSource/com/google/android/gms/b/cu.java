package com.google.android.gms.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class cu
{
  private static final ExecutorService a = Executors.newFixedThreadPool(2, new ez("GAC_Executor"));
  
  public static ExecutorService a()
  {
    return a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */