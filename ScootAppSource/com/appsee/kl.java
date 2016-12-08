package com.appsee;

import android.graphics.Rect;
import org.json.JSONObject;

class kl
{
  private String A;
  private long B;
  private boolean D;
  private tl G;
  private String M;
  private String f;
  private Rect l;
  
  public kl(tl paramtl, String paramString1, String paramString2, long paramLong, Rect paramRect)
  {
    this.G = paramtl;
    this.A = paramString1;
    this.f = paramString2;
    this.B = paramLong;
    this.l = paramRect;
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = i - 1;
    for (i = j; j >= 0; i = j)
    {
      j = paramString.charAt(i);
      int k = i - 1;
      arrayOfChar[i] = ((char)(j ^ 0x47));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x33));
    }
    return new String(arrayOfChar);
  }
  
  public long C()
  {
    return this.B;
  }
  
  public tl C()
  {
    return this.G;
  }
  
  public String C()
  {
    return this.A;
  }
  
  public void C(long paramLong)
  {
    this.B = paramLong;
  }
  
  public void C(tl paramtl)
  {
    this.G = paramtl;
  }
  
  public void C(Boolean paramBoolean)
  {
    this.D = paramBoolean.booleanValue();
  }
  
  public void C(String paramString)
  {
    this.f = paramString;
  }
  
  public String H()
  {
    return this.f;
  }
  
  public JSONObject H()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(mb.C("s"), this.G.ordinal());
    localJSONObject.put(zb.C("o"), this.B);
    localJSONObject.put(mb.C("n"), this.f);
    localJSONObject.put(zb.C("l"), this.A);
    String str;
    if (this.G == tl.f) {
      if (!bb.C(this.M))
      {
        localJSONObject.put(mb.C("-c"), this.M);
        str = zb.C("Fi");
        if (!this.D) {
          break label139;
        }
      }
    }
    label139:
    for (int i = 1;; i = 0)
    {
      localJSONObject.put(str, i);
      localJSONObject.put(mb.C("e"), C());
      return localJSONObject;
    }
  }
  
  public void H(String paramString)
  {
    this.A = paramString;
  }
  
  public void a(String paramString)
  {
    this.M = paramString;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\kl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */