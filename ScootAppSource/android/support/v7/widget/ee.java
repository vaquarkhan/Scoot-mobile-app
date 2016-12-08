package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

final class ee
  extends Observable<ef>
{
  public void a()
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ef)this.mObservers.get(i)).a();
      i -= 1;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ef)this.mObservers.get(i)).a(paramInt1, paramInt2);
      i -= 1;
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    int i = this.mObservers.size() - 1;
    while (i >= 0)
    {
      ((ef)this.mObservers.get(i)).b(paramInt1, paramInt2);
      i -= 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */