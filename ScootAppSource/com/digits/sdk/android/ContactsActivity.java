package com.digits.sdk.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ContactsActivity
  extends Activity
{
  v a;
  
  public void onCreate(Bundle paramBundle)
  {
    setTheme(getIntent().getIntExtra("THEME_RESOURCE_ID", R.style.Digits_default));
    super.onCreate(paramBundle);
    this.a = new v(this);
    this.a.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */