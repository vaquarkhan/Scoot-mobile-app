package com.sagar.taxiapp.parsesignup;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.support.v7.a.ah;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.parse.ParseUser;
import com.sagar.taxiapp.ds;

public class ModifyUserDetails
  extends ah
{
  private EditText m;
  private EditText n;
  private EditText o;
  private ParseUser p;
  
  public void a(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("profileName", paramString);
    localIntent.putExtra("profilePic", getSharedPreferences("shareddata", 0).getString("profile_uri", ""));
    if (getParent() == null) {
      setResult(-1, localIntent);
    }
    for (;;)
    {
      finish();
      return;
      getParent().setResult(-1, localIntent);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968722);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    this.p = ParseUser.getCurrentUser();
    paramBundle = this.p.getString("firstName");
    String str = this.p.getString("lastName");
    Object localObject1 = (Toolbar)findViewById(2131755210);
    a((Toolbar)localObject1);
    Object localObject2 = h();
    if (localObject2 != null)
    {
      ((android.support.v7.a.a)localObject2).c(false);
      ((android.support.v7.a.a)localObject2).b(true);
      ((android.support.v7.a.a)localObject2).a(true);
      if (Build.VERSION.SDK_INT < 21) {
        break label284;
      }
      ((android.support.v7.a.a)localObject2).a(getResources().getDrawable(2130837795, null));
    }
    for (;;)
    {
      localObject1 = (TextView)((Toolbar)localObject1).findViewById(2131755818);
      ((TextView)localObject1).setTypeface(ds.a(this, "fonts/OpenSans-Semibold.ttf"));
      ((TextView)localObject1).setText("Profile");
      this.m = ((EditText)findViewById(2131755263));
      this.n = ((EditText)findViewById(2131755264));
      this.o = ((EditText)findViewById(2131755634));
      localObject1 = (Button)findViewById(2131755637);
      localObject2 = (Button)findViewById(2131755636);
      this.m.setText(paramBundle);
      this.n.setText(str);
      this.o.setText(this.p.getString("phone"));
      ((Button)localObject1).setOnClickListener(new a(this));
      ((Button)localObject2).setOnClickListener(new b(this));
      return;
      label284:
      ((android.support.v7.a.a)localObject2).a(c.a(this, 2130837795));
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return super.onOptionsItemSelected(paramMenuItem);
    }
    finish();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\ModifyUserDetails.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */