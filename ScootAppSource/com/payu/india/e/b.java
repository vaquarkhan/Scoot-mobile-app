package com.payu.india.e;

import android.os.AsyncTask;
import com.payu.india.Model.Emi;
import com.payu.india.Model.PaymentDetails;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import com.payu.india.Model.StoredCard;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends AsyncTask<PayuConfig, String, PayuResponse>
{
  com.payu.india.b.c a;
  
  public b(com.payu.india.b.c paramc)
  {
    this.a = paramc;
  }
  
  protected PayuResponse a(PayuConfig... paramVarArgs)
  {
    PayuResponse localPayuResponse = new PayuResponse();
    Object localObject1 = new PostData();
    Object localObject2 = paramVarArgs[0];
    Object localObject3;
    for (;;)
    {
      try
      {
        com.payu.india.c.c.a((PayuConfig)localObject2);
        switch (((PayuConfig)localObject2).b())
        {
        case 0: 
          paramVarArgs = new URL("https://info.payu.in/merchant/postservice.php?form=2");
        }
      }
      catch (ProtocolException localProtocolException2)
      {
        int i;
        paramVarArgs = (PayuConfig[])localObject1;
        localObject1 = localProtocolException2;
        paramVarArgs.a(5016);
        paramVarArgs.a("ERROR");
        paramVarArgs.b(((ProtocolException)localObject1).getMessage());
        localPayuResponse.a(paramVarArgs);
        return localPayuResponse;
        paramVarArgs = new URL("https://info.payu.in/merchant/postservice.php?form=2");
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        paramVarArgs = (PayuConfig[])localObject1;
        localObject1 = localUnsupportedEncodingException2;
        paramVarArgs.a(5004);
        paramVarArgs.a("ERROR");
        paramVarArgs.b(((UnsupportedEncodingException)localObject1).getMessage());
        continue;
        paramVarArgs = new URL("https://mobiletest.payu.in/merchant/postservice?form=2");
        continue;
      }
      catch (JSONException localJSONException2)
      {
        paramVarArgs = (PayuConfig[])localObject1;
        localObject1 = localJSONException2;
        paramVarArgs.a(5014);
        paramVarArgs.a("ERROR");
        paramVarArgs.b(((JSONException)localObject1).getMessage());
        continue;
        paramVarArgs = new URL("https://test.payu.in/merchant/postservice?form=2");
        continue;
      }
      catch (IOException localIOException2)
      {
        label196:
        label249:
        label296:
        paramVarArgs = (PayuConfig[])localObject1;
        localObject1 = localIOException2;
      }
      localObject2 = ((PayuConfig)localObject2).a().getBytes("UTF-8");
      paramVarArgs = (HttpURLConnection)paramVarArgs.openConnection();
      paramVarArgs.setRequestMethod("POST");
      paramVarArgs.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      paramVarArgs.setRequestProperty("Content-Length", String.valueOf(localObject2.length));
      paramVarArgs.setDoOutput(true);
      paramVarArgs.getOutputStream().write((byte[])localObject2);
      paramVarArgs = paramVarArgs.getInputStream();
      localObject2 = new StringBuffer();
      localObject3 = new byte['Ѐ'];
      i = paramVarArgs.read((byte[])localObject3);
      if (i == -1) {
        break;
      }
      ((StringBuffer)localObject2).append(new String((byte[])localObject3, 0, i));
      continue;
      label343:
      paramVarArgs.a(5016);
      paramVarArgs.a("ERROR");
      paramVarArgs.b(((IOException)localObject1).getMessage());
      continue;
      paramVarArgs = new URL("https://mobiledev.payu.in/merchant/postservice?form=2");
    }
    JSONObject localJSONObject = new JSONObject(localIOException2.toString());
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (localJSONObject.has("ibiboCodes"))
    {
      paramVarArgs = localJSONObject.getJSONObject("ibiboCodes");
      Object localObject7;
      Object localObject8;
      if (paramVarArgs.has("creditcard"))
      {
        localObject3 = paramVarArgs.getJSONObject("creditcard");
        localObject4 = new ArrayList();
        localObject5 = ((JSONObject)localObject3).keys();
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (String)((Iterator)localObject5).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject4).add(localObject8);
        }
        localPayuResponse.c((ArrayList)localObject4);
      }
      if (paramVarArgs.has("debitcard"))
      {
        localObject3 = paramVarArgs.getJSONObject("debitcard");
        localObject4 = new ArrayList();
        localObject5 = ((JSONObject)localObject3).keys();
        while (((Iterator)localObject5).hasNext())
        {
          localObject6 = (String)((Iterator)localObject5).next();
          localObject7 = new PaymentDetails();
          localObject8 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          ((PaymentDetails)localObject7).b((String)localObject6);
          ((PaymentDetails)localObject7).c(((JSONObject)localObject8).getString("bank_id"));
          ((PaymentDetails)localObject7).a(((JSONObject)localObject8).getString("title"));
          ((PaymentDetails)localObject7).d(((JSONObject)localObject8).getString("pgId"));
          ((ArrayList)localObject4).add(localObject7);
        }
        localPayuResponse.d((ArrayList)localObject4);
      }
      if (paramVarArgs.has("netbanking"))
      {
        localObject3 = paramVarArgs.getJSONObject("netbanking");
        localObject4 = ((JSONObject)localObject3).keys();
        localObject5 = new ArrayList();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (String)((Iterator)localObject4).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject5).add(localObject8);
        }
        Collections.sort((List)localObject5, new d(this));
        localPayuResponse.e((ArrayList)localObject5);
      }
      if (paramVarArgs.has("cashcard"))
      {
        localObject3 = paramVarArgs.getJSONObject("cashcard");
        localObject4 = ((JSONObject)localObject3).keys();
        localObject5 = new ArrayList();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (String)((Iterator)localObject4).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject5).add(localObject8);
        }
        Collections.sort((List)localObject5, new d(this));
        localPayuResponse.f((ArrayList)localObject5);
      }
      if (paramVarArgs.has("ivr"))
      {
        localObject3 = paramVarArgs.getJSONObject("ivr");
        localObject4 = ((JSONObject)localObject3).keys();
        localObject5 = new ArrayList();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (String)((Iterator)localObject4).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject5).add(localObject8);
        }
        localPayuResponse.g((ArrayList)localObject5);
      }
      if (paramVarArgs.has("ivrdc"))
      {
        localObject3 = paramVarArgs.getJSONObject("ivrdc");
        localObject4 = ((JSONObject)localObject3).keys();
        localObject5 = new ArrayList();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (String)((Iterator)localObject4).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject5).add(localObject8);
        }
        localPayuResponse.h((ArrayList)localObject5);
      }
      if (paramVarArgs.has("paisawallet"))
      {
        localObject3 = paramVarArgs.getJSONObject("paisawallet");
        localObject4 = ((JSONObject)localObject3).keys();
        localObject5 = new ArrayList();
        while (((Iterator)localObject4).hasNext())
        {
          localObject6 = (String)((Iterator)localObject4).next();
          localObject7 = ((JSONObject)localObject3).getJSONObject((String)localObject6);
          localObject8 = new PaymentDetails();
          ((PaymentDetails)localObject8).b((String)localObject6);
          ((PaymentDetails)localObject8).c(((JSONObject)localObject7).getString("bank_id"));
          ((PaymentDetails)localObject8).a(((JSONObject)localObject7).getString("title"));
          ((PaymentDetails)localObject8).d(((JSONObject)localObject7).getString("pgId"));
          ((ArrayList)localObject5).add(localObject8);
        }
        localPayuResponse.i((ArrayList)localObject5);
      }
      if (paramVarArgs.has("emi"))
      {
        paramVarArgs = paramVarArgs.getJSONObject("emi");
        localObject3 = paramVarArgs.keys();
        localObject4 = new ArrayList();
        while (((Iterator)localObject3).hasNext())
        {
          localObject5 = (String)((Iterator)localObject3).next();
          localObject6 = paramVarArgs.getJSONObject((String)localObject5);
          localObject7 = new Emi();
          ((Emi)localObject7).b((String)localObject5);
          ((Emi)localObject7).a(((JSONObject)localObject6).getString("bank"));
          ((Emi)localObject7).c(((JSONObject)localObject6).getString("title"));
          ((Emi)localObject7).d(((JSONObject)localObject6).getString("pgId"));
          ((ArrayList)localObject4).add(localObject7);
        }
        Collections.sort((List)localObject4, new c(this));
        localPayuResponse.b((ArrayList)localObject4);
      }
    }
    if ((localJSONObject.has("userCards")) && (localJSONObject.getJSONObject("userCards").has("user_cards")))
    {
      paramVarArgs = localJSONObject.getJSONObject("userCards").getJSONObject("user_cards");
      localObject3 = paramVarArgs.keys();
      localObject4 = new ArrayList();
      label1579:
      if (((Iterator)localObject3).hasNext())
      {
        localObject6 = (String)((Iterator)localObject3).next();
        localObject5 = new StoredCard();
        localObject6 = paramVarArgs.getJSONObject((String)localObject6);
        ((StoredCard)localObject5).a(((JSONObject)localObject6).getString("name_on_card"));
        ((StoredCard)localObject5).b(((JSONObject)localObject6).getString("card_name"));
        ((StoredCard)localObject5).c(((JSONObject)localObject6).getString("expiry_year"));
        ((StoredCard)localObject5).d(((JSONObject)localObject6).getString("expiry_month"));
        ((StoredCard)localObject5).e(((JSONObject)localObject6).getString("card_type"));
        ((StoredCard)localObject5).f(((JSONObject)localObject6).getString("card_token"));
        if (((JSONObject)localObject6).getInt("is_expired") != 0) {
          break label1983;
        }
      }
    }
    label1983:
    for (boolean bool = false;; bool = true)
    {
      ((StoredCard)localObject5).a(Boolean.valueOf(bool));
      ((StoredCard)localObject5).g(((JSONObject)localObject6).getString("card_mode"));
      ((StoredCard)localObject5).h(((JSONObject)localObject6).getString("card_no"));
      ((StoredCard)localObject5).i(((JSONObject)localObject6).getString("card_brand"));
      ((StoredCard)localObject5).j(((JSONObject)localObject6).getString("card_bin"));
      ((StoredCard)localObject5).k(((JSONObject)localObject6).getString("isDomestic"));
      ((StoredCard)localObject5).m(((JSONObject)localObject6).getString("issuingBank"));
      if (((JSONObject)localObject6).has("card_cvv")) {
        ((StoredCard)localObject5).a(((JSONObject)localObject6).getInt("card_cvv"));
      }
      ((ArrayList)localObject4).add(localObject5);
      break label1579;
      localPayuResponse.a((ArrayList)localObject4);
      if ((localJSONObject.has("status")) && (localJSONObject.getString("status").contentEquals("0"))) {
        paramVarArgs = new PostData();
      }
      try
      {
        paramVarArgs.a(5019);
        paramVarArgs.a("ERROR");
        paramVarArgs.b(localJSONObject.getString("msg"));
      }
      catch (ProtocolException localProtocolException1)
      {
        break label196;
        localProtocolException1.a(0);
        localProtocolException1.b("Data fetched successfully, Stored card status: " + localJSONObject.getJSONObject("userCards").getString("msg"));
        localProtocolException1.a("SUCCESS");
        paramVarArgs = localProtocolException1;
      }
      catch (IOException localIOException1)
      {
        break label343;
      }
      catch (JSONException localJSONException1)
      {
        break label296;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1) {}
      break label249;
      break;
    }
  }
  
  protected void a(PayuResponse paramPayuResponse)
  {
    super.onPostExecute(paramPayuResponse);
    this.a.a(paramPayuResponse);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */