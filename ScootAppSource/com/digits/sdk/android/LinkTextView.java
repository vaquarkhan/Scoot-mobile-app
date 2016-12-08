package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class LinkTextView
  extends TextView
{
  public LinkTextView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public LinkTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public LinkTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    setTextColor(b(paramContext));
  }
  
  private int b(Context paramContext)
  {
    TypedValue localTypedValue = dz.a(paramContext.getTheme(), 16842907);
    if (localTypedValue == null) {
      return dz.a(paramContext.getResources(), paramContext.getTheme());
    }
    return localTypedValue.data;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\LinkTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */