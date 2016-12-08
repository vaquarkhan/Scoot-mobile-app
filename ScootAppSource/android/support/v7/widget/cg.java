package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

final class cg
  implements Runnable
{
  cg(ce paramce, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      cn localcn = (cn)localIterator.next();
      ce.a(this.b, localcn);
    }
    this.a.clear();
    ce.b(this.b).remove(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */