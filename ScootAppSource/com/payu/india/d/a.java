package com.payu.india.d;

import com.payu.india.Model.MerchantWebService;
import com.payu.india.Model.PostData;
import com.payu.india.c.c;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends c
{
  private MerchantWebService b;
  private StringBuilder c;
  
  private a() {}
  
  public a(MerchantWebService paramMerchantWebService)
  {
    this.b = paramMerchantWebService;
  }
  
  public PostData a()
  {
    this.c = new StringBuilder();
    if (this.b.b() == null) {
      return d("Mandatory param key is missing");
    }
    this.c.append(b("key", this.b.b()));
    if (this.b.c() == null) {
      return d("Mandatory param hash is missing");
    }
    this.c.append(b("hash", this.b.c()));
    if ((this.b.a() == null) || (!com.payu.india.c.a.b.contains(this.b.a()))) {
      return d("Mandatory param command is missing");
    }
    this.c.append(b("command", this.b.a()));
    Object localObject1 = this.b.a();
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      return a(0, "SUCCESS", e(this.c.toString()));
      if (!((String)localObject1).equals("payment_related_details_for_mobile_sdk")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject1).equals("vas_for_mobile_sdk")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject1).equals("get_merchant_ibibo_codes")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject1).equals("verify_payment")) {
        break;
      }
      i = 3;
      break;
      if (!((String)localObject1).equals("check_payment")) {
        break;
      }
      i = 4;
      break;
      if (!((String)localObject1).equals("cancel_refund_transaction")) {
        break;
      }
      i = 5;
      break;
      if (!((String)localObject1).equals("check_action_status")) {
        break;
      }
      i = 6;
      break;
      if (!((String)localObject1).equals("capture_transaction")) {
        break;
      }
      i = 7;
      break;
      if (!((String)localObject1).equals("update_requests")) {
        break;
      }
      i = 8;
      break;
      if (!((String)localObject1).equals("cod_verify")) {
        break;
      }
      i = 9;
      break;
      if (!((String)localObject1).equals("cod_cancel")) {
        break;
      }
      i = 10;
      break;
      if (!((String)localObject1).equals("cod_settled")) {
        break;
      }
      i = 11;
      break;
      if (!((String)localObject1).equals("get_TDR")) {
        break;
      }
      i = 12;
      break;
      if (!((String)localObject1).equals("udf_update")) {
        break;
      }
      i = 13;
      break;
      if (!((String)localObject1).equals("create_invoice")) {
        break;
      }
      i = 14;
      break;
      if (!((String)localObject1).equals("check_offer_status")) {
        break;
      }
      i = 15;
      break;
      if (!((String)localObject1).equals("getNetbankingStatus")) {
        break;
      }
      i = 16;
      break;
      if (!((String)localObject1).equals("getIssuingBankStatus")) {
        break;
      }
      i = 17;
      break;
      if (!((String)localObject1).equals("get_Transaction_Details")) {
        break;
      }
      i = 18;
      break;
      if (!((String)localObject1).equals("get_transaction_info")) {
        break;
      }
      i = 19;
      break;
      if (!((String)localObject1).equals("check_isDomestic")) {
        break;
      }
      i = 20;
      break;
      if (!((String)localObject1).equals("get_user_cards")) {
        break;
      }
      i = 21;
      break;
      if (!((String)localObject1).equals("save_user_card")) {
        break;
      }
      i = 22;
      break;
      if (!((String)localObject1).equals("edit_user_card")) {
        break;
      }
      i = 23;
      break;
      if (!((String)localObject1).equals("delete_user_card")) {
        break;
      }
      i = 24;
      break;
      if (!((String)localObject1).equals("delete_store_card_cvv")) {
        break;
      }
      i = 25;
      break;
      if (!((String)localObject1).equals("mobileHashTestWs")) {
        break;
      }
      i = 26;
      break;
      if (!((String)localObject1).equals("get_hashes")) {
        break;
      }
      i = 27;
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1 should be user_credentials (merchant_key:unique_user_id.) to get the merchant information and stored card or default to get only the merchant information");
      }
      this.c.append(b("var1", this.b.d()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1 Please send var1 as 'default'");
      }
      this.c.append(b("var1", this.b.d()));
      localObject2 = this.c;
      if (this.b.e() == null)
      {
        localObject1 = b("var2", "default");
        label1086:
        ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = this.c;
        if (this.b.e() != null) {
          break label1149;
        }
      }
      label1149:
      for (localObject1 = b("var3", "default");; localObject1 = b("var3", this.b.f()))
      {
        ((StringBuilder)localObject2).append((String)localObject1);
        break;
        localObject1 = b("var2", this.b.e());
        break label1086;
      }
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1 Please send var1 as 'default'");
      }
      this.c.append(b("var1", this.b.d()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Transaction id (txnid)if you want to verify more than one transaction please separate them by pipe : ex 6234567|45678987|4567876 ");
      }
      this.c.append(b("var1", this.b.d()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      this.c.append(b("var1", this.b.d()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the Token ID(unique token from merchant)");
      }
      if (this.b.f() == null) {
        return d("Mandatory param var3 is missing var3  should contain the amount which needs to be refunded. Please note that both partial and full refunds are allowed.");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      this.c.append(b("var3", this.b.f()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Request ID which you get while cancel_refund_transaction api");
      }
      this.c.append(b("var1", this.b.d()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing should be the Token ID(unique token from merchant)");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the Request ID which you get while cancel_refund_transaction api");
      }
      if (this.b.f() == null) {
        return d("Mandatory param var3 is missing var3should be the Bank Ref Id for the requested transaction.");
      }
      if (this.b.g() == null) {
        return d("Mandatory param var4 is missing var4 Amount should be a Double value example 5.00");
      }
      if (this.b.h() == null) {
        return d("Mandatory param var5 is missing var5should be the Action (cancel/capture/refund)");
      }
      if (this.b.h() == null) {
        return d("Mandatory param var6 is missing var6 should be new status to be set");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      this.c.append(b("var3", this.b.f()));
      this.c.append(b("var4", this.b.g()));
      this.c.append(b("var5", this.b.h()));
      this.c.append(b("var6", this.b.i()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the Token ID(unique token from merchant)");
      }
      if (this.b.f() == null) {
        return d("Mandatory param var3 is missing var3 Amount should be a Double value example 5.00");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      this.c.append(b("var3", this.b.f()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the Token ID(unique token from merchant)");
      }
      if (this.b.f() == null) {
        return d("Mandatory param var3 is missing var3 Amount should be a Double value example 5.00");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      this.c.append(b("var3", this.b.f()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the Token ID(unique token from merchant)");
      }
      if (this.b.f() == null) {
        return d("5001 var3 Amount should be a Double value example 5.00");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      this.c.append(b("var3", this.b.f()));
      continue;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the Payu id (mihpayid) of the transaction which was given by payu.");
      }
      this.c.append(b("var1", this.b.d()));
    }
    if (this.b.d() == null) {
      return d("Mandatory param var1 is missing var1should be the Transaction id (txnid)");
    }
    this.c.append(b("var1", this.b.d()));
    Object localObject2 = this.c;
    if (this.b.e() == null)
    {
      localObject1 = "";
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = this.c;
      if (this.b.f() != null) {
        break label2363;
      }
      localObject1 = "";
      label2236:
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = this.c;
      if (this.b.g() != null) {
        break label2381;
      }
      localObject1 = "";
      label2264:
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = this.c;
      if (this.b.h() != null) {
        break label2399;
      }
      localObject1 = "";
      label2292:
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = this.c;
      if (this.b.i() != null) {
        break label2417;
      }
    }
    label2363:
    label2381:
    label2399:
    label2417:
    for (localObject1 = "";; localObject1 = b("var6", this.b.i()))
    {
      ((StringBuilder)localObject2).append((String)localObject1);
      if (this.b.d() != null) {
        break label2435;
      }
      return d("Mandatory param var1 is missing");
      localObject1 = b("var2", this.b.e());
      break;
      localObject1 = b("var3", this.b.f());
      break label2236;
      localObject1 = b("var4", this.b.g());
      break label2264;
      localObject1 = b("var5", this.b.h());
      break label2292;
    }
    for (;;)
    {
      label2435:
      int j;
      try
      {
        localObject1 = new JSONObject(this.b.d());
        localObject2 = new String[6];
        localObject2[0] = "amount";
        localObject2[1] = "txnid";
        localObject2[2] = "productinfo";
        localObject2[3] = "firstname";
        localObject2[4] = "email";
        localObject2[5] = "phone";
        int k = localObject2.length;
        j = 0;
        String str3;
        if (j < k)
        {
          str3 = localObject2[j];
          if ((((JSONObject)localObject1).getString(str3) == null) || (((JSONObject)localObject1).getString(str3).length() < 1)) {
            return d("Mandatory param " + str3 + " is missing for creating an Invoice");
          }
          i = -1;
        }
        switch (str3.hashCode())
        {
        case -1413853096: 
          if (!str3.equals("amount")) {
            break;
          }
          i = 0;
          break;
        case 110812421: 
          if (!str3.equals("txnid")) {
            break;
          }
          i = 1;
          break;
        case -1491000803: 
          if (!str3.equals("productinfo")) {
            break;
          }
          i = 2;
          break;
        case 133788987: 
          if (!str3.equals("firstname")) {
            break;
          }
          i = 3;
          break;
        case 96619420: 
          if (!str3.equals("email")) {
            break;
          }
          i = 4;
          break;
        case 106642798: 
          boolean bool = str3.equals("phone");
          if (!bool) {
            break;
          }
          i = 5;
          break;
          try
          {
            Double.parseDouble(((JSONObject)localObject1).getString(str3));
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            return a(5003, " Amount should be a Double value example 5.00");
          }
          this.c.append(b("var1", this.b.d()));
        }
      }
      catch (JSONException localJSONException)
      {
        return a(5014, "var1  should be a stringified JSON object; It seems there is an exception while parsing JSON");
      }
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1 should be offer key example : offer@1234 ");
      }
      this.c.append(b("var1", this.b.d()));
      localObject2 = this.c;
      if (this.b.e() == null)
      {
        str1 = "";
        label2846:
        ((StringBuilder)localObject2).append(b("var2", str1));
        localObject2 = this.c;
        if (this.b.f() != null) {
          break label3186;
        }
        str1 = "";
        label2880:
        ((StringBuilder)localObject2).append(b("var3", str1));
        localObject2 = this.c;
        if (this.b.g() != null) {
          break label3198;
        }
        str1 = "";
        label2914:
        ((StringBuilder)localObject2).append(b("var4", str1));
        localObject2 = this.c;
        if (this.b.h() != null) {
          break label3210;
        }
        str1 = "";
        label2948:
        ((StringBuilder)localObject2).append(b("var5", str1));
        localObject2 = this.c;
        if (this.b.i() != null) {
          break label3222;
        }
        str1 = "";
        label2982:
        ((StringBuilder)localObject2).append(b("var6", str1));
        localObject2 = this.c;
        if (this.b.j() != null) {
          break label3234;
        }
        str1 = "";
        label3016:
        ((StringBuilder)localObject2).append(b("var7", str1));
        localObject2 = this.c;
        if (this.b.k() != null) {
          break label3246;
        }
        str1 = "";
        label3051:
        ((StringBuilder)localObject2).append(b("var8", str1));
        localObject2 = this.c;
        if (this.b.l() != null) {
          break label3258;
        }
        str1 = "";
        label3086:
        ((StringBuilder)localObject2).append(b("var9", str1));
        localObject2 = this.c;
        if (this.b.m() != null) {
          break label3270;
        }
        str1 = "";
        label3121:
        ((StringBuilder)localObject2).append(b("var10", str1));
        localObject2 = this.c;
        if (this.b.n() != null) {
          break label3282;
        }
      }
      label3186:
      label3198:
      label3210:
      label3222:
      label3234:
      label3246:
      label3258:
      label3270:
      label3282:
      for (String str1 = "";; str1 = this.b.n())
      {
        ((StringBuilder)localObject2).append(b("var11", str1));
        break;
        str1 = this.b.e();
        break label2846;
        str1 = this.b.f();
        break label2880;
        str1 = this.b.g();
        break label2914;
        str1 = this.b.h();
        break label2948;
        str1 = this.b.i();
        break label2982;
        str1 = this.b.j();
        break label3016;
        str1 = this.b.k();
        break label3051;
        str1 = this.b.l();
        break label3086;
        str1 = this.b.m();
        break label3121;
      }
      if ((this.b.d() == null) || (this.b.d().length() < 1)) {
        return d("Mandatory param var1 is missing var1should be the bank code for one bank, default for getting all banks");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      if ((this.b.d() == null) || (this.b.d().length() != 6)) {
        return d("Mandatory param var1 is missing var1number or the card bin (first 6 digit of the card)");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the from date in YYYY-MM-DD format");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2till date in YYYY-MM-DD format.");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the from date in YYYY-MM-DD hh:mm:ss format");
      }
      if (this.b.e() == null) {
        return d("Mandatory param var2 is missing var2should be the till date in YYYY-MM-DD hh:mm:ss format.");
      }
      this.c.append(b("var1", this.b.d()));
      this.c.append(b("var2", this.b.e()));
      break;
      if ((this.b.d() == null) || (this.b.d().length() < 6)) {
        return d("Mandatory param var1 is missing var1number or the card bin (first 6 digit of the card)");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the user credentials and it should be merchant_key:unique_user_id.");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the user credentials and it should be merchant_key:unique_user_id.");
      }
      this.c.append(b("var1", this.b.d()));
      if ((this.b.e() == null) || (this.b.e().length() < 1)) {
        return d("Mandatory param var2 is missing var2should be the card name (nickname of the card)");
      }
      this.c.append(b("var2", this.b.e()));
      if ((this.b.f() == null) || (!this.b.f().contentEquals("CC"))) {
        return d("Mandatory param var3 is missing var3should be the card mode; please use CC as card mode");
      }
      this.c.append(b("var3", this.b.f()));
      if ((this.b.g() == null) || (!this.b.g().contentEquals("CC"))) {
        return d("Mandatory param var4 is missing var4should be the card type; please use CC as card type");
      }
      this.c.append(b("var4", this.b.g()));
      if ((this.b.h() == null) || (this.b.h().length() < 1)) {
        return d("Mandatory param var5 is missing var5 should be name on card");
      }
      this.c.append(b("var5", this.b.h()));
      if ((this.b.i() == null) || (!a(this.b.i()).booleanValue())) {
        return d("Mandatory param var6 is missing var6 should be a valid credit / debit card number");
      }
      this.c.append(b("var6", this.b.i()));
      try
      {
        i = Integer.parseInt(this.b.j());
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        try
        {
          j = Integer.parseInt(this.b.k());
          if (!a(i, j)) {
            break label4083;
          }
          this.c.append(b("var7", this.b.j()));
          this.c.append(b("var8", this.b.k()));
        }
        catch (NumberFormatException localNumberFormatException3)
        {
          return a(5002, " Invalid year, year should be 4 digit YYYY format");
        }
        localNumberFormatException2 = localNumberFormatException2;
        return a(5002, " Invalid month, it should be two digit number range from 01 to 12 MM format");
      }
      label4083:
      return a(5012, " It seems the card is expired!");
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing var1should be the user credentials and it should be merchant_key:unique_user_id.");
      }
      this.c.append(b("var1", this.b.d()));
      if ((this.b.e() == null) || (this.b.e().length() < 1)) {
        return d("Mandatory param var2 is missing var2should be the card token, you get the card token when you store/fetch a card");
      }
      this.c.append(b("var2", this.b.e()));
      if ((this.b.f() == null) || (this.b.f().length() < 1)) {
        return d("Mandatory param var3 is missing var3should be the card name (nickname of the card)");
      }
      this.c.append(b("var3", this.b.f()));
      localObject2 = this.c;
      if (this.b.g() == null)
      {
        str2 = "CC";
        ((StringBuilder)localObject2).append(b("var4", str2));
        localObject2 = this.c;
        if (this.b.h() != null) {
          break label4353;
        }
      }
      label4353:
      for (String str2 = "CC";; str2 = this.b.h())
      {
        ((StringBuilder)localObject2).append(b("var5", str2));
        if ((this.b.i() != null) && (this.b.i().length() >= 1)) {
          break label4365;
        }
        return d("Mandatory param var6 is missing var6 should be name on card");
        str2 = this.b.g();
        break;
      }
      label4365:
      this.c.append(b("var6", this.b.i()));
      if ((this.b.j() == null) || (!a(this.b.j()).booleanValue())) {
        return d("Mandatory param var7 is missing var7 should be a valid credit / debit card number");
      }
      this.c.append(b("var7", this.b.j()));
      try
      {
        i = Integer.parseInt(this.b.k());
      }
      catch (NumberFormatException localNumberFormatException4)
      {
        try
        {
          j = Integer.parseInt(this.b.l());
          if (!a(i, j)) {
            break label4547;
          }
          this.c.append(b("var8", this.b.k()));
          this.c.append(b("var9", this.b.l()));
        }
        catch (NumberFormatException localNumberFormatException5)
        {
          return a(5002, " Invalid year, year should be 4 digit YYYY format");
        }
        localNumberFormatException4 = localNumberFormatException4;
        return a(5002, " Invalid month, it should be two digit number range from 01 to 12 MM format");
      }
      label4547:
      return a(5012, " It seems the card is expired!");
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing should be the user credentials and it should be merchant_key:unique_user_id.");
      }
      this.c.append(b("var1", this.b.d()));
      if ((this.b.e() == null) && (this.b.e().length() < 2)) {
        return d("Mandatory param var2 is missing var2should be the card token, you get the card token when you store/fetch a card");
      }
      this.c.append(b("var2", this.b.e()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing should be the user credentials and it should be merchant_key:unique_user_id.");
      }
      this.c.append(b("var1", this.b.d()));
      if ((this.b.e() == null) && (this.b.e().length() < 2)) {
        return d("Mandatory param var2 is missing var2should be the card token, you get the card token when you store/fetch a card");
      }
      this.c.append(b("var2", this.b.e()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      if (this.b.d() == null) {
        return d("Mandatory param var1 is missing");
      }
      this.c.append(b("var1", this.b.d()));
      break;
      switch (i)
      {
      }
      j += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */