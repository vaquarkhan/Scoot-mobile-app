package com.codetroopers.betterpickers.numberpicker;

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
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.styleable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberPicker
  extends LinearLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  protected int a = 20;
  protected final Button[] b = new Button[10];
  protected int[] c = new int[this.a];
  protected int d = -1;
  protected Button e;
  protected Button f;
  protected ImageButton g;
  protected NumberView h;
  protected final Context i;
  protected View j;
  private TextView k;
  private NumberPickerErrorTextView l;
  private int m;
  private String n = "";
  private Button o;
  private ColorStateList p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u = -1;
  private Integer v = null;
  private Integer w = null;
  
  public NumberPicker(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = paramContext;
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
    this.p = getResources().getColorStateList(R.color.dialog_text_color_holo_dark);
    this.q = R.drawable.key_background_dark;
    this.r = R.drawable.button_background_dark;
    this.t = R.drawable.ic_backspace_dark;
    this.s = getResources().getColor(R.color.default_divider_color_dark);
  }
  
  private String a(double paramDouble)
  {
    DecimalFormat localDecimalFormat = new DecimalFormat("0.0");
    localDecimalFormat.setMaximumFractionDigits(Integer.MAX_VALUE);
    return localDecimalFormat.format(paramDouble);
  }
  
  private void a(int paramInt)
  {
    if (this.d < this.a - 1)
    {
      if ((this.c[0] == 0) && (this.c[1] == -1) && (!j()) && (paramInt != 10)) {
        this.c[0] = paramInt;
      }
    }
    else {
      return;
    }
    int i1 = this.d;
    while (i1 >= 0)
    {
      this.c[(i1 + 1)] = this.c[i1];
      i1 -= 1;
    }
    this.d += 1;
    this.c[0] = paramInt;
  }
  
  private void e()
  {
    Button[] arrayOfButton = this.b;
    int i2 = arrayOfButton.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Button localButton = arrayOfButton[i1];
      if (localButton != null)
      {
        localButton.setTextColor(this.p);
        localButton.setBackgroundResource(this.q);
      }
      i1 += 1;
    }
    if (this.j != null) {
      this.j.setBackgroundColor(this.s);
    }
    if (this.e != null)
    {
      this.e.setTextColor(this.p);
      this.e.setBackgroundResource(this.q);
    }
    if (this.f != null)
    {
      this.f.setTextColor(this.p);
      this.f.setBackgroundResource(this.q);
    }
    if (this.g != null)
    {
      this.g.setBackgroundResource(this.r);
      this.g.setImageDrawable(getResources().getDrawable(this.t));
    }
    if (this.h != null) {
      this.h.setTheme(this.u);
    }
    if (this.k != null) {
      this.k.setTextColor(this.p);
    }
  }
  
  private void f()
  {
    l();
    c();
    m();
    a();
  }
  
  private void g()
  {
    if (this.k != null) {
      this.k.setText(this.n);
    }
  }
  
  private String getEnteredNumberString()
  {
    int i1 = this.d;
    String str = "";
    if (i1 >= 0)
    {
      if (this.c[i1] == -1) {}
      for (;;)
      {
        i1 -= 1;
        break;
        if (this.c[i1] == 10) {
          str = str + ".";
        } else {
          str = str + this.c[i1];
        }
      }
    }
    return str;
  }
  
  private void h()
  {
    if (this.m == 0)
    {
      this.m = 1;
      return;
    }
    this.m = 0;
  }
  
  private void i()
  {
    if (k()) {
      a(10);
    }
  }
  
  private boolean j()
  {
    boolean bool = false;
    int[] arrayOfInt = this.c;
    int i2 = arrayOfInt.length;
    int i1 = 0;
    while (i1 < i2)
    {
      if (arrayOfInt[i1] == 10) {
        bool = true;
      }
      i1 += 1;
    }
    return bool;
  }
  
  private boolean k()
  {
    return !j();
  }
  
  private void l()
  {
    this.f.setEnabled(k());
  }
  
  private void m()
  {
    boolean bool = false;
    if (this.o == null) {
      return;
    }
    if (this.d == -1)
    {
      this.o.setEnabled(false);
      return;
    }
    Button localButton = this.o;
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
      f();
      return;
      if (paramView == this.g)
      {
        if (this.d >= 0)
        {
          int i1 = 0;
          while (i1 < this.d)
          {
            this.c[i1] = this.c[(i1 + 1)];
            i1 += 1;
          }
          this.c[this.d] = -1;
          this.d -= 1;
        }
      }
      else if (paramView == this.e) {
        h();
      } else if (paramView == this.f) {
        i();
      }
    }
  }
  
  public void b()
  {
    int i1 = 0;
    while (i1 < this.a)
    {
      this.c[i1] = -1;
      i1 += 1;
    }
    this.d = -1;
    c();
  }
  
  protected void c()
  {
    boolean bool4 = false;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool1 = true;
    Object localObject2 = getEnteredNumberString().replaceAll("\\-", "");
    Object localObject1 = ((String)localObject2).split("\\.");
    if (localObject1.length >= 2) {
      if (localObject1[0].equals(""))
      {
        localObject2 = this.h;
        localObject1 = localObject1[1];
        bool2 = j();
        if (this.m == 1) {
          ((NumberView)localObject2).a("0", (String)localObject1, bool2, bool1);
        }
      }
    }
    do
    {
      return;
      bool1 = false;
      break;
      localObject2 = this.h;
      String str = localObject1[0];
      localObject1 = localObject1[1];
      bool3 = j();
      if (this.m == 1) {}
      for (bool1 = bool2;; bool1 = false)
      {
        ((NumberView)localObject2).a(str, (String)localObject1, bool3, bool1);
        return;
      }
      if (localObject1.length == 1)
      {
        localObject2 = this.h;
        localObject1 = localObject1[0];
        bool2 = j();
        if (this.m == 1) {}
        for (bool1 = bool3;; bool1 = false)
        {
          ((NumberView)localObject2).a((String)localObject1, "", bool2, bool1);
          return;
        }
      }
    } while (!((String)localObject2).equals("."));
    localObject1 = this.h;
    bool1 = bool4;
    if (this.m == 1) {
      bool1 = true;
    }
    ((NumberView)localObject1).a("0", "", true, bool1);
  }
  
  protected void d()
  {
    this.e.setEnabled(true);
    this.f.setEnabled(k());
    if (!k()) {
      this.f.setContentDescription(null);
    }
  }
  
  public double getDecimal()
  {
    return BigDecimal.valueOf(getEnteredNumber()).divideAndRemainder(BigDecimal.ONE)[1].doubleValue();
  }
  
  public double getEnteredNumber()
  {
    int i1 = this.d;
    String str1 = "0";
    if ((i1 < 0) || (this.c[i1] == -1))
    {
      String str2 = str1;
      if (this.m == 1) {
        str2 = "-" + str1;
      }
      return Double.parseDouble(str2);
    }
    if (this.c[i1] == 10) {}
    for (str1 = str1 + ".";; str1 = str1 + this.c[i1])
    {
      i1 -= 1;
      break;
    }
  }
  
  public NumberPickerErrorTextView getErrorView()
  {
    return this.l;
  }
  
  public boolean getIsNegative()
  {
    return this.m == 1;
  }
  
  protected int getLayoutId()
  {
    return R.layout.number_picker_view;
  }
  
  public int getNumber()
  {
    return Integer.parseInt(a(getEnteredNumber()).split("\\.|,")[0]);
  }
  
  public void onClick(View paramView)
  {
    paramView.performHapticFeedback(1);
    this.l.b();
    a(paramView);
    a();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.j = findViewById(R.id.divider);
    this.l = ((NumberPickerErrorTextView)findViewById(R.id.error));
    int i1 = 0;
    while (i1 < this.c.length)
    {
      this.c[i1] = -1;
      i1 += 1;
    }
    Object localObject = findViewById(R.id.first);
    View localView1 = findViewById(R.id.second);
    View localView2 = findViewById(R.id.third);
    View localView3 = findViewById(R.id.fourth);
    this.h = ((NumberView)findViewById(R.id.number_text));
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
    d();
    i1 = 0;
    while (i1 < 10)
    {
      this.b[i1].setOnClickListener(this);
      this.b[i1].setText(String.format("%d", new Object[] { Integer.valueOf(i1) }));
      this.b[i1].setTag(R.id.numbers_key, new Integer(i1));
      i1 += 1;
    }
    c();
    localObject = this.i.getResources();
    this.e.setText(((Resources)localObject).getString(R.string.number_picker_plus_minus));
    this.f.setText(((Resources)localObject).getString(R.string.number_picker_seperator));
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.k = ((TextView)findViewById(R.id.label));
    this.m = 0;
    g();
    e();
    f();
  }
  
  public boolean onLongClick(View paramView)
  {
    boolean bool = false;
    paramView.performHapticFeedback(0);
    this.l.b();
    if (paramView == this.g)
    {
      this.g.setPressed(false);
      b();
      f();
      bool = true;
    }
    return bool;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof NumberPicker.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (NumberPicker.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.d = paramParcelable.a;
    this.c = paramParcelable.b;
    if (this.c == null)
    {
      this.c = new int[this.a];
      this.d = -1;
    }
    this.m = paramParcelable.c;
    f();
  }
  
  public Parcelable onSaveInstanceState()
  {
    NumberPicker.SavedState localSavedState = new NumberPicker.SavedState(super.onSaveInstanceState());
    localSavedState.b = this.c;
    localSavedState.c = this.m;
    localSavedState.a = this.d;
    return localSavedState;
  }
  
  public void setDecimalVisibility(int paramInt)
  {
    if (this.f != null) {
      this.f.setVisibility(paramInt);
    }
  }
  
  public void setLabelText(String paramString)
  {
    this.n = paramString;
    g();
  }
  
  public void setMax(int paramInt)
  {
    this.w = Integer.valueOf(paramInt);
  }
  
  public void setMin(int paramInt)
  {
    this.v = Integer.valueOf(paramInt);
  }
  
  public void setPlusMinusVisibility(int paramInt)
  {
    if (this.e != null) {
      this.e.setVisibility(paramInt);
    }
  }
  
  public void setSetButton(Button paramButton)
  {
    this.o = paramButton;
    m();
  }
  
  public void setTheme(int paramInt)
  {
    this.u = paramInt;
    if (this.u != -1)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(paramInt, R.styleable.BetterPickersDialogFragment);
      this.p = localTypedArray.getColorStateList(R.styleable.BetterPickersDialogFragment_bpTextColor);
      this.q = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpKeyBackground, this.q);
      this.r = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpButtonBackground, this.r);
      this.s = localTypedArray.getColor(R.styleable.BetterPickersDialogFragment_bpDividerColor, this.s);
      this.t = localTypedArray.getResourceId(R.styleable.BetterPickersDialogFragment_bpDeleteIcon, this.t);
    }
    e();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\numberpicker\NumberPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */