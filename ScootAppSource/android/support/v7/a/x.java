package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public final class x
{
  public int A;
  public boolean B = false;
  public boolean[] C;
  public boolean D;
  public boolean E;
  public int F = -1;
  public DialogInterface.OnMultiChoiceClickListener G;
  public Cursor H;
  public String I;
  public String J;
  public AdapterView.OnItemSelectedListener K;
  public ac L;
  public boolean M = true;
  public final Context a;
  public final LayoutInflater b;
  public int c = 0;
  public Drawable d;
  public int e = 0;
  public CharSequence f;
  public View g;
  public CharSequence h;
  public CharSequence i;
  public DialogInterface.OnClickListener j;
  public CharSequence k;
  public DialogInterface.OnClickListener l;
  public CharSequence m;
  public DialogInterface.OnClickListener n;
  public boolean o;
  public DialogInterface.OnCancelListener p;
  public DialogInterface.OnDismissListener q;
  public DialogInterface.OnKeyListener r;
  public CharSequence[] s;
  public ListAdapter t;
  public DialogInterface.OnClickListener u;
  public int v;
  public View w;
  public int x;
  public int y;
  public int z;
  
  public x(Context paramContext)
  {
    this.a = paramContext;
    this.o = true;
    this.b = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  private void b(r paramr)
  {
    ListView localListView = (ListView)this.b.inflate(r.k(paramr), null);
    Object localObject;
    if (this.D) {
      if (this.H == null)
      {
        localObject = new y(this, this.a, r.l(paramr), 16908308, this.s, localListView);
        if (this.L != null) {
          this.L.a(localListView);
        }
        r.a(paramr, (ListAdapter)localObject);
        r.a(paramr, this.F);
        if (this.u == null) {
          break label274;
        }
        localListView.setOnItemClickListener(new aa(this, paramr));
        label110:
        if (this.K != null) {
          localListView.setOnItemSelectedListener(this.K);
        }
        if (!this.E) {
          break label300;
        }
        localListView.setChoiceMode(1);
      }
    }
    for (;;)
    {
      r.a(paramr, localListView);
      return;
      localObject = new z(this, this.a, this.H, false, localListView, paramr);
      break;
      if (this.E) {}
      for (int i1 = r.m(paramr);; i1 = r.n(paramr))
      {
        if (this.H == null) {
          break label237;
        }
        localObject = new SimpleCursorAdapter(this.a, i1, this.H, new String[] { this.I }, new int[] { 16908308 });
        break;
      }
      label237:
      if (this.t != null)
      {
        localObject = this.t;
        break;
      }
      localObject = new ae(this.a, i1, 16908308, this.s);
      break;
      label274:
      if (this.G == null) {
        break label110;
      }
      localListView.setOnItemClickListener(new ab(this, localListView, paramr));
      break label110;
      label300:
      if (this.D) {
        localListView.setChoiceMode(2);
      }
    }
  }
  
  public void a(r paramr)
  {
    if (this.g != null)
    {
      paramr.b(this.g);
      if (this.h != null) {
        paramr.b(this.h);
      }
      if (this.i != null) {
        paramr.a(-1, this.i, this.j, null);
      }
      if (this.k != null) {
        paramr.a(-2, this.k, this.l, null);
      }
      if (this.m != null) {
        paramr.a(-3, this.m, this.n, null);
      }
      if ((this.s != null) || (this.H != null) || (this.t != null)) {
        b(paramr);
      }
      if (this.w == null) {
        break label236;
      }
      if (!this.B) {
        break label227;
      }
      paramr.a(this.w, this.x, this.y, this.z, this.A);
    }
    label227:
    label236:
    while (this.v == 0)
    {
      return;
      if (this.f != null) {
        paramr.a(this.f);
      }
      if (this.d != null) {
        paramr.a(this.d);
      }
      if (this.c != 0) {
        paramr.b(this.c);
      }
      if (this.e == 0) {
        break;
      }
      paramr.b(paramr.c(this.e));
      break;
      paramr.c(this.w);
      return;
    }
    paramr.a(this.v);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */