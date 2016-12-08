package com.sagar.taxiapp.b;

import android.content.res.Resources;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.codetroopers.betterpickers.radialtimepicker.l;
import java.util.Calendar;
import java.util.TimeZone;

final class ba
  implements View.OnClickListener
{
  ba(av paramav) {}
  
  public void onClick(View paramView)
  {
    av.f(this.a).setTextColor(this.a.m().getColor(2131689623));
    av.g(this.a).setImageResource(2130837758);
    paramView = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));
    int i = paramView.get(11);
    int j = paramView.get(12);
    paramView = l.a(this.a, i, j, DateFormat.is24HourFormat(this.a.l()));
    paramView.b(2131558631);
    paramView.a(this.a.n(), "Time Picker");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */