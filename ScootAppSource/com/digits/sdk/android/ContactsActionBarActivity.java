package com.digits.sdk.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.a.e;

public class ContactsActionBarActivity
  extends e
{
  v m;
  
  public void onCreate(Bundle paramBundle)
  {
    setTheme(getIntent().getIntExtra("THEME_RESOURCE_ID", R.style.Theme_AppCompat_Light));
    super.onCreate(paramBundle);
    this.m = new v(this);
    this.m.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsActionBarActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */