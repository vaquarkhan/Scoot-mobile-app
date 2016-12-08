package android.support.v7.widget;

import android.database.DataSetObserver;

final class dm
  extends DataSetObserver
{
  private dm(dd paramdd) {}
  
  public void onChanged()
  {
    if (this.a.k()) {
      this.a.c();
    }
  }
  
  public void onInvalidated()
  {
    this.a.i();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */