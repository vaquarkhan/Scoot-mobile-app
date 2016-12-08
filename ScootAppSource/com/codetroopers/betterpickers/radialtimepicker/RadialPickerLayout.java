package com.codetroopers.betterpickers.radialtimepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.a.g;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.codetroopers.betterpickers.R.color;
import com.d.a.s;
import java.util.List;

public class RadialPickerLayout
  extends FrameLayout
  implements View.OnTouchListener
{
  private AccessibilityManager A;
  private com.d.a.d B;
  private Handler C = new Handler();
  private final int a;
  private final int b;
  private int c;
  private com.codetroopers.betterpickers.a d;
  private e e;
  private boolean f;
  private int g;
  private int h;
  private boolean i;
  private boolean j;
  private int k;
  private b l;
  private a m;
  private i n;
  private i o;
  private f p;
  private f q;
  private View r;
  private int[] s;
  private boolean t;
  private int u = -1;
  private boolean v;
  private boolean w;
  private int x;
  private float y;
  private float z;
  
  public RadialPickerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnTouchListener(this);
    this.a = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.b = ViewConfiguration.getTapTimeout();
    this.v = false;
    this.l = new b(paramContext);
    addView(this.l);
    this.m = new a(paramContext);
    addView(this.m);
    this.n = new i(paramContext);
    addView(this.n);
    this.o = new i(paramContext);
    addView(this.o);
    this.p = new f(paramContext);
    addView(this.p);
    this.q = new f(paramContext);
    addView(this.q);
    a();
    this.c = -1;
    this.t = true;
    this.r = new View(paramContext);
    this.r.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.r.setBackgroundColor(getResources().getColor(R.color.bpTransparent_black));
    this.r.setVisibility(4);
    addView(this.r);
    this.A = ((AccessibilityManager)paramContext.getSystemService("accessibility"));
    this.f = false;
  }
  
  private int a(float paramFloat1, float paramFloat2, boolean paramBoolean, Boolean[] paramArrayOfBoolean)
  {
    int i1 = getCurrentItemShowing();
    if (i1 == 0) {
      return this.p.a(paramFloat1, paramFloat2, paramBoolean, paramArrayOfBoolean);
    }
    if (i1 == 1) {
      return this.q.a(paramFloat1, paramFloat2, paramBoolean, paramArrayOfBoolean);
    }
    return -1;
  }
  
  private int a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramInt == -1) {
      return -1;
    }
    int i2 = getCurrentItemShowing();
    int i1;
    label37:
    f localf;
    if ((!paramBoolean2) && (i2 == 1))
    {
      i1 = 1;
      if (i1 == 0) {
        break label128;
      }
      paramInt = b(paramInt);
      if (i2 != 0) {
        break label138;
      }
      localf = this.p;
      i1 = 30;
      label52:
      localf.a(paramInt, paramBoolean1, paramBoolean3);
      localf.invalidate();
      if (i2 != 0) {
        break label178;
      }
      if (!this.i) {
        break label167;
      }
      if ((paramInt != 0) || (!paramBoolean1)) {
        break label151;
      }
      paramInt = 360;
    }
    label128:
    label138:
    label151:
    label167:
    label178:
    label199:
    for (;;)
    {
      i1 = paramInt / i1;
      if ((i2 == 0) && (this.i) && (!paramBoolean1) && (paramInt != 0))
      {
        return i1 + 12;
        i1 = 0;
        break;
        paramInt = d(paramInt, 0);
        break label37;
        localf = this.q;
        i1 = 6;
        break label52;
        if ((paramInt != 360) || (paramBoolean1)) {
          break label199;
        }
        paramInt = 0;
        continue;
        if (paramInt != 0) {
          break label199;
        }
        paramInt = 360;
        continue;
        if ((paramInt != 360) || (i2 != 1)) {
          break label199;
        }
        paramInt = 0;
        continue;
      }
      return i1;
    }
  }
  
  private void a()
  {
    this.s = new int['ũ'];
    int i3 = 0;
    int i1 = 0;
    int i5 = 8;
    int i2 = 1;
    if (i3 < 361)
    {
      this.s[i3] = i1;
      int i4;
      if (i2 == i5)
      {
        i4 = i1 + 6;
        if (i4 == 360)
        {
          i1 = 7;
          label56:
          i2 = 1;
          i5 = i1;
        }
      }
      for (;;)
      {
        i3 += 1;
        i1 = i4;
        break;
        if (i4 % 30 == 0)
        {
          i1 = 14;
          break label56;
        }
        i1 = 4;
        break label56;
        i2 += 1;
        i4 = i1;
      }
    }
  }
  
  private boolean a(int paramInt)
  {
    return (this.i) && (paramInt <= 12) && (paramInt != 0);
  }
  
  private int b(int paramInt)
  {
    if (this.s == null) {
      return -1;
    }
    return this.s[paramInt];
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0)
    {
      c(0, paramInt2);
      this.p.a(paramInt2 % 12 * 30, a(paramInt2), false);
      this.p.invalidate();
    }
    while (paramInt1 != 1) {
      return;
    }
    c(1, paramInt2);
    this.q.a(paramInt2 * 6, false, false);
    this.q.invalidate();
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      this.g = paramInt2;
    }
    do
    {
      do
      {
        return;
        if (paramInt1 == 1)
        {
          this.h = paramInt2;
          return;
        }
      } while (paramInt1 != 2);
      if (paramInt2 == 0)
      {
        this.g %= 12;
        return;
      }
    } while (paramInt2 != 1);
    this.g = (this.g % 12 + 12);
  }
  
  private int d(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 / 30 * 30;
    int i2 = i1 + 30;
    if (paramInt2 == 1) {
      paramInt2 = i2;
    }
    do
    {
      do
      {
        return paramInt2;
        if (paramInt2 != -1) {
          break;
        }
        paramInt2 = i1;
      } while (paramInt1 != i1);
      return i1 - 30;
      paramInt2 = i1;
    } while (paramInt1 - i1 < i2 - paramInt1);
    return i2;
  }
  
  private int getCurrentlyShowingValue()
  {
    int i1 = getCurrentItemShowing();
    if (i1 == 0) {
      return this.g;
    }
    if (i1 == 1) {
      return this.h;
    }
    return -1;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    b(0, paramInt1);
    b(1, paramInt2);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    int i2 = 255;
    if ((paramInt != 0) && (paramInt != 1))
    {
      Log.e("RadialPickerLayout", "TimePicker does not support view at index " + paramInt);
      return;
    }
    int i1 = getCurrentItemShowing();
    this.k = paramInt;
    if ((paramBoolean) && (paramInt != i1))
    {
      s[] arrayOfs = new s[4];
      if (paramInt == 1)
      {
        arrayOfs[0] = this.n.getDisappearAnimator();
        arrayOfs[1] = this.p.getDisappearAnimator();
        arrayOfs[2] = this.o.getReappearAnimator();
        arrayOfs[3] = this.q.getReappearAnimator();
      }
      for (;;)
      {
        if ((this.B != null) && (this.B.d())) {
          this.B.c();
        }
        this.B = new com.d.a.d();
        this.B.a(arrayOfs);
        this.B.a();
        return;
        if (paramInt == 0)
        {
          arrayOfs[0] = this.n.getReappearAnimator();
          arrayOfs[1] = this.p.getReappearAnimator();
          arrayOfs[2] = this.o.getDisappearAnimator();
          arrayOfs[3] = this.q.getDisappearAnimator();
        }
      }
    }
    if (paramInt == 0)
    {
      i1 = 255;
      if (paramInt != 1) {
        break label275;
      }
    }
    label275:
    for (paramInt = i2;; paramInt = 0)
    {
      com.d.c.a.a(this.n, i1);
      com.d.c.a.a(this.p, i1);
      com.d.c.a.a(this.o, paramInt);
      com.d.c.a.a(this.q, paramInt);
      return;
      i1 = 0;
      break;
    }
  }
  
  public void a(Context paramContext, com.codetroopers.betterpickers.a parama, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.f)
    {
      Log.e("RadialPickerLayout", "Time has already been initialized.");
      return;
    }
    this.d = parama;
    this.i = paramBoolean;
    boolean bool;
    int i1;
    label87:
    Resources localResources;
    String[] arrayOfString2;
    String[] arrayOfString1;
    String[] arrayOfString3;
    if (g.a(this.A))
    {
      bool = true;
      this.j = bool;
      this.l.a(paramContext, this.j);
      this.l.invalidate();
      if (!this.j)
      {
        parama = this.m;
        if (paramInt1 >= 12) {
          break label444;
        }
        i1 = 0;
        parama.a(paramContext, i1);
        this.m.invalidate();
      }
      localResources = paramContext.getResources();
      localObject = new int[12];
      Object tmp115_113 = localObject;
      tmp115_113[0] = 12;
      Object tmp120_115 = tmp115_113;
      tmp120_115[1] = 1;
      Object tmp124_120 = tmp120_115;
      tmp124_120[2] = 2;
      Object tmp128_124 = tmp124_120;
      tmp128_124[3] = 3;
      Object tmp132_128 = tmp128_124;
      tmp132_128[4] = 4;
      Object tmp136_132 = tmp132_128;
      tmp136_132[5] = 5;
      Object tmp140_136 = tmp136_132;
      tmp140_136[6] = 6;
      Object tmp146_140 = tmp140_136;
      tmp146_140[7] = 7;
      Object tmp152_146 = tmp146_140;
      tmp152_146[8] = 8;
      Object tmp158_152 = tmp152_146;
      tmp158_152[9] = 9;
      Object tmp164_158 = tmp158_152;
      tmp164_158[10] = 10;
      Object tmp170_164 = tmp164_158;
      tmp170_164[11] = 11;
      tmp170_164;
      arrayOfString2 = new String[12];
      arrayOfString1 = new String[12];
      arrayOfString3 = new String[12];
      i1 = 0;
      label201:
      if (i1 >= 12) {
        break label475;
      }
      if (!paramBoolean) {
        break label450;
      }
    }
    label444:
    label450:
    for (parama = String.format("%02d", new Object[] { Integer.valueOf(new int[] { 0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 }[i1]) });; parama = String.format("%d", new Object[] { Integer.valueOf(localObject[i1]) }))
    {
      arrayOfString2[i1] = parama;
      arrayOfString1[i1] = String.format("%d", new Object[] { Integer.valueOf(localObject[i1]) });
      arrayOfString3[i1] = String.format("%02d", new Object[] { Integer.valueOf(new int[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 }[i1]) });
      i1 += 1;
      break label201;
      bool = this.i;
      break;
      i1 = 1;
      break label87;
    }
    label475:
    Object localObject = this.n;
    if (paramBoolean) {}
    for (parama = arrayOfString1;; parama = null)
    {
      ((i)localObject).a(localResources, arrayOfString2, parama, this.j, true);
      this.n.invalidate();
      this.o.a(localResources, arrayOfString3, null, this.j, false);
      this.o.invalidate();
      c(0, paramInt1);
      c(1, paramInt2);
      this.p.a(paramContext, this.j, paramBoolean, true, paramInt1 % 12 * 30, a(paramInt1));
      this.q.a(paramContext, this.j, false, false, paramInt2 * 6, false);
      this.f = true;
      return;
    }
  }
  
  public boolean a(boolean paramBoolean)
  {
    int i1 = 0;
    if ((this.w) && (!paramBoolean)) {
      return false;
    }
    this.t = paramBoolean;
    View localView = this.r;
    if (paramBoolean) {
      i1 = 4;
    }
    localView.setVisibility(i1);
    return true;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    Object localObject;
    long l1;
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramAccessibilityEvent.getText().clear();
      localObject = new Time();
      ((Time)localObject).hour = getHours();
      ((Time)localObject).minute = getMinutes();
      l1 = ((Time)localObject).normalize(true);
      if (!this.i) {
        break label94;
      }
    }
    label94:
    for (int i1 = 129;; i1 = 1)
    {
      localObject = DateUtils.formatDateTime(getContext(), l1, i1);
      paramAccessibilityEvent.getText().add(localObject);
      return true;
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  public int getCurrentItemShowing()
  {
    if ((this.k != 0) && (this.k != 1))
    {
      Log.e("RadialPickerLayout", "Current item showing was unfortunately set to " + this.k);
      return -1;
    }
    return this.k;
  }
  
  public int getHours()
  {
    return this.g;
  }
  
  public int getIsCurrentlyAmOrPm()
  {
    if (this.g < 12) {
      return 0;
    }
    if (this.g < 24) {
      return 1;
    }
    return -1;
  }
  
  public int getMinutes()
  {
    return this.h;
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.addAction(4096);
    paramAccessibilityNodeInfo.addAction(8192);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    i1 = Math.min(i1, i2);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(i1, paramInt2));
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    paramView = new Boolean[1];
    paramView[0] = Boolean.valueOf(false);
    switch (paramMotionEvent.getAction())
    {
    }
    boolean bool1;
    int i1;
    for (;;)
    {
      bool1 = false;
      do
      {
        do
        {
          do
          {
            do
            {
              return bool1;
              bool1 = bool2;
            } while (!this.t);
            this.y = f1;
            this.z = f2;
            this.c = -1;
            this.v = false;
            this.w = true;
            if (!this.j) {}
            for (this.u = this.m.a(f1, f2); (this.u == 0) || (this.u == 1); this.u = -1)
            {
              this.d.c();
              this.x = -1;
              this.C.postDelayed(new c(this), this.b);
              return true;
            }
            this.x = a(f1, f2, g.a(this.A), paramView);
            bool1 = bool2;
          } while (this.x == -1);
          this.d.c();
          this.C.postDelayed(new d(this, paramView), this.b);
          return true;
          if (!this.t)
          {
            Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
            return true;
          }
          float f3 = Math.abs(f2 - this.z);
          float f4 = Math.abs(f1 - this.y);
          if ((!this.v) && (f4 <= this.a) && (f3 <= this.a)) {
            break;
          }
          if ((this.u == 0) || (this.u == 1))
          {
            this.C.removeCallbacksAndMessages(null);
            if (this.m.a(f1, f2) == this.u) {
              break;
            }
            this.m.setAmOrPmPressed(-1);
            this.m.invalidate();
            this.u = -1;
            break;
          }
          if (this.x == -1) {
            break;
          }
          this.v = true;
          this.C.removeCallbacksAndMessages(null);
          i1 = a(f1, f2, true, paramView);
          bool1 = bool2;
        } while (i1 == -1);
        i1 = a(i1, paramView[0].booleanValue(), false, true);
        bool1 = bool2;
      } while (i1 == this.c);
      this.d.c();
      this.c = i1;
      this.e.a(getCurrentItemShowing(), i1, false);
      return true;
      if (!this.t)
      {
        Log.d("RadialPickerLayout", "Input was disabled, but received ACTION_UP.");
        this.e.a(3, 1, false);
        return true;
      }
      this.C.removeCallbacksAndMessages(null);
      this.w = false;
      if ((this.u != 0) && (this.u != 1)) {
        break;
      }
      i1 = this.m.a(f1, f2);
      this.m.setAmOrPmPressed(-1);
      this.m.invalidate();
      if (i1 == this.u)
      {
        this.m.setAmOrPm(i1);
        if (getIsCurrentlyAmOrPm() != i1)
        {
          this.e.a(2, this.u, false);
          c(2, i1);
        }
      }
      this.u = -1;
    }
    int i2;
    int i3;
    if (this.x != -1)
    {
      i1 = a(f1, f2, this.v, paramView);
      if (i1 != -1)
      {
        bool2 = paramView[0].booleanValue();
        if (this.v) {
          break label752;
        }
        bool1 = true;
        i2 = a(i1, bool2, bool1, false);
        i1 = i2;
        if (getCurrentItemShowing() == 0)
        {
          i1 = i2;
          if (!this.i)
          {
            i3 = getIsCurrentlyAmOrPm();
            if ((i3 != 0) || (i2 != 12)) {
              break label758;
            }
            i1 = 0;
          }
        }
      }
    }
    for (;;)
    {
      c(getCurrentItemShowing(), i1);
      this.e.a(getCurrentItemShowing(), i1, true);
      this.v = false;
      return true;
      label752:
      bool1 = false;
      break;
      label758:
      i1 = i2;
      if (i3 == 1)
      {
        i1 = i2;
        if (i2 != 12) {
          i1 = i2 + 12;
        }
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    boolean bool = false;
    if (super.performAccessibilityAction(paramInt, paramBundle)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramInt == 4096) {
        paramInt = 1;
      }
      while (paramInt != 0)
      {
        int i2 = getCurrentlyShowingValue();
        int i3 = getCurrentItemShowing();
        int i1;
        if (i3 == 0)
        {
          i1 = 30;
          i2 %= 12;
        }
        for (;;)
        {
          label58:
          i2 = d(i2 * i1, paramInt) / i1;
          if (i3 == 0) {
            if (this.i)
            {
              i1 = 23;
              paramInt = 0;
              label88:
              if (i2 <= i1) {
                break label156;
              }
            }
          }
          for (;;)
          {
            b(i3, paramInt);
            this.e.a(i3, paramInt, false);
            return true;
            if (paramInt != 8192) {
              break label178;
            }
            paramInt = -1;
            break;
            if (i3 != 1) {
              break label173;
            }
            i1 = 6;
            break label58;
            i1 = 12;
            paramInt = 1;
            break label88;
            i1 = 55;
            paramInt = 0;
            break label88;
            label156:
            if (i2 < paramInt) {
              paramInt = i1;
            } else {
              paramInt = i2;
            }
          }
          label173:
          i1 = 0;
        }
        label178:
        paramInt = 0;
      }
    }
  }
  
  public void setAmOrPm(int paramInt)
  {
    this.m.setAmOrPm(paramInt);
    this.m.invalidate();
    c(2, paramInt);
  }
  
  public void setOnValueSelectedListener(e parame)
  {
    this.e = parame;
  }
  
  void setTheme(TypedArray paramTypedArray)
  {
    this.l.setTheme(paramTypedArray);
    this.m.setTheme(paramTypedArray);
    this.n.setTheme(paramTypedArray);
    this.o.setTheme(paramTypedArray);
    this.p.setTheme(paramTypedArray);
    this.q.setTheme(paramTypedArray);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\RadialPickerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */