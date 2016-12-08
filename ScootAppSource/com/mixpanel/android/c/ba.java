package com.mixpanel.android.c;

import android.view.View;
import java.util.List;

abstract class ba
  extends at
{
  private final bf a;
  private final String b;
  private final boolean c;
  
  public ba(List<aa> paramList, String paramString, bf parambf, boolean paramBoolean)
  {
    super(paramList);
    this.a = parambf;
    this.b = paramString;
    this.c = paramBoolean;
  }
  
  protected void c(View paramView)
  {
    this.a.a(paramView, this.b, this.c);
  }
  
  protected String d()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */