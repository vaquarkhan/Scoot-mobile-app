package com.sagar.taxiapp;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.b.c;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class NewUserScreen
  extends Activity
{
  private Button a;
  private Button b;
  private TextView c;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130968762);
    this.a = ((Button)findViewById(2131755802));
    this.b = ((Button)findViewById(2131755803));
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.clearFlags(67108864);
      paramBundle.setStatusBarColor(c.c(this, 2131689628));
    }
    this.c = ((TextView)findViewById(2131755804));
    this.b.setOnClickListener(new cq(this));
    this.a.setOnClickListener(new cr(this));
    this.c.setOnClickListener(new cs(this));
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131820556, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131755838) {
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\NewUserScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */