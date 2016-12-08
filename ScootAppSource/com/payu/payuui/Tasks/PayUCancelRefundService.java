package com.payu.payuui.Tasks;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.payu.india.Model.MerchantWebService;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.india.Model.PayuResponse;
import com.payu.india.Model.PostData;
import com.payu.india.d.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class PayUCancelRefundService
  extends IntentService
{
  public PayUCancelRefundService()
  {
    super("CancelRefund");
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getExtras();
    paramIntent = (PayuHashes)((Bundle)localObject1).getParcelable("payu_hashes");
    Object localObject2 = (PaymentParams)((Bundle)localObject1).getParcelable("payment_params");
    localObject1 = (PayuConfig)((Bundle)localObject1).getParcelable("payuConfig");
    if (localObject1 != null) {}
    for (;;)
    {
      Object localObject3 = new MerchantWebService();
      ((MerchantWebService)localObject3).b(((PaymentParams)localObject2).a());
      ((MerchantWebService)localObject3).a("cancel_refund_transaction");
      ((MerchantWebService)localObject3).d(((PaymentParams)localObject2).s());
      ((MerchantWebService)localObject3).e(((PaymentParams)localObject2).t());
      ((MerchantWebService)localObject3).f(((PaymentParams)localObject2).c());
      ((MerchantWebService)localObject3).c(paramIntent.b());
      paramIntent = new a((MerchantWebService)localObject3).a();
      if (paramIntent.b() == 0)
      {
        ((PayuConfig)localObject1).a(paramIntent.a());
        ((PayuConfig)localObject1).a(((PayuConfig)localObject1).b());
        localObject2 = new PayuResponse();
        localObject3 = new PostData();
        paramIntent = null;
      }
      try
      {
        switch (((PayuConfig)localObject1).b())
        {
        case 0: 
          label192:
          localObject1 = ((PayuConfig)localObject1).a().getBytes("UTF-8");
          paramIntent = (HttpURLConnection)paramIntent.openConnection();
          paramIntent.setRequestMethod("POST");
          paramIntent.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          paramIntent.setRequestProperty("Content-Length", String.valueOf(localObject1.length));
          paramIntent.setDoOutput(true);
          paramIntent.getOutputStream().write((byte[])localObject1);
          paramIntent = paramIntent.getInputStream();
          localObject1 = new StringBuilder();
          byte[] arrayOfByte = new byte['Ѐ'];
          for (;;)
          {
            int i = paramIntent.read(arrayOfByte);
            if (i == -1) {
              break;
            }
            ((StringBuilder)localObject1).append(new String(arrayOfByte, 0, i));
          }
        }
      }
      catch (IOException paramIntent)
      {
        for (;;)
        {
          paramIntent.printStackTrace();
          for (;;)
          {
            ((PayuResponse)localObject2).a((PostData)localObject3);
            Log.v("Scoot", "PayUResponse " + localObject2.toString());
            return;
            localObject1 = new PayuConfig();
            break;
            paramIntent = new URL("https://info.payu.in/merchant/postservice.php?form=2");
            break label192;
            paramIntent = new URL("https://mobiletest.payu.in/merchant/postservice?form=2");
            break label192;
            paramIntent = new URL("https://test.payu.in/merchant/postservice?form=2");
            break label192;
            Log.v("PayU", "Refund Response " + ((StringBuilder)localObject1).toString());
            paramIntent = new JSONObject(((StringBuilder)localObject1).toString());
            if (paramIntent.has("msg")) {
              ((PostData)localObject3).b(paramIntent.getString("msg"));
            }
            if (paramIntent.has("status"))
            {
              ((PostData)localObject3).a(paramIntent.getInt("status"));
              ((PostData)localObject3).a("SUCCESS");
            }
            else
            {
              ((PostData)localObject3).a(5018);
              ((PostData)localObject3).a("ERROR");
            }
          }
          Toast.makeText(this, paramIntent.a(), 1).show();
          return;
        }
      }
      catch (JSONException paramIntent)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\Tasks\PayUCancelRefundService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */