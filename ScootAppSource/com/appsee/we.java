package com.appsee;

import android.graphics.Rect;
import org.json.JSONArray;
import org.json.JSONObject;

class we
{
  private long A;
  private Rect l;
  
  public we(Rect paramRect, long paramLong)
  {
    this.A = paramLong;
    this.l = paramRect;
  }
  
  public long C()
  {
    return this.A;
  }
  
  public Rect C()
  {
    return this.l;
  }
  
  public JSONObject C()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put(mb.C("s"), this.A);
    JSONArray localJSONArray = new JSONArray();
    localJSONArray.put(this.l.left);
    localJSONArray.put(this.l.top);
    localJSONArray.put(this.l.width());
    localJSONArray.put(this.l.height());
    localJSONObject.put(wc.C("P"), localJSONArray);
    return localJSONObject;
  }
  
  public void C(long paramLong)
  {
    this.A = paramLong;
  }
  
  public void C(Rect paramRect)
  {
    this.l = paramRect;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */