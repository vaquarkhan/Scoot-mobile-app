package com.payu.india.e;

import android.os.AsyncTask;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends AsyncTask<PayuConfig, String, PayuResponse>
{
  com.payu.india.b.a a;
  
  public a(com.payu.india.b.a parama)
  {
    this.a = parama;
  }
  
  protected PayuResponse a(PayuConfig... paramVarArgs)
  {
    PayuResponse localPayuResponse = new PayuResponse();
    PostData localPostData = new PostData();
    Object localObject = paramVarArgs[0];
    try
    {
      switch (((PayuConfig)localObject).b())
      {
      case 0: 
        paramVarArgs = new URL("https://info.payu.in/merchant/postservice.php?form=2");
        localObject = ((PayuConfig)localObject).a().getBytes("UTF-8");
        paramVarArgs = (HttpURLConnection)paramVarArgs.openConnection();
        paramVarArgs.setRequestMethod("POST");
        paramVarArgs.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        paramVarArgs.setRequestProperty("Content-Length", String.valueOf(localObject.length));
        paramVarArgs.setDoOutput(true);
        paramVarArgs.getOutputStream().write((byte[])localObject);
        paramVarArgs = paramVarArgs.getInputStream();
        localObject = new StringBuffer();
        byte[] arrayOfByte = new byte['Ѐ'];
        for (;;)
        {
          int i = paramVarArgs.read(arrayOfByte);
          if (i == -1) {
            break;
          }
          ((StringBuffer)localObject).append(new String(arrayOfByte, 0, i));
        }
      }
    }
    catch (MalformedURLException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        localPayuResponse.a(localPostData);
        return localPayuResponse;
        paramVarArgs = new URL("https://info.payu.in/merchant/postservice.php?form=2");
      }
    }
    catch (ProtocolException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        continue;
        paramVarArgs = new URL("https://mobiletest.payu.in/merchant/postservice?form=2");
      }
    }
    catch (IOException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        continue;
        paramVarArgs = new URL("https://test.payu.in/merchant/postservice?form=2");
      }
    }
    catch (JSONException paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs.printStackTrace();
        continue;
        paramVarArgs = new URL("https://mobiledev.payu.in/merchant/postservice?form=2");
        continue;
        paramVarArgs = new JSONObject(((StringBuffer)localObject).toString());
        if (paramVarArgs.has("msg")) {
          localPostData.b(paramVarArgs.getString("msg"));
        }
        if ((paramVarArgs.has("status")) && (paramVarArgs.getInt("status") == 1))
        {
          localPostData.a(0);
          localPostData.a("SUCCESS");
        }
        else
        {
          localPostData.a(5017);
          localPostData.a("ERROR");
        }
      }
    }
  }
  
  protected void a(PayuResponse paramPayuResponse)
  {
    super.onPostExecute(paramPayuResponse);
    this.a.a(paramPayuResponse);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */