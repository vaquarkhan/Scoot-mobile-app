package com.codetroopers.betterpickers.hmspicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
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
import com.codetroopers.betterpickers.R.styleable;

public class HmsPicker
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  protected int a = 5;
  protected final Button[] b = new Button[10];
  protected int[] c = new int[this.a];
  protected int d = -1;
  protected ImageButton e;
  protected Button f;
  protected Button g;
  protected HmsView h;
  protected final Context i;
  protected View j;
  private TextView k;
  private TextView l;
  private TextView m;
  private Button n;
  private ColorStateList o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t = -1;
  
  public HmsPicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public HmsPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = paramContext;
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.o = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.p = R.drawable.key_background_dark;
    this.q = R.drawable.button_background_dark;
    this.r = getResources().getColor(R.color.default_divider_color_dark);
    this.s = R.drawable.ic_backspace_dark;
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
        localButton.setTextColor(this.o);
        localButton.setBackgroundResource(this.p);
      }
      i1 += 1;
    }
    if (this.j != null) {
      this.j.setBackgroundColor(this.r);
    }
    if (this.k != null)
    {
      this.k.setTextColor(this.o);
      this.k.setBackgroundResource(this.p);
    }
    if (this.l != null)
    {
      this.l.setTextColor(this.o);
      this.l.setBackgroundResource(this.p);
    }
    if (this.m != null)
    {
      this.m.setTextColor(this.o);
      this.m.setBackgroundResource(this.p);
    }
    if (this.e != null)
    {
      this.e.setBackgroundResource(this.q);
      this.e.setImageDrawable(getResources().getDrawable(this.s));
    }
    if (this.h != null) {
      this.h.setTheme(this.t);
    }
  }
  
  private void e()
  {
    c();
    f();
    a();
  }
  
  private void f()
  {
    boolean bool = false;
    if (this.n == null) {
      return;
    }
    if (this.d == -1)
    {
      this.n.setEnabled(false);
      return;
    }
    Button localButton = this.n;
    if (this.d >= 0) {
      bool = true;
    }
    localButton.setEnabled(bool);
  }
  
  public void a()
  {
    if (this.d != -1) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.e != null) {
        this.e.setEnabled(bool);
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
      if ((paramView == this.e) && (this.d >= 0))
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
    this.h.a(this.c[4], this.c[3], this.c[2], this.c[1], this.c[0]);
  }
  
  public int getHours()
  {
    return this.c[4];
  }
  
  protected int getLayoutId()
  {
    return R.layout.hms_picker_view;
  }
  
  public int getMinutes()
  {
    return this.c[3] * 10 + this.c[2];
  }
  
  public int getSeconds()
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
    View localView1 = findViewById(R.id.first);
    View localView2 = findViewById(R.id.second);
    View localView3 = findViewById(R.id.third);
    View localView4 = findViewById(R.id.fourth);
    this.h = ((HmsView)findViewById(R.id.hms_text));
    this.e = ((ImageButton)findViewById(R.id.delete));
    this.e.setOnClickListener(this);
    this.e.setOnLongClickListener(this);
    this.b[1] = ((Button)localView1.findViewById(R.id.key_left));
    this.b[2] = ((Button)localView1.findViewById(R.id.key_middle));
    this.b[3] = ((Button)localView1.findViewById(R.id.key_right));
    this.b[4] = ((Button)localView2.findViewById(R.id.key_left));
    this.b[5] = ((Button)localView2.findViewById(R.id.key_middle));
    this.b[6] = ((Button)localView2.findViewById(R.id.key_right));
    this.b[7] = ((Button)localView3.findViewById(R.id.key_left));
    this.b[8] = ((Button)localView3.findViewById(R.id.key_middle));
    this.b[9] = ((Button)localView3.findViewById(R.id.key_right));
    this.f = ((Button)localView4.findViewById(R.id.key_left));
    this.b[0] = ((Button)localView4.findViewById(R.id.key_middle));
    this.g = ((Button)localView4.findViewById(R.id.key_right));
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
    this.k = ((TextView)findViewById(R.id.hours_label));
    this.l = ((TextView)findViewById(R.id.minutes_label));
    this.m = ((TextView)findViewById(R.id.seconds_label));
    this.j = findViewById(R.id.divider);
    d();
    e();
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = false;
    paramView.performHapticFeedback(0);
    if (paramView == this.e)
    {
      this.e.setPressed(false);
      b();
      e();
      bool = true;
    }
    return bool;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof HmsPicker.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (HmsPicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.d = paramParcelable.a;
    this.c = paramParcelable.b;
    if (this.c == null)
    {
      this.c = new int[this.a];
      this.d = -1;
    }
    e();
  }
  
  public Parcelable onSaveInstanceState()
  {
    HmsPicker.SavedState localSavedState = new HmsPicker.SavedState(super.onSaveInstanceState());
    localSavedState.b = this.c;
    localSavedState.a = this.d;
    return localSavedState;
  }
  
  protected void setLeftRightEnabled(boolean paramBoolean)
  {
    this.f.setEnabled(paramBoolean);
    this.g.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.f.setContentDescription(null);
      this.g.setContentDescription(null);
    }
  }
  
  public void setSetButton(Button paramButton)
  {
    this.n = paramButton;
    f();
  }
  
  public void setTheme(int paramInt)
  {
    this.t = paramInt;
    if (this.t != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.o = localTypedArray.getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
      this.p = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpKeyBackground, this.p);
      this.q = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpButtonBackground, this.q);
      this.r = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpDividerColor, this.r);
      this.s = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpDeleteIcon, this.s);
    }
    d();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\hmspicker\HmsPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */