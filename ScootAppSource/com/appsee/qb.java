package com.appsee;

import org.apache.http.client.methods.HttpRequestBase;

class qb
  implements Runnable
{
  qb(hc paramhc) {}
  
  public void run()
  {
    hc.C(this.l).abort();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */