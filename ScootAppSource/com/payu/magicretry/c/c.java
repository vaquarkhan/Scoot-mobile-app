package com.payu.magicretry.c;

import android.app.Activity;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class c
  extends AsyncTask<Void, Void, Void>
{
  c(a parama, String paramString) {}
  
  protected Void a(Void... paramVarArgs)
  {
    a.b(this.b);
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject(this.a);
        if (!new File(a.d(this.b).getFilesDir(), a.c(this.b)).exists()) {
          a.d(this.b).openFileOutput(a.c(this.b), 0);
        }
        Object localObject = a.d(this.b).openFileInput(a.c(this.b));
        paramVarArgs = "";
        int i = ((FileInputStream)localObject).read();
        if (i != -1)
        {
          paramVarArgs = paramVarArgs + Character.toString((char)i);
          continue;
        }
        if (!paramVarArgs.equalsIgnoreCase("")) {
          continue;
        }
        paramVarArgs = new JSONArray();
        ((FileInputStream)localObject).close();
        localObject = a.d(this.b).openFileOutput(a.c(this.b), 0);
        paramVarArgs.put(paramVarArgs.length(), localJSONObject);
        ((FileOutputStream)localObject).write(paramVarArgs.toString().getBytes());
        ((FileOutputStream)localObject).close();
      }
      catch (IOException paramVarArgs)
      {
        paramVarArgs.printStackTrace();
        a.e(this.b).add(this.a);
        continue;
      }
      catch (JSONException paramVarArgs)
      {
        paramVarArgs.printStackTrace();
        a.e(this.b).add(this.a);
        continue;
      }
      catch (Exception paramVarArgs)
      {
        paramVarArgs.printStackTrace();
        a.e(this.b).add(this.a);
        continue;
      }
      a.f(this.b);
      return null;
      paramVarArgs = new JSONArray(paramVarArgs);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */