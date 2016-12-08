package d;

final class d
  extends Thread
{
  public d()
  {
    super("Okio Watchdog");
    setDaemon(true);
  }
  
  public void run()
  {
    try
    {
      for (;;)
      {
        a locala = a.access$000();
        if (locala != null) {
          locala.timedOut();
        }
      }
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */