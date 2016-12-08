package com.mixpanel.android.c;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

final class x
{
  private final z a = new z();
  
  private View a(aa paramaa, View paramView, int paramInt)
  {
    int i = this.a.a(paramInt);
    if (a(paramaa, paramView))
    {
      this.a.b(paramInt);
      if ((paramaa.c == -1) || (paramaa.c == i)) {
        return paramView;
      }
    }
    if ((paramaa.a == 1) && ((paramView instanceof ViewGroup)))
    {
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      i = 0;
      while (i < j)
      {
        View localView = a(paramaa, paramView.getChildAt(i), paramInt);
        if (localView != null) {
          return localView;
        }
        i += 1;
      }
    }
    return null;
  }
  
  private boolean a(aa paramaa, View paramView)
  {
    if ((paramaa.b != null) && (!a(paramView, paramaa.b))) {}
    String str;
    do
    {
      do
      {
        return false;
      } while (((-1 != paramaa.d) && (paramView.getId() != paramaa.d)) || ((paramaa.e != null) && (!paramaa.e.equals(paramView.getContentDescription()))));
      str = paramaa.f;
    } while ((paramaa.f != null) && ((paramView.getTag() == null) || (!str.equals(paramView.getTag().toString()))));
    return true;
  }
  
  private static boolean a(Object paramObject, String paramString)
  {
    for (paramObject = paramObject.getClass();; paramObject = ((Class)paramObject).getSuperclass())
    {
      if (((Class)paramObject).getCanonicalName().equals(paramString)) {
        return true;
      }
      if (paramObject == Object.class) {
        return false;
      }
    }
  }
  
  private void b(View paramView, List<aa> paramList, y paramy)
  {
    int i = 0;
    if (paramList.isEmpty()) {
      paramy.a(paramView);
    }
    while (!(paramView instanceof ViewGroup)) {
      return;
    }
    if (this.a.a())
    {
      Log.v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
      return;
    }
    paramView = (ViewGroup)paramView;
    aa localaa = (aa)paramList.get(0);
    paramList = paramList.subList(1, paramList.size());
    int j = paramView.getChildCount();
    int k = this.a.b();
    for (;;)
    {
      if (i < j)
      {
        View localView = a(localaa, paramView.getChildAt(i), k);
        if (localView != null) {
          b(localView, paramList, paramy);
        }
        if ((localaa.c < 0) || (this.a.a(k) <= localaa.c)) {}
      }
      else
      {
        this.a.c();
        return;
      }
      i += 1;
    }
  }
  
  public void a(View paramView, List<aa> paramList, y paramy)
  {
    if (paramList.isEmpty()) {}
    do
    {
      return;
      if (this.a.a())
      {
        Log.w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
        return;
      }
      aa localaa = (aa)paramList.get(0);
      paramList = paramList.subList(1, paramList.size());
      paramView = a(localaa, paramView, this.a.b());
      this.a.c();
    } while (paramView == null);
    b(paramView, paramList, paramy);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */