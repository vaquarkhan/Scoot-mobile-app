package com.sagar.taxiapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Button;

public final class z
{
  public static void a(Activity paramActivity)
  {
    SharedPreferences localSharedPreferences = paramActivity.getSharedPreferences("apprater", 0);
    if (!localSharedPreferences.getBoolean("special_offer", false))
    {
      localSharedPreferences.edit().putInt("offer_launch_count", localSharedPreferences.getInt("offer_launch_count", 0) + 1).apply();
      paramActivity = new Dialog(paramActivity);
      paramActivity.requestWindowFeature(1);
      paramActivity.setContentView(2130968677);
      ((Button)paramActivity.findViewById(2131755425)).setOnClickListener(new aa(paramActivity));
      paramActivity.show();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */