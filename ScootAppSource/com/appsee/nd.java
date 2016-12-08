package com.appsee;

import android.view.inputmethod.InputMethodManager;

class nd
  implements Runnable
{
  nd(rd paramrd, boolean paramBoolean) {}
  
  public void run()
  {
    boolean bool2 = true;
    boolean bool3 = rd.C(this.l);
    rd localrd = this.l;
    zk localzk = wn.C();
    if (!this.A)
    {
      bool1 = true;
      if ((!localzk.C(bool1)) || (!this.l.C()) || (!rd.C(this.l).isFullscreenMode())) {
        break label117;
      }
    }
    label117:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      rd.C(localrd, bool1);
      if ((bool3 != rd.C(this.l)) && (rd.C(this.l) != null)) {
        rd.C(this.l).C(rd.C(this.l));
      }
      return;
      bool1 = false;
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */