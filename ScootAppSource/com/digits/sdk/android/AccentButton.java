package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class AccentButton
  extends Button
{
  public AccentButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AccentButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842824);
  }
  
  public AccentButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    int i = dz.a(getResources(), getContext().getTheme());
    l locall = new l(getResources());
    locall.a(this);
    locall.a(this, i);
    locall.a(this, i);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\AccentButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */