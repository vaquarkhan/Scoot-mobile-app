package android.support.v7.a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.support.v7.appcompat.R.attr;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class bh
  extends Dialog
  implements ai
{
  private aj a;
  
  public bh(Context paramContext, int paramInt)
  {
    super(paramContext, a(paramContext, paramInt));
    a().a(null);
    a().i();
  }
  
  private static int a(Context paramContext, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0)
    {
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(R.attr.dialogTheme, localTypedValue, true);
      i = localTypedValue.resourceId;
    }
    return i;
  }
  
  public aj a()
  {
    if (this.a == null) {
      this.a = aj.a(this, this);
    }
    return this.a;
  }
  
  public b a(c paramc)
  {
    return null;
  }
  
  public void a(b paramb) {}
  
  public boolean a(int paramInt)
  {
    return a().c(paramInt);
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().b(paramView, paramLayoutParams);
  }
  
  public void b(b paramb) {}
  
  public View findViewById(int paramInt)
  {
    return a().a(paramInt);
  }
  
  public void invalidateOptionsMenu()
  {
    a().e();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    a().h();
    super.onCreate(paramBundle);
    a().a(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    a().c();
  }
  
  public void setContentView(int paramInt)
  {
    a().b(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    a().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().a(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    a().a(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a().a(paramCharSequence);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */