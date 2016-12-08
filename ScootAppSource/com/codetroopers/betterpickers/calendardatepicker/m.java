package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.view.cb;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.dimen;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.c;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

public abstract class m
  extends View
{
  protected static int a = 32;
  protected static int b = 10;
  protected static int c = 1;
  protected static int d;
  protected static int e;
  protected static int f;
  protected static int g;
  protected static int h;
  protected static float i = 0.0F;
  protected int A = 7;
  protected int B = this.A;
  protected int C = -1;
  protected int D = -1;
  protected int E = -1;
  protected int F = -1;
  protected int G;
  protected int H;
  protected int I;
  protected int J;
  protected int K;
  private String L;
  private String M;
  private final Formatter N;
  private final StringBuilder O;
  private final Calendar P;
  private final Calendar Q;
  private final n R;
  private int S = 6;
  private o T;
  private boolean U;
  private int V = 0;
  protected int j = 0;
  protected Paint k;
  protected Paint l;
  protected Paint m;
  protected Paint n;
  protected Paint o;
  protected int p = -1;
  protected int q = -1;
  protected int r = -1;
  protected int s;
  protected int t;
  protected int u;
  protected int v = a;
  protected boolean w = false;
  protected int x = -1;
  protected int y = -1;
  protected int z = 1;
  
  public m(Context paramContext)
  {
    super(paramContext);
    paramContext = paramContext.getResources();
    this.Q = Calendar.getInstance();
    this.P = Calendar.getInstance();
    this.L = paramContext.getString(R.string.day_of_week_label_typeface);
    this.M = paramContext.getString(R.string.sans_serif);
    this.G = paramContext.getColor(R.color.date_picker_text_normal);
    this.H = paramContext.getColor(R.color.date_picker_text_disabled);
    this.I = paramContext.getColor(R.color.bpBlue);
    this.J = paramContext.getColor(R.color.date_picker_text_normal);
    this.K = paramContext.getColor(R.color.circle_background);
    this.O = new StringBuilder(50);
    this.N = new Formatter(this.O, Locale.getDefault());
    d = paramContext.getDimensionPixelSize(R.dimen.day_number_size);
    e = paramContext.getDimensionPixelSize(R.dimen.month_label_size);
    f = paramContext.getDimensionPixelSize(R.dimen.month_day_label_text_size);
    g = paramContext.getDimensionPixelOffset(R.dimen.month_list_item_header_height);
    h = paramContext.getDimensionPixelSize(R.dimen.day_number_select_circle_radius);
    this.v = ((paramContext.getDimensionPixelOffset(R.dimen.date_picker_view_animator_height) - g) / 6);
    this.R = new n(this, this);
    cb.a(this, this.R);
    cb.c(this, 1);
    this.U = true;
    a();
  }
  
  private boolean a(int paramInt)
  {
    return ((this.F < 0) || (paramInt <= this.F)) && ((this.E < 0) || (paramInt >= this.E));
  }
  
  private boolean a(int paramInt, Time paramTime)
  {
    return (this.t == paramTime.year) && (this.s == paramTime.month) && (paramInt == paramTime.monthDay);
  }
  
  private void b(int paramInt)
  {
    if (this.T != null) {
      this.T.a(this, new l(this.t, this.s, paramInt));
    }
    this.R.a(paramInt, 1);
  }
  
  private void b(Canvas paramCanvas)
  {
    int i1 = (this.u + this.j * 2) / 2;
    int i2 = (g - f) / 2;
    int i3 = e / 3;
    paramCanvas.drawText(getMonthAndYearString(), i1, i2 + i3, this.l);
  }
  
  private void c(Canvas paramCanvas)
  {
    int i2 = g;
    int i3 = f / 2;
    int i4 = (this.u - this.j * 2) / (this.A * 2);
    int i1 = 0;
    while (i1 < this.A)
    {
      int i5 = this.z;
      int i6 = this.A;
      int i7 = this.j;
      this.Q.set(7, (i5 + i1) % i6);
      paramCanvas.drawText(this.Q.getDisplayName(7, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()), (i1 * 2 + 1) * i4 + i7, i2 - i3, this.o);
      i1 += 1;
    }
  }
  
  private int d()
  {
    int i1 = e();
    int i2 = (this.B + i1) / this.A;
    if ((i1 + this.B) % this.A > 0) {}
    for (i1 = 1;; i1 = 0) {
      return i1 + i2;
    }
  }
  
  private int e()
  {
    if (this.V < this.z) {}
    for (int i1 = this.V + this.A;; i1 = this.V) {
      return i1 - this.z;
    }
  }
  
  private String getMonthAndYearString()
  {
    this.O.setLength(0);
    long l1 = this.P.getTimeInMillis();
    return DateUtils.formatDateRange(getContext(), this.N, l1, l1, 52, Time.getCurrentTimezone()).toString();
  }
  
  public int a(float paramFloat1, float paramFloat2)
  {
    int i1 = this.j;
    if ((paramFloat1 < i1) || (paramFloat1 > this.u - this.j)) {
      i1 = -1;
    }
    int i2;
    do
    {
      return i1;
      i2 = (int)(paramFloat2 - g) / this.v;
      i2 = (int)((paramFloat1 - i1) * this.A / (this.u - i1 - this.j)) - e() + 1 + i2 * this.A;
      if (i2 < 1) {
        break;
      }
      i1 = i2;
    } while (i2 <= this.B);
    return -1;
  }
  
  protected void a()
  {
    this.l = new Paint();
    this.l.setFakeBoldText(true);
    this.l.setAntiAlias(true);
    this.l.setTextSize(e);
    this.l.setTypeface(Typeface.create(this.M, 1));
    this.l.setColor(this.G);
    this.l.setTextAlign(Paint.Align.CENTER);
    this.l.setStyle(Paint.Style.FILL);
    this.m = new Paint();
    this.m.setFakeBoldText(true);
    this.m.setAntiAlias(true);
    this.m.setColor(this.K);
    this.m.setTextAlign(Paint.Align.CENTER);
    this.m.setStyle(Paint.Style.FILL);
    this.n = new Paint();
    this.n.setFakeBoldText(true);
    this.n.setAntiAlias(true);
    this.n.setColor(this.I);
    this.n.setTextAlign(Paint.Align.CENTER);
    this.n.setStyle(Paint.Style.FILL);
    this.n.setAlpha(60);
    this.o = new Paint();
    this.o.setAntiAlias(true);
    this.o.setTextSize(f);
    this.o.setColor(this.G);
    this.o.setTypeface(Typeface.create(this.L, 0));
    this.o.setStyle(Paint.Style.FILL);
    this.o.setTextAlign(Paint.Align.CENTER);
    this.o.setFakeBoldText(true);
    this.k = new Paint();
    this.k.setAntiAlias(true);
    this.k.setTextSize(d);
    this.k.setStyle(Paint.Style.FILL);
    this.k.setTextAlign(Paint.Align.CENTER);
    this.k.setFakeBoldText(false);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int i3 = (this.v + d) / 2 - c + g;
    int i6 = (this.u - this.j * 2) / (this.A * 2);
    int i1 = e();
    int i2 = 1;
    while (i2 <= this.B)
    {
      int i4 = (i1 * 2 + 1) * i6 + this.j;
      int i5 = i3 - ((this.v + d) / 2 - c);
      int i7 = this.v;
      a(paramCanvas, this.t, this.s, i2, i4, i3, i4 - i6, i4 + i6, i5, i5 + i7, a(i2));
      i5 = i1 + 1;
      i1 = i5;
      i4 = i3;
      if (i5 == this.A)
      {
        i1 = 0;
        i4 = i3 + this.v;
      }
      i2 += 1;
      i3 = i4;
    }
  }
  
  public abstract void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean);
  
  public boolean a(l paraml)
  {
    if ((paraml.a != this.t) || (paraml.b != this.s) || (paraml.c > this.B)) {
      return false;
    }
    this.R.b(paraml.c);
    return true;
  }
  
  public void b()
  {
    this.S = 6;
    requestLayout();
  }
  
  public void c()
  {
    this.R.d();
  }
  
  public l getAccessibilityFocus()
  {
    int i1 = this.R.c();
    if (i1 >= 0) {
      return new l(this.t, this.s, i1);
    }
    return null;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    b(paramCanvas);
    c(paramCanvas);
    a(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), this.v * this.S + g);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.u = paramInt1;
    this.R.b();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      int i1 = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (i1 >= 0) {
        b(i1);
      }
    }
  }
  
  public void setAccessibilityDelegate(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    if ((!this.U) && (Build.VERSION.SDK_INT >= 14)) {
      super.setAccessibilityDelegate(paramAccessibilityDelegate);
    }
  }
  
  public void setMonthParams(HashMap<String, Integer> paramHashMap)
  {
    if ((!paramHashMap.containsKey("month")) && (!paramHashMap.containsKey("year"))) {
      throw new InvalidParameterException("You must specify month and year for this view");
    }
    setTag(paramHashMap);
    if (paramHashMap.containsKey("height"))
    {
      this.v = ((Integer)paramHashMap.get("height")).intValue();
      if (this.v < b) {
        this.v = b;
      }
    }
    if (paramHashMap.containsKey("selected_day")) {
      this.x = ((Integer)paramHashMap.get("selected_day")).intValue();
    }
    if (paramHashMap.containsKey("range_min")) {
      this.E = ((Integer)paramHashMap.get("range_min")).intValue();
    }
    if (paramHashMap.containsKey("range_max")) {
      this.F = ((Integer)paramHashMap.get("range_max")).intValue();
    }
    this.s = ((Integer)paramHashMap.get("month")).intValue();
    this.t = ((Integer)paramHashMap.get("year")).intValue();
    Time localTime = new Time(Time.getCurrentTimezone());
    localTime.setToNow();
    this.w = false;
    this.y = -1;
    this.P.set(2, this.s);
    this.P.set(1, this.t);
    this.P.set(5, 1);
    this.V = this.P.get(7);
    if (paramHashMap.containsKey("week_start")) {}
    for (this.z = ((Integer)paramHashMap.get("week_start")).intValue();; this.z = this.P.getFirstDayOfWeek())
    {
      this.B = c.a(this.s, this.t);
      int i1 = 0;
      while (i1 < this.B)
      {
        int i2 = i1 + 1;
        if (a(i2, localTime))
        {
          this.w = true;
          this.y = i2;
        }
        i1 += 1;
      }
    }
    this.S = d();
    this.R.b();
  }
  
  public void setOnDayClickListener(o paramo)
  {
    this.T = paramo;
  }
  
  public void setTheme(TypedArray paramTypedArray)
  {
    this.K = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor2, R.color.circle_background);
    this.I = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue);
    this.H = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.ampm_text_color);
    this.J = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.ampm_text_color);
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */