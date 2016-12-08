package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class w
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  int a = 0;
  int b = 0;
  boolean c = true;
  boolean d = true;
  int e = -1;
  Dialog f;
  boolean g;
  boolean h;
  boolean i;
  
  public void a()
  {
    a(false);
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    if (!this.i) {
      this.h = false;
    }
  }
  
  public void a(Dialog paramDialog, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 3: 
      paramDialog.getWindow().addFlags(24);
    }
    paramDialog.requestWindowFeature(1);
  }
  
  public void a(ah paramah, String paramString)
  {
    this.h = false;
    this.i = true;
    paramah = paramah.a();
    paramah.a(this, paramString);
    paramah.a();
  }
  
  void a(boolean paramBoolean)
  {
    if (this.h) {
      return;
    }
    this.h = true;
    this.i = false;
    if (this.f != null)
    {
      this.f.dismiss();
      this.f = null;
    }
    this.g = true;
    if (this.e >= 0)
    {
      n().a(this.e, 1);
      this.e = -1;
      return;
    }
    av localav = n().a();
    localav.a(this);
    if (paramBoolean)
    {
      localav.b();
      return;
    }
    localav.a();
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    if (this.G == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      if (paramBundle != null)
      {
        this.a = paramBundle.getInt("android:style", 0);
        this.b = paramBundle.getInt("android:theme", 0);
        this.c = paramBundle.getBoolean("android:cancelable", true);
        this.d = paramBundle.getBoolean("android:showsDialog", this.d);
        this.e = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }
  
  public Dialog b()
  {
    return this.f;
  }
  
  public LayoutInflater b(Bundle paramBundle)
  {
    if (!this.d) {
      return super.b(paramBundle);
    }
    this.f = c(paramBundle);
    if (this.f != null)
    {
      a(this.f, this.a);
      return (LayoutInflater)this.f.getContext().getSystemService("layout_inflater");
    }
    return (LayoutInflater)this.C.g().getSystemService("layout_inflater");
  }
  
  public void b(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public Dialog c(Bundle paramBundle)
  {
    return new Dialog(l(), f_());
  }
  
  public void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (!this.d) {}
    do
    {
      do
      {
        return;
        View localView = v();
        if (localView != null)
        {
          if (localView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
          this.f.setContentView(localView);
        }
        this.f.setOwnerActivity(l());
        this.f.setCancelable(this.c);
        this.f.setOnCancelListener(this);
        this.f.setOnDismissListener(this);
      } while (paramBundle == null);
      paramBundle = paramBundle.getBundle("android:savedDialogState");
    } while (paramBundle == null);
    this.f.onRestoreInstanceState(paramBundle);
  }
  
  public void e()
  {
    super.e();
    if ((!this.i) && (!this.h)) {
      this.h = true;
    }
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.f != null)
    {
      Bundle localBundle = this.f.onSaveInstanceState();
      if (localBundle != null) {
        paramBundle.putBundle("android:savedDialogState", localBundle);
      }
    }
    if (this.a != 0) {
      paramBundle.putInt("android:style", this.a);
    }
    if (this.b != 0) {
      paramBundle.putInt("android:theme", this.b);
    }
    if (!this.c) {
      paramBundle.putBoolean("android:cancelable", this.c);
    }
    if (!this.d) {
      paramBundle.putBoolean("android:showsDialog", this.d);
    }
    if (this.e != -1) {
      paramBundle.putInt("android:backStackId", this.e);
    }
  }
  
  public void f()
  {
    super.f();
    if (this.f != null)
    {
      this.g = false;
      this.f.show();
    }
  }
  
  public int f_()
  {
    return this.b;
  }
  
  public void g()
  {
    super.g();
    if (this.f != null) {
      this.f.hide();
    }
  }
  
  public boolean g_()
  {
    return this.d;
  }
  
  public void h()
  {
    super.h();
    if (this.f != null)
    {
      this.g = true;
      this.f.dismiss();
      this.f = null;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (!this.g) {
      a(true);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */