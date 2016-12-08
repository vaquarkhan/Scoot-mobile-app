package com.codetroopers.betterpickers.datepicker;

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
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DatePicker
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static int x = -1;
  private static int y = -1;
  private static int z = -1;
  private Button A;
  private boolean B = false;
  private ColorStateList C;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private int J = -1;
  protected int a = 2;
  protected int b = 4;
  protected int c = -1;
  protected int[] d = new int[this.a];
  protected int[] e = new int[this.b];
  protected int f = -1;
  protected int g = -1;
  protected final Button[] h = new Button[12];
  protected final Button[] i = new Button[10];
  protected final Button[] j = new Button[10];
  protected Button k;
  protected Button l;
  protected Button m;
  protected ImageButton n;
  protected UnderlinePageIndicatorPicker o;
  protected ViewPager p;
  protected b q;
  protected ImageButton r;
  protected DateView s;
  protected String[] t;
  protected final Context u;
  protected View v;
  private char[] w;
  
  public DatePicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.u = paramContext;
    this.w = DateFormat.getDateFormatOrder(this.u);
    this.t = e();
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.C = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.D = R.drawable.key_background_dark;
    this.E = R.drawable.button_background_dark;
    this.F = getResources().getColor(R.color.default_divider_color_dark);
    this.G = getResources().getColor(R.color.default_keyboard_indicator_color_dark);
    this.I = R.drawable.ic_backspace_dark;
    this.H = R.drawable.ic_check_dark;
  }
  
  public static String[] a(Locale paramLocale)
  {
    int i2 = 0;
    int i1;
    SimpleDateFormat localSimpleDateFormat;
    if (paramLocale != null)
    {
      i1 = 1;
      if (i1 == 0) {
        break label125;
      }
      localSimpleDateFormat = new SimpleDateFormat("MMM", paramLocale);
      label23:
      if (i1 == 0) {
        break label138;
      }
    }
    String[] arrayOfString;
    label125:
    label138:
    for (paramLocale = new GregorianCalendar(paramLocale);; paramLocale = new GregorianCalendar())
    {
      paramLocale.set(1, 0);
      paramLocale.set(5, 1);
      paramLocale.set(11, 0);
      paramLocale.set(12, 0);
      paramLocale.set(13, 0);
      paramLocale.set(14, 0);
      arrayOfString = new String[12];
      i1 = i2;
      while (i1 < arrayOfString.length)
      {
        paramLocale.set(2, i1);
        arrayOfString[i1] = localSimpleDateFormat.format(paramLocale.getTime()).toUpperCase();
        i1 += 1;
      }
      i1 = 0;
      break;
      localSimpleDateFormat = new SimpleDateFormat("MMM");
      break label23;
    }
    return arrayOfString;
  }
  
  private void d(int paramInt)
  {
    if (this.f < this.a - 1)
    {
      int i1 = this.f;
      while (i1 >= 0)
      {
        this.d[(i1 + 1)] = this.d[i1];
        i1 -= 1;
      }
      this.f += 1;
      this.d[0] = paramInt;
    }
    if (((getDayOfMonth() >= 4) || ((getMonthOfYear() == 1) && (getDayOfMonth() >= 3))) && (this.p.getCurrentItem() < 2)) {
      this.p.a(this.p.getCurrentItem() + 1, true);
    }
  }
  
  private void e(int paramInt)
  {
    if (this.g < this.b - 1)
    {
      int i1 = this.g;
      while (i1 >= 0)
      {
        this.e[(i1 + 1)] = this.e[i1];
        i1 -= 1;
      }
      this.g += 1;
      this.e[0] = paramInt;
    }
    if ((getYear() >= 1000) && (this.p.getCurrentItem() < 2)) {
      this.p.a(this.p.getCurrentItem() + 1, true);
    }
  }
  
  public static String[] e()
  {
    return a(Locale.getDefault());
  }
  
  private void f()
  {
    int i2 = 0;
    Button[] arrayOfButton = this.h;
    int i3 = arrayOfButton.length;
    int i1 = 0;
    Button localButton;
    while (i1 < i3)
    {
      localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.C);
        localButton.setBackgroundResource(this.D);
      }
      i1 += 1;
    }
    arrayOfButton = this.i;
    i3 = arrayOfButton.length;
    i1 = 0;
    while (i1 < i3)
    {
      localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.C);
        localButton.setBackgroundResource(this.D);
      }
      i1 += 1;
    }
    arrayOfButton = this.j;
    i3 = arrayOfButton.length;
    i1 = i2;
    while (i1 < i3)
    {
      localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.C);
        localButton.setBackgroundResource(this.D);
      }
      i1 += 1;
    }
    if (this.o != null) {
      this.o.setSelectedColor(this.G);
    }
    if (this.v != null) {
      this.v.setBackgroundColor(this.F);
    }
    if (this.k != null)
    {
      this.k.setTextColor(this.C);
      this.k.setBackgroundResource(this.D);
    }
    if (this.n != null)
    {
      this.n.setBackgroundResource(this.D);
      this.n.setImageDrawable(getResources().getDrawable(this.H));
    }
    if (this.r != null)
    {
      this.r.setBackgroundResource(this.E);
      this.r.setImageDrawable(getResources().getDrawable(this.I));
    }
    if (this.l != null)
    {
      this.l.setTextColor(this.C);
      this.l.setBackgroundResource(this.D);
    }
    if (this.m != null)
    {
      this.m.setTextColor(this.C);
      this.m.setBackgroundResource(this.D);
    }
    if (this.s != null) {
      this.s.setTheme(this.J);
    }
  }
  
  private void g()
  {
    m();
    c();
    n();
    a();
    i();
    j();
    k();
  }
  
  private void h()
  {
    if (this.p.getCurrentItem() < 2) {
      this.p.a(this.p.getCurrentItem() + 1, true);
    }
  }
  
  private void i()
  {
    int i2 = getDayOfMonth();
    int i1 = 0;
    while (i1 < this.h.length)
    {
      if (this.h[i1] != null) {
        this.h[i1].setEnabled(true);
      }
      i1 += 1;
    }
    if ((i2 > 29) && (this.h[1] != null)) {
      this.h[1].setEnabled(false);
    }
    if (i2 > 30)
    {
      if (this.h[3] != null) {
        this.h[3].setEnabled(false);
      }
      if (this.h[5] != null) {
        this.h[5].setEnabled(false);
      }
      if (this.h[8] != null) {
        this.h[8].setEnabled(false);
      }
      if (this.h[10] != null) {
        this.h[10].setEnabled(false);
      }
    }
  }
  
  private void j()
  {
    int i1 = getDayOfMonth();
    if (i1 >= 4)
    {
      setDateKeyRange(-1);
      return;
    }
    if (i1 >= 3)
    {
      if (this.c == 1)
      {
        setDateKeyRange(-1);
        return;
      }
      if ((this.c == 3) || (this.c == 5) || (this.c == 8) || (this.c == 10))
      {
        setDateKeyRange(0);
        return;
      }
      setDateKeyRange(1);
      return;
    }
    if (i1 >= 2)
    {
      setDateKeyRange(9);
      return;
    }
    if (i1 >= 1)
    {
      setDateKeyRange(9);
      return;
    }
    setDateMinKeyRange(1);
  }
  
  private void k()
  {
    int i1 = getYear();
    if (i1 >= 1000)
    {
      setYearKeyRange(-1);
      return;
    }
    if (i1 >= 1)
    {
      setYearKeyRange(9);
      return;
    }
    setYearMinKeyRange(1);
  }
  
  private boolean l()
  {
    return getDayOfMonth() > 0;
  }
  
  private void m()
  {
    if (this.n != null) {
      this.n.setEnabled(l());
    }
  }
  
  private void n()
  {
    if (this.A == null) {
      return;
    }
    Button localButton = this.A;
    if ((getDayOfMonth() > 0) && ((this.B) || (getYear() > 0)) && (getMonthOfYear() >= 0)) {}
    for (boolean bool = true;; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }
  
  private void setDateKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.i.length)
    {
      Button localButton;
      if (this.i[i1] != null)
      {
        localButton = this.i[i1];
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
  
  private void setDateMinKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.i.length)
    {
      Button localButton;
      if (this.i[i1] != null)
      {
        localButton = this.i[i1];
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
  
  private void setYearKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.j.length)
    {
      Button localButton;
      if (this.j[i1] != null)
      {
        localButton = this.j[i1];
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
    if (i1 < this.j.length)
    {
      Button localButton;
      if (this.j[i1] != null)
      {
        localButton = this.j[i1];
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
    if ((this.c != -1) || (this.f != -1) || (this.g != -1)) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.r != null) {
        this.r.setEnabled(bool);
      }
      return;
    }
  }
  
  protected void a(View paramView)
  {
    if (paramView == this.r) {
      switch (this.w[this.p.getCurrentItem()])
      {
      }
    }
    for (;;)
    {
      g();
      return;
      if (this.c != -1)
      {
        this.c = -1;
        continue;
        int i1;
        if (this.f >= 0)
        {
          i1 = 0;
          while (i1 < this.f)
          {
            this.d[i1] = this.d[(i1 + 1)];
            i1 += 1;
          }
          this.d[this.f] = 0;
          this.f -= 1;
        }
        else if (this.p.getCurrentItem() > 0)
        {
          this.p.a(this.p.getCurrentItem() - 1, true);
          continue;
          if (this.g >= 0)
          {
            i1 = 0;
            while (i1 < this.g)
            {
              this.e[i1] = this.e[(i1 + 1)];
              i1 += 1;
            }
            this.e[this.g] = 0;
            this.g -= 1;
          }
          else if (this.p.getCurrentItem() > 0)
          {
            this.p.a(this.p.getCurrentItem() - 1, true);
            continue;
            if (paramView == this.n)
            {
              h();
            }
            else if (paramView == this.s.getDate())
            {
              this.p.setCurrentItem(y);
            }
            else if (paramView == this.s.getMonth())
            {
              this.p.setCurrentItem(x);
            }
            else if (paramView == this.s.getYear())
            {
              this.p.setCurrentItem(z);
            }
            else if (paramView.getTag(R.id.date_keyboard).equals("month"))
            {
              this.c = ((Integer)paramView.getTag(R.id.date_month_int)).intValue();
              if (this.p.getCurrentItem() < 2) {
                this.p.a(this.p.getCurrentItem() + 1, true);
              }
            }
            else if (paramView.getTag(R.id.date_keyboard).equals("date"))
            {
              d(((Integer)paramView.getTag(R.id.numbers_key)).intValue());
            }
            else if (paramView.getTag(R.id.date_keyboard).equals("year"))
            {
              e(((Integer)paramView.getTag(R.id.numbers_key)).intValue());
            }
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
      this.d[i1] = 0;
      i1 += 1;
    }
    i1 = 0;
    while (i1 < this.b)
    {
      this.e[i1] = 0;
      i1 += 1;
    }
    this.f = -1;
    this.g = -1;
    this.c = -1;
    this.p.a(0, true);
    c();
  }
  
  protected void c()
  {
    if (this.c < 0) {}
    for (String str = "";; str = this.t[this.c])
    {
      this.s.a(str, getDayOfMonth(), getYear());
      return;
    }
  }
  
  protected void d()
  {
    if (this.k != null) {
      this.k.setEnabled(false);
    }
    if (this.n != null) {
      this.n.setEnabled(l());
    }
    if (this.l != null) {
      this.l.setEnabled(false);
    }
    if (this.m != null) {
      this.m.setEnabled(false);
    }
  }
  
  public int getDayOfMonth()
  {
    return this.d[1] * 10 + this.d[0];
  }
  
  protected int getLayoutId()
  {
    return R.layout.date_picker_view;
  }
  
  public int getMonthOfYear()
  {
    return this.c;
  }
  
  public int getYear()
  {
    return this.e[3] * 1000 + this.e[2] * 100 + this.e[1] * 10 + this.e[0];
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
    this.v = findViewById(R.id.divider);
    int i1 = 0;
    while (i1 < this.d.length)
    {
      this.d[i1] = 0;
      i1 += 1;
    }
    i1 = 0;
    while (i1 < this.e.length)
    {
      this.e[i1] = 0;
      i1 += 1;
    }
    this.o = ((UnderlinePageIndicatorPicker)findViewById(R.id.keyboard_indicator));
    this.p = ((ViewPager)findViewById(R.id.keyboard_pager));
    this.p.setOffscreenPageLimit(2);
    this.q = new b(this, (LayoutInflater)this.u.getSystemService("layout_inflater"));
    this.p.setAdapter(this.q);
    this.o.setViewPager(this.p);
    this.p.setCurrentItem(0);
    this.s = ((DateView)findViewById(R.id.date_text));
    this.s.setTheme(this.J);
    this.s.setUnderlinePage(this.o);
    this.s.setOnClick(this);
    this.r = ((ImageButton)findViewById(R.id.delete));
    this.r.setOnClickListener(this);
    this.r.setOnLongClickListener(this);
    d();
    c();
    g();
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = false;
    paramView.performHapticFeedback(0);
    if (paramView == this.r)
    {
      this.r.setPressed(false);
      b();
      g();
      bool = true;
    }
    return bool;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof DatePicker.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (DatePicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.f = paramParcelable.a;
    this.g = paramParcelable.b;
    this.d = paramParcelable.c;
    this.e = paramParcelable.d;
    if (this.d == null)
    {
      this.d = new int[this.a];
      this.f = -1;
    }
    if (this.e == null)
    {
      this.e = new int[this.b];
      this.g = -1;
    }
    this.c = paramParcelable.e;
    g();
  }
  
  public Parcelable onSaveInstanceState()
  {
    DatePicker.SavedState localSavedState = new DatePicker.SavedState(super.onSaveInstanceState());
    localSavedState.e = this.c;
    localSavedState.c = this.d;
    localSavedState.a = this.f;
    localSavedState.d = this.e;
    localSavedState.b = this.g;
    return localSavedState;
  }
  
  public void setSetButton(Button paramButton)
  {
    this.A = paramButton;
    n();
  }
  
  public void setTheme(int paramInt)
  {
    this.J = paramInt;
    if (this.J != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.C = localTypedArray.getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
      this.D = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpKeyBackground, this.D);
      this.E = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpButtonBackground, this.E);
      this.H = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpCheckIcon, this.H);
      this.F = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpTitleDividerColor, this.F);
      this.G = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.G);
      this.I = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpDeleteIcon, this.I);
    }
    f();
  }
  
  public void setYearOptional(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\datepicker\DatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */