package com.scootapp.tv.d;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.es;

public abstract class i
  extends es
{
  private int a = 0;
  private boolean b = true;
  
  public abstract void a();
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.a(paramRecyclerView, paramInt1, paramInt2);
    try
    {
      if ((this.a > 10) && (this.b))
      {
        a();
        this.b = false;
      }
      for (this.a = 0; ((this.b) && (paramInt2 > 0)) || ((!this.b) && (paramInt2 < 0)); this.a = 0)
      {
        label37:
        this.a += paramInt2;
        return;
        if ((this.a >= -10) || (this.b)) {
          break label37;
        }
        b();
        this.b = true;
      }
      return;
    }
    catch (Exception paramRecyclerView)
    {
      paramRecyclerView.printStackTrace();
    }
  }
  
  public abstract void b();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */