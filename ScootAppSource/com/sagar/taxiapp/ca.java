package com.sagar.taxiapp;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.login.x;
import com.facebook.n;
import com.facebook.p;

final class ca
  implements n<x>
{
  ca(LoginPage paramLoginPage) {}
  
  public void a() {}
  
  public void a(x paramx)
  {
    paramx = GraphRequest.a(AccessToken.a(), new cb(this));
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "email");
    paramx.a(localBundle);
    paramx.j();
  }
  
  public void a(p paramp) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */