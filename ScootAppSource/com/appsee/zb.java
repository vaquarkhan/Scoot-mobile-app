package com.appsee;

import org.json.JSONObject;

class zb
{
  private long A;
  private short B;
  private short D;
  private boolean G;
  private wb M;
  private short l;
  
  public zb(short paramShort1, short paramShort2, short paramShort3, long paramLong, wb paramwb, boolean paramBoolean)
  {
    this.B = paramShort1;
    this.D = paramShort2;
    this.l = paramShort3;
    this.A = paramLong;
    this.M = paramwb;
    this.G = paramBoolean;
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
      arrayOfChar[i] = ((char)(j ^ 0x1C));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x2F));
    }
    return new String(arrayOfChar);
  }
  
  public long C()
  {
    return this.A;
  }
  
  public wb C()
  {
    return this.M;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(qi.C("3"), this.B);
    localJSONObject.put(fc.C("b"), this.M.ordinal());
    localJSONObject.put(qi.C(","), this.D);
    localJSONObject.put(fc.C("~"), this.l);
    localJSONObject.put(qi.C(" "), this.A);
    if (this.G) {
      localJSONObject.put(fc.C("l"), 1);
    }
    return localJSONObject;
  }
  
  public short C()
  {
    return this.D;
  }
  
  public void C(long paramLong)
  {
    this.A = paramLong;
  }
  
  public void C(wb paramwb)
  {
    this.M = paramwb;
  }
  
  public void C(short paramShort)
  {
    this.l = paramShort;
  }
  
  public void C(boolean paramBoolean)
  {
    this.G = paramBoolean;
  }
  
  public boolean C()
  {
    return this.G;
  }
  
  public short H()
  {
    return this.B;
  }
  
  public void H(short paramShort)
  {
    this.B = paramShort;
  }
  
  public short a()
  {
    return this.l;
  }
  
  public void a(short paramShort)
  {
    this.D = paramShort;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */