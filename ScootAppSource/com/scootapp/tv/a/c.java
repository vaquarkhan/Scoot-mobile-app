package com.scootapp.tv.a;

import android.app.ProgressDialog;
import android.support.v7.a.ah;
import com.sagar.taxiapp.beans.b;
import java.util.HashMap;

final class c
  implements Runnable
{
  c(String paramString1, ah paramah, ProgressDialog paramProgressDialog, HashMap paramHashMap, b paramb, String paramString2) {}
  
  public void run()
  {
    if (this.a.equalsIgnoreCase("clear car rental")) {
      a.d(this.b, this.c, this.d, this.e, this.f);
    }
    do
    {
      return;
      if (this.a.equalsIgnoreCase("makson"))
      {
        a.e(this.b, this.c, this.d, this.e, this.f);
        return;
      }
      if (this.a.equalsIgnoreCase("one way cabs"))
      {
        a.c(this.b, this.c, this.d, this.e, this.f);
        return;
      }
      if (this.a.equalsIgnoreCase("roder"))
      {
        a.b(this.b, this.c, this.d, this.e, this.f);
        return;
      }
    } while (!this.a.equalsIgnoreCase("savaari"));
    a.a(this.b, this.c, this.d, this.e, this.f);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */