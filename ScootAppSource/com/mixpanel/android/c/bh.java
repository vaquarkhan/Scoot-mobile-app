package com.mixpanel.android.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class bh
  extends at
{
  private final a a;
  private final a b;
  private final WeakHashMap<View, Object> c;
  private final Object[] d;
  
  public bh(List<aa> paramList, a parama1, a parama2)
  {
    super(paramList);
    this.a = parama1;
    this.b = parama2;
    this.d = new Object[1];
    this.c = new WeakHashMap();
  }
  
  public void a()
  {
    Iterator localIterator = this.c.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      View localView = (View)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (localObject != null)
      {
        this.d[0] = localObject;
        this.a.a(localView, this.d);
      }
    }
  }
  
  public void a(View paramView)
  {
    Object localObject;
    Bitmap localBitmap1;
    if (this.b != null)
    {
      localObject = this.a.a();
      if (1 == localObject.length)
      {
        localBitmap1 = localObject[0];
        localObject = this.b.a(paramView);
        if (localBitmap1 == localObject) {}
        do
        {
          return;
          if (localBitmap1 == null) {
            break;
          }
          if ((!(localBitmap1 instanceof Bitmap)) || (!(localObject instanceof Bitmap))) {
            break label107;
          }
        } while (((Bitmap)localBitmap1).sameAs((Bitmap)localObject));
        if ((!(localObject instanceof Bitmap)) && (!(localObject instanceof BitmapDrawable)) && (!this.c.containsKey(paramView))) {
          break label161;
        }
      }
    }
    for (;;)
    {
      this.a.a(paramView);
      return;
      label107:
      if (((localBitmap1 instanceof BitmapDrawable)) && ((localObject instanceof BitmapDrawable)))
      {
        localBitmap1 = ((BitmapDrawable)localBitmap1).getBitmap();
        Bitmap localBitmap2 = ((BitmapDrawable)localObject).getBitmap();
        if ((localBitmap1 == null) || (!localBitmap1.sameAs(localBitmap2))) {
          break;
        }
        return;
      }
      if (!localBitmap1.equals(localObject)) {
        break;
      }
      return;
      label161:
      this.d[0] = localObject;
      if (this.a.a(this.d)) {
        this.c.put(paramView, localObject);
      } else {
        this.c.put(paramView, null);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */