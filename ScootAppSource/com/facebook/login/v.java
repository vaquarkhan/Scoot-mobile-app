package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import com.facebook.b.az;

final class v
  implements y
{
  private final Activity a;
  
  v(Activity paramActivity)
  {
    az.a(paramActivity, "activity");
    this.a = paramActivity;
  }
  
  public Activity a()
  {
    return this.a;
  }
  
  public void a(Intent paramIntent, int paramInt)
  {
    this.a.startActivityForResult(paramIntent, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */