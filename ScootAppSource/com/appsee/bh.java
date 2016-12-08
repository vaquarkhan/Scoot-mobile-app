package com.appsee;

import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

class bh
  implements GestureDetector.OnGestureListener, r, x
{
  private static bh B;
  private GestureDetector A;
  private xd D;
  private sc G;
  private WeakReference<View> M;
  private List<jg> l;
  
  public static bh C()
  {
    try
    {
      if (B == null) {
        B = new bh();
      }
      bh localbh = B;
      return localbh;
    }
    finally {}
  }
  
  public JSONArray C()
  {
    synchronized (this.l)
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(((jg)localIterator.next()).C());
      }
      return localJSONArray;
    }
  }
  
  public void C()
  {
    synchronized (this.l)
    {
      this.l.clear();
      return;
    }
  }
  
  public void C(float paramFloat, short[] paramArrayOfShort, MotionEvent paramMotionEvent)
  {
    C(hj.M, paramMotionEvent, paramArrayOfShort);
  }
  
  public void C(int paramInt, short[] paramArrayOfShort, MotionEvent paramMotionEvent)
  {
    if (paramInt >= 0) {}
    for (hj localhj = hj.A;; localhj = hj.f)
    {
      C(localhj, paramMotionEvent, paramArrayOfShort);
      return;
    }
  }
  
  public void C(MotionEvent paramMotionEvent)
  {
    C(hj.l, paramMotionEvent);
  }
  
  public void C(MotionEvent paramMotionEvent, View paramView)
  {
    if (!ye.C().j()) {}
    do
    {
      return;
      this.M = new WeakReference(paramView);
      if (this.A == null) {
        this.A = new GestureDetector(bp.C(), this);
      }
      this.G.C(paramMotionEvent);
      this.A.onTouchEvent(paramMotionEvent);
      this.D.C(paramMotionEvent);
    } while (paramMotionEvent.getActionMasked() != 1);
    uj.C().C(ab.H(ab.C(paramMotionEvent, paramView)));
  }
  
  public void C(hj paramhj, MotionEvent paramMotionEvent, short[] paramArrayOfShort, View arg4)
  {
    if (!fc.C().C()) {}
    label605:
    for (;;)
    {
      return;
      if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0)) {
        paramArrayOfShort = lb.C().C(paramMotionEvent.hashCode());
      }
      for (;;)
      {
        if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0)) {
          break label605;
        }
        if (paramMotionEvent != null) {}
        Object localObject2;
        Object localObject3;
        for (int i = paramMotionEvent.hashCode();; i = 0)
        {
          paramArrayOfShort = new jg(paramhj, true, paramArrayOfShort, -1L, -1L, null, i);
          synchronized (lb.C().C())
          {
            localObject2 = paramArrayOfShort.C();
            if (localObject2 == null) {
              break;
            }
            localObject3 = lb.C().C().iterator();
            zb localzb;
            do
            {
              do
              {
                if (!((Iterator)localObject3).hasNext()) {
                  break;
                }
                localzb = (zb)((Iterator)localObject3).next();
              } while (!((List)localObject2).contains(Short.valueOf(localzb.H())));
              if ((paramArrayOfShort.H() == -1L) || (localzb.C() < paramArrayOfShort.H())) {
                paramArrayOfShort.C(localzb.C());
              }
            } while ((paramArrayOfShort.C() != -1L) && (localzb.C() <= paramArrayOfShort.C()));
            paramArrayOfShort.H(localzb.C());
          }
        }
        if ((paramArrayOfShort.H() == -1L) || (paramArrayOfShort.C() == -1L)) {
          break;
        }
        if (!ye.C().L()) {
          paramArrayOfShort.C(null);
        }
        if (paramhj == hj.e) {}
        for (;;)
        {
          try
          {
            ??? = ye.C().C();
            localObject2 = ab.H(???);
            localObject3 = ab.a(???);
            C(paramArrayOfShort, ???, (View)localObject2, (View)localObject3);
            if ((((Set)???).contains(xo.A)) || (((Set)???).contains(xo.D)))
            {
              vd.C(1, zb.C("_CuLwJx\017JFyX&\no"), new Object[] { ab.a(???) });
              vd.C(1, kl.C("\024F7C(A3V#c&A\"]3\023\021Z\"D}\0264"), new Object[] { ab.a((View)localObject2) });
              ab.C(???.getRootView(), ((Set)???).contains(xo.A), ((Set)???).contains(xo.D));
            }
            uj.C().C((View)localObject2, ???, paramArrayOfShort, paramMotionEvent);
            if ((!ye.C().s()) && (localObject3 == null)) {
              paramArrayOfShort.C(false);
            }
          }
          catch (Exception paramMotionEvent)
          {
            ue.C(paramMotionEvent, zb.C("Y]n@n\017}KxFrH<[}_<N[u@r"));
            continue;
            paramMotionEvent = (jg)this.l.get(this.l.size() - 1);
            continue;
            this.l.add(paramArrayOfShort);
            vd.C(1, kl.C("u(F)WgT\"@3F5Vg\0264\0234G&A3\0233Z*Vg\016g\026#\023\"]#\0233Z*Vg\016g\026#"), new Object[] { paramhj.toString(), Long.valueOf(paramArrayOfShort.H()), Long.valueOf(paramArrayOfShort.C()) });
            continue;
          }
          synchronized (this.l)
          {
            if (this.l.isEmpty())
            {
              paramMotionEvent = null;
              if ((paramMotionEvent == null) || (!paramMotionEvent.C()) || (!paramArrayOfShort.a()) || (paramMotionEvent.H() != paramArrayOfShort.H()) || (paramMotionEvent.C() != paramArrayOfShort.C())) {
                continue;
              }
            }
          }
        }
      }
    }
  }
  
  public void H(MotionEvent paramMotionEvent)
  {
    synchronized (this.l)
    {
      if (this.l.isEmpty())
      {
        localjg = null;
        if ((localjg != null) && (localjg.C() == hj.e) && (localjg.C() == paramMotionEvent.hashCode())) {
          localjg.C(false);
        }
        return;
      }
      jg localjg = (jg)this.l.get(this.l.size() - 1);
    }
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    paramFloat1 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
    paramFloat2 = paramMotionEvent2.getX() - paramMotionEvent1.getX();
    if (Math.abs(paramFloat2) > Math.abs(paramFloat1)) {
      if (paramFloat2 > 0.0F) {
        C(hj.c, paramMotionEvent2);
      }
    }
    for (;;)
    {
      return false;
      C(hj.G, paramMotionEvent2);
      continue;
      if (paramFloat1 > 0.0F) {
        C(hj.E, paramMotionEvent2);
      } else {
        C(hj.D, paramMotionEvent2);
      }
    }
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    View localView = ab.C(paramMotionEvent, (View)this.M.get());
    this.M = null;
    C(hj.e, paramMotionEvent, null, localView);
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */