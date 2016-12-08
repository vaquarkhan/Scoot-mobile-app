package com.appsee;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

@TargetApi(9)
class mc
  extends hc
{
  private HttpURLConnection A = null;
  private boolean B = false;
  private boolean G;
  private CookieManager l;
  
  public mc()
  {
    this.jdField_l_of_type_JavaNetCookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
    this.jdField_G_of_type_Boolean = false;
    if (Build.VERSION.SDK_INT < 23) {
      throw new UnsupportedOperationException(sc.C("6a\013zBz\007{\024l\020)\022{\rq\033)\013zBh\024h\013e\003k\016lBf\fe\033)\004{\rdBH\fm\020f\013mBd\003{\021a\017h\016e\r~Bh\fmB|\022"));
    }
  }
  
  protected JSONObject C(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      C(true);
      HashMap localHashMap = new HashMap();
      localHashMap.put(sc.C("J\rg\026l\f}O}\033y\007"), rd.C("9U(I1F9Q1J6\n2V7K"));
      paramString = C(paramString, localHashMap, bb.C(paramJSONObject.toString()));
      return paramString;
    }
    finally
    {
      C(false);
    }
  }
  
  protected JSONObject C(String paramString1, byte[] paramArrayOfByte, int paramInt, String paramString2, Map<String, String> paramMap)
  {
    try
    {
      C(true);
      String str = String.format(sc.C("$O$O$O$O$O,\021"), new Object[] { UUID.randomUUID().toString().replace(rd.C("\b"), "") });
      paramArrayOfByte = C(paramArrayOfByte, paramInt, paramString2, paramMap, str);
      paramString2 = new HashMap();
      paramString2.put(sc.C("J\rg\026l\f}O}\033y\007"), String.format(rd.C("5P4Q1U9W,\n>J*HuA9Q9\036xG7P6A9W!\030}V"), new Object[] { str }));
      paramString2.put(sc.C("!f\f}\007g\026E\007g\005}\n"), Integer.toString(paramArrayOfByte.length));
      paramString1 = C(paramString1, paramString2, paramArrayOfByte);
      return paramString1;
    }
    finally
    {
      C(false);
    }
  }
  
  public void C()
  {
    for (;;)
    {
      synchronized (jdField_G_of_type_JavaLangObject)
      {
        if (this.A != null)
        {
          Thread localThread = new Thread(new oc(this), rd.C("d(U+@=k=Q/J*N\013Q7U(L6B\fM*@9A"));
          try
          {
            localThread.start();
            localThread.join();
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            ue.C(localInterruptedException, sc.C("'{\020f\020)1}\ry\022`\fnBg\007}\025f\020bBj\003e\016"));
            continue;
          }
        }
      }
      if (this.jdField_G_of_type_Boolean) {
        this.B = true;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\mc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */