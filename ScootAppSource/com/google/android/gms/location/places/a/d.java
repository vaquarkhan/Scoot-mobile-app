package com.google.android.gms.location.places.a;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.google.android.gms.common.b;

public abstract class d
{
  protected final Intent a;
  
  public d(String paramString)
  {
    this.a = new Intent(paramString);
    this.a.setPackage("com.google.android.gms");
  }
  
  protected Intent a(Activity paramActivity)
  {
    Resources.Theme localTheme = paramActivity.getTheme();
    TypedValue localTypedValue1 = new TypedValue();
    TypedValue localTypedValue2 = new TypedValue();
    if ((localTheme.resolveAttribute(16843827, localTypedValue1, true)) && (!this.a.hasExtra("primary_color"))) {
      this.a.putExtra("primary_color", localTypedValue1.data);
    }
    if ((localTheme.resolveAttribute(16843828, localTypedValue2, true)) && (!this.a.hasExtra("primary_color_dark"))) {
      this.a.putExtra("primary_color_dark", localTypedValue2.data);
    }
    b.a().b(paramActivity);
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */