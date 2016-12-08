package com.payu.india.e;

import android.os.AsyncTask;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import com.payu.india.Model.StoredCard;
import com.payu.india.b.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends AsyncTask<PayuConfig, String, PayuResponse>
{
  private b a;
  
  public e(b paramb)
  {
    this.a = paramb;
  }
  
  protected PayuResponse a(PayuConfig... paramVarArgs)
  {
    PayuResponse localPayuResponse = new PayuResponse();
    PostData localPostData = new PostData();
    Object localObject1 = paramVarArgs[0];
    try
    {
      switch (((PayuConfig)localObject1).b())
      {
      case 0: 
        paramVarArgs = new URL("https://info.payu.in/merchant/postservice.php?form=2");
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
      }
      paramVarArgs = new JSONObject(((StringBuffer)localObject1).toString());
      if (!paramVarArgs.has("user_cards")) {
        break label553;
      }
    }
    localObject1 = ((PayuConfig)localObject1).a().getBytes("UTF-8");
    paramVarArgs = (HttpURLConnection)paramVarArgs.openConnection();
    paramVarArgs.setRequestMethod("POST");
    paramVarArgs.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    paramVarArgs.setRequestProperty("Content-Length", String.valueOf(localObject1.length));
    paramVarArgs.setDoOutput(true);
    paramVarArgs.getOutputStream().write((byte[])localObject1);
    paramVarArgs = paramVarArgs.getInputStream();
    localObject1 = new StringBuffer();
    Object localObject2 = new byte['Ѐ'];
    for (;;)
    {
      int i = paramVarArgs.read((byte[])localObject2);
      if (i == -1) {
        break;
      }
      ((StringBuffer)localObject1).append(new String((byte[])localObject2, 0, i));
    }
    label188:
    localObject1 = paramVarArgs.getJSONObject("user_cards");
    localObject2 = ((JSONObject)localObject1).keys();
    ArrayList localArrayList = new ArrayList();
    label320:
    Object localObject3;
    StoredCard localStoredCard;
    if (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      localStoredCard = new StoredCard();
      localObject3 = ((JSONObject)localObject1).getJSONObject((String)localObject3);
      localStoredCard.a(((JSONObject)localObject3).getString("name_on_card"));
      localStoredCard.b(((JSONObject)localObject3).getString("card_name"));
      localStoredCard.c(((JSONObject)localObject3).getString("expiry_year"));
      localStoredCard.d(((JSONObject)localObject3).getString("expiry_month"));
      localStoredCard.e(((JSONObject)localObject3).getString("card_type"));
      localStoredCard.f(((JSONObject)localObject3).getString("card_token"));
      if (((JSONObject)localObject3).getInt("is_expired") != 0) {
        break label620;
      }
    }
    label553:
    label620:
    for (boolean bool = false;; bool = true)
    {
      localStoredCard.a(Boolean.valueOf(bool));
      localStoredCard.g(((JSONObject)localObject3).getString("card_mode"));
      localStoredCard.h(((JSONObject)localObject3).getString("card_no"));
      localStoredCard.i(((JSONObject)localObject3).getString("card_brand"));
      localStoredCard.j(((JSONObject)localObject3).getString("card_bin"));
      localStoredCard.k(((JSONObject)localObject3).getString("isDomestic"));
      if (((JSONObject)localObject3).has("card_cvv")) {
        localStoredCard.a(((JSONObject)localObject3).getInt("card_cvv"));
      }
      localArrayList.add(localStoredCard);
      break label320;
      localPayuResponse.a(localArrayList);
      if (paramVarArgs.has("msg")) {
        localPostData.b(paramVarArgs.getString("msg"));
      }
      if (paramVarArgs.has("status"))
      {
        localPostData.a(0);
        localPostData.a("SUCCESS");
        break label188;
      }
      localPostData.a(5018);
      localPostData.a("ERROR");
      break label188;
      break;
    }
  }
  
  protected void a(PayuResponse paramPayuResponse)
  {
    super.onPostExecute(paramPayuResponse);
    this.a.b(paramPayuResponse);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */