package com.payu.custombrowser;

import android.app.Activity;
import android.os.AsyncTask;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ap
  extends AsyncTask<String, Void, String>
{
  private String b;
  
  ap(am paramam, String paramString)
  {
    this.b = paramString;
  }
  
  protected String a(String... paramVarArgs)
  {
    j = 0;
    try
    {
      localObject1 = new JSONArray(paramVarArgs[0]);
      i = 0;
      paramVarArgs = (String[])localObject1;
    }
    catch (MalformedURLException paramVarArgs)
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      paramVarArgs.printStackTrace();
      for (;;)
      {
        return null;
        if (i != 200) {
          break label615;
        }
        try
        {
          localObject1 = new JSONObject(((StringBuffer)localObject2).toString());
          if ((!((JSONObject)localObject1).has("status")) || (((JSONObject)localObject1).getString("status").equalsIgnoreCase(""))) {
            break;
          }
          if ((((JSONObject)localObject1).has("status")) && ((((JSONObject)localObject1).getString("status").equalsIgnoreCase("1")) || (((JSONObject)localObject1).getString("status").equalsIgnoreCase("-1"))))
          {
            am.c(this.a).deleteFile(am.f(this.a));
            i = j;
            while (i < paramVarArgs.length())
            {
              ah.a(((JSONObject)paramVarArgs.get(i)).getString("merchant_key") + "|" + ((JSONObject)paramVarArgs.get(i)).getString("txnid"), true, am.c(this.a));
              i += 1;
            }
          }
          try
          {
            paramVarArgs = am.c(this.a).openFileOutput(am.f(this.a), 0);
            paramVarArgs.write(this.b.getBytes());
            paramVarArgs.close();
          }
          catch (IOException paramVarArgs)
          {
            paramVarArgs.printStackTrace();
          }
        }
        catch (Exception paramVarArgs)
        {
          paramVarArgs.printStackTrace();
          try
          {
            paramVarArgs = am.c(this.a).openFileOutput(am.f(this.a), 0);
            paramVarArgs.write(this.b.getBytes());
            paramVarArgs.close();
          }
          catch (IOException paramVarArgs)
          {
            paramVarArgs.printStackTrace();
          }
        }
      }
    }
    catch (ProtocolException paramVarArgs)
    {
      for (;;)
      {
        continue;
        try
        {
          paramVarArgs = am.c(this.a).openFileOutput(am.f(this.a), 0);
          paramVarArgs.write(this.b.getBytes());
          paramVarArgs.close();
        }
        catch (IOException paramVarArgs)
        {
          paramVarArgs.printStackTrace();
        }
      }
    }
    catch (IOException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
      }
    }
    catch (Exception paramVarArgs)
    {
      for (;;)
      {
        int i;
        paramVarArgs.printStackTrace();
        continue;
        try
        {
          paramVarArgs = am.c(this.a).openFileOutput(am.f(this.a), 0);
          paramVarArgs.write(this.b.getBytes());
          paramVarArgs.close();
        }
        catch (IOException paramVarArgs)
        {
          paramVarArgs.printStackTrace();
        }
        continue;
        am.c(this.a).deleteFile(am.f(this.a));
        continue;
        i += 1;
      }
    }
    if (i < ((JSONArray)localObject1).length())
    {
      if (ah.a(((JSONObject)((JSONArray)localObject1).get(i)).getString("merchant_key") + "|" + ((JSONObject)((JSONArray)localObject1).get(i)).getString("txnid"), am.c(this.a))) {
        paramVarArgs = am.a((JSONArray)localObject1, i);
      }
    }
    else if (paramVarArgs.length() > 0)
    {
      localObject1 = "mobile_data=" + paramVarArgs.toString();
      localObject2 = ((String)localObject1).getBytes("UTF-8");
      localObject3 = (HttpURLConnection)new URL("https://info.payu.in/merchant/mobileWebService.php").openConnection();
      ((HttpURLConnection)localObject3).setRequestMethod("POST");
      ((HttpURLConnection)localObject3).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      ((HttpURLConnection)localObject3).setRequestProperty("Content-Length", String.valueOf(((String)localObject1).length()));
      ((HttpURLConnection)localObject3).setDoOutput(true);
      ((HttpURLConnection)localObject3).getOutputStream().write((byte[])localObject2);
      i = ((HttpURLConnection)localObject3).getResponseCode();
      localObject1 = ((HttpURLConnection)localObject3).getInputStream();
      localObject2 = new StringBuffer();
      localObject3 = new byte['Ѐ'];
      for (;;)
      {
        int k = ((InputStream)localObject1).read((byte[])localObject3);
        if (k == -1) {
          break;
        }
        ((StringBuffer)localObject2).append(new String((byte[])localObject3, 0, k));
      }
    }
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */