package com.codetroopers.betterpickers.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.bt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.string;

final class b
  extends bt
{
  private LayoutInflater b;
  
  public b(DatePicker paramDatePicker, LayoutInflater paramLayoutInflater)
  {
    this.b = paramLayoutInflater;
  }
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject = this.a.u.getResources();
    View localView1;
    View localView2;
    View localView3;
    View localView4;
    if (DatePicker.a(this.a)[paramInt] == 'M')
    {
      DatePicker.a(paramInt);
      localView1 = this.b.inflate(R.layout.keyboard_text_with_header, null);
      localObject = localView1.findViewById(R.id.first);
      localView2 = localView1.findViewById(R.id.second);
      localView3 = localView1.findViewById(R.id.third);
      localView4 = localView1.findViewById(R.id.fourth);
      ((TextView)localView1.findViewById(R.id.header)).setText(R.string.month_c);
      this.a.h[0] = ((Button)((View)localObject).findViewById(R.id.key_left));
      this.a.h[1] = ((Button)((View)localObject).findViewById(R.id.key_middle));
      this.a.h[2] = ((Button)((View)localObject).findViewById(R.id.key_right));
      this.a.h[3] = ((Button)localView2.findViewById(R.id.key_left));
      this.a.h[4] = ((Button)localView2.findViewById(R.id.key_middle));
      this.a.h[5] = ((Button)localView2.findViewById(R.id.key_right));
      this.a.h[6] = ((Button)localView3.findViewById(R.id.key_left));
      this.a.h[7] = ((Button)localView3.findViewById(R.id.key_middle));
      this.a.h[8] = ((Button)localView3.findViewById(R.id.key_right));
      this.a.h[9] = ((Button)localView4.findViewById(R.id.key_left));
      this.a.h[10] = ((Button)localView4.findViewById(R.id.key_middle));
      this.a.h[11] = ((Button)localView4.findViewById(R.id.key_right));
      paramInt = 0;
      while (paramInt < 12)
      {
        this.a.h[paramInt].setOnClickListener(this.a);
        this.a.h[paramInt].setText(this.a.t[paramInt]);
        this.a.h[paramInt].setTextColor(DatePicker.b(this.a));
        this.a.h[paramInt].setBackgroundResource(DatePicker.c(this.a));
        this.a.h[paramInt].setTag(R.id.date_keyboard, "month");
        this.a.h[paramInt].setTag(R.id.date_month_int, Integer.valueOf(paramInt));
        paramInt += 1;
      }
    }
    for (;;)
    {
      this.a.d();
      this.a.c();
      DatePicker.e(this.a);
      paramViewGroup.addView(localView1, 0);
      return localView1;
      if (DatePicker.a(this.a)[paramInt] == 'd')
      {
        DatePicker.b(paramInt);
        localView1 = this.b.inflate(R.layout.keyboard_right_drawable_with_header, null);
        localView2 = localView1.findViewById(R.id.first);
        localView3 = localView1.findViewById(R.id.second);
        localView4 = localView1.findViewById(R.id.third);
        View localView5 = localView1.findViewById(R.id.fourth);
        ((TextView)localView1.findViewById(R.id.header)).setText(R.string.day_c);
        this.a.i[1] = ((Button)localView2.findViewById(R.id.key_left));
        this.a.i[2] = ((Button)localView2.findViewById(R.id.key_middle));
        this.a.i[3] = ((Button)localView2.findViewById(R.id.key_right));
        this.a.i[4] = ((Button)localView3.findViewById(R.id.key_left));
        this.a.i[5] = ((Button)localView3.findViewById(R.id.key_middle));
        this.a.i[6] = ((Button)localView3.findViewById(R.id.key_right));
        this.a.i[7] = ((Button)localView4.findViewById(R.id.key_left));
        this.a.i[8] = ((Button)localView4.findViewById(R.id.key_middle));
        this.a.i[9] = ((Button)localView4.findViewById(R.id.key_right));
        this.a.k = ((Button)localView5.findViewById(R.id.key_left));
        this.a.k.setTextColor(DatePicker.b(this.a));
        this.a.k.setBackgroundResource(DatePicker.c(this.a));
        this.a.i[0] = ((Button)localView5.findViewById(R.id.key_middle));
        this.a.n = ((ImageButton)localView5.findViewById(R.id.key_right));
        paramInt = 0;
        while (paramInt < 10)
        {
          this.a.i[paramInt].setOnClickListener(this.a);
          this.a.i[paramInt].setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
          this.a.i[paramInt].setTextColor(DatePicker.b(this.a));
          this.a.i[paramInt].setBackgroundResource(DatePicker.c(this.a));
          this.a.i[paramInt].setTag(R.id.date_keyboard, "date");
          this.a.i[paramInt].setTag(R.id.numbers_key, Integer.valueOf(paramInt));
          paramInt += 1;
        }
        this.a.n.setImageDrawable(((Resources)localObject).getDrawable(DatePicker.d(this.a)));
        this.a.n.setBackgroundResource(DatePicker.c(this.a));
        this.a.n.setOnClickListener(this.a);
      }
      else if (DatePicker.a(this.a)[paramInt] == 'y')
      {
        DatePicker.c(paramInt);
        localView1 = this.b.inflate(R.layout.keyboard_with_header, null);
        localObject = localView1.findViewById(R.id.first);
        localView2 = localView1.findViewById(R.id.second);
        localView3 = localView1.findViewById(R.id.third);
        localView4 = localView1.findViewById(R.id.fourth);
        ((TextView)localView1.findViewById(R.id.header)).setText(R.string.year_c);
        this.a.j[1] = ((Button)((View)localObject).findViewById(R.id.key_left));
        this.a.j[2] = ((Button)((View)localObject).findViewById(R.id.key_middle));
        this.a.j[3] = ((Button)((View)localObject).findViewById(R.id.key_right));
        this.a.j[4] = ((Button)localView2.findViewById(R.id.key_left));
        this.a.j[5] = ((Button)localView2.findViewById(R.id.key_middle));
        this.a.j[6] = ((Button)localView2.findViewById(R.id.key_right));
        this.a.j[7] = ((Button)localView3.findViewById(R.id.key_left));
        this.a.j[8] = ((Button)localView3.findViewById(R.id.key_middle));
        this.a.j[9] = ((Button)localView3.findViewById(R.id.key_right));
        this.a.l = ((Button)localView4.findViewById(R.id.key_left));
        this.a.l.setTextColor(DatePicker.b(this.a));
        this.a.l.setBackgroundResource(DatePicker.c(this.a));
        this.a.j[0] = ((Button)localView4.findViewById(R.id.key_middle));
        this.a.m = ((Button)localView4.findViewById(R.id.key_right));
        this.a.m.setTextColor(DatePicker.b(this.a));
        this.a.m.setBackgroundResource(DatePicker.c(this.a));
        paramInt = 0;
        while (paramInt < 10)
        {
          this.a.j[paramInt].setOnClickListener(this.a);
          this.a.j[paramInt].setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
          this.a.j[paramInt].setTextColor(DatePicker.b(this.a));
          this.a.j[paramInt].setBackgroundResource(DatePicker.c(this.a));
          this.a.j[paramInt].setTag(R.id.date_keyboard, "year");
          this.a.j[paramInt].setTag(R.id.numbers_key, Integer.valueOf(paramInt));
          paramInt += 1;
        }
      }
      else
      {
        localView1 = new View(this.a.u);
      }
    }
  }
  
  public void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)paramObject);
  }
  
  public boolean a(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
  
  public int b()
  {
    return 3;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\datepicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */