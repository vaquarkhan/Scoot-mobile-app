package com.mixpanel.android.c;

import android.util.Log;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class av
  extends ba
{
  private final int a;
  private final WeakHashMap<View, aw> b;
  
  public av(List<aa> paramList, int paramInt, String paramString, bf parambf)
  {
    super(paramList, paramString, parambf, false);
    this.a = paramInt;
    this.b = new WeakHashMap();
  }
  
  private View.AccessibilityDelegate d(View paramView)
  {
    try
    {
      paramView = (View.AccessibilityDelegate)paramView.getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(paramView, new Object[0]);
      return paramView;
    }
    catch (NoSuchMethodException paramView)
    {
      return null;
    }
    catch (IllegalAccessException paramView)
    {
      return null;
    }
    catch (InvocationTargetException paramView)
    {
      Log.w("MixpanelAPI.ViewVisitor", "getAccessibilityDelegate threw an exception when called.", paramView);
    }
    return null;
  }
  
  public void a()
  {
    Iterator localIterator = this.b.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      View localView = (View)((Map.Entry)localObject).getKey();
      localObject = (aw)((Map.Entry)localObject).getValue();
      View.AccessibilityDelegate localAccessibilityDelegate = d(localView);
      if (localAccessibilityDelegate == localObject) {
        localView.setAccessibilityDelegate(((aw)localObject).a());
      } else if ((localAccessibilityDelegate instanceof aw)) {
        ((aw)localAccessibilityDelegate).a((aw)localObject);
      }
    }
    this.b.clear();
  }
  
  public void a(View paramView)
  {
    Object localObject = d(paramView);
    if (((localObject instanceof aw)) && (((aw)localObject).a(d()))) {
      return;
    }
    localObject = new aw(this, (View.AccessibilityDelegate)localObject);
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
    this.b.put(paramView, localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */