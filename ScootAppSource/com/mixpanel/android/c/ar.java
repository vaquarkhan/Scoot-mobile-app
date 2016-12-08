package com.mixpanel.android.c;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.ab;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

final class ar
  implements Callable<List<as>>
{
  private ad<Activity> a;
  private final List<as> b = new ArrayList();
  private final DisplayMetrics c = new DisplayMetrics();
  private final ap d = new ap();
  private final int e = 160;
  
  private void a(as paramas)
  {
    View localView = paramas.b;
    try
    {
      localObject1 = View.class.getDeclaredMethod("createSnapshot", new Class[] { Bitmap.Config.class, Integer.TYPE, Boolean.TYPE });
      ((Method)localObject1).setAccessible(true);
      localObject1 = (Bitmap)((Method)localObject1).invoke(localView, new Object[] { Bitmap.Config.RGB_565, Integer.valueOf(-1), Boolean.valueOf(false) });
      if (localObject1 != null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          localBoolean = Boolean.valueOf(localView.isDrawingCacheEnabled());
        }
        catch (RuntimeException localRuntimeException1)
        {
          Object localObject1;
          Bitmap localBitmap;
          float f1;
          float f2;
          Object localObject2;
          Object localObject3;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          localBoolean = null;
        }
        try
        {
          localView.setDrawingCacheEnabled(true);
          localView.buildDrawingCache(true);
          localBitmap = localView.getDrawingCache();
          localObject1 = localBitmap;
          f1 = 1.0F;
          f2 = f1;
          if (localObject1 != null)
          {
            int i = ((Bitmap)localObject1).getDensity();
            if (i != 0) {
              f1 = 160.0F / i;
            }
            i = ((Bitmap)localObject1).getWidth();
            int j = ((Bitmap)localObject1).getHeight();
            int k = (int)(((Bitmap)localObject1).getWidth() * f1 + 0.5D);
            int m = (int)(((Bitmap)localObject1).getHeight() * f1 + 0.5D);
            f2 = f1;
            if (i > 0)
            {
              f2 = f1;
              if (j > 0)
              {
                f2 = f1;
                if (k > 0)
                {
                  f2 = f1;
                  if (m > 0)
                  {
                    this.d.a(k, m, 160, (Bitmap)localObject1);
                    f2 = f1;
                  }
                }
              }
            }
          }
          if ((localBoolean != null) && (!localBoolean.booleanValue())) {
            localView.setDrawingCacheEnabled(false);
          }
          paramas.d = f2;
          paramas.c = this.d;
          return;
        }
        catch (RuntimeException localRuntimeException2)
        {
          for (;;) {}
        }
        localNoSuchMethodException = localNoSuchMethodException;
        if (ab.a) {
          Log.v("MixpanelAPI.Snapshot", "Can't call createSnapshot, will use drawCache", localNoSuchMethodException);
        }
        localObject2 = null;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Log.d("MixpanelAPI.Snapshot", "Can't call createSnapshot with arguments", localIllegalArgumentException);
        localObject3 = null;
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.Snapshot", "Exception when calling createSnapshot", localInvocationTargetException);
        localObject4 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.Snapshot", "Can't access createSnapshot, using drawCache", localIllegalAccessException);
        localObject5 = null;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.Snapshot", "createSnapshot didn't return a bitmap?", localClassCastException);
        localObject6 = null;
        continue;
        if (ab.a) {
          Log.v("MixpanelAPI.Snapshot", "Can't take a bitmap snapshot of view " + localView + ", skipping for now.", localRuntimeException1);
        }
        continue;
        Boolean localBoolean = null;
      }
    }
  }
  
  public List<as> a()
  {
    this.b.clear();
    Iterator localIterator = this.a.a().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Activity)localIterator.next();
      String str = localObject.getClass().getCanonicalName();
      View localView = ((Activity)localObject).getWindow().getDecorView().getRootView();
      ((Activity)localObject).getWindowManager().getDefaultDisplay().getMetrics(this.c);
      localObject = new as(str, localView);
      this.b.add(localObject);
    }
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      a((as)this.b.get(i));
      i += 1;
    }
    return this.b;
  }
  
  public void a(ad<Activity> paramad)
  {
    this.a = paramad;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */