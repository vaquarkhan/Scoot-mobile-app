package android.support.v7.a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public final class ag
{
  private final x a;
  private int b;
  
  public ag(Context paramContext)
  {
    this(paramContext, af.a(paramContext, 0));
  }
  
  public ag(Context paramContext, int paramInt)
  {
    this.a = new x(new ContextThemeWrapper(paramContext, af.a(paramContext, paramInt)));
    this.b = paramInt;
  }
  
  public Context a()
  {
    return this.a.a;
  }
  
  public ag a(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.a.r = paramOnKeyListener;
    return this;
  }
  
  public ag a(Drawable paramDrawable)
  {
    this.a.d = paramDrawable;
    return this;
  }
  
  public ag a(View paramView)
  {
    this.a.g = paramView;
    return this;
  }
  
  public ag a(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.a.t = paramListAdapter;
    this.a.u = paramOnClickListener;
    return this;
  }
  
  public ag a(CharSequence paramCharSequence)
  {
    this.a.f = paramCharSequence;
    return this;
  }
  
  public af b()
  {
    af localaf = new af(this.a.a, this.b, false);
    this.a.a(af.a(localaf));
    localaf.setCancelable(this.a.o);
    if (this.a.o) {
      localaf.setCanceledOnTouchOutside(true);
    }
    localaf.setOnCancelListener(this.a.p);
    localaf.setOnDismissListener(this.a.q);
    if (this.a.r != null) {
      localaf.setOnKeyListener(this.a.r);
    }
    return localaf;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */