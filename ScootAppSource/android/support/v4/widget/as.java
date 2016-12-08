package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class as
{
  public static void a(ListView paramListView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      au.a(paramListView, paramInt);
      return;
    }
    at.a(paramListView, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */