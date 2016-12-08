package com.codetroopers.betterpickers.calendardatepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.codetroopers.betterpickers.c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public abstract class h
  extends ListView
  implements AbsListView.OnScrollListener, e
{
  private static final SimpleDateFormat o = new SimpleDateFormat("yyyy", Locale.getDefault());
  protected int a = 6;
  protected boolean b = false;
  protected int c = 7;
  protected float d = 1.0F;
  protected Context e;
  protected Handler f;
  protected l g = new l();
  protected k h;
  protected l i = new l();
  protected int j;
  protected long k;
  protected int l = 0;
  protected int m = 0;
  protected j n = new j(this);
  private a p;
  private boolean q;
  
  public h(Context paramContext, a parama)
  {
    super(paramContext);
    a(paramContext);
    setController(parama);
  }
  
  private boolean a(l paraml)
  {
    if (paraml == null) {
      return false;
    }
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((localView instanceof m)) && (((m)localView).a(paraml))) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private String b(l paraml)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(paraml.a, paraml.b, paraml.c);
    paraml = new StringBuffer();
    paraml.append(localCalendar.getDisplayName(2, 2, Locale.getDefault()));
    paraml.append(" ");
    paraml.append(o.format(localCalendar.getTime()));
    return paraml.toString();
  }
  
  private l e()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((localView instanceof m))
      {
        l locall = ((m)localView).getAccessibilityFocus();
        if (locall != null)
        {
          if (Build.VERSION.SDK_INT == 17) {
            ((m)localView).c();
          }
          return locall;
        }
      }
      i1 += 1;
    }
    return null;
  }
  
  public abstract k a(Context paramContext, a parama);
  
  public void a()
  {
    a(this.p.c_(), false, true, true);
  }
  
  public void a(int paramInt)
  {
    clearFocus();
    post(new i(this, paramInt));
    onScrollStateChanged(this, 0);
  }
  
  public void a(Context paramContext)
  {
    this.f = new Handler();
    setLayoutParams(new AbsListView.LayoutParams(-1, -1));
    setDrawSelectorOnTop(false);
    this.e = paramContext;
    d();
  }
  
  public boolean a(l paraml, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = false;
    if (paramBoolean2) {
      this.g.a(paraml);
    }
    this.i.a(paraml);
    int i3 = (paraml.a - this.p.c().a) * 12 + (paraml.b - this.p.c().b);
    int i1 = 0;
    int i2 = i1 + 1;
    paraml = getChildAt(i1);
    if (paraml == null)
    {
      label83:
      if (paraml == null) {
        break label262;
      }
      i1 = getPositionForView(paraml);
      label94:
      if (paramBoolean2) {
        this.h.a(this.g);
      }
      if (Log.isLoggable("MonthFragment", 3)) {
        Log.d("MonthFragment", "GoTo position " + i3);
      }
      if ((i3 == i1) && (!paramBoolean3)) {
        break label276;
      }
      setMonthDisplayed(this.i);
      this.l = 2;
      if ((!paramBoolean1) || (Build.VERSION.SDK_INT < 11)) {
        break label268;
      }
      smoothScrollToPositionFromTop(i3, -1, 250);
      paramBoolean1 = true;
    }
    label262:
    label268:
    label276:
    do
    {
      return paramBoolean1;
      i1 = paraml.getTop();
      if (Log.isLoggable("MonthFragment", 3)) {
        Log.d("MonthFragment", "child at " + (i2 - 1) + " has top " + i1);
      }
      if (i1 >= 0) {
        break label83;
      }
      i1 = i2;
      break;
      i1 = 0;
      break label94;
      a(i3);
      return false;
      paramBoolean1 = bool;
    } while (!paramBoolean2);
    setMonthDisplayed(this.g);
    return false;
  }
  
  public void b()
  {
    c();
  }
  
  protected void c()
  {
    if (this.h == null) {
      this.h = a(getContext(), this.p);
    }
    for (;;)
    {
      setAdapter(this.h);
      return;
      this.h.a(this.g);
    }
  }
  
  @SuppressLint({"NewApi"})
  protected void d()
  {
    setCacheColorHint(0);
    setDivider(null);
    setItemsCanFocus(true);
    setFastScrollEnabled(false);
    setVerticalScrollBarEnabled(false);
    setOnScrollListener(this);
    setFadingEdgeLength(0);
    if (Build.VERSION.SDK_INT >= 11) {
      setFriction(ViewConfiguration.getScrollFriction() * this.d);
    }
  }
  
  public int getMostVisiblePosition()
  {
    int i6 = getFirstVisiblePosition();
    int i7 = getHeight();
    int i4 = 0;
    int i1 = 0;
    int i3 = 0;
    int i2 = 0;
    View localView;
    if (i4 < i7)
    {
      localView = getChildAt(i1);
      if (localView != null) {}
    }
    else
    {
      return i3 + i6;
    }
    i4 = localView.getBottom();
    int i5 = Math.min(i4, i7) - Math.max(0, localView.getTop());
    if (i5 > i2)
    {
      i3 = i1;
      i2 = i5;
    }
    for (;;)
    {
      i1 += 1;
      break;
    }
  }
  
  protected void layoutChildren()
  {
    l locall = e();
    super.layoutChildren();
    if (this.q)
    {
      this.q = false;
      return;
    }
    a(locall);
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setItemCount(-1);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.addAction(4096);
    paramAccessibilityNodeInfo.addAction(8192);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    m localm = (m)paramAbsListView.getChildAt(0);
    if (localm == null) {
      return;
    }
    this.k = (paramAbsListView.getFirstVisiblePosition() * localm.getHeight() - localm.getBottom());
    this.l = this.m;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    this.n.a(paramAbsListView, paramInt);
  }
  
  @SuppressLint({"NewApi"})
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    if ((paramInt != 4096) && (paramInt != 8192)) {
      return super.performAccessibilityAction(paramInt, paramBundle);
    }
    int i1 = getFirstVisiblePosition();
    paramBundle = new l(i1 / 12 + this.p.c().a, i1 % 12, 1);
    if (paramInt == 4096)
    {
      paramBundle.b += 1;
      if (paramBundle.b == 12)
      {
        paramBundle.b = 0;
        paramBundle.a += 1;
      }
    }
    for (;;)
    {
      c.a(this, b(paramBundle));
      a(paramBundle, true, false, true);
      this.q = true;
      return true;
      if (paramInt == 8192)
      {
        View localView = getChildAt(0);
        if ((localView != null) && (localView.getTop() >= -1))
        {
          paramBundle.b -= 1;
          if (paramBundle.b == -1)
          {
            paramBundle.b = 11;
            paramBundle.a -= 1;
          }
        }
      }
    }
  }
  
  public void setController(a parama)
  {
    this.p = parama;
    this.p.a(this);
    c();
    a();
  }
  
  protected void setMonthDisplayed(l paraml)
  {
    this.j = paraml.b;
    invalidateViews();
  }
  
  public void setTheme(TypedArray paramTypedArray)
  {
    if (this.h != null) {
      this.h.a(paramTypedArray);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */