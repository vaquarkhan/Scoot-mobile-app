package com.codetroopers.betterpickers.calendardatepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import java.util.HashMap;

public abstract class k
  extends BaseAdapter
  implements o
{
  protected static int a = 7;
  private final Context b;
  private final a c;
  private l d;
  private TypedArray e;
  
  public k(Context paramContext, a parama)
  {
    this.b = paramContext;
    this.c = parama;
    a();
    a(this.c.c_());
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    return (this.d.a == paramInt1) && (this.d.b == paramInt2);
  }
  
  private boolean b(int paramInt1, int paramInt2)
  {
    return (this.c.c().a == paramInt1) && (this.c.c().b == paramInt2);
  }
  
  private boolean c(int paramInt1, int paramInt2)
  {
    return (this.c.d().a == paramInt1) && (this.c.d().b == paramInt2);
  }
  
  private boolean c(l paraml)
  {
    return (paraml.b(this.c.c()) >= 0) && (paraml.b(this.c.d()) <= 0);
  }
  
  public abstract m a(Context paramContext);
  
  protected void a()
  {
    this.d = new l(System.currentTimeMillis());
    if (this.d.b(this.c.d()) > 0) {
      this.d = this.c.d();
    }
    if (this.d.b(this.c.c()) < 0) {
      this.d = this.c.c();
    }
  }
  
  public void a(TypedArray paramTypedArray)
  {
    this.e = paramTypedArray;
  }
  
  public void a(l paraml)
  {
    this.d = paraml;
    notifyDataSetChanged();
  }
  
  public void a(m paramm, l paraml)
  {
    if ((paraml != null) && (c(paraml))) {
      b(paraml);
    }
  }
  
  protected void b(l paraml)
  {
    this.c.e_();
    this.c.a(paraml.a, paraml.b, paraml.c);
    a(paraml);
  }
  
  public int getCount()
  {
    return (this.c.d().a - this.c.c().a + 1) * 12 - (11 - this.c.d().b) - this.c.c().b;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  @SuppressLint({"NewApi"})
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j = -1;
    paramViewGroup = null;
    Object localObject;
    int k;
    int m;
    if (paramView != null)
    {
      paramViewGroup = (m)paramView;
      paramView = (HashMap)paramViewGroup.getTag();
      localObject = paramView;
      if (paramView == null) {
        localObject = new HashMap();
      }
      ((HashMap)localObject).clear();
      k = (this.c.c().b + paramInt) % 12;
      m = (this.c.c().b + paramInt) / 12 + this.c.c().a;
      if (!a(m, k)) {
        break label322;
      }
    }
    label322:
    for (paramInt = this.d.c;; paramInt = -1)
    {
      if (b(m, k)) {}
      for (int i = this.c.c().c;; i = -1)
      {
        if (c(m, k)) {
          j = this.c.d().c;
        }
        paramViewGroup.b();
        ((HashMap)localObject).put("selected_day", Integer.valueOf(paramInt));
        ((HashMap)localObject).put("year", Integer.valueOf(m));
        ((HashMap)localObject).put("month", Integer.valueOf(k));
        ((HashMap)localObject).put("week_start", Integer.valueOf(this.c.d_()));
        ((HashMap)localObject).put("range_min", Integer.valueOf(i));
        ((HashMap)localObject).put("range_max", Integer.valueOf(j));
        paramViewGroup.setMonthParams((HashMap)localObject);
        paramViewGroup.invalidate();
        return paramViewGroup;
        localObject = a(this.b);
        ((m)localObject).setTheme(this.e);
        ((m)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        ((m)localObject).setClickable(true);
        ((m)localObject).setOnDayClickListener(this);
        paramView = paramViewGroup;
        paramViewGroup = (ViewGroup)localObject;
        break;
      }
    }
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */