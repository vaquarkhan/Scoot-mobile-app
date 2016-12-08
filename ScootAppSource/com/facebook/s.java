package com.facebook;

import com.facebook.b.as;
import com.facebook.b.x;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
{
  static final v a = new v(200, 299, null);
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final String f;
  private final String g;
  private final String h;
  private final String i;
  private final String j;
  private final JSONObject k;
  private final JSONObject l;
  private final Object m;
  private final HttpURLConnection n;
  private final p o;
  
  private s(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, JSONObject paramJSONObject1, JSONObject paramJSONObject2, Object paramObject, HttpURLConnection paramHttpURLConnection, p paramp)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString1;
    this.g = paramString2;
    this.l = paramJSONObject1;
    this.k = paramJSONObject2;
    this.m = paramObject;
    this.n = paramHttpURLConnection;
    this.h = paramString3;
    this.i = paramString4;
    paramInt1 = 0;
    if (paramp != null)
    {
      this.o = paramp;
      paramInt1 = 1;
      paramString1 = f();
      if (paramInt1 == 0) {
        break label131;
      }
    }
    label131:
    for (paramInt1 = u.b;; paramInt1 = paramString1.a(paramInt2, paramInt3, paramBoolean))
    {
      this.b = paramInt1;
      this.j = paramString1.a(this.b);
      return;
      this.o = new ac(this, paramString2);
      break;
    }
  }
  
  public s(int paramInt, String paramString1, String paramString2)
  {
    this(-1, paramInt, -1, paramString1, paramString2, null, null, false, null, null, null, null, null);
  }
  
  s(HttpURLConnection paramHttpURLConnection, Exception paramException) {}
  
  static s a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    for (;;)
    {
      try
      {
        if (paramJSONObject.has("code"))
        {
          int i4 = paramJSONObject.getInt("code");
          localObject1 = as.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
          {
            JSONObject localJSONObject2 = (JSONObject)localObject1;
            localObject1 = null;
            String str = null;
            JSONObject localJSONObject1 = null;
            Object localObject4 = null;
            boolean bool2 = false;
            int i2 = -1;
            int i3 = -1;
            int i1 = 0;
            Object localObject2;
            Object localObject3;
            boolean bool1;
            if (localJSONObject2.has("error"))
            {
              localJSONObject1 = (JSONObject)as.a(localJSONObject2, "error", null);
              localObject1 = localJSONObject1.optString("type", null);
              str = localJSONObject1.optString("message", null);
              i2 = localJSONObject1.optInt("code", -1);
              i3 = localJSONObject1.optInt("error_subcode", -1);
              localObject2 = localJSONObject1.optString("error_user_msg", null);
              localObject3 = localJSONObject1.optString("error_user_title", null);
              bool1 = localJSONObject1.optBoolean("is_transient", false);
              i1 = 1;
              if (i1 != 0) {
                return new s(i4, i2, i3, (String)localObject1, str, (String)localObject3, (String)localObject2, bool1, localJSONObject2, paramJSONObject, paramObject, paramHttpURLConnection, null);
              }
            }
            else
            {
              if ((!localJSONObject2.has("error_code")) && (!localJSONObject2.has("error_msg")))
              {
                localObject3 = localObject4;
                localObject2 = localJSONObject1;
                bool1 = bool2;
                if (!localJSONObject2.has("error_reason")) {
                  continue;
                }
              }
              localObject1 = localJSONObject2.optString("error_reason", null);
              str = localJSONObject2.optString("error_msg", null);
              i2 = localJSONObject2.optInt("error_code", -1);
              i3 = localJSONObject2.optInt("error_subcode", -1);
              i1 = 1;
              localObject3 = localObject4;
              localObject2 = localJSONObject1;
              bool1 = bool2;
              continue;
            }
          }
          if (!a.a(i4))
          {
            if (!paramJSONObject.has("body")) {
              break label359;
            }
            localObject1 = (JSONObject)as.a(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            paramJSONObject = new s(i4, -1, -1, null, null, null, null, false, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null);
            return paramJSONObject;
          }
        }
      }
      catch (JSONException paramJSONObject) {}
      return null;
      label359:
      Object localObject1 = null;
    }
  }
  
  /* Error */
  static x f()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 160	com/facebook/w:i	()Ljava/lang/String;
    //   6: invokestatic 163	com/facebook/b/as:c	(Ljava/lang/String;)Lcom/facebook/b/ax;
    //   9: astore_0
    //   10: aload_0
    //   11: ifnonnull +12 -> 23
    //   14: invokestatic 165	com/facebook/b/x:a	()Lcom/facebook/b/x;
    //   17: astore_0
    //   18: ldc 2
    //   20: monitorexit
    //   21: aload_0
    //   22: areturn
    //   23: aload_0
    //   24: invokevirtual 169	com/facebook/b/ax:b	()Lcom/facebook/b/x;
    //   27: astore_0
    //   28: goto -10 -> 18
    //   31: astore_0
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   9	19	0	localObject1	Object
    //   31	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	10	31	finally
    //   14	18	31	finally
    //   23	28	31	finally
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public String c()
  {
    return this.f;
  }
  
  public String d()
  {
    if (this.g != null) {
      return this.g;
    }
    return this.o.getLocalizedMessage();
  }
  
  public p e()
  {
    return this.o;
  }
  
  public String toString()
  {
    return "{HttpStatus: " + this.c + ", errorCode: " + this.d + ", errorType: " + this.f + ", errorMessage: " + d() + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */