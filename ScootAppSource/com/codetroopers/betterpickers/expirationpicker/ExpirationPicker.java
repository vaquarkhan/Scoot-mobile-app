package com.codetroopers.betterpickers.expirationpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.drawable;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.datepicker.DatePicker;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import java.util.Calendar;

public class ExpirationPicker
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static int s = -1;
  private static int t = -1;
  private int A;
  private int B;
  private int C = -1;
  protected int a = 4;
  protected int b = -1;
  protected int[] c = new int[this.a];
  protected int d = -1;
  protected int e;
  protected final Button[] f = new Button[12];
  protected final Button[] g = new Button[10];
  protected Button h;
  protected Button i;
  protected UnderlinePageIndicatorPicker j;
  protected ViewPager k;
  protected b l;
  protected ImageButton m;
  protected ExpirationView n;
  protected String[] o;
  protected final Context p;
  protected View q;
  private char[] r;
  private Button u;
  private ColorStateList v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public ExpirationPicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ExpirationPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.p = paramContext;
    this.r = DateFormat.getDateFormatOrder(this.p);
    this.o = DatePicker.e();
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.v = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.w = R.drawable.key_background_dark;
    this.x = R.drawable.button_background_dark;
    this.y = getResources().getColor(R.color.default_divider_color_dark);
    this.z = getResources().getColor(R.color.default_keyboard_indicator_color_dark);
    this.B = R.drawable.ic_backspace_dark;
    this.A = R.drawable.ic_check_dark;
    this.e = Calendar.getInstance().get(1);
  }
  
  private void c(int paramInt)
  {
    if (this.d < this.a - 1)
    {
      int i1 = this.d;
      while (i1 >= 0)
      {
        this.c[(i1 + 1)] = this.c[i1];
        i1 -= 1;
      }
      this.d += 1;
      this.c[0] = paramInt;
    }
    if (this.k.getCurrentItem() < 2) {
      this.k.a(this.k.getCurrentItem() + 1, true);
    }
  }
  
  private void e()
  {
    int i2 = 0;
    Button[] arrayOfButton = this.f;
    int i3 = arrayOfButton.length;
    int i1 = 0;
    Button localButton;
    while (i1 < i3)
    {
      localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.v);
        localButton.setBackgroundResource(this.w);
      }
      i1 += 1;
    }
    arrayOfButton = this.g;
    i3 = arrayOfButton.length;
    i1 = i2;
    while (i1 < i3)
    {
      localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.v);
        localButton.setBackgroundResource(this.w);
      }
      i1 += 1;
    }
    if (this.j != null) {
      this.j.setSelectedColor(this.z);
    }
    if (this.q != null) {
      this.q.setBackgroundColor(this.y);
    }
    if (this.m != null)
    {
      this.m.setBackgroundResource(this.x);
      this.m.setImageDrawable(getResources().getDrawable(this.B));
    }
    if (this.h != null)
    {
      this.h.setTextColor(this.v);
      this.h.setBackgroundResource(this.w);
    }
    if (this.i != null)
    {
      this.i.setTextColor(this.v);
      this.i.setBackgroundResource(this.w);
    }
    if (this.n != null) {
      this.n.setTheme(this.C);
    }
  }
  
  private void f()
  {
    c();
    i();
    a();
    g();
    h();
  }
  
  private void g()
  {
    int i1 = 0;
    while (i1 < this.f.length)
    {
      if (this.f[i1] != null) {
        this.f[i1].setEnabled(true);
      }
      i1 += 1;
    }
  }
  
  private void h()
  {
    if (this.d == 1) {
      setYearMinKeyRange(this.e % 100 / 10);
    }
    do
    {
      return;
      if (this.d == 2)
      {
        setYearMinKeyRange(Math.max(0, this.e % 100 - this.c[0] * 10));
        return;
      }
    } while (this.d != 3);
    setYearKeyRange(-1);
  }
  
  private void i()
  {
    if (this.u == null) {
      return;
    }
    Button localButton = this.u;
    if ((getYear() >= this.e) && (getMonthOfYear() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
  
  private void setYearKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.g.length)
    {
      Button localButton;
      if (this.g[i1] != null)
      {
        localButton = this.g[i1];
        if (i1 > paramInt) {
          break label48;
        }
      }
      label48:
      for (boolean bool = true;; bool = false)
      {
        localButton.setEnabled(bool);
        i1 += 1;
        break;
      }
    }
  }
  
  private void setYearMinKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.g.length)
    {
      Button localButton;
      if (this.g[i1] != null)
      {
        localButton = this.g[i1];
        if (i1 < paramInt) {
          break label48;
        }
      }
      label48:
      for (boolean bool = true;; bool = false)
      {
        localButton.setEnabled(bool);
        i1 += 1;
        break;
      }
    }
  }
  
  public void a()
  {
    if ((this.b != -1) || (this.d != -1)) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.m != null) {
        this.m.setEnabled(bool);
      }
      return;
    }
  }
  
  protected void a(View paramView)
  {
    if (paramView == this.m) {
      switch (this.k.getCurrentItem())
      {
      }
    }
    for (;;)
    {
      f();
      return;
      if (this.b != -1)
      {
        this.b = -1;
        continue;
        if (this.d >= 2)
        {
          int i1 = 0;
          while (i1 < this.d)
          {
            this.c[i1] = this.c[(i1 + 1)];
            i1 += 1;
          }
          this.c[this.d] = 0;
          this.d -= 1;
        }
        else if (this.k.getCurrentItem() > 0)
        {
          this.k.a(this.k.getCurrentItem() - 1, true);
          continue;
          if (paramView == this.n.getMonth())
          {
            this.k.setCurrentItem(s);
          }
          else if (paramView == this.n.getYear())
          {
            this.k.setCurrentItem(t);
          }
          else if (paramView.getTag(R.id.date_keyboard).equals("month"))
          {
            this.b = ((Integer)paramView.getTag(R.id.date_month_int)).intValue();
            if (this.k.getCurrentItem() < 2) {
              this.k.a(this.k.getCurrentItem() + 1, true);
            }
          }
          else if (paramView.getTag(R.id.date_keyboard).equals("year"))
          {
            c(((Integer)paramView.getTag(R.id.numbers_key)).intValue());
          }
        }
      }
    }
  }
  
  public void b()
  {
    int i1 = 0;
    while (i1 < this.a)
    {
      this.c[i1] = 0;
      i1 += 1;
    }
    this.d = -1;
    this.b = -1;
    this.k.a(0, true);
    c();
  }
  
  @SuppressLint({"DefaultLocale"})
  protected void c()
  {
    if (this.b < 0) {}
    for (String str = "";; str = String.format("%02d", new Object[] { Integer.valueOf(this.b) }))
    {
      this.n.a(str, getYear());
      return;
    }
  }
  
  protected void d()
  {
    if (this.h != null) {
      this.h.setEnabled(false);
    }
    if (this.i != null) {
      this.i.setEnabled(false);
    }
  }
  
  protected int getLayoutId()
  {
    return R.layout.expiration_picker_view;
  }
  
  public int getMonthOfYear()
  {
    return this.b;
  }
  
  public int getYear()
  {
    return this.c[3] * 1000 + this.c[2] * 100 + this.c[1] * 10 + this.c[0];
  }
  
  public void onClick(View paramView)
  {
    paramView.performHapticFeedback(1);
    a(paramView);
    a();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.q = findViewById(R.id.divider);
    int i1 = 0;
    while (i1 < this.c.length)
    {
      this.c[i1] = 0;
      i1 += 1;
    }
    this.j = ((UnderlinePageIndicatorPicker)findViewById(R.id.keyboard_indicator));
    this.k = ((ViewPager)findViewById(R.id.keyboard_pager));
    this.k.setOffscreenPageLimit(2);
    this.l = new b(this, (LayoutInflater)this.p.getSystemService("layout_inflater"));
    this.k.setAdapter(this.l);
    this.j.setViewPager(this.k);
    this.k.setCurrentItem(0);
    this.n = ((ExpirationView)findViewById(R.id.date_text));
    this.n.setTheme(this.C);
    this.n.setUnderlinePage(this.j);
    this.n.setOnClick(this);
    this.m = ((ImageButton)findViewById(R.id.delete));
    this.m.setOnClickListener(this);
    this.m.setOnLongClickListener(this);
    c(this.e / 1000);
    c(this.e % 1000 / 100);
    this.k.a(this.k.getCurrentItem() - 1, true);
    d();
    c();
    f();
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = false;
    paramView.performHapticFeedback(0);
    if (paramView == this.m)
    {
      this.m.setPressed(false);
      b();
      f();
      bool = true;
    }
    return bool;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ExpirationPicker.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (ExpirationPicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.d = paramParcelable.a;
    this.c = paramParcelable.b;
    if (this.c == null)
    {
      this.c = new int[this.a];
      this.d = -1;
    }
    this.b = paramParcelable.c;
    f();
  }
  
  public Parcelable onSaveInstanceState()
  {
    ExpirationPicker.SavedState localSavedState = new ExpirationPicker.SavedState(super.onSaveInstanceState());
    localSavedState.c = this.b;
    localSavedState.b = this.c;
    localSavedState.a = this.d;
    return localSavedState;
  }
  
  public void setMinYear(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setSetButton(Button paramButton)
  {
    this.u = paramButton;
    i();
  }
  
  public void setTheme(int paramInt)
  {
    this.C = paramInt;
    if (this.C != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.v = localTypedArray.getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
      this.w = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpKeyBackground, this.w);
      this.x = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpButtonBackground, this.x);
      this.A = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpCheckIcon, this.A);
      this.y = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpTitleDividerColor, this.y);
      this.z = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.z);
      this.B = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpDeleteIcon, this.B);
    }
    e();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\expirationpicker\ExpirationPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */