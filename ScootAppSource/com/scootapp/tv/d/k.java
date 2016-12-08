package com.scootapp.tv.d;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.squareup.picasso.Callback;

final class k
  implements Callback
{
  k(j paramj) {}
  
  public void onError()
  {
    j.a(this.a).setVisibility(8);
  }
  
  public void onSuccess()
  {
    Log.v("Scoot", "Offer Loaded");
    j.a(this.a).setVisibility(8);
    j.b(this.a).setVisibility(0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */