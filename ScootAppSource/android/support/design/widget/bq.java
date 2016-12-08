package android.support.design.widget;

import java.lang.ref.WeakReference;

final class bq
{
  private final WeakReference<bp> a;
  private int b;
  
  bq(int paramInt, bp parambp)
  {
    this.a = new WeakReference(parambp);
    this.b = paramInt;
  }
  
  boolean a(bp parambp)
  {
    return (parambp != null) && (this.a.get() == parambp);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */