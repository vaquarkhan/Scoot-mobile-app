package android.support.v7.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class aj
{
  private static int a = -1;
  private static boolean b = false;
  
  public static aj a(Activity paramActivity, ai paramai)
  {
    return a(paramActivity, paramActivity.getWindow(), paramai);
  }
  
  public static aj a(Dialog paramDialog, ai paramai)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramai);
  }
  
  private static aj a(Context paramContext, Window paramWindow, ai paramai)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return new ar(paramContext, paramWindow, paramai);
    }
    if (i >= 14) {
      return new ap(paramContext, paramWindow, paramai);
    }
    if (i >= 11) {
      return new ao(paramContext, paramWindow, paramai);
    }
    return new at(paramContext, paramWindow, paramai);
  }
  
  public static int j()
  {
    return a;
  }
  
  public static boolean k()
  {
    return b;
  }
  
  public abstract a a();
  
  public abstract View a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(int paramInt);
  
  public abstract void b(Bundle paramBundle);
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void c();
  
  public abstract void c(Bundle paramBundle);
  
  public abstract boolean c(int paramInt);
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract h g();
  
  public abstract void h();
  
  public abstract boolean i();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */