package com.google.android.gms.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.ak;
import java.util.LinkedList;

public abstract class b<T extends a>
{
  private T a;
  private Bundle b;
  private LinkedList<i> c;
  private final n<T> d = new c(this);
  
  private void a(int paramInt)
  {
    while ((!this.c.isEmpty()) && (((i)this.c.getLast()).a() >= paramInt)) {
      this.c.removeLast();
    }
  }
  
  private void a(Bundle paramBundle, i parami)
  {
    if (this.a != null)
    {
      parami.a(this.a);
      return;
    }
    if (this.c == null) {
      this.c = new LinkedList();
    }
    this.c.add(parami);
    if (paramBundle != null)
    {
      if (this.b != null) {
        break label76;
      }
      this.b = ((Bundle)paramBundle.clone());
    }
    for (;;)
    {
      a(this.d);
      return;
      label76:
      this.b.putAll(paramBundle);
    }
  }
  
  public static void b(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    String str2 = ak.a(localContext, i, GooglePlayServicesUtil.zzam(localContext));
    String str1 = ak.c(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    paramFrameLayout = new TextView(paramFrameLayout.getContext());
    paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.setText(str2);
    localLinearLayout.addView(paramFrameLayout);
    if (str1 != null)
    {
      paramFrameLayout = new Button(localContext);
      paramFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      paramFrameLayout.setText(str1);
      localLinearLayout.addView(paramFrameLayout);
      paramFrameLayout.setOnClickListener(new g(localContext, i));
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new f(this, localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle));
    if (this.a == null) {
      a(localFrameLayout);
    }
    return localFrameLayout;
  }
  
  public T a()
  {
    return this.a;
  }
  
  public void a(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    a(paramBundle2, new d(this, paramActivity, paramBundle1, paramBundle2));
  }
  
  public void a(Bundle paramBundle)
  {
    a(paramBundle, new e(this, paramBundle));
  }
  
  protected void a(FrameLayout paramFrameLayout)
  {
    b(paramFrameLayout);
  }
  
  protected abstract void a(n<T> paramn);
  
  public void b()
  {
    a(null, new h(this));
  }
  
  public void b(Bundle paramBundle)
  {
    if (this.a != null) {
      this.a.b(paramBundle);
    }
    while (this.b == null) {
      return;
    }
    paramBundle.putAll(this.b);
  }
  
  public void c()
  {
    if (this.a != null)
    {
      this.a.b();
      return;
    }
    a(5);
  }
  
  public void d()
  {
    if (this.a != null)
    {
      this.a.c();
      return;
    }
    a(2);
  }
  
  public void e()
  {
    if (this.a != null)
    {
      this.a.d();
      return;
    }
    a(1);
  }
  
  public void f()
  {
    if (this.a != null) {
      this.a.e();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */