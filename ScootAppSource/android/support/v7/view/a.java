package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.db;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.bool;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.integer;
import android.support.v7.appcompat.R.styleable;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public final class a
{
  private Context a;
  
  private a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public int a()
  {
    return this.a.getResources().getInteger(R.integer.abc_max_action_buttons);
  }
  
  public boolean b()
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    while (!db.b(ViewConfiguration.get(this.a))) {
      return true;
    }
    return false;
  }
  
  public int c()
  {
    return this.a.getResources().getDisplayMetrics().widthPixels / 2;
  }
  
  public boolean d()
  {
    if (this.a.getApplicationInfo().targetSdkVersion >= 16) {
      return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
    return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs_pre_jb);
  }
  
  public int e()
  {
    TypedArray localTypedArray = this.a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
    int j = localTypedArray.getLayoutDimension(R.styleable.ActionBar_height, 0);
    Resources localResources = this.a.getResources();
    int i = j;
    if (!d()) {
      i = Math.min(j, localResources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    return i;
  }
  
  public boolean f()
  {
    return this.a.getApplicationInfo().targetSdkVersion < 14;
  }
  
  public int g()
  {
    return this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */