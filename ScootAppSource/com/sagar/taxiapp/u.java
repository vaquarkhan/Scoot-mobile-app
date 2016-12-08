package com.sagar.taxiapp;

import android.content.SharedPreferences;
import com.parse.ParseCloud;
import com.sagar.taxiapp.parsesignup.c;
import java.util.HashMap;

final class u
  implements Runnable
{
  u(ActivitySplash paramActivitySplash) {}
  
  public void run()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences("shareddata", 0);
    if ((localSharedPreferences.getString("Key", null) == null) || (localSharedPreferences.getString("Salt", null) == null)) {
      ParseCloud.callFunctionInBackground("payuMerchant", new HashMap(), new v(this));
    }
    new c(this.a).b();
    this.a.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */