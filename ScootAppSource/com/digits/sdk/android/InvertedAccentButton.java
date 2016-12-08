package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class InvertedAccentButton
  extends Button
{
  public InvertedAccentButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public InvertedAccentButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842824);
  }
  
  public InvertedAccentButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  void a()
  {
    int i = dz.a(getResources(), getContext().getTheme());
    l locall = new l(getResources());
    locall.a(this);
    locall.b(this, i);
    locall.b(this, i);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\InvertedAccentButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */