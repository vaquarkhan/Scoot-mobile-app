package com.b.a;

final class i
  implements Runnable
{
  private final r b;
  private final w c;
  private final Runnable d;
  
  public i(g paramg, r paramr, w paramw, Runnable paramRunnable)
  {
    this.b = paramr;
    this.c = paramw;
    this.d = paramRunnable;
  }
  
  public void run()
  {
    if (this.b.h()) {
      this.b.b("canceled-at-delivery");
    }
    label97:
    label107:
    for (;;)
    {
      return;
      if (this.c.a())
      {
        this.b.b(this.c.a);
        if (!this.c.d) {
          break label97;
        }
        this.b.a("intermediate-response");
      }
      for (;;)
      {
        if (this.d == null) {
          break label107;
        }
        this.d.run();
        return;
        this.b.b(this.c.c);
        break;
        this.b.b("done");
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */