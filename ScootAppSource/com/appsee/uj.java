package com.appsee;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TabWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

class uj
{
  private static final int G = 4000;
  private static uj l;
  private List<kl> A;
  
  public static uj C()
  {
    try
    {
      if (l == null) {
        l = new uj();
      }
      uj localuj = l;
      return localuj;
    }
    finally {}
  }
  
  public static byte[] C(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    Bitmap localBitmap1 = ab.C(paramDrawable);
    if ((localBitmap1 == null) || (localBitmap1.getWidth() == 0) || (localBitmap1.getHeight() == 0)) {
      throw new Exception(zb.C("l}A;[<L}CZpNhJ<G}\\t\017z@n\017,\017oFfJx\017uB}Hy"));
    }
    double d = localBitmap1.getWidth() / localBitmap1.getHeight();
    paramDrawable = new Dimension(8, 8);
    Object localObject = new Dimension(16, 4);
    Bitmap localBitmap2;
    if (Math.abs(d - paramDrawable.getRatio()) < Math.abs(d - ((Dimension)localObject).getRatio()))
    {
      localBitmap2 = C(localBitmap1, paramDrawable, true);
      localObject = new byte[72];
      k = 0;
    }
    int m;
    int n;
    for (int j = 0;; j = k)
    {
      if (k >= localBitmap2.getHeight()) {
        break label224;
      }
      m = 0;
      k = 0;
      for (;;)
      {
        if (m < localBitmap2.getWidth())
        {
          m = localBitmap2.getPixel(k, j);
          n = localBitmap2.getWidth();
          int i = (byte)Color.red(m);
          m = k + 1;
          localObject[(n * j + k)] = i;
          k = m;
          continue;
          paramDrawable = (Drawable)localObject;
          break;
        }
      }
      k = j + 1;
    }
    label224:
    paramDrawable = C(localBitmap1, paramDrawable, false);
    int k = 0;
    for (j = 0; k < paramDrawable.getHeight(); j = k)
    {
      m = 0;
      for (k = 0; m < paramDrawable.getWidth(); k = m)
      {
        if (Color.alpha(paramDrawable.getPixel(k, j)) == 0)
        {
          m = paramDrawable.getWidth() * j + k;
          n = m / 8 + 64;
          localObject[n] = ((byte)(1 << 7 - m % 8 | localObject[n]));
        }
        m = k + 1;
      }
      k = j + 1;
    }
    return (byte[])localObject;
  }
  
  public kl C(tl paramtl)
  {
    for (;;)
    {
      synchronized (this.A)
      {
        i = this.A.size() - 1;
        j = i;
        if (i >= 0)
        {
          kl localkl = (kl)this.A.get(j);
          if ((localkl != null) && (localkl.C() == paramtl)) {
            return localkl;
          }
        }
        else
        {
          return null;
        }
      }
      int i = j - 1;
      int j = i;
    }
  }
  
  public JSONArray C()
  {
    synchronized (this.A)
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.A.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((kl)localIterator.next()).H());
      }
      return localJSONArray;
    }
  }
  
  public void C()
  {
    if ((!fc.C().C()) || (!ye.C().g())) {}
    kl localkl;
    do
    {
      return;
      if (this.A.isEmpty()) {
        break;
      }
      localkl = (kl)this.A.get(this.A.size() - 1);
    } while ((localkl != null) && (localkl.C() == tl.e));
    C(tl.e, null, qc.C("e"), null);
  }
  
  public void C(View paramView)
  {
    if ((paramView instanceof SeekBar))
    {
      String str = ab.C(paramView, false, ab.C(new Class[] { SeekBar.class }));
      C(tl.A, Integer.toString(((SeekBar)paramView).getProgress()), str, null, paramView.getId(), ab.C(paramView, SeekBar.class), ab.C(paramView));
    }
  }
  
  public void C(View paramView1, View paramView2, jg paramjg, MotionEvent paramMotionEvent)
  {
    if (paramView1 == null) {}
    do
    {
      do
      {
        return;
      } while ((!fc.C().C()) || (!ye.C().g()));
      if ((paramView1 instanceof AbsListView))
      {
        C((AbsListView)paramView1, paramMotionEvent, paramjg);
        return;
      }
      if ((paramView1 instanceof TabWidget))
      {
        C((TabWidget)paramView1, paramView2, paramjg);
        return;
      }
      if (ab.C(ob.f, paramView1))
      {
        C((ViewGroup)paramView1, paramView2, paramjg);
        return;
      }
      if (ab.J(paramView1))
      {
        C(paramView1, paramjg);
        return;
      }
    } while (((paramView1 instanceof SeekBar)) || (!(paramView1 instanceof EditText)));
    paramMotionEvent = ab.C(paramView1, false, ab.C(new Class[] { EditText.class }));
    C(tl.l, null, paramMotionEvent, paramjg, paramView1.getId(), ab.C(paramView2, EditText.class), ab.C(paramView1));
  }
  
  public void C(ViewGroup paramViewGroup, View paramView, jg paramjg)
  {
    if ((paramViewGroup == null) || (paramView == null)) {}
    while ((!(paramView instanceof EditText)) && (!(paramView instanceof ImageView))) {
      return;
    }
    Object localObject = new ArrayList(ab.C());
    ((List)localObject).add(ImageView.class);
    String str2 = ab.C(paramView, true, (List)localObject);
    String str1 = H(paramView);
    localObject = str1;
    if (bb.C(str1))
    {
      paramViewGroup = ab.C(paramViewGroup, ImageView.class);
      localObject = str1;
      if (paramViewGroup.size() > 2) {
        localObject = C(((ImageView)paramViewGroup.get(1)).getDrawable());
      }
    }
    C(tl.f, (String)localObject, str2, paramjg, paramView.getId(), ab.C(paramView, paramView.getClass()), ab.C(paramView));
  }
  
  public void C(AbsListView paramAbsListView, MotionEvent paramMotionEvent, jg paramjg)
  {
    int i = ab.C(paramAbsListView, (short)(int)paramMotionEvent.getY(paramMotionEvent.getActionIndex()));
    if (i < 0)
    {
      paramjg.C(false);
      return;
    }
    paramMotionEvent = String.format(zb.C("\0372\nx"), new Object[] { Integer.valueOf(i) });
    paramAbsListView = ab.C(paramAbsListView, false, ab.C(new Class[] { AbsListView.class }));
    C(tl.D, paramMotionEvent, paramAbsListView, paramjg);
  }
  
  public void C(TabWidget paramTabWidget, View paramView, jg paramjg)
  {
    View localView = ab.C(paramTabWidget, paramView);
    String str = H(localView);
    paramView = ab.C(paramTabWidget, false, ab.C(new Class[] { TabWidget.class }));
    int i = ab.H(paramTabWidget, localView);
    paramTabWidget = paramView;
    if (i != -1) {
      paramTabWidget = String.format(zb.C("9\\2\nx"), new Object[] { paramView, Integer.valueOf(i) });
    }
    C(tl.f, str, paramTabWidget, paramjg, localView.getId(), ab.C(localView, localView.getClass()), ab.C(localView));
  }
  
  public void C(tl paramtl, String paramString1, String paramString2, jg paramjg)
  {
    C(paramtl, paramString1, paramString2, paramjg, -1, false, null);
  }
  
  public void C(tl arg1, String paramString1, String paramString2, jg paramjg, int paramInt, boolean paramBoolean, Rect paramRect)
  {
    if (!fc.C().C()) {}
    while ((fc.C().C() == -1L) || (((??? == tl.E) || (??? == tl.B)) && (!this.A.isEmpty()) && (((kl)this.A.get(this.A.size() - 1)).C() == ???))) {
      return;
    }
    paramRect = new kl(???, paramString1, paramString2, fc.C().C(), ab.C(paramRect));
    if (paramInt > 0)
    {
      paramRect.a(String.valueOf(paramInt));
      paramRect.C(Boolean.valueOf(paramBoolean));
    }
    if (paramjg != null) {
      paramRect.C(paramjg.C());
    }
    vd.C(1, qc.C("-~-tF0c1ctf7s=h:' ~$bt:t\"'+tw5u5j1s1u''i'qttn:c1t:t\"''5st\"0"), new Object[] { ???.toString(), paramString1, paramString2, Long.valueOf(paramRect.C()) });
    synchronized (this.A)
    {
      this.A.add(paramRect);
      return;
    }
  }
  
  public void C(String paramString)
  {
    if ((!fc.C().C()) || (!ye.C().g())) {}
    kl localkl;
    do
    {
      return;
      if (this.A.isEmpty()) {
        break;
      }
      localkl = (kl)this.A.get(this.A.size() - 1);
    } while ((localkl != null) && (localkl.C() == tl.c) && (fc.C().C() - localkl.C() <= 4000L));
    C(tl.c, paramString, null, null);
  }
  
  public void H()
  {
    synchronized (this.A)
    {
      this.A.clear();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */