package android.support.v4.view;

import android.database.DataSetObserver;

final class ec
  extends DataSetObserver
{
  private ec(ViewPager paramViewPager) {}
  
  public void onChanged()
  {
    this.a.b();
  }
  
  public void onInvalidated()
  {
    this.a.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */