package com.sagar.taxiapp;

import android.content.Intent;
import com.facebook.aj;
import com.facebook.as;
import org.json.JSONObject;

final class do
  implements aj
{
  do(dn paramdn) {}
  
  public void a(JSONObject paramJSONObject, as paramas)
  {
    try
    {
      paramas = paramJSONObject.optJSONObject("picture").optJSONObject("data").optString("url");
      Intent localIntent = new Intent(this.a.a, SocialAccountSignup.class);
      localIntent.putExtra("email", paramJSONObject.optString("email"));
      localIntent.putExtra("password", "facebook");
      localIntent.putExtra("first_name", paramJSONObject.optString("first_name"));
      localIntent.putExtra("last_name", paramJSONObject.optString("last_name"));
      localIntent.putExtra("signupType", "facebook");
      localIntent.putExtra("displayPictureUrl", paramas);
      this.a.a.startActivity(localIntent);
      return;
    }
    catch (NullPointerException paramas)
    {
      for (;;)
      {
        paramas = "NA";
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */