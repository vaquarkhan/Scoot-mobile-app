package com.payu.custombrowser;

import android.app.Activity;
import android.os.AsyncTask;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

final class i
  extends AsyncTask<Void, Void, Void>
{
  i(a parama) {}
  
  protected Void a(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = (HttpURLConnection)new URL("https://secure.payu.in/js/sdk_js/v3/" + "initialize" + ".js").openConnection();
      paramVarArgs.setRequestMethod("GET");
      paramVarArgs.setRequestProperty("Accept-Charset", "UTF-8");
      FileOutputStream localFileOutputStream;
      if (paramVarArgs.getResponseCode() == 200)
      {
        paramVarArgs = new GZIPInputStream(paramVarArgs.getInputStream());
        byte[] arrayOfByte = new byte['Ѐ'];
        localFileOutputStream = a.e(this.a).openFileOutput("initialize", 0);
        for (;;)
        {
          int i = paramVarArgs.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
      }
      try
      {
        if (a.e(this.a) != null)
        {
          a.a(this.a, new JSONObject(a.q(this.a).a(a.e(this.a).openFileInput("initialize"))));
          if (a.a(this.a) == null) {
            break label885;
          }
          a.w(this.a);
          if ((a.v(this.a)) && (a.e(this.a) != null)) {
            a.e(this.a).runOnUiThread(new j(this));
          }
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          a.x(this.a);
          localFileNotFoundException.printStackTrace();
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          a.x(this.a);
          localJSONException.printStackTrace();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          a.x(this.a);
          localException.printStackTrace();
        }
      }
    }
    catch (MalformedURLException paramVarArgs)
    {
      paramVarArgs = paramVarArgs;
      paramVarArgs.printStackTrace();
      for (;;)
      {
        try
        {
          if (a.e(this.a) != null)
          {
            a.a(this.a, new JSONObject(a.q(this.a).a(a.e(this.a).openFileInput("initialize"))));
            if (a.a(this.a) == null) {
              continue;
            }
            a.w(this.a);
            if ((a.v(this.a)) && (a.e(this.a) != null)) {
              a.e(this.a).runOnUiThread(new j(this));
            }
          }
        }
        catch (FileNotFoundException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
          continue;
        }
        catch (JSONException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
          continue;
        }
        catch (Exception paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
          continue;
        }
        return null;
        paramVarArgs.close();
        localFileOutputStream.close();
        try
        {
          if (a.e(this.a) == null) {
            continue;
          }
          a.a(this.a, new JSONObject(a.q(this.a).a(a.e(this.a).openFileInput("initialize"))));
          if (a.a(this.a) != null)
          {
            a.w(this.a);
            if ((!a.v(this.a)) || (a.e(this.a) == null)) {
              continue;
            }
            a.e(this.a).runOnUiThread(new j(this));
          }
        }
        catch (FileNotFoundException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
          continue;
          a.x(this.a);
          continue;
        }
        catch (JSONException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
        catch (Exception paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
        continue;
        a.x(this.a);
      }
    }
    catch (ProtocolException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs = paramVarArgs;
        paramVarArgs.printStackTrace();
        try
        {
          if (a.e(this.a) != null)
          {
            a.a(this.a, new JSONObject(a.q(this.a).a(a.e(this.a).openFileInput("initialize"))));
            if (a.a(this.a) != null)
            {
              a.w(this.a);
              if ((!a.v(this.a)) || (a.e(this.a) == null)) {
                continue;
              }
              a.e(this.a).runOnUiThread(new j(this));
            }
          }
        }
        catch (FileNotFoundException paramVarArgs)
        {
          for (;;)
          {
            a.x(this.a);
            paramVarArgs.printStackTrace();
            break;
            a.x(this.a);
          }
        }
        catch (JSONException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
        catch (Exception paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
      }
    }
    catch (IOException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs = paramVarArgs;
        paramVarArgs.printStackTrace();
        try
        {
          if (a.e(this.a) != null)
          {
            a.a(this.a, new JSONObject(a.q(this.a).a(a.e(this.a).openFileInput("initialize"))));
            if (a.a(this.a) != null)
            {
              a.w(this.a);
              if ((!a.v(this.a)) || (a.e(this.a) == null)) {
                continue;
              }
              a.e(this.a).runOnUiThread(new j(this));
            }
          }
        }
        catch (FileNotFoundException paramVarArgs)
        {
          for (;;)
          {
            a.x(this.a);
            paramVarArgs.printStackTrace();
            break;
            a.x(this.a);
          }
        }
        catch (JSONException paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
        catch (Exception paramVarArgs)
        {
          a.x(this.a);
          paramVarArgs.printStackTrace();
        }
      }
    }
    finally {}
    for (;;)
    {
      throw paramVarArgs;
      label885:
      a.x(this.a);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */