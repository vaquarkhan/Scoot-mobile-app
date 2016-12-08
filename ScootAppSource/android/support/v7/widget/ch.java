package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class ch
  implements Runnable
{
  ch(ce paramce, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      fd localfd = (fd)localIterator.next();
      ce.a(this.b, localfd);
    }
    this.a.clear();
    ce.c(this.b).remove(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */