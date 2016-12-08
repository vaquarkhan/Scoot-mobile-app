package com.mixpanel.android.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.mixpanel.android.mpmetrics.ax;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@TargetApi(16)
final class ao
{
  private final ar a;
  private final List<ab> b;
  private final aq c;
  private final Handler d;
  private final ax e;
  
  public ao(List<ab> paramList, ax paramax)
  {
    this.b = paramList;
    this.e = paramax;
    this.d = new Handler(Looper.getMainLooper());
    this.a = new ar();
    this.c = new aq(255);
  }
  
  private void b(JsonWriter paramJsonWriter, View paramView)
  {
    float f2 = 0.0F;
    int i = paramView.getId();
    Object localObject;
    if (-1 == i)
    {
      localObject = null;
      paramJsonWriter.beginObject();
      paramJsonWriter.name("hashCode").value(paramView.hashCode());
      paramJsonWriter.name("id").value(i);
      paramJsonWriter.name("mp_id_name").value((String)localObject);
      localObject = paramView.getContentDescription();
      if (localObject != null) {
        break label406;
      }
      paramJsonWriter.name("contentDescription").nullValue();
      label84:
      localObject = paramView.getTag();
      if (localObject != null) {
        break label426;
      }
      paramJsonWriter.name("tag").nullValue();
      label105:
      paramJsonWriter.name("top").value(paramView.getTop());
      paramJsonWriter.name("left").value(paramView.getLeft());
      paramJsonWriter.name("width").value(paramView.getWidth());
      paramJsonWriter.name("height").value(paramView.getHeight());
      paramJsonWriter.name("scrollX").value(paramView.getScrollX());
      paramJsonWriter.name("scrollY").value(paramView.getScrollY());
      paramJsonWriter.name("visibility").value(paramView.getVisibility());
      if (Build.VERSION.SDK_INT < 11) {
        break label604;
      }
      f2 = paramView.getTranslationX();
    }
    label406:
    label426:
    label604:
    for (float f1 = paramView.getTranslationY();; f1 = 0.0F)
    {
      paramJsonWriter.name("translationX").value(f2);
      paramJsonWriter.name("translationY").value(f1);
      paramJsonWriter.name("classes");
      paramJsonWriter.beginArray();
      localObject = paramView.getClass();
      for (;;)
      {
        paramJsonWriter.value((String)this.c.get(localObject));
        localObject = ((Class)localObject).getSuperclass();
        if ((localObject == Object.class) || (localObject == null))
        {
          paramJsonWriter.endArray();
          c(paramJsonWriter, paramView);
          localObject = paramView.getLayoutParams();
          int j;
          if ((localObject instanceof RelativeLayout.LayoutParams))
          {
            localObject = ((RelativeLayout.LayoutParams)localObject).getRules();
            paramJsonWriter.name("layoutRules");
            paramJsonWriter.beginArray();
            j = localObject.length;
            i = 0;
            for (;;)
            {
              if (i < j)
              {
                paramJsonWriter.value(localObject[i]);
                i += 1;
                continue;
                localObject = this.e.a(i);
                break;
                paramJsonWriter.name("contentDescription").value(((CharSequence)localObject).toString());
                break label84;
                if (!(localObject instanceof CharSequence)) {
                  break label105;
                }
                paramJsonWriter.name("tag").value(localObject.toString());
                break label105;
              }
            }
            paramJsonWriter.endArray();
          }
          paramJsonWriter.name("subviews");
          paramJsonWriter.beginArray();
          if ((paramView instanceof ViewGroup))
          {
            localObject = (ViewGroup)paramView;
            j = ((ViewGroup)localObject).getChildCount();
            i = 0;
            while (i < j)
            {
              View localView = ((ViewGroup)localObject).getChildAt(i);
              if (localView != null) {
                paramJsonWriter.value(localView.hashCode());
              }
              i += 1;
            }
          }
          paramJsonWriter.endArray();
          paramJsonWriter.endObject();
          if ((paramView instanceof ViewGroup))
          {
            paramView = (ViewGroup)paramView;
            j = paramView.getChildCount();
            i = 0;
            while (i < j)
            {
              localObject = paramView.getChildAt(i);
              if (localObject != null) {
                b(paramJsonWriter, (View)localObject);
              }
              i += 1;
            }
          }
          return;
        }
      }
    }
  }
  
  private void c(JsonWriter paramJsonWriter, View paramView)
  {
    Class localClass = paramView.getClass();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (ab)localIterator.next();
      if ((((ab)localObject1).b.isAssignableFrom(localClass)) && (((ab)localObject1).c != null))
      {
        Object localObject2 = ((ab)localObject1).c.a(paramView);
        if (localObject2 != null) {
          if ((localObject2 instanceof Number))
          {
            paramJsonWriter.name(((ab)localObject1).a).value((Number)localObject2);
          }
          else if ((localObject2 instanceof Boolean))
          {
            paramJsonWriter.name(((ab)localObject1).a).value(((Boolean)localObject2).booleanValue());
          }
          else if ((localObject2 instanceof ColorStateList))
          {
            paramJsonWriter.name(((ab)localObject1).a).value(Integer.valueOf(((ColorStateList)localObject2).getDefaultColor()));
          }
          else if ((localObject2 instanceof Drawable))
          {
            localObject2 = (Drawable)localObject2;
            Rect localRect = ((Drawable)localObject2).getBounds();
            paramJsonWriter.name(((ab)localObject1).a);
            paramJsonWriter.beginObject();
            paramJsonWriter.name("classes");
            paramJsonWriter.beginArray();
            for (localObject1 = localObject2.getClass(); localObject1 != Object.class; localObject1 = ((Class)localObject1).getSuperclass()) {
              paramJsonWriter.value(((Class)localObject1).getCanonicalName());
            }
            paramJsonWriter.endArray();
            paramJsonWriter.name("dimensions");
            paramJsonWriter.beginObject();
            paramJsonWriter.name("left").value(localRect.left);
            paramJsonWriter.name("right").value(localRect.right);
            paramJsonWriter.name("top").value(localRect.top);
            paramJsonWriter.name("bottom").value(localRect.bottom);
            paramJsonWriter.endObject();
            if ((localObject2 instanceof ColorDrawable))
            {
              localObject1 = (ColorDrawable)localObject2;
              paramJsonWriter.name("color").value(((ColorDrawable)localObject1).getColor());
            }
            paramJsonWriter.endObject();
          }
          else
          {
            paramJsonWriter.name(((ab)localObject1).a).value(localObject2.toString());
          }
        }
      }
    }
  }
  
  void a(JsonWriter paramJsonWriter, View paramView)
  {
    paramJsonWriter.beginArray();
    b(paramJsonWriter, paramView);
    paramJsonWriter.endArray();
  }
  
  public void a(ad<Activity> paramad, OutputStream paramOutputStream)
  {
    this.a.a(paramad);
    paramad = new FutureTask(this.a);
    this.d.post(paramad);
    OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(paramOutputStream);
    Object localObject = Collections.emptyList();
    localOutputStreamWriter.write("[");
    try
    {
      paramad = (List)paramad.get(1L, TimeUnit.SECONDS);
      int j = paramad.size();
      int i = 0;
      while (i < j)
      {
        if (i > 0) {
          localOutputStreamWriter.write(",");
        }
        localObject = (as)paramad.get(i);
        localOutputStreamWriter.write("{");
        localOutputStreamWriter.write("\"activity\":");
        localOutputStreamWriter.write(JSONObject.quote(((as)localObject).a));
        localOutputStreamWriter.write(",");
        localOutputStreamWriter.write("\"scale\":");
        localOutputStreamWriter.write(String.format("%s", new Object[] { Float.valueOf(((as)localObject).d) }));
        localOutputStreamWriter.write(",");
        localOutputStreamWriter.write("\"serialized_objects\":");
        JsonWriter localJsonWriter = new JsonWriter(localOutputStreamWriter);
        localJsonWriter.beginObject();
        localJsonWriter.name("rootObject").value(((as)localObject).b.hashCode());
        localJsonWriter.name("objects");
        a(localJsonWriter, ((as)localObject).b);
        localJsonWriter.endObject();
        localJsonWriter.flush();
        localOutputStreamWriter.write(",");
        localOutputStreamWriter.write("\"screenshot\":");
        localOutputStreamWriter.flush();
        ((as)localObject).c.a(Bitmap.CompressFormat.PNG, 100, paramOutputStream);
        localOutputStreamWriter.write("}");
        i += 1;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        paramad = (ad<Activity>)localObject;
        if (com.mixpanel.android.mpmetrics.ab.a)
        {
          Log.d("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", localInterruptedException);
          paramad = (ad<Activity>)localObject;
        }
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        paramad = (ad<Activity>)localObject;
        if (com.mixpanel.android.mpmetrics.ab.a)
        {
          Log.i("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", localTimeoutException);
          paramad = (ad<Activity>)localObject;
        }
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        paramad = (ad<Activity>)localObject;
        if (com.mixpanel.android.mpmetrics.ab.a)
        {
          Log.e("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", localExecutionException);
          paramad = (ad<Activity>)localObject;
        }
      }
      localOutputStreamWriter.write("]");
      localOutputStreamWriter.flush();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */