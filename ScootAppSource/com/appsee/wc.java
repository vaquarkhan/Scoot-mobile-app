package com.appsee;

import org.json.JSONObject;

class wc
{
  private xc A;
  private String B;
  private boolean G;
  private long l;
  
  public wc(String paramString, long paramLong, boolean paramBoolean, xc paramxc)
  {
    this.B = paramString;
    this.l = paramLong;
    this.G = paramBoolean;
    this.A = paramxc;
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
      arrayOfChar[i] = ((char)(j ^ 0x36));
      if (k < 0) {
        break;
      }
      j = k - 1;
      arrayOfChar[k] = ((char)(paramString.charAt(k) ^ 0x74));
    }
    return new String(arrayOfChar);
  }
  
  public long C()
  {
    return this.l;
  }
  
  public xc C()
  {
    return this.A;
  }
  
  public String C()
  {
    return this.B;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(sc.C("\f"), this.B);
    localJSONObject.put(sc.C("\003"), this.G);
    localJSONObject.put(sc.C("\022"), this.A.ordinal());
    localJSONObject.put(sc.C("\021"), this.l);
    return localJSONObject;
  }
  
  public void C(long paramLong)
  {
    this.l = paramLong;
  }
  
  public void C(xc paramxc)
  {
    this.A = paramxc;
  }
  
  public void C(String paramString)
  {
    this.B = paramString;
  }
  
  public void C(boolean paramBoolean)
  {
    this.G = paramBoolean;
  }
  
  public boolean C()
  {
    return this.G;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\wc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */