package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.bf;
import android.support.v4.view.cb;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
{
  private static final int[] F = { 16842912 };
  private Layout A;
  private TransformationMethod B;
  private gg C;
  private final Rect D = new Rect();
  private final aq E;
  private Drawable a;
  private Drawable b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private CharSequence g;
  private CharSequence h;
  private boolean i;
  private int j;
  private int k;
  private float l;
  private float m;
  private VelocityTracker n = VelocityTracker.obtain();
  private int o;
  private float p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private TextPaint x = new TextPaint(1);
  private ColorStateList y;
  private Layout z;
  
  public SwitchCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.switchStyle);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    this.x.density = localResources.getDisplayMetrics().density;
    paramAttributeSet = gm.a(paramContext, paramAttributeSet, R.styleable.SwitchCompat, paramInt, 0);
    this.a = paramAttributeSet.a(R.styleable.SwitchCompat_android_thumb);
    if (this.a != null) {
      this.a.setCallback(this);
    }
    this.b = paramAttributeSet.a(R.styleable.SwitchCompat_track);
    if (this.b != null) {
      this.b.setCallback(this);
    }
    this.g = paramAttributeSet.c(R.styleable.SwitchCompat_android_textOn);
    this.h = paramAttributeSet.c(R.styleable.SwitchCompat_android_textOff);
    this.i = paramAttributeSet.a(R.styleable.SwitchCompat_showText, true);
    this.c = paramAttributeSet.e(R.styleable.SwitchCompat_thumbTextPadding, 0);
    this.d = paramAttributeSet.e(R.styleable.SwitchCompat_switchMinWidth, 0);
    this.e = paramAttributeSet.e(R.styleable.SwitchCompat_switchPadding, 0);
    this.f = paramAttributeSet.a(R.styleable.SwitchCompat_splitTrack, false);
    paramInt = paramAttributeSet.g(R.styleable.SwitchCompat_switchTextAppearance, 0);
    if (paramInt != 0) {
      a(paramContext, paramInt);
    }
    this.E = aq.a();
    paramAttributeSet.a();
    paramContext = ViewConfiguration.get(paramContext);
    this.k = paramContext.getScaledTouchSlop();
    this.o = paramContext.getScaledMinimumFlingVelocity();
    refreshDrawableState();
    setChecked(isChecked());
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  private Layout a(CharSequence paramCharSequence)
  {
    TextPaint localTextPaint;
    if (this.B != null)
    {
      paramCharSequence = this.B.getTransformation(paramCharSequence, this);
      localTextPaint = this.x;
      if (paramCharSequence == null) {
        break label62;
      }
    }
    label62:
    for (int i1 = (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, this.x));; i1 = 0)
    {
      return new StaticLayout(paramCharSequence, localTextPaint, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      break;
    }
  }
  
  private void a()
  {
    if (this.C != null)
    {
      clearAnimation();
      this.C = null;
    }
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    Typeface localTypeface = null;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      a(localTypeface, paramInt2);
      return;
      localTypeface = Typeface.SANS_SERIF;
      continue;
      localTypeface = Typeface.SERIF;
      continue;
      localTypeface = Typeface.MONOSPACE;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(3);
    super.onTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.C != null) {
      a();
    }
    float f2 = this.p;
    if (paramBoolean) {}
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      this.C = new gg(this, f2, f1, null);
      this.C.setDuration(250L);
      this.C.setAnimationListener(new gf(this, paramBoolean));
      startAnimation(this.C);
      return;
    }
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    if (this.a == null) {}
    int i3;
    int i1;
    int i2;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    do
    {
      return false;
      i3 = getThumbOffset();
      this.a.getPadding(this.D);
      i1 = this.u;
      i2 = this.k;
      i3 = i3 + this.t - this.k;
      i4 = this.s;
      i5 = this.D.left;
      i6 = this.D.right;
      i7 = this.k;
      i8 = this.w;
      i9 = this.k;
    } while ((paramFloat1 <= i3) || (paramFloat1 >= i4 + i3 + i5 + i6 + i7) || (paramFloat2 <= i1 - i2) || (paramFloat2 >= i8 + i9));
    return true;
  }
  
  private void b(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    this.j = 0;
    int i1;
    boolean bool2;
    float f1;
    if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
    {
      i1 = 1;
      bool2 = isChecked();
      if (i1 == 0) {
        break label135;
      }
      this.n.computeCurrentVelocity(1000);
      f1 = this.n.getXVelocity();
      if (Math.abs(f1) <= this.o) {
        break label126;
      }
      if (!hc.a(this)) {
        break label114;
      }
      if (f1 >= 0.0F) {
        break label108;
      }
    }
    for (;;)
    {
      if (bool1 != bool2) {
        playSoundEffect(0);
      }
      setChecked(bool1);
      a(paramMotionEvent);
      return;
      i1 = 0;
      break;
      label108:
      bool1 = false;
      continue;
      label114:
      if (f1 <= 0.0F)
      {
        bool1 = false;
        continue;
        label126:
        bool1 = getTargetCheckedState();
        continue;
        label135:
        bool1 = bool2;
      }
    }
  }
  
  private boolean getTargetCheckedState()
  {
    return this.p > 0.5F;
  }
  
  private int getThumbOffset()
  {
    if (hc.a(this)) {}
    for (float f1 = 1.0F - this.p;; f1 = this.p) {
      return (int)(f1 * getThumbScrollRange() + 0.5F);
    }
  }
  
  private int getThumbScrollRange()
  {
    if (this.b != null)
    {
      Rect localRect2 = this.D;
      this.b.getPadding(localRect2);
      if (this.a != null) {}
      for (Rect localRect1 = cq.a(this.a);; localRect1 = cq.a) {
        return this.q - this.s - localRect2.left - localRect2.right - localRect1.left - localRect1.right;
      }
    }
    return 0;
  }
  
  private void setThumbPosition(float paramFloat)
  {
    this.p = paramFloat;
    invalidate();
  }
  
  public void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, R.styleable.TextAppearance);
    ColorStateList localColorStateList = paramContext.getColorStateList(R.styleable.TextAppearance_android_textColor);
    if (localColorStateList != null)
    {
      this.y = localColorStateList;
      paramInt = paramContext.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
      if ((paramInt != 0) && (paramInt != this.x.getTextSize()))
      {
        this.x.setTextSize(paramInt);
        requestLayout();
      }
      a(paramContext.getInt(R.styleable.TextAppearance_android_typeface, -1), paramContext.getInt(R.styleable.TextAppearance_android_textStyle, -1));
      if (!paramContext.getBoolean(R.styleable.TextAppearance_textAllCaps, false)) {
        break label127;
      }
    }
    label127:
    for (this.B = new android.support.v7.c.a(getContext());; this.B = null)
    {
      paramContext.recycle();
      return;
      this.y = getTextColors();
      break;
    }
  }
  
  public void a(Typeface paramTypeface, int paramInt)
  {
    boolean bool = false;
    if (paramInt > 0)
    {
      int i1;
      if (paramTypeface == null)
      {
        paramTypeface = Typeface.defaultFromStyle(paramInt);
        setSwitchTypeface(paramTypeface);
        if (paramTypeface == null) {
          break label88;
        }
        i1 = paramTypeface.getStyle();
        label31:
        paramInt = (i1 ^ 0xFFFFFFFF) & paramInt;
        paramTypeface = this.x;
        if ((paramInt & 0x1) != 0) {
          bool = true;
        }
        paramTypeface.setFakeBoldText(bool);
        paramTypeface = this.x;
        if ((paramInt & 0x2) == 0) {
          break label94;
        }
      }
      label88:
      label94:
      for (float f1 = -0.25F;; f1 = 0.0F)
      {
        paramTypeface.setTextSkewX(f1);
        return;
        paramTypeface = Typeface.create(paramTypeface, paramInt);
        break;
        i1 = 0;
        break label31;
      }
    }
    this.x.setFakeBoldText(false);
    this.x.setTextSkewX(0.0F);
    setSwitchTypeface(paramTypeface);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.D;
    int i2 = this.t;
    int i5 = this.u;
    int i7 = this.v;
    int i6 = this.w;
    int i8 = i2 + getThumbOffset();
    Object localObject;
    int i9;
    label139:
    int i4;
    int i3;
    if (this.a != null)
    {
      localObject = cq.a(this.a);
      if (this.b == null) {
        break label340;
      }
      this.b.getPadding(localRect);
      i9 = localRect.left;
      if (localObject == null) {
        break label320;
      }
      i1 = i2;
      if (((Rect)localObject).left > localRect.left) {
        i1 = i2 + (((Rect)localObject).left - localRect.left);
      }
      if (((Rect)localObject).top <= localRect.top) {
        break label314;
      }
      i2 = ((Rect)localObject).top - localRect.top + i5;
      i4 = i7;
      if (((Rect)localObject).right > localRect.right) {
        i4 = i7 - (((Rect)localObject).right - localRect.right);
      }
      if (((Rect)localObject).bottom <= localRect.bottom) {
        break label307;
      }
      i3 = i6 - (((Rect)localObject).bottom - localRect.bottom);
      label201:
      this.b.setBounds(i1, i2, i4, i3);
    }
    label307:
    label314:
    label320:
    label340:
    for (int i1 = i9 + i8;; i1 = i8)
    {
      if (this.a != null)
      {
        this.a.getPadding(localRect);
        i2 = i1 - localRect.left;
        i1 = i1 + this.s + localRect.right;
        this.a.setBounds(i2, i5, i1, i6);
        localObject = getBackground();
        if (localObject != null) {
          android.support.v4.c.a.a.a((Drawable)localObject, i2, i5, i1, i6);
        }
      }
      super.draw(paramCanvas);
      return;
      localObject = cq.a;
      break;
      i3 = i6;
      break label201;
      i2 = i5;
      break label139;
      i3 = i6;
      i4 = i5;
      i1 = i2;
      i2 = i4;
      i4 = i7;
      break label201;
    }
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    if (this.a != null) {
      android.support.v4.c.a.a.a(this.a, paramFloat1, paramFloat2);
    }
    if (this.b != null) {
      android.support.v4.c.a.a.a(this.b, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.a != null) {
      this.a.setState(arrayOfInt);
    }
    if (this.b != null) {
      this.b.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public int getCompoundPaddingLeft()
  {
    int i1;
    if (!hc.a(this)) {
      i1 = super.getCompoundPaddingLeft();
    }
    int i2;
    do
    {
      return i1;
      i2 = super.getCompoundPaddingLeft() + this.q;
      i1 = i2;
    } while (TextUtils.isEmpty(getText()));
    return i2 + this.e;
  }
  
  public int getCompoundPaddingRight()
  {
    int i1;
    if (hc.a(this)) {
      i1 = super.getCompoundPaddingRight();
    }
    int i2;
    do
    {
      return i1;
      i2 = super.getCompoundPaddingRight() + this.q;
      i1 = i2;
    } while (TextUtils.isEmpty(getText()));
    return i2 + this.e;
  }
  
  public boolean getShowText()
  {
    return this.i;
  }
  
  public boolean getSplitTrack()
  {
    return this.f;
  }
  
  public int getSwitchMinWidth()
  {
    return this.d;
  }
  
  public int getSwitchPadding()
  {
    return this.e;
  }
  
  public CharSequence getTextOff()
  {
    return this.h;
  }
  
  public CharSequence getTextOn()
  {
    return this.g;
  }
  
  public Drawable getThumbDrawable()
  {
    return this.a;
  }
  
  public int getThumbTextPadding()
  {
    return this.c;
  }
  
  public Drawable getTrackDrawable()
  {
    return this.b;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null) {
        this.a.jumpToCurrentState();
      }
      if (this.b != null) {
        this.b.jumpToCurrentState();
      }
      a();
      if (!isChecked()) {
        break label59;
      }
    }
    label59:
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      setThumbPosition(f1);
      return;
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      mergeDrawableStates(arrayOfInt, F);
    }
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1 = this.D;
    Object localObject3 = this.b;
    int i3;
    int i4;
    int i5;
    int i6;
    Object localObject2;
    label151:
    int i2;
    if (localObject3 != null)
    {
      ((Drawable)localObject3).getPadding((Rect)localObject1);
      i3 = this.u;
      i4 = this.w;
      i5 = ((Rect)localObject1).top;
      i6 = ((Rect)localObject1).bottom;
      localObject2 = this.a;
      if (localObject3 != null)
      {
        if ((!this.f) || (localObject2 == null)) {
          break label322;
        }
        Rect localRect = cq.a((Drawable)localObject2);
        ((Drawable)localObject2).copyBounds((Rect)localObject1);
        ((Rect)localObject1).left += localRect.left;
        ((Rect)localObject1).right -= localRect.right;
        i1 = paramCanvas.save();
        paramCanvas.clipRect((Rect)localObject1, Region.Op.DIFFERENCE);
        ((Drawable)localObject3).draw(paramCanvas);
        paramCanvas.restoreToCount(i1);
      }
      i2 = paramCanvas.save();
      if (localObject2 != null) {
        ((Drawable)localObject2).draw(paramCanvas);
      }
      if (!getTargetCheckedState()) {
        break label331;
      }
      localObject1 = this.z;
      label180:
      if (localObject1 != null)
      {
        localObject3 = getDrawableState();
        if (this.y != null) {
          this.x.setColor(this.y.getColorForState((int[])localObject3, 0));
        }
        this.x.drawableState = ((int[])localObject3);
        if (localObject2 == null) {
          break label340;
        }
        localObject2 = ((Drawable)localObject2).getBounds();
        i1 = ((Rect)localObject2).left;
      }
    }
    label322:
    label331:
    label340:
    for (int i1 = ((Rect)localObject2).right + i1;; i1 = getWidth())
    {
      i1 /= 2;
      int i7 = ((Layout)localObject1).getWidth() / 2;
      i3 = (i3 + i5 + (i4 - i6)) / 2;
      i4 = ((Layout)localObject1).getHeight() / 2;
      paramCanvas.translate(i1 - i7, i3 - i4);
      ((Layout)localObject1).draw(paramCanvas);
      paramCanvas.restoreToCount(i2);
      return;
      ((Rect)localObject1).setEmpty();
      break;
      ((Drawable)localObject3).draw(paramCanvas);
      break label151;
      localObject1 = this.A;
      break label180;
    }
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
      if (!isChecked()) {
        break label57;
      }
    }
    CharSequence localCharSequence2;
    label57:
    for (CharSequence localCharSequence1 = this.g;; localCharSequence1 = this.h)
    {
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2)) {
          break;
        }
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
    paramAccessibilityNodeInfo.setText(localStringBuilder);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect1;
    Rect localRect2;
    if (this.a != null)
    {
      localRect1 = this.D;
      if (this.b != null)
      {
        this.b.getPadding(localRect1);
        localRect2 = cq.a(this.a);
        paramInt2 = Math.max(0, localRect2.left - localRect1.left);
      }
    }
    for (paramInt1 = Math.max(0, localRect2.right - localRect1.right);; paramInt1 = i1)
    {
      if (hc.a(this))
      {
        paramInt3 = getPaddingLeft() + paramInt2;
        paramInt4 = this.q + paramInt3 - paramInt2 - paramInt1;
        label113:
        switch (getGravity() & 0x70)
        {
        default: 
          paramInt2 = getPaddingTop();
          paramInt1 = this.r + paramInt2;
        }
      }
      for (;;)
      {
        this.t = paramInt3;
        this.u = paramInt2;
        this.w = paramInt1;
        this.v = paramInt4;
        return;
        localRect1.setEmpty();
        break;
        paramInt4 = getWidth() - getPaddingRight() - paramInt1;
        paramInt3 = paramInt1 + (paramInt2 + (paramInt4 - this.q));
        break label113;
        paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.r / 2;
        paramInt1 = this.r + paramInt2;
        continue;
        paramInt1 = getHeight() - getPaddingBottom();
        paramInt2 = paramInt1 - this.r;
      }
      paramInt2 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i4 = 0;
    if (this.i)
    {
      if (this.z == null) {
        this.z = a(this.g);
      }
      if (this.A == null) {
        this.A = a(this.h);
      }
    }
    Rect localRect = this.D;
    int i1;
    int i3;
    if (this.a != null)
    {
      this.a.getPadding(localRect);
      i2 = this.a.getIntrinsicWidth() - localRect.left - localRect.right;
      i1 = this.a.getIntrinsicHeight();
      if (!this.i) {
        break label303;
      }
      i3 = Math.max(this.z.getWidth(), this.A.getWidth()) + this.c * 2;
      label133:
      this.s = Math.max(i3, i2);
      if (this.b == null) {
        break label309;
      }
      this.b.getPadding(localRect);
    }
    for (int i2 = this.b.getIntrinsicHeight();; i2 = i4)
    {
      int i6 = localRect.left;
      int i5 = localRect.right;
      i4 = i5;
      i3 = i6;
      if (this.a != null)
      {
        localRect = cq.a(this.a);
        i3 = Math.max(i6, localRect.left);
        i4 = Math.max(i5, localRect.right);
      }
      i3 = Math.max(this.d, i4 + (i3 + this.s * 2));
      i1 = Math.max(i2, i1);
      this.q = i3;
      this.r = i1;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i1) {
        setMeasuredDimension(cb.j(this), i1);
      }
      return;
      i1 = 0;
      i2 = 0;
      break;
      label303:
      i3 = 0;
      break label133;
      label309:
      localRect.setEmpty();
    }
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {}
    for (CharSequence localCharSequence = this.g;; localCharSequence = this.h)
    {
      if (localCharSequence != null) {
        paramAccessibilityEvent.getText().add(localCharSequence);
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.n.addMovement(paramMotionEvent);
    switch (bf.a(paramMotionEvent))
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((isEnabled()) && (a(f1, f2)))
      {
        this.j = 1;
        this.l = f1;
        this.m = f2;
        continue;
        switch (this.j)
        {
        case 0: 
        default: 
          break;
        case 1: 
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          if ((Math.abs(f1 - this.l) > this.k) || (Math.abs(f2 - this.m) > this.k))
          {
            this.j = 2;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.l = f1;
            this.m = f2;
            return true;
          }
          break;
        case 2: 
          float f3 = paramMotionEvent.getX();
          int i1 = getThumbScrollRange();
          f1 = f3 - this.l;
          if (i1 != 0) {
            f1 /= i1;
          }
          for (;;)
          {
            f2 = f1;
            if (hc.a(this)) {
              f2 = -f1;
            }
            f1 = a(f2 + this.p, 0.0F, 1.0F);
            if (f1 != this.p)
            {
              this.l = f3;
              setThumbPosition(f1);
            }
            return true;
            if (f1 > 0.0F) {
              f1 = 1.0F;
            } else {
              f1 = -1.0F;
            }
          }
          if (this.j == 2)
          {
            b(paramMotionEvent);
            super.onTouchEvent(paramMotionEvent);
            return true;
          }
          this.j = 0;
          this.n.clear();
        }
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if ((getWindowToken() != null) && (cb.F(this)) && (isShown()))
    {
      a(paramBoolean);
      return;
    }
    a();
    if (paramBoolean) {}
    for (float f1 = 1.0F;; f1 = 0.0F)
    {
      setThumbPosition(f1);
      return;
    }
  }
  
  public void setShowText(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    this.f = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    this.d = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    this.e = paramInt;
    requestLayout();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    if (this.x.getTypeface() != paramTypeface)
    {
      this.x.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    requestLayout();
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    this.g = paramCharSequence;
    requestLayout();
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    this.a = paramDrawable;
    requestLayout();
  }
  
  public void setThumbResource(int paramInt)
  {
    setThumbDrawable(this.E.a(getContext(), paramInt));
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    this.c = paramInt;
    requestLayout();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    this.b = paramDrawable;
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    setTrackDrawable(this.E.a(getContext(), paramInt));
  }
  
  public void toggle()
  {
    if (!isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.a) || (paramDrawable == this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */