package com.mixpanel.android.c;

import android.annotation.TargetApi;
import android.view.View;
import java.util.List;

@TargetApi(16)
abstract class at
  implements y
{
  private final List<aa> a;
  private final x b;
  
  protected at(List<aa> paramList)
  {
    this.a = paramList;
    this.b = new x();
  }
  
  public abstract void a();
  
  protected List<aa> b()
  {
    return this.a;
  }
  
  public void b(View paramView)
  {
    this.b.a(paramView, this.a, this);
  }
  
  protected x c()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */