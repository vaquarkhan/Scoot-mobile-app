package com.appsee;

class am
  implements Thread.UncaughtExceptionHandler
{
  private static boolean G = false;
  private static Object l = new Object();
  private Thread.UncaughtExceptionHandler A;
  
  am(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.A = paramUncaughtExceptionHandler;
  }
  
  public static void C()
  {
    try
    {
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
      if (!(localUncaughtExceptionHandler instanceof am)) {
        Thread.setDefaultUncaughtExceptionHandler(new am(localUncaughtExceptionHandler));
      }
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, kl.C("v5A(AgZ)\0235V Z4G\"Agr7C4V\"v?P\"C3Z(]\017R)W+V5"));
    }
  }
  
  public static void C(he arg0, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        ue.C(???.C(), kl.C("p&F [3\0232]/R)W+V#\023\"K$V7G.\\)"));
      }
      catch (Exception ???)
      {
        ue.C(???, kl.C("v5A(Ag[&]#_.] \0232]$R(F [3\0232]/R)W+V#\023\"K$V7G.\\)"));
        synchronized (l)
        {
          G = false;
          l.notify();
          return;
        }
        ei.H(new en(???));
        continue;
      }
      finally
      {
        synchronized (l)
        {
          G = false;
          l.notify();
          throw ((Throwable)localObject5);
        }
      }
      synchronized (l)
      {
        if (G)
        {
          vd.H(3, rd.C("\013N1U(L6BxF*D+MxM9K<I1K?\005:@;D-V=\0059I*@9A!\0050D6A4L6BxD6J,M=WxF*D+M"));
          l.wait(3000L);
          synchronized (l)
          {
            G = false;
            l.notify();
            return;
          }
        }
        G = true;
        if (paramBoolean)
        {
          K(???);
          synchronized (l)
          {
            G = false;
            l.notify();
            return;
          }
        }
      }
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    C(new he(paramThrowable), ei.C());
    try
    {
      if (this.A != null) {
        this.A.uncaughtException(paramThread, paramThrowable);
      }
      return;
    }
    catch (Exception paramThread)
    {
      ue.C(paramThread, rd.C("\035W*J*\0050D6A4L6BxP6F9J-B0QxP6M9K<I=Ax@ F=U,L7KxR1Q0\0057W1B1K9IxM9K<I=W"));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */