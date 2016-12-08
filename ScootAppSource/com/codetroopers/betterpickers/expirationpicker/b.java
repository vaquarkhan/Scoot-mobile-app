package com.codetroopers.betterpickers.expirationpicker;

import android.content.Context;
import android.support.v4.view.bt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;

final class b
  extends bt
{
  private LayoutInflater b;
  
  public b(ExpirationPicker paramExpirationPicker, LayoutInflater paramLayoutInflater)
  {
    this.b = paramLayoutInflater;
  }
  
  public Object a(ViewGroup paramViewGroup, int paramInt)
  {
    this.a.p.getResources();
    View localView1;
    View localView2;
    View localView3;
    View localView4;
    View localView5;
    if (paramInt == 0)
    {
      ExpirationPicker.a(paramInt);
      localView1 = this.b.inflate(R.layout.keyboard_text, null);
      localView2 = localView1.findViewById(R.id.first);
      localView3 = localView1.findViewById(R.id.second);
      localView4 = localView1.findViewById(R.id.third);
      localView5 = localView1.findViewById(R.id.fourth);
      this.a.f[0] = ((Button)localView2.findViewById(R.id.key_left));
      this.a.f[1] = ((Button)localView2.findViewById(R.id.key_middle));
      this.a.f[2] = ((Button)localView2.findViewById(R.id.key_right));
      this.a.f[3] = ((Button)localView3.findViewById(R.id.key_left));
      this.a.f[4] = ((Button)localView3.findViewById(R.id.key_middle));
      this.a.f[5] = ((Button)localView3.findViewById(R.id.key_right));
      this.a.f[6] = ((Button)localView4.findViewById(R.id.key_left));
      this.a.f[7] = ((Button)localView4.findViewById(R.id.key_middle));
      this.a.f[8] = ((Button)localView4.findViewById(R.id.key_right));
      this.a.f[9] = ((Button)localView5.findViewById(R.id.key_left));
      this.a.f[10] = ((Button)localView5.findViewById(R.id.key_middle));
      this.a.f[11] = ((Button)localView5.findViewById(R.id.key_right));
      paramInt = 0;
      while (paramInt < 12)
      {
        this.a.f[paramInt].setOnClickListener(this.a);
        this.a.f[paramInt].setText(String.format("%02d", new Object[] { Integer.valueOf(paramInt + 1) }));
        this.a.f[paramInt].setTextColor(ExpirationPicker.a(this.a));
        this.a.f[paramInt].setBackgroundResource(ExpirationPicker.b(this.a));
        this.a.f[paramInt].setTag(R.id.date_keyboard, "month");
        this.a.f[paramInt].setTag(R.id.date_month_int, Integer.valueOf(paramInt + 1));
        paramInt += 1;
      }
    }
    for (;;)
    {
      this.a.d();
      this.a.c();
      ExpirationPicker.c(this.a);
      paramViewGroup.addView(localView1, 0);
      return localView1;
      if (paramInt == 1)
      {
        ExpirationPicker.b(paramInt);
        localView1 = this.b.inflate(R.layout.keyboard, null);
        localView2 = localView1.findViewById(R.id.first);
        localView3 = localView1.findViewById(R.id.second);
        localView4 = localView1.findViewById(R.id.third);
        localView5 = localView1.findViewById(R.id.fourth);
        this.a.g[1] = ((Button)localView2.findViewById(R.id.key_left));
        this.a.g[2] = ((Button)localView2.findViewById(R.id.key_middle));
        this.a.g[3] = ((Button)localView2.findViewById(R.id.key_right));
        this.a.g[4] = ((Button)localView3.findViewById(R.id.key_left));
        this.a.g[5] = ((Button)localView3.findViewById(R.id.key_middle));
        this.a.g[6] = ((Button)localView3.findViewById(R.id.key_right));
        this.a.g[7] = ((Button)localView4.findViewById(R.id.key_left));
        this.a.g[8] = ((Button)localView4.findViewById(R.id.key_middle));
        this.a.g[9] = ((Button)localView4.findViewById(R.id.key_right));
        this.a.h = ((Button)localView5.findViewById(R.id.key_left));
        this.a.h.setTextColor(ExpirationPicker.a(this.a));
        this.a.h.setBackgroundResource(ExpirationPicker.b(this.a));
        this.a.g[0] = ((Button)localView5.findViewById(R.id.key_middle));
        this.a.i = ((Button)localView5.findViewById(R.id.key_right));
        this.a.i.setTextColor(ExpirationPicker.a(this.a));
        this.a.i.setBackgroundResource(ExpirationPicker.b(this.a));
        paramInt = 0;
        while (paramInt < 10)
        {
          this.a.g[paramInt].setOnClickListener(this.a);
          this.a.g[paramInt].setText(String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
          this.a.g[paramInt].setTextColor(ExpirationPicker.a(this.a));
          this.a.g[paramInt].setBackgroundResource(ExpirationPicker.b(this.a));
          this.a.g[paramInt].setTag(R.id.date_keyboard, "year");
          this.a.g[paramInt].setTag(R.id.numbers_key, Integer.valueOf(paramInt));
          paramInt += 1;
        }
      }
      else
      {
        localView1 = new View(this.a.p);
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
    return 2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\expirationpicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */