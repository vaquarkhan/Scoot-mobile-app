package com.google.android.gms.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.GooglePlayServicesUtil;

final class g
  implements View.OnClickListener
{
  g(Context paramContext, int paramInt) {}
  
  public void onClick(View paramView)
  {
    this.a.startActivity(GooglePlayServicesUtil.zzbC(this.b));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */