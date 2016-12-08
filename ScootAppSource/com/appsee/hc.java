package com.appsee;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.json.JSONArray;
import org.json.JSONObject;

class hc
{
  protected static Object G = new Object();
  protected static String l = "c03e86fd74e090eadb4dc2f5e57b1842";
  private BasicCookieStore A = new BasicCookieStore();
  protected final int B = 60000;
  private HttpRequestBase M = null;
  
  protected JSONObject C(String paramString)
  {
    paramString = new JSONObject(paramString);
    String str = paramString.optString(sc.C("'{\020f\020"), null);
    if (str != null) {
      throw new Exception(str);
    }
    return paramString;
  }
  
  protected JSONObject C(String paramString, JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(sc.C("J\rg\026l\f}O}\033y\007"), bc.C("\025,\0040\035?\025(\0353\032s\036/\0332"));
    return C(paramString, localHashMap, new StringEntity(paramJSONObject.toString(), sc.C("7]$$Z")));
  }
  
  protected JSONObject C(String paramString1, byte[] paramArrayOfByte, int paramInt, String paramString2, Map<String, String> paramMap)
  {
    String str = String.format(bc.C("YqYqYqYqYqQ/"), new Object[] { UUID.randomUUID().toString().replace(sc.C("O"), "") });
    paramArrayOfByte = C(paramArrayOfByte, paramInt, paramString2, paramMap, str);
    paramString2 = new HashMap();
    paramString2.put(bc.C("73\032(\0212\000q\000%\0049"), String.format(sc.C("d\027e\026`\022h\020}Mo\r{\017$\006h\026hY)\000f\027g\006h\020p_,\021"), new Object[] { str }));
    paramString2.put(bc.C("\037\0332\0009\032(89\032;\0004"), Integer.toString(paramArrayOfByte.length));
    return C(paramString1, paramString2, new ByteArrayEntity(paramArrayOfByte));
  }
  
  public JSONObject C(byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    String str = String.format(sc.C("GzM|\022e\rh\006"), new Object[] { Appsee.G });
    HashMap localHashMap = new HashMap();
    localHashMap.put(bc.C("\017\021/\0075\0332=8"), paramString1);
    localHashMap.put(sc.C("J\027{\020l\f}+g\006l\032"), Long.toString(paramLong1));
    localHashMap.put(bc.C("\b\033(\0250'5\0169"), Long.toString(paramLong2));
    return C(str, paramArrayOfByte, paramInt, paramString2, localHashMap);
  }
  
  public void C()
  {
    for (;;)
    {
      synchronized (G)
      {
        if ((this.M != null) && (!this.M.isAborted()))
        {
          Thread localThread = new Thread(new qb(this), bc.C("\035\004,\0079\021\022\021(\0033\0067'(\033,\0045\032; 4\0069\0258"));
          try
          {
            localThread.start();
            localThread.join();
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            ue.C(localInterruptedException, sc.C("'{\020f\020)1}\ry\022`\fnBg\007}\025f\020bBj\003e\016"));
          }
        }
      }
    }
  }
  
  protected byte[] C(byte[] paramArrayOfByte, int paramInt, String paramString1, Map<String, String> paramMap, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(550);
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuilder.append(bc.C("Yq"));
      localStringBuilder.append(paramString2);
      localStringBuilder.append(sc.C("\004h"));
      localStringBuilder.append(bc.C("73\032(\0212\000q05\007,\033/\035(\0353\032fT:\033.\031q\020=\000=O|\032=\0319I~"));
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append(sc.C("@\004h\004h"));
      localStringBuilder.append((String)localEntry.getValue());
      localStringBuilder.append(bc.C("yV"));
    }
    localStringBuilder.append(sc.C("$O"));
    localStringBuilder.append(paramString2);
    localStringBuilder.append(bc.C("yV"));
    localStringBuilder.append(sc.C("!f\f}\007g\026$&`\021y\rz\013}\013f\f3Bo\r{\017$\006h\026hY)\fh\017l_+\004`\016l@2Bo\013e\007g\003d\0074@"));
    localStringBuilder.append(paramString1);
    localStringBuilder.append(bc.C("VgyV"));
    localStringBuilder.append(sc.C("J\rg\026l\f}O]\033y\0073Bh\022y\016`\001h\026`\rgMf\001}\007}Oz\026{\007h\017\004h\004h"));
    paramMap = String.format(bc.C("yVYqQ/YqyV"), new Object[] { paramString2 });
    paramString1 = bb.C(localStringBuilder.toString());
    paramMap = bb.C(paramMap);
    paramString2 = new byte[paramString1.length + paramInt + paramMap.length];
    System.arraycopy(paramString1, 0, paramString2, 0, paramString1.length);
    System.arraycopy(paramArrayOfByte, 0, paramString2, paramString1.length, paramInt);
    System.arraycopy(paramMap, 0, paramString2, paramString1.length + paramInt, paramMap.length);
    return paramString2;
  }
  
  public JSONObject H(String paramString)
  {
    String str = String.format(bc.C("y\007s\0273\032:\035;"), new Object[] { Appsee.G });
    JSONObject localJSONObject = new JSONObject();
    Object localObject2 = wn.C().C(true);
    ml localml = wn.C().C();
    Object localObject1 = localObject2[0];
    localObject2 = localObject2[1];
    localJSONObject.put(sc.C("H\022y4l\020z\013f\f"), wn.D());
    localJSONObject.put(bc.C("6)\0328\0309=8"), wn.A());
    localJSONObject.put(sc.C("M\007\013j\007J\rm\007"), wn.H());
    localJSONObject.put(bc.C("\023'\n\021.\0075\0332"), wn.h());
    localJSONObject.put(sc.C("#g\006{\r`\006Z&B4l\020z\013f\f"), wn.H());
    localJSONObject.put(bc.C("'%\007(\021183\027=\0309"), wn.K());
    localJSONObject.put(sc.C("J\rg\fl\001}\013\013}\033"), wn.C().ordinal());
    localJSONObject.put(bc.C("\017\027.\0219\032\013\0358\0004"), ((Dimension)localObject2).getWidth());
    localJSONObject.put(sc.C("Z\001{\007l\fA\007`\005a\026"), ((Dimension)localObject2).getHeight());
    localJSONObject.put(bc.C("70\0359\032( 5\0319"), bb.C(new Date()));
    localJSONObject.put(sc.C("0l\023|\007z\026@\006"), paramString);
    paramString = gb.C();
    if (paramString != null) {
      localJSONObject.put(bc.C("\023\022:\0305\0329'9\007/\0353\032/"), paramString);
    }
    localJSONObject.put(sc.C("M\007\013j\007J\rm\007@\f}\007{\fh\016"), wn.a());
    localJSONObject.put(bc.C("9=\032)\022=\027(\001.\021."), wn.M());
    localJSONObject.put(sc.C(",l\026Z\001{\007l\fA\007`\005a\026"), ((Dimension)localObject1).getHeight());
    localJSONObject.put(bc.C(":9\000\017\027.\0219\032\013\0358\0004"), ((Dimension)localObject1).getWidth());
    localJSONObject.put(sc.C("1j\020l\007g&y\013"), wn.C());
    localJSONObject.put(bc.C("$4\r/\035?\025099\032)6)\000(\0332"), wn.a());
    localJSONObject.put(sc.C("$f\f}1j\003e\007"), wn.C());
    localJSONObject.put(bc.C("09\0025\0279!2\035-\0019=\030"), wn.J());
    localJSONObject.put(sc.C("@\f`\026`\003e-{\013l\f}\003}\013f\f"), localml.ordinal());
    paramString = gb.C();
    if (paramString != null) {
      localJSONObject.put(bc.C("99\000=\020=\000=1.\0063\006/"), paramString);
    }
    paramString = xb.C();
    if (paramString != null) {
      localJSONObject.put(sc.C("A\003{\006~\003{\007L\fj\rm\007{\021"), new JSONArray(paramString));
    }
    localJSONObject.put(bc.C("09\0025\0279',\021?"), wn.C());
    vd.C(1, sc.C("!f\fo\013nBY\003{\003d\0213B,\021"), new Object[] { localJSONObject.toString() });
    return C(str, localJSONObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */