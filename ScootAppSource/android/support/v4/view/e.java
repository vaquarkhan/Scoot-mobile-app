package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.ae;
import android.view.View;

final class e
  extends b
{
  public ae a(Object paramObject, View paramView)
  {
    paramObject = k.a(paramObject, paramView);
    if (paramObject != null) {
      return new ae(paramObject);
    }
    return null;
  }
  
  public Object a(a parama)
  {
    return k.a(new f(this, parama));
  }
  
  public boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return k.a(paramObject, paramView, paramInt, paramBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */