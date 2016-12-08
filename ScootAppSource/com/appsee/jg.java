package com.appsee;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class jg
{
  private Rect A;
  private int B;
  private long D;
  private hj G;
  private long M;
  private boolean f;
  private List<Short> l;
  
  public jg(hj paramhj, boolean paramBoolean, short[] paramArrayOfShort, long paramLong1, long paramLong2, Rect paramRect, int paramInt)
  {
    this.G = paramhj;
    this.f = paramBoolean;
    this.D = paramLong1;
    this.M = paramLong2;
    this.A = paramRect;
    this.B = paramInt;
    if ((paramArrayOfShort != null) && (paramArrayOfShort.length > 0))
    {
      this.l = new ArrayList(paramArrayOfShort.length);
      int j = paramArrayOfShort.length;
      paramInt = 0;
      for (int i = 0; paramInt < j; i = paramInt)
      {
        short s = paramArrayOfShort[i];
        paramhj = this.l;
        paramInt = i + 1;
        paramhj.add(Short.valueOf(s));
      }
    }
  }
  
  public int C()
  {
    return this.B;
  }
  
  public long C()
  {
    return this.M;
  }
  
  public Rect C()
  {
    return this.A;
  }
  
  public hj C()
  {
    return this.G;
  }
  
  public List<Short> C()
  {
    return this.l;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(sb.C("7"), this.G.ordinal());
    String str = nc.C("6");
    if (this.f) {}
    for (int i = 1;; i = 0)
    {
      localJSONObject.put(str, i);
      localJSONObject.put(sb.C("0"), this.D);
      localJSONObject.put(nc.C("!"), this.M);
      if ((this.l != null) && (!this.l.isEmpty())) {
        localJSONObject.put(sb.C("$"), new JSONArray(this.l));
      }
      localJSONObject.put(nc.C("&"), H());
      return localJSONObject;
    }
  }
  
  public void C(int paramInt)
  {
    this.B = paramInt;
  }
  
  public void C(long paramLong)
  {
    this.D = paramLong;
  }
  
  public void C(Rect paramRect)
  {
    this.A = paramRect;
  }
  
  public void C(hj paramhj)
  {
    this.G = paramhj;
  }
  
  public void C(List<Short> paramList)
  {
    this.l = paramList;
  }
  
  public void C(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public boolean C()
  {
    return (this.G == hj.A) || (this.G == hj.f);
  }
  
  public long H()
  {
    return this.D;
  }
  
  public void H(long paramLong)
  {
    this.M = paramLong;
  }
  
  public boolean H()
  {
    return this.f;
  }
  
  public boolean a()
  {
    return (this.G == hj.E) || (this.G == hj.G) || (this.G == hj.c) || (this.G == hj.D);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\jg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */