package com.appsee;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class vc
{
  private bd A;
  private long B;
  private ml G;
  private List<Rect> l;
  
  public long C()
  {
    return this.B;
  }
  
  public bd C()
  {
    return this.A;
  }
  
  public ml C()
  {
    return this.G;
  }
  
  public List<Rect> C()
  {
    return this.l;
  }
  
  public void C(long paramLong)
  {
    this.B = paramLong;
  }
  
  public void C(bd parambd)
  {
    this.A = parambd;
  }
  
  public void C(ml paramml)
  {
    this.G = paramml;
  }
  
  public void C(HashMap<View, Rect> paramHashMap)
  {
    if ((paramHashMap != null) && (!paramHashMap.isEmpty())) {
      this.l = new ArrayList(paramHashMap.values());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */