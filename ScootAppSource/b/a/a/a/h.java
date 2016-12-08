package b.a.a.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class h
  implements l
{
  final CountDownLatch a = new CountDownLatch(this.b);
  
  h(f paramf, int paramInt) {}
  
  public void a(Exception paramException)
  {
    f.b(this.c).a(paramException);
  }
  
  public void a(Object paramObject)
  {
    this.a.countDown();
    if (this.a.getCount() == 0L)
    {
      f.a(this.c).set(true);
      f.b(this.c).a(this.c);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */