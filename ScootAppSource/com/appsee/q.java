package com.appsee;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class q
{
  private static HashMap<Class<?>, String> D = new HashMap();
  private WeakReference<List<View>> A;
  private WeakReference<Menu> B;
  private WeakReference<Object> E;
  private long G = 0L;
  private Window.Callback M;
  private Window.Callback c;
  private b e;
  private View.OnTouchListener f;
  private WeakReference<View> l;
  
  static
  {
    D.clear();
    C(kl.C("&]#A(Z#\0354F7C(A3\0351\004iR7Cir$G.\\)q&A\006P3Z1Z3J\003V+V R3V\016p\024\027\020Z)W(D\004R+_%R$X\020A&C7V5"), sc.C("d5{\003y\022l\006"));
    C(kl.C("R)W5\\.WiE.V0\035\020Z)W(D\004R+_%R$X\020A&C7V5"), sc.C("d5{\003y\022l\006"));
    C(kl.C("R)W5\\.Wi@2C7\\5GiEp\035.]3V5]&_iE.V0\035\020Z)W(D\004R+_%R$X\020A&C7V5"), sc.C("d5{\003y\022l\006"));
    C(kl.C("&]#A(Z#\0354F7C(A3\0351\004iE.V0\035\020Z)W(D\004R+_%R$X\020A&C7V5"), sc.C("d5{\003y\022l\006"));
    C(kl.C("\\5TiP/A(^.F*\035%R4Vir7C+Z$R3Z(]\024G&G2@\nR)R V5\027u"), sc.C("\017J\003e\016k\003j\t"));
  }
  
  public q(Object paramObject, View paramView, b paramb)
  {
    this.E = new WeakReference(paramObject);
    this.l = new WeakReference(paramView);
    this.e = paramb;
    if (paramObject != null)
    {
      if (!(paramObject instanceof Window)) {
        break label77;
      }
      this.c = ((Window)paramObject).getCallback();
      if (this.c == null) {
        ue.C(null, kl.C("\004R)](GgU.]#\023\020Z)W(DgG(F$[gG&A V3"));
      }
    }
    label77:
    while (!(paramObject instanceof PopupWindow)) {
      return;
    }
    this.f = ((View.OnTouchListener)lc.C(paramObject, sc.C("\017]\r|\001a+g\026l\020j\007y\026f\020")));
  }
  
  public Menu C()
  {
    if (this.B != null) {
      return (Menu)this.B.get();
    }
    return null;
  }
  
  public View C()
  {
    return (View)this.l.get();
  }
  
  public Window.Callback C()
  {
    Window.Callback localCallback1 = H();
    if (localCallback1 != null)
    {
      if (this.M == null)
      {
        localCallback1 = C(localCallback1);
        for (Window.Callback localCallback2 = localCallback1; localCallback1 != null; localCallback2 = localCallback1)
        {
          this.M = localCallback2;
          localCallback1 = C(localCallback2);
        }
      }
      if (this.M == null) {
        this.M = this.c;
      }
      return this.M;
    }
    return null;
  }
  
  public Window C()
  {
    Object localObject = this.E.get();
    if ((localObject instanceof Window)) {
      return (Window)localObject;
    }
    return null;
  }
  
  public Object C()
  {
    return this.E.get();
  }
  
  public void C()
  {
    if ((!ye.C().y()) || (!fc.C().C())) {}
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = this.E.get();
        if (!(localObject instanceof Window)) {
          break;
        }
      } while ((H() instanceof a));
      ((Window)localObject).setCallback(new a(this));
      H();
      return;
    } while ((!(localObject instanceof PopupWindow)) || ((this.f instanceof j)));
    ((PopupWindow)localObject).setTouchInterceptor(new j(this, null));
  }
  
  public boolean C()
  {
    return ((this.E.get() instanceof Window)) && ((C() instanceof AlertDialog));
  }
  
  public Window.Callback H()
  {
    return this.c;
  }
  
  public List<View> H()
  {
    if (this.A != null) {
      return (List)this.A.get();
    }
    return null;
  }
  
  public void H()
  {
    if (this.e == null) {}
    List localList;
    do
    {
      do
      {
        do
        {
          return;
        } while ((!fc.C().C()) || (!ye.C().M()) || (!ye.C().H()));
        localList = C();
      } while ((localList == null) || (localList.isEmpty()));
      C(localList);
    } while (C() == null);
    this.e.C(this, localList);
  }
  
  public void H(List<View> paramList)
  {
    paramList = paramList.iterator();
    for (;;)
    {
      View localView;
      if (paramList.hasNext())
      {
        localView = (View)paramList.next();
        if (!(localView.getTouchDelegate() instanceof l)) {}
      }
      else
      {
        return;
      }
      localView.setTouchDelegate(new l(this, localView));
    }
  }
  
  public void K()
  {
    Window.Callback localCallback = C();
    if ((!id.C()) && ((localCallback instanceof Activity)))
    {
      Object localObject = lc.C(localCallback, kl.C("*~&Z)g/A\"R#"));
      ad localad = id.C().C();
      lc.C(localCallback, sc.C("d+g\021}\020|\017l\f}\003}\013f\f"), localad);
      lc.C(localObject, kl.C("^\016]4G5F*V)G&G.\\)"), localad);
      id.C().C((Activity)localCallback, true);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */