package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.a.ae;
import android.support.v4.view.a.l;
import android.support.v4.widget.ao;
import android.text.format.DateFormat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.codetroopers.betterpickers.R.string;
import java.util.Calendar;
import java.util.List;

final class n
  extends ao
{
  private final Rect c = new Rect();
  private final Calendar d = Calendar.getInstance();
  
  public n(m paramm, View paramView)
  {
    super(paramView);
  }
  
  private void a(int paramInt, Rect paramRect)
  {
    int m = this.a.j;
    int k = m.g;
    int i = this.a.v;
    int j = (this.a.u - this.a.j * 2) / this.a.A;
    int n = paramInt - 1 + m.a(this.a);
    paramInt = n / this.a.A;
    m += n % this.a.A * j;
    paramInt = k + paramInt * i;
    paramRect.set(m, paramInt, j + m, i + paramInt);
  }
  
  private CharSequence c(int paramInt)
  {
    this.d.set(this.a.t, this.a.s, paramInt);
    CharSequence localCharSequence = DateFormat.format("dd MMMM yyyy", this.d.getTimeInMillis());
    Object localObject = localCharSequence;
    if (paramInt == this.a.x) {
      localObject = this.a.getContext().getString(R.string.item_is_selected, new Object[] { localCharSequence });
    }
    return (CharSequence)localObject;
  }
  
  protected void a(int paramInt, l paraml)
  {
    a(paramInt, this.c);
    paraml.d(c(paramInt));
    paraml.b(this.c);
    paraml.a(16);
    if (paramInt == this.a.x) {
      paraml.e(true);
    }
  }
  
  protected void a(int paramInt, AccessibilityEvent paramAccessibilityEvent)
  {
    paramAccessibilityEvent.setContentDescription(c(paramInt));
  }
  
  protected void a(List<Integer> paramList)
  {
    int i = 1;
    while (i <= this.a.B)
    {
      paramList.add(Integer.valueOf(i));
      i += 1;
    }
  }
  
  protected boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    switch (paramInt2)
    {
    default: 
      return false;
    }
    m.a(this.a, paramInt1);
    return true;
  }
  
  public void b(int paramInt)
  {
    a(this.a).a(paramInt, 64, null);
  }
  
  public void d()
  {
    int i = c();
    if (i != Integer.MIN_VALUE) {
      a(this.a).a(i, 128, null);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */