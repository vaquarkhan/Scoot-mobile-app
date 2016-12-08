package com.c.a.c;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;

final class o
  implements Runnable
{
  o(h paramh, Activity paramActivity, u paramu, aw paramaw, b.a.a.a.a.g.o paramo) {}
  
  public void run()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    Object localObject = new p(this);
    float f = this.a.getResources().getDisplayMetrics().density;
    int i = h.a(f, 5);
    TextView localTextView = new TextView(this.a);
    localTextView.setAutoLinkMask(15);
    localTextView.setText(this.c.b());
    localTextView.setTextAppearance(this.a, 16973892);
    localTextView.setPadding(i, i, i, i);
    localTextView.setFocusable(false);
    ScrollView localScrollView = new ScrollView(this.a);
    localScrollView.setPadding(h.a(f, 14), h.a(f, 2), h.a(f, 10), h.a(f, 12));
    localScrollView.addView(localTextView);
    localBuilder.setView(localScrollView).setTitle(this.c.a()).setCancelable(false).setNeutralButton(this.c.c(), (DialogInterface.OnClickListener)localObject);
    if (this.d.d)
    {
      localObject = new q(this);
      localBuilder.setNegativeButton(this.c.e(), (DialogInterface.OnClickListener)localObject);
    }
    if (this.d.f)
    {
      localObject = new r(this);
      localBuilder.setPositiveButton(this.c.d(), (DialogInterface.OnClickListener)localObject);
    }
    localBuilder.show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */