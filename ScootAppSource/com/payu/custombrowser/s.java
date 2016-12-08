package com.payu.custombrowser;

import android.widget.ImageView;

final class s
  implements Runnable
{
  s(q paramq) {}
  
  public void run()
  {
    if (a.e(this.a.d) != null)
    {
      q localq = this.a;
      localq.a += 1;
      if (this.a.a >= this.a.b.length) {
        this.a.a = 0;
      }
      this.a.c.setImageBitmap(null);
      this.a.c.destroyDrawingCache();
      this.a.c.refreshDrawableState();
      this.a.c.setImageDrawable(this.a.b[this.a.a]);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */