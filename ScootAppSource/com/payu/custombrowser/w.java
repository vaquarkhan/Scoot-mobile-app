package com.payu.custombrowser;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class w
  implements View.OnClickListener
{
  w(a parama) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.putExtra(this.a.a(R.string.cb_result), "Transaction canceled due to cancel pressed!");
    a.e(this.a).setResult(0, paramView);
    a.e(this.a).finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */