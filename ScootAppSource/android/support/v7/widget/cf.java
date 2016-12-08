package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class cf
  implements Runnable
{
  cf(ce paramce, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      co localco = (co)localIterator.next();
      ce.a(this.b, localco.a, localco.b, localco.c, localco.d, localco.e);
    }
    this.a.clear();
    ce.a(this.b).remove(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */