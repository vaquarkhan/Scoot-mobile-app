package android.support.v7.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.e;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.support.v7.view.menu.z;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

final class bf
{
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  ViewGroup g;
  View h;
  View i;
  i j;
  g k;
  Context l;
  boolean m;
  boolean n;
  boolean o;
  public boolean p;
  boolean q;
  boolean r;
  Bundle s;
  
  bf(int paramInt)
  {
    this.a = paramInt;
    this.q = false;
  }
  
  z a(y paramy)
  {
    if (this.j == null) {
      return null;
    }
    if (this.k == null)
    {
      this.k = new g(this.l, R.layout.abc_list_menu_item_layout);
      this.k.a(paramy);
      this.j.a(this.k);
    }
    return this.k.a(this.g);
  }
  
  void a(Context paramContext)
  {
    TypedValue localTypedValue = new TypedValue();
    Resources.Theme localTheme = paramContext.getResources().newTheme();
    localTheme.setTo(paramContext.getTheme());
    localTheme.resolveAttribute(R.attr.actionBarPopupTheme, localTypedValue, true);
    if (localTypedValue.resourceId != 0) {
      localTheme.applyStyle(localTypedValue.resourceId, true);
    }
    localTheme.resolveAttribute(R.attr.panelMenuListTheme, localTypedValue, true);
    if (localTypedValue.resourceId != 0) {
      localTheme.applyStyle(localTypedValue.resourceId, true);
    }
    for (;;)
    {
      paramContext = new e(paramContext, 0);
      paramContext.getTheme().setTo(localTheme);
      this.l = paramContext;
      paramContext = paramContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
      this.b = paramContext.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
      this.f = paramContext.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
      paramContext.recycle();
      return;
      localTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
    }
  }
  
  void a(i parami)
  {
    if (parami == this.j) {}
    do
    {
      return;
      if (this.j != null) {
        this.j.b(this.k);
      }
      this.j = parami;
    } while ((parami == null) || (this.k == null));
    parami.a(this.k);
  }
  
  public boolean a()
  {
    boolean bool2 = true;
    boolean bool1;
    if (this.h == null) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (this.i != null);
      bool1 = bool2;
    } while (this.k.a().getCount() > 0);
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */