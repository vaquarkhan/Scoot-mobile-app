package com.sagar.taxiapp.b;

import android.content.SharedPreferences.Editor;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.Log;
import android.widget.Toast;
import com.b.a.y;
import org.json.JSONArray;
import org.json.JSONObject;

final class ae
  implements y<JSONObject>
{
  ae(v paramv) {}
  
  public void a(JSONObject paramJSONObject)
  {
    Log.v("Scoot", "Inside Result Function getLocationFromWeb()");
    if (paramJSONObject != null)
    {
      paramJSONObject = paramJSONObject.optJSONArray("results");
      if (paramJSONObject.optJSONObject(0) != null)
      {
        paramJSONObject = paramJSONObject.optJSONObject(0).optString("formatted_address");
        Log.v("Scoot", "Location inside " + paramJSONObject);
        v localv = this.a;
        if (paramJSONObject != null)
        {
          localv.c = paramJSONObject;
          if (!this.a.c.equalsIgnoreCase("Enter Current Location")) {
            break label153;
          }
          Toast.makeText(v.F(this.a), "Unable to obtain location. Please enter your location manually.", 1).show();
          v.d(this.a).setHint("Enter Your Location");
        }
        for (;;)
        {
          v.I(this.a).putString("yourLocation", this.a.c).apply();
          return;
          paramJSONObject = "Enter Current Location";
          break;
          label153:
          v.d(this.a).setText(this.a.c);
        }
      }
      v.d(this.a).setHint("Enter Your Location");
      return;
    }
    v.d(this.a).setHint("Enter Your Location");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */