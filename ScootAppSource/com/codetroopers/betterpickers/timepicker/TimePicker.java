package com.codetroopers.betterpickers.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.drawable;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.styleable;
import java.text.DateFormatSymbols;

public class TimePicker
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  protected int a = 4;
  protected final Button[] b = new Button[10];
  protected int[] c = new int[this.a];
  protected int d = -1;
  protected Button e;
  protected Button f;
  protected ImageButton g;
  protected TimerView h;
  protected final Context i;
  protected View j;
  private TextView k;
  private String[] l;
  private final String m;
  private int n;
  private Button o;
  private boolean p = false;
  private ColorStateList q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v = -1;
  
  public TimePicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TimePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = paramContext;
    this.p = a(this.i);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.m = paramContext.getResources().getString(R.string.time_picker_ampm_label);
    this.q = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.r = R.drawable.key_background_dark;
    this.s = R.drawable.button_background_dark;
    this.t = getResources().getColor(R.color.default_divider_color_dark);
    this.u = R.drawable.ic_backspace_dark;
  }
  
  private void a(int paramInt)
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
  }
  
  public static boolean a(Context paramContext)
  {
    return DateFormat.is24HourFormat(paramContext);
  }
  
  private void d()
  {
    Button[] arrayOfButton = this.b;
    int i2 = arrayOfButton.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Button localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.q);
        localButton.setBackgroundResource(this.r);
      }
      i1 += 1;
    }
    if (this.j != null) {
      this.j.setBackgroundColor(this.t);
    }
    if (this.e != null)
    {
      this.e.setTextColor(this.q);
      this.e.setBackgroundResource(this.r);
    }
    if (this.k != null)
    {
      this.k.setTextColor(this.q);
      this.k.setBackgroundResource(this.r);
    }
    if (this.f != null)
    {
      this.f.setTextColor(this.q);
      this.f.setBackgroundResource(this.r);
    }
    if (this.g != null)
    {
      this.g.setBackgroundResource(this.s);
      this.g.setImageDrawable(getResources().getDrawable(this.u));
    }
    if (this.h != null) {
      this.h.setTheme(this.v);
    }
  }
  
  private void e()
  {
    f();
    k();
    c();
    j();
    l();
    a();
  }
  
  private void f()
  {
    if (!this.p)
    {
      switch (this.n)
      {
      default: 
        return;
      case 0: 
        this.k.setText(this.m);
        return;
      case 2: 
        this.k.setText(this.l[0]);
        return;
      }
      this.k.setText(this.l[1]);
      return;
    }
    this.k.setVisibility(4);
    this.n = 3;
  }
  
  private void g()
  {
    getEnteredTime();
    if (!this.p)
    {
      if (i())
      {
        a(0);
        a(0);
      }
      this.n = 2;
    }
    while (!i()) {
      return;
    }
    a(0);
    a(0);
  }
  
  private int getEnteredTime()
  {
    return this.c[3] * 1000 + this.c[2] * 100 + this.c[1] * 10 + this.c[0];
  }
  
  private void h()
  {
    getEnteredTime();
    if (!this.p)
    {
      if (i())
      {
        a(0);
        a(0);
      }
      this.n = 1;
    }
    while (!i()) {
      return;
    }
    a(3);
    a(0);
  }
  
  private boolean i()
  {
    int i1 = getEnteredTime();
    if (!this.p) {
      if ((i1 < 1) || (i1 > 12)) {}
    }
    while ((i1 >= 0) && (i1 <= 23) && (this.d > -1) && (this.d < 2))
    {
      return true;
      return false;
    }
    return false;
  }
  
  private void j()
  {
    int i1 = getEnteredTime();
    if (this.p) {
      if (this.d >= 3) {
        setKeyRange(-1);
      }
    }
    do
    {
      do
      {
        return;
        if (i1 == 0)
        {
          if ((this.d == -1) || (this.d == 0) || (this.d == 2))
          {
            setKeyRange(9);
            return;
          }
          if (this.d == 1)
          {
            setKeyRange(5);
            return;
          }
          setKeyRange(-1);
          return;
        }
        if (i1 == 1)
        {
          if ((this.d == 0) || (this.d == 2))
          {
            setKeyRange(9);
            return;
          }
          if (this.d == 1)
          {
            setKeyRange(5);
            return;
          }
          setKeyRange(-1);
          return;
        }
        if (i1 == 2)
        {
          if ((this.d == 2) || (this.d == 1))
          {
            setKeyRange(9);
            return;
          }
          if (this.d == 0)
          {
            setKeyRange(3);
            return;
          }
          setKeyRange(-1);
          return;
        }
        if (i1 <= 5)
        {
          setKeyRange(9);
          return;
        }
        if (i1 <= 9)
        {
          setKeyRange(5);
          return;
        }
        if ((i1 >= 10) && (i1 <= 15))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 16) && (i1 <= 19))
        {
          setKeyRange(5);
          return;
        }
        if ((i1 >= 20) && (i1 <= 25))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 26) && (i1 <= 29))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 30) && (i1 <= 35))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 36) && (i1 <= 39))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 40) && (i1 <= 45))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 46) && (i1 <= 49))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 50) && (i1 <= 55))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 56) && (i1 <= 59))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 60) && (i1 <= 65))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 70) && (i1 <= 75))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 80) && (i1 <= 85))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 90) && (i1 <= 95))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 100) && (i1 <= 105))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 106) && (i1 <= 109))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 110) && (i1 <= 115))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 116) && (i1 <= 119))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 120) && (i1 <= 125))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 126) && (i1 <= 129))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 130) && (i1 <= 135))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 136) && (i1 <= 139))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 140) && (i1 <= 145))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 146) && (i1 <= 149))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 150) && (i1 <= 155))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 156) && (i1 <= 159))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 160) && (i1 <= 165))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 166) && (i1 <= 169))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 170) && (i1 <= 175))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 176) && (i1 <= 179))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 180) && (i1 <= 185))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 186) && (i1 <= 189))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 190) && (i1 <= 195))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 196) && (i1 <= 199))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 200) && (i1 <= 205))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 206) && (i1 <= 209))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 210) && (i1 <= 215))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 216) && (i1 <= 219))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 220) && (i1 <= 225))
        {
          setKeyRange(9);
          return;
        }
        if ((i1 >= 226) && (i1 <= 229))
        {
          setKeyRange(-1);
          return;
        }
        if ((i1 >= 230) && (i1 <= 235))
        {
          setKeyRange(9);
          return;
        }
      } while (i1 < 236);
      setKeyRange(-1);
      return;
      if (this.n != 0)
      {
        setKeyRange(-1);
        return;
      }
      if (i1 == 0)
      {
        setKeyRange(9);
        this.b[0].setEnabled(false);
        return;
      }
      if (i1 <= 9)
      {
        setKeyRange(5);
        return;
      }
      if (i1 <= 95)
      {
        setKeyRange(9);
        return;
      }
      if ((i1 >= 100) && (i1 <= 105))
      {
        setKeyRange(9);
        return;
      }
      if ((i1 >= 106) && (i1 <= 109))
      {
        setKeyRange(-1);
        return;
      }
      if ((i1 >= 110) && (i1 <= 115))
      {
        setKeyRange(9);
        return;
      }
      if ((i1 >= 116) && (i1 <= 119))
      {
        setKeyRange(-1);
        return;
      }
      if ((i1 >= 120) && (i1 <= 125))
      {
        setKeyRange(9);
        return;
      }
    } while (i1 < 126);
    setKeyRange(-1);
  }
  
  private void k()
  {
    int i1 = getEnteredTime();
    if (this.p)
    {
      boolean bool = i();
      this.e.setEnabled(bool);
      this.f.setEnabled(bool);
      return;
    }
    if (((i1 > 12) && (i1 < 100)) || (i1 == 0) || (this.n != 0))
    {
      this.e.setEnabled(false);
      this.f.setEnabled(false);
      return;
    }
    this.e.setEnabled(true);
    this.f.setEnabled(true);
  }
  
  private void l()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this.o == null) {
      return;
    }
    if (this.d == -1)
    {
      this.o.setEnabled(false);
      return;
    }
    if (this.p)
    {
      int i1 = getEnteredTime();
      localButton = this.o;
      if (this.d >= 2)
      {
        bool1 = bool2;
        if (i1 >= 60) {
          if (i1 <= 95) {
            break label78;
          }
        }
      }
      label78:
      for (bool1 = bool2;; bool1 = false)
      {
        localButton.setEnabled(bool1);
        return;
      }
    }
    Button localButton = this.o;
    if (this.n != 0) {}
    for (;;)
    {
      localButton.setEnabled(bool1);
      return;
      bool1 = false;
    }
  }
  
  private void setKeyRange(int paramInt)
  {
    int i1 = 0;
    if (i1 < this.b.length)
    {
      Button localButton = this.b[i1];
      if (i1 <= paramInt) {}
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
    if (this.d != -1) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.g != null) {
        this.g.setEnabled(bool);
      }
      return;
    }
  }
  
  protected void a(View paramView)
  {
    Integer localInteger = (Integer)paramView.getTag(R.id.numbers_key);
    if (localInteger != null) {
      a(localInteger.intValue());
    }
    for (;;)
    {
      e();
      return;
      if (paramView == this.g)
      {
        if ((!this.p) && (this.n != 0))
        {
          this.n = 0;
        }
        else if (this.d >= 0)
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
      }
      else if (paramView == this.e) {
        g();
      } else if (paramView == this.f) {
        h();
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
    c();
  }
  
  protected void c()
  {
    int i4 = -1;
    getEnteredTime();
    if (this.d > -1)
    {
      if (this.d < 0) {
        break label264;
      }
      i1 = this.c[this.d];
      if (((!this.p) || (i1 < 3) || (i1 > 9)) && ((this.p) || (i1 < 2) || (i1 > 9))) {
        break label264;
      }
    }
    label198:
    label208:
    label243:
    label253:
    label264:
    for (int i1 = -2;; i1 = -1)
    {
      int i2 = i1;
      int i3;
      if (this.d > 0)
      {
        i2 = i1;
        if (this.d < 3)
        {
          i2 = i1;
          if (i1 != -2)
          {
            i3 = this.c[this.d] * 10 + this.c[(this.d - 1)];
            if ((!this.p) || (i3 < 24) || (i3 > 25))
            {
              i2 = i1;
              if (!this.p)
              {
                i2 = i1;
                if (i3 >= 13)
                {
                  i2 = i1;
                  if (i3 > 15) {}
                }
              }
            }
            else
            {
              i2 = -2;
            }
          }
        }
      }
      i1 = i2;
      if (this.d == 3) {
        i1 = this.c[3];
      }
      if (this.d < 2)
      {
        i2 = -1;
        if (this.d >= 1) {
          break label243;
        }
        i3 = -1;
        if (this.d >= 0) {
          break label253;
        }
      }
      for (;;)
      {
        this.h.a(i1, i2, i3, i4);
        return;
        i1 = -1;
        break;
        i2 = this.c[2];
        break label198;
        i3 = this.c[1];
        break label208;
        i4 = this.c[0];
      }
    }
  }
  
  public int getHours()
  {
    int i1 = 12;
    int i3 = this.c[3] * 10 + this.c[2];
    int i2;
    if (i3 == 12) {
      i2 = i1;
    }
    switch (this.n)
    {
    default: 
      if (this.n != 1) {
        break;
      }
    }
    for (;;)
    {
      i2 = i1 + i3;
      return i2;
      return 0;
      return i3;
      i1 = 0;
    }
  }
  
  protected int getLayoutId()
  {
    return R.layout.time_picker_view;
  }
  
  public int getMinutes()
  {
    return this.c[1] * 10 + this.c[0];
  }
  
  public int getTime()
  {
    return this.c[4] * 3600 + this.c[3] * 600 + this.c[2] * 60 + this.c[1] * 10 + this.c[0];
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
    Object localObject = findViewById(R.id.first);
    View localView1 = findViewById(R.id.second);
    View localView2 = findViewById(R.id.third);
    View localView3 = findViewById(R.id.fourth);
    this.h = ((TimerView)findViewById(R.id.timer_time_text));
    this.g = ((ImageButton)findViewById(R.id.delete));
    this.g.setOnClickListener(this);
    this.g.setOnLongClickListener(this);
    this.b[1] = ((Button)((View)localObject).findViewById(R.id.key_left));
    this.b[2] = ((Button)((View)localObject).findViewById(R.id.key_middle));
    this.b[3] = ((Button)((View)localObject).findViewById(R.id.key_right));
    this.b[4] = ((Button)localView1.findViewById(R.id.key_left));
    this.b[5] = ((Button)localView1.findViewById(R.id.key_middle));
    this.b[6] = ((Button)localView1.findViewById(R.id.key_right));
    this.b[7] = ((Button)localView2.findViewById(R.id.key_left));
    this.b[8] = ((Button)localView2.findViewById(R.id.key_middle));
    this.b[9] = ((Button)localView2.findViewById(R.id.key_right));
    this.e = ((Button)localView3.findViewById(R.id.key_left));
    this.b[0] = ((Button)localView3.findViewById(R.id.key_middle));
    this.f = ((Button)localView3.findViewById(R.id.key_right));
    setLeftRightEnabled(false);
    int i1 = 0;
    while (i1 < 10)
    {
      this.b[i1].setOnClickListener(this);
      this.b[i1].setText(String.format("%d", new Object[] { Integer.valueOf(i1) }));
      this.b[i1].setTag(R.id.numbers_key, new Integer(i1));
      i1 += 1;
    }
    c();
    localObject = this.i.getResources();
    this.l = new DateFormatSymbols().getAmPmStrings();
    if (this.p)
    {
      this.e.setText(((Resources)localObject).getString(R.string.time_picker_00_label));
      this.f.setText(((Resources)localObject).getString(R.string.time_picker_30_label));
    }
    for (;;)
    {
      this.e.setOnClickListener(this);
      this.f.setOnClickListener(this);
      this.k = ((TextView)findViewById(R.id.ampm_label));
      this.n = 0;
      this.j = findViewById(R.id.divider);
      d();
      e();
      return;
      this.e.setText(this.l[0]);
      this.f.setText(this.l[1]);
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = false;
    paramView.performHapticFeedback(0);
    if (paramView == this.g)
    {
      this.g.setPressed(false);
      this.n = 0;
      b();
      e();
      bool = true;
    }
    return bool;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof TimePicker.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (TimePicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.d = paramParcelable.a;
    this.c = paramParcelable.b;
    if (this.c == null)
    {
      this.c = new int[this.a];
      this.d = -1;
    }
    this.n = paramParcelable.c;
    e();
  }
  
  public Parcelable onSaveInstanceState()
  {
    TimePicker.SavedState localSavedState = new TimePicker.SavedState(super.onSaveInstanceState());
    localSavedState.b = this.c;
    localSavedState.c = this.n;
    localSavedState.a = this.d;
    return localSavedState;
  }
  
  protected void setLeftRightEnabled(boolean paramBoolean)
  {
    this.e.setEnabled(paramBoolean);
    this.f.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.e.setContentDescription(null);
      this.f.setContentDescription(null);
    }
  }
  
  public void setSetButton(Button paramButton)
  {
    this.o = paramButton;
    l();
  }
  
  public void setTheme(int paramInt)
  {
    this.v = paramInt;
    if (this.v != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.q = localTypedArray.getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
      this.r = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpKeyBackground, this.r);
      this.s = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpButtonBackground, this.s);
      this.t = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpDividerColor, this.t);
      this.u = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpDeleteIcon, this.u);
    }
    d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\timepicker\TimePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */