package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.a.ae;
import android.support.v4.view.a.ar;
import android.support.v4.view.a.g;
import android.support.v4.view.a.l;
import android.support.v4.view.cb;
import android.support.v4.view.ef;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ao
  extends android.support.v4.view.a
{
  private static final String a = View.class.getName();
  private static final Rect c = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
  private final Rect d = new Rect();
  private final Rect e = new Rect();
  private final Rect f = new Rect();
  private final int[] g = new int[2];
  private final AccessibilityManager h;
  private final View i;
  private aq j;
  private int k = Integer.MIN_VALUE;
  private int l = Integer.MIN_VALUE;
  
  public ao(View paramView)
  {
    if (paramView == null) {
      throw new IllegalArgumentException("View may not be null");
    }
    this.i = paramView;
    this.h = ((AccessibilityManager)paramView.getContext().getSystemService("accessibility"));
  }
  
  private boolean a(int paramInt, Bundle paramBundle)
  {
    return cb.a(this.i, paramInt, paramBundle);
  }
  
  private boolean a(Rect paramRect)
  {
    if ((paramRect == null) || (paramRect.isEmpty())) {
      return false;
    }
    if (this.i.getWindowVisibility() != 0) {
      return false;
    }
    for (Object localObject = this.i.getParent(); (localObject instanceof View); localObject = ((View)localObject).getParent())
    {
      localObject = (View)localObject;
      if ((cb.f((View)localObject) <= 0.0F) || (((View)localObject).getVisibility() != 0)) {
        return false;
      }
    }
    if (localObject == null) {
      return false;
    }
    if (!this.i.getLocalVisibleRect(this.f)) {
      return false;
    }
    return paramRect.intersect(this.f);
  }
  
  private AccessibilityEvent b(int paramInt)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt);
    cb.a(this.i, localAccessibilityEvent);
    return localAccessibilityEvent;
  }
  
  private AccessibilityEvent b(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return c(paramInt1, paramInt2);
    }
    return b(paramInt2);
  }
  
  private boolean b(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    switch (paramInt1)
    {
    default: 
      return c(paramInt1, paramInt2, paramBundle);
    }
    return a(paramInt2, paramBundle);
  }
  
  private l c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return d(paramInt);
    }
    return d();
  }
  
  private AccessibilityEvent c(int paramInt1, int paramInt2)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    localAccessibilityEvent.setEnabled(true);
    localAccessibilityEvent.setClassName(a);
    a(paramInt1, localAccessibilityEvent);
    if ((localAccessibilityEvent.getText().isEmpty()) && (localAccessibilityEvent.getContentDescription() == null)) {
      throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }
    localAccessibilityEvent.setPackageName(this.i.getContext().getPackageName());
    android.support.v4.view.a.a.a(localAccessibilityEvent).a(this.i, paramInt1);
    return localAccessibilityEvent;
  }
  
  private boolean c(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    switch (paramInt2)
    {
    default: 
      return a(paramInt1, paramInt2, paramBundle);
    }
    return d(paramInt1, paramInt2, paramBundle);
  }
  
  private l d()
  {
    l locall = l.a(this.i);
    cb.a(this.i, locall);
    a(locall);
    Object localObject = new LinkedList();
    a((List)localObject);
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      locall.b(this.i, localInteger.intValue());
    }
    return locall;
  }
  
  private l d(int paramInt)
  {
    l locall = l.b();
    locall.h(true);
    locall.b(a);
    locall.b(c);
    a(paramInt, locall);
    if ((locall.r() == null) && (locall.s() == null)) {
      throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    }
    locall.a(this.e);
    if (this.e.equals(c)) {
      throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }
    int m = locall.c();
    if ((m & 0x40) != 0) {
      throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }
    if ((m & 0x80) != 0) {
      throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }
    locall.a(this.i.getContext().getPackageName());
    locall.a(this.i, paramInt);
    locall.d(this.i);
    if (this.k == paramInt)
    {
      locall.d(true);
      locall.a(128);
    }
    for (;;)
    {
      if (a(this.e))
      {
        locall.c(true);
        locall.b(this.e);
      }
      this.i.getLocationOnScreen(this.g);
      paramInt = this.g[0];
      m = this.g[1];
      this.d.set(this.e);
      this.d.offset(paramInt, m);
      locall.d(this.d);
      return locall;
      locall.d(false);
      locall.a(64);
    }
  }
  
  private boolean d(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    switch (paramInt2)
    {
    default: 
      return false;
    case 64: 
      return f(paramInt1);
    }
    return g(paramInt1);
  }
  
  private boolean e(int paramInt)
  {
    return this.k == paramInt;
  }
  
  private boolean f(int paramInt)
  {
    if ((!this.h.isEnabled()) || (!g.a(this.h))) {}
    while (e(paramInt)) {
      return false;
    }
    if (this.k != Integer.MIN_VALUE) {
      a(this.k, 65536);
    }
    this.k = paramInt;
    this.i.invalidate();
    a(paramInt, 32768);
    return true;
  }
  
  private boolean g(int paramInt)
  {
    if (e(paramInt))
    {
      this.k = Integer.MIN_VALUE;
      this.i.invalidate();
      a(paramInt, 65536);
      return true;
    }
    return false;
  }
  
  public ae a(View paramView)
  {
    if (this.j == null) {
      this.j = new aq(this, null);
    }
    return this.j;
  }
  
  public void a(int paramInt)
  {
    a(paramInt, 2048);
  }
  
  protected abstract void a(int paramInt, l paraml);
  
  protected abstract void a(int paramInt, AccessibilityEvent paramAccessibilityEvent);
  
  public void a(l paraml) {}
  
  protected abstract void a(List<Integer> paramList);
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == Integer.MIN_VALUE) || (!this.h.isEnabled())) {}
    ViewParent localViewParent;
    do
    {
      return false;
      localViewParent = this.i.getParent();
    } while (localViewParent == null);
    AccessibilityEvent localAccessibilityEvent = b(paramInt1, paramInt2);
    return ef.a(localViewParent, this.i, localAccessibilityEvent);
  }
  
  protected abstract boolean a(int paramInt1, int paramInt2, Bundle paramBundle);
  
  public void b()
  {
    a(-1);
  }
  
  public int c()
  {
    return this.k;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */