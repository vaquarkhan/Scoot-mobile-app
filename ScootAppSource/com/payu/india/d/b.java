package com.payu.india.d;

import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PostData;
import com.payu.india.c.a;
import com.payu.india.c.c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Set;

public final class b
  extends c
{
  private PaymentParams b;
  private String c;
  private PostData d;
  private StringBuffer e;
  
  private b() {}
  
  public b(PaymentParams paramPaymentParams, String paramString)
  {
    this.b = paramPaymentParams;
    this.c = paramString;
    f(this.b.a());
  }
  
  public PostData a()
  {
    this.d = new PostData();
    this.e = new StringBuffer();
    int j;
    String str1;
    label220:
    int i;
    if (a.a.contains(this.c))
    {
      this.e.append(b("pg", this.c));
      this.e.append(b("device_type", "1"));
      j = 0;
      if (j >= a.d.length) {
        break label1278;
      }
      str1 = a.d[j];
      switch (str1.hashCode())
      {
      default: 
        i = -1;
        label222:
        switch (i)
        {
        }
        break;
      }
    }
    for (;;)
    {
      j += 1;
      break;
      return d("Invalid pg!, pg should be any one of CC, EMI, CASH, NB, PAYU_MONEY");
      if (!str1.equals("key")) {
        break label220;
      }
      i = 0;
      break label222;
      if (!str1.equals("txnid")) {
        break label220;
      }
      i = 1;
      break label222;
      if (!str1.equals("amount")) {
        break label220;
      }
      i = 2;
      break label222;
      if (!str1.equals("productinfo")) {
        break label220;
      }
      i = 3;
      break label222;
      if (!str1.equals("firstname")) {
        break label220;
      }
      i = 4;
      break label222;
      if (!str1.equals("email")) {
        break label220;
      }
      i = 5;
      break label222;
      if (!str1.equals("surl")) {
        break label220;
      }
      i = 6;
      break label222;
      if (!str1.equals("furl")) {
        break label220;
      }
      i = 7;
      break label222;
      if (!str1.equals("hash")) {
        break label220;
      }
      i = 8;
      break label222;
      if (!str1.equals("udf1")) {
        break label220;
      }
      i = 9;
      break label222;
      if (!str1.equals("udf2")) {
        break label220;
      }
      i = 10;
      break label222;
      if (!str1.equals("udf3")) {
        break label220;
      }
      i = 11;
      break label222;
      if (!str1.equals("udf4")) {
        break label220;
      }
      i = 12;
      break label222;
      if (!str1.equals("udf5")) {
        break label220;
      }
      i = 13;
      break label222;
      if ((this.b.a() == null) || (this.b.a().length() < 1)) {
        return d("Mandatory param key is missing");
      }
      this.e.append(b("key", this.b.a()));
      continue;
      if ((this.b.b() == null) || (this.b.b().length() < 1)) {
        return d("Mandatory param txnid is missing");
      }
      this.e.append(b("txnid", this.b.b()));
      continue;
      try
      {
        if (this.b != null) {}
        for (double d1 = Double.parseDouble(this.b.c()); Double.valueOf(d1).doubleValue() < 1.0D; d1 = 0.0D) {
          return a(5003, " Amount should be a Double value example 5.00");
        }
        this.e.append(b("amount", this.b.c()));
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        return a(5002, " Amount should be a Double value example 5.00");
      }
      catch (NullPointerException localNullPointerException)
      {
        return a(5003, " Amount should be a Double value example 5.00");
      }
      continue;
      if ((this.b.d() == null) || (this.b.d().length() < 1)) {
        return d("Mandatory param product info is missing");
      }
      this.e.append(b("productinfo", this.b.d()));
      continue;
      if (this.b.e() == null) {
        return d("Mandatory param firstname is missing");
      }
      this.e.append(b("firstname", this.b.e()));
      continue;
      if (this.b.f() == null) {
        return d("Mandatory param email is missing");
      }
      this.e.append(b("email", this.b.f()));
      continue;
      if ((this.b.g() == null) || (this.b.g().length() < 1)) {
        return d("Mandatory param surl is missing");
      }
      try
      {
        this.e.append("surl=").append(URLEncoder.encode(this.b.g(), "UTF-8")).append("&");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        return a(5004, "surl should be something like https://www.payu.in/txnstatus");
      }
      if ((this.b.h() == null) || (this.b.h().length() < 1)) {
        return d("Mandatory param furl is missing");
      }
      try
      {
        this.e.append("furl=").append(URLEncoder.encode(this.b.h(), "UTF-8")).append("&");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        return a(5004, "furl should be something like https://www.payu.in/txnstatus");
      }
      if ((this.b.i() == null) || (this.b.i().length() < 1)) {
        return d("Mandatory param hash is missing");
      }
      this.e.append(b("hash", this.b.i()));
      continue;
      if (this.b.s() == null) {
        return d("UDF1 should not be null, it can be empty or string");
      }
      this.e.append(b("udf1", this.b.s()));
      continue;
      if (this.b.t() == null) {
        return d("UDF2 should not be null, it can be empty or string");
      }
      this.e.append(b("udf2", this.b.t()));
      continue;
      if (this.b.u() == null) {
        return d("UDF3 should not be null, it can be empty or string");
      }
      this.e.append(b("udf3", this.b.u()));
      continue;
      if (this.b.v() == null) {
        return d("UDF4 should not be null, it can be empty or string");
      }
      this.e.append(b("udf4", this.b.v()));
      continue;
      if (this.b.w() == null) {
        return d("UDF5 should not be null, it can be empty or string");
      }
      this.e.append(b("udf5", this.b.w()));
    }
    label1278:
    if (this.b.k() != null) {
      this.e.append(b("phone", this.b.k()));
    }
    Object localObject3 = this.e;
    Object localObject1;
    if (this.b.j() != null)
    {
      localObject1 = b("offer_key", this.b.j());
      label1340:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.l() == null) {
        break label2304;
      }
      localObject1 = b("lastname", this.b.l());
      label1379:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.m() == null) {
        break label2312;
      }
      localObject1 = b("address1", this.b.m());
      label1418:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.n() == null) {
        break label2320;
      }
      localObject1 = b("address2", this.b.n());
      label1457:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.o() == null) {
        break label2328;
      }
      localObject1 = b("city", this.b.o());
      label1496:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.p() == null) {
        break label2336;
      }
      localObject1 = b("state", this.b.p());
      label1535:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.q() == null) {
        break label2344;
      }
      localObject1 = b("country", this.b.q());
      label1575:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.r() == null) {
        break label2352;
      }
      localObject1 = b("zipcode", this.b.r());
      label1615:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.x() == null) {
        break label2360;
      }
      localObject1 = b("codurl", this.b.x());
      label1655:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.y() == null) {
        break label2368;
      }
      localObject1 = b("drop_category", this.b.y());
      label1695:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.z() == null) {
        break label2376;
      }
      localObject1 = b("enforce_paymethod", this.b.z());
      label1735:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.A() == null) {
        break label2384;
      }
      localObject1 = b("custom_note", this.b.A());
      label1775:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.B() == null) {
        break label2392;
      }
      localObject1 = b("note_category", this.b.B());
      label1815:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.C() == null) {
        break label2400;
      }
      localObject1 = b("shipping_firstname", this.b.C());
      label1855:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.D() == null) {
        break label2408;
      }
      localObject1 = b("shipping_lastname", this.b.D());
      label1895:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.E() == null) {
        break label2416;
      }
      localObject1 = b("shipping_address1", this.b.E());
      label1935:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.F() == null) {
        break label2424;
      }
      localObject1 = b("shipping_address2", this.b.F());
      label1975:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.G() == null) {
        break label2432;
      }
      localObject1 = b("shipping_city", this.b.G());
      label2015:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.H() == null) {
        break label2440;
      }
      localObject1 = b("shipping_state", this.b.H());
      label2055:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.I() == null) {
        break label2448;
      }
      localObject1 = b("shipping_county", this.b.I());
      label2095:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.J() == null) {
        break label2456;
      }
      localObject1 = b("shipping_zipcode", this.b.J());
      label2135:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject3 = this.e;
      if (this.b.K() == null) {
        break label2464;
      }
      localObject1 = b("shipping_phone", this.b.K());
      label2175:
      ((StringBuffer)localObject3).append((String)localObject1);
      localObject1 = this.c;
      switch (((String)localObject1).hashCode())
      {
      default: 
        label2244:
        i = -1;
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        return a(0, "SUCCESS", this.e.toString());
        localObject1 = "";
        break label1340;
        label2304:
        localObject1 = "";
        break label1379;
        label2312:
        localObject1 = "";
        break label1418;
        label2320:
        localObject1 = "";
        break label1457;
        label2328:
        localObject1 = "";
        break label1496;
        label2336:
        localObject1 = "";
        break label1535;
        label2344:
        localObject1 = "";
        break label1575;
        label2352:
        localObject1 = "";
        break label1615;
        label2360:
        localObject1 = "";
        break label1655;
        label2368:
        localObject1 = "";
        break label1695;
        label2376:
        localObject1 = "";
        break label1735;
        label2384:
        localObject1 = "";
        break label1775;
        label2392:
        localObject1 = "";
        break label1815;
        label2400:
        localObject1 = "";
        break label1855;
        label2408:
        localObject1 = "";
        break label1895;
        label2416:
        localObject1 = "";
        break label1935;
        label2424:
        localObject1 = "";
        break label1975;
        label2432:
        localObject1 = "";
        break label2015;
        label2440:
        localObject1 = "";
        break label2055;
        label2448:
        localObject1 = "";
        break label2095;
        label2456:
        localObject1 = "";
        break label2135;
        label2464:
        localObject1 = "";
        break label2175;
        if (!((String)localObject1).equals("CC")) {
          break label2244;
        }
        i = 0;
        continue;
        if (!((String)localObject1).equals("NB")) {
          break label2244;
        }
        i = 1;
        continue;
        if (!((String)localObject1).equals("EMI")) {
          break label2244;
        }
        i = 2;
        continue;
        if (!((String)localObject1).equals("CASH")) {
          break label2244;
        }
        i = 3;
        continue;
        if (!((String)localObject1).equals("PAYU_MONEY")) {
          break label2244;
        }
        i = 4;
      }
    }
    this.e.append(b("bankcode", "CC"));
    label3216:
    Object localObject2;
    if ((this.b.N() != null) && (a(this.b.N()).booleanValue()))
    {
      this.e.append(b("ccnum", this.b.N()));
      if (!c(this.b.N()).contentEquals("SMAE")) {
        if (a(this.b.N(), this.b.O())) {
          this.e.append(b("ccvv", this.b.O()));
        }
      }
      for (;;)
      {
        try
        {
          if (a(Integer.parseInt(this.b.P()), Integer.parseInt(this.b.Q())))
          {
            this.e.append(b("ccexpyr", this.b.Q()));
            this.e.append(b("ccexpmon", this.b.P()));
            if ((this.b.R() == null) || (this.b.R().trim().length() <= 0)) {
              break label3216;
            }
            localObject1 = this.b.R();
            if (this.b.S() == null) {
              break label3224;
            }
            localObject3 = this.b.S();
            this.e.append(b("ccname", (String)localObject1));
            if (this.b.M() == 1)
            {
              if (this.b.L() == null) {
                break;
              }
              this.e.append(b("card_name", (String)localObject3));
              localObject3 = this.e;
              if (this.b.L() == null) {
                break label3231;
              }
              localObject1 = b("user_credentials", this.b.L());
              ((StringBuffer)localObject3).append((String)localObject1);
              localObject3 = this.e;
              if (this.b.M() != 1) {
                break label3239;
              }
              localObject1 = b("store_card", "" + this.b.M());
              ((StringBuffer)localObject3).append((String)localObject1);
              localObject3 = this.e;
              if (this.b.W() != 1) {
                break label3247;
              }
              localObject1 = b("one_click_checkout", "" + this.b.W());
              ((StringBuffer)localObject3).append((String)localObject1);
            }
            return a(0, "SUCCESS", e(this.e.toString()));
            return a(5009, " Invalid cvv, please verify");
          }
          localObject1 = a(5012, " It seems the card is expired!");
          return (PostData)localObject1;
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          return a(5002, " It seems the card is expired!");
        }
        catch (Exception localException1)
        {
          return a(5001, " It seems the card is expired!");
        }
        if (a(this.b.N(), this.b.O())) {
          this.e.append(b("ccvv", this.b.O()));
        }
        try
        {
          if (!a(Integer.parseInt(this.b.P()), Integer.parseInt(this.b.Q()))) {
            continue;
          }
          this.e.append(b("ccexpyr", this.b.Q()));
          this.e.append(b("ccexpmon", this.b.P()));
        }
        catch (Exception localException2) {}
        continue;
        localObject2 = "PayuUser";
        continue;
        label3224:
        localObject3 = localObject2;
        continue;
        label3231:
        localObject2 = "";
        continue;
        label3239:
        localObject2 = "";
        continue;
        label3247:
        localObject2 = "";
      }
      return d(" Card can not be stored!, user_credentials is missing!");
    }
    if (this.b.T() != null)
    {
      if (this.b.L() != null)
      {
        this.e.append(b("user_credentials", this.b.L()));
        this.e.append(b("store_card_token", this.b.T()));
        if ((this.b.U() != null) && (!c(this.b.U()).contentEquals("SMAE")))
        {
          if ((this.b.O() == null) && (this.b.X() == null)) {
            return d(" Invalid cvv, please verify");
          }
          if (!a(Integer.parseInt(this.b.P()), Integer.parseInt(this.b.Q()))) {
            return d(" It seems the card is expired!");
          }
        }
        if (this.b.X() == null)
        {
          localObject3 = this.e;
          if (this.b.O() != null)
          {
            localObject2 = b("ccvv", this.b.O());
            ((StringBuffer)localObject3).append((String)localObject2);
            label3470:
            localObject3 = this.e;
            if (this.b.P() == null) {
              break label3706;
            }
            localObject2 = b("ccexpmon", this.b.P());
            label3502:
            ((StringBuffer)localObject3).append((String)localObject2);
            localObject3 = this.e;
            if (this.b.Q() == null) {
              break label3721;
            }
            localObject2 = b("ccexpyr", this.b.Q());
            label3542:
            ((StringBuffer)localObject3).append((String)localObject2);
            localObject3 = this.e;
            if (this.b.R() != null) {
              break label3736;
            }
            localObject2 = b("ccname", "PayuUser");
            label3578:
            ((StringBuffer)localObject3).append((String)localObject2);
            localObject3 = this.e;
            if (this.b.W() != 1) {
              break label3755;
            }
          }
        }
        label3706:
        label3721:
        label3736:
        label3755:
        for (localObject2 = b("one_click_checkout", "" + this.b.W());; localObject2 = "")
        {
          ((StringBuffer)localObject3).append((String)localObject2);
          return a(0, "SUCCESS", e(this.e.toString()));
          localObject2 = b("ccvv", "123");
          break;
          this.e.append(b("card_merchant_param", this.b.X()));
          break label3470;
          localObject2 = b("ccexpmon", "12");
          break label3502;
          localObject2 = b("ccexpmon", "2080");
          break label3542;
          localObject2 = b("ccname", this.b.R());
          break label3578;
        }
      }
      return a(5013, "should be the user credentials and it should be merchant_key:unique_user_id.");
    }
    return a(5008, " Invalid card number, Failed while applying Luhn");
    if ((this.b.V() != null) && (this.b.V().length() > 1))
    {
      this.e.append(b("bankcode", this.b.V()));
      return a(0, "SUCCESS", e(this.e.toString()));
    }
    return a(5005, "Invalid bank code please verify");
    if ((this.b.V() != null) && (this.b.V().length() > 1))
    {
      this.e.append(b("pg", "EMI"));
      this.e.append(b("bankcode", this.b.V()));
      if (a("" + this.b.N()).booleanValue())
      {
        this.e.append(b("ccnum", "" + this.b.N()));
        if (!c("" + this.b.N()).contentEquals("SMAE"))
        {
          if (!a("" + this.b.N(), "" + this.b.O())) {
            break label4463;
          }
          this.e.append(b("ccvv", "" + this.b.O()));
        }
        for (;;)
        {
          try
          {
            if (a(Integer.parseInt(this.b.P()), Integer.parseInt(this.b.Q())))
            {
              this.e.append(b("ccexpyr", "" + this.b.Q()));
              this.e.append(b("ccexpmon", "" + this.b.P()));
              localObject3 = this.e;
              if (this.b.R() == null)
              {
                localObject2 = b("ccname", "PayuUser");
                ((StringBuffer)localObject3).append((String)localObject2);
                if (this.b.M() == 1)
                {
                  if (this.b.L() == null) {
                    break;
                  }
                  localObject3 = this.e;
                  if (this.b.S() != null) {
                    break label4521;
                  }
                  localObject2 = b("card_name", "PayuUser");
                  ((StringBuffer)localObject3).append((String)localObject2);
                  localObject3 = this.e;
                  if (this.b.L() == null) {
                    break label4540;
                  }
                  localObject2 = b("user_credentials", this.b.L());
                  ((StringBuffer)localObject3).append((String)localObject2);
                  localObject3 = this.e;
                  if (this.b.M() != 1) {
                    break label4548;
                  }
                  localObject2 = b("store_card", "" + this.b.M());
                  ((StringBuffer)localObject3).append((String)localObject2);
                }
                return a(0, "SUCCESS", e(this.e.toString()));
                label4463:
                return a(5009, " Invalid cvv, please verify");
              }
            }
            else
            {
              localObject2 = a(5012, " It seems the card is expired!");
              return (PostData)localObject2;
            }
          }
          catch (NumberFormatException localNumberFormatException3)
          {
            return a(5002, " It seems the card is expired!");
          }
          String str2 = b("ccname", this.b.R());
          continue;
          label4521:
          str2 = b("name_on_card", this.b.S());
          continue;
          label4540:
          str2 = "";
          continue;
          label4548:
          str2 = "";
        }
        return d(" Card can not be stored!, user_credentials is missing!");
      }
      return a(5008, " Invalid card number, Failed while applying Luhn");
    }
    return d("Please provide valid email details");
    this.e.append(b("pg", "CASH"));
    if ((this.b != null) && (this.b.V() != null) && (this.b.V().length() > 1))
    {
      this.e.append(b("bankcode", this.b.V()));
      return a(0, "SUCCESS", this.e.toString());
    }
    return a(5005, "Invalid bank code please verify");
    this.e.append(b("bankcode", "PAYUW".toLowerCase()));
    this.e.append(b("pg", "wallet"));
    return a(0, "SUCCESS", this.e.toString());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */