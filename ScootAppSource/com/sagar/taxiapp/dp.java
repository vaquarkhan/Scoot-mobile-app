package com.sagar.taxiapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

final class dp
  implements View.OnClickListener
{
  dp(SocialAccountSignup paramSocialAccountSignup) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent("android.intent.action.VIEW", Uri.parse("http://scootapp.com/?termsAndConditions"));
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */