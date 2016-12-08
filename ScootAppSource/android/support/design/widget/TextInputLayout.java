package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.R.color;
import android.support.design.R.string;
import android.support.design.R.style;
import android.support.design.R.styleable;
import android.support.v4.b.c;
import android.support.v4.c.a.q;
import android.support.v4.view.en;
import android.support.v4.widget.Space;
import android.support.v7.widget.aq;
import android.support.v7.widget.cq;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TextInputLayout
  extends LinearLayout
{
  private EditText a;
  private boolean b;
  private CharSequence c;
  private Paint d;
  private LinearLayout e;
  private int f;
  private boolean g;
  private TextView h;
  private int i;
  private boolean j;
  private CharSequence k;
  private boolean l;
  private TextView m;
  private int n;
  private int o;
  private int p;
  private boolean q;
  private ColorStateList r;
  private ColorStateList s;
  private final o t = new o(this);
  private boolean u;
  private cf v;
  private boolean w;
  
  public TextInputLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    ce.a(paramContext);
    setOrientation(1);
    setWillNotDraw(false);
    setAddStatesFromChildren(true);
    this.t.a(a.b);
    this.t.b(new AccelerateInterpolator());
    this.t.d(8388659);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.TextInputLayout, paramInt, R.style.Widget_Design_TextInputLayout);
    this.b = paramContext.getBoolean(R.styleable.TextInputLayout_hintEnabled, true);
    setHint(paramContext.getText(R.styleable.TextInputLayout_android_hint));
    this.u = paramContext.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
    if (paramContext.hasValue(R.styleable.TextInputLayout_android_textColorHint))
    {
      paramAttributeSet = paramContext.getColorStateList(R.styleable.TextInputLayout_android_textColorHint);
      this.s = paramAttributeSet;
      this.r = paramAttributeSet;
    }
    if (paramContext.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
      setHintTextAppearance(paramContext.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, 0));
    }
    this.i = paramContext.getResourceId(R.styleable.TextInputLayout_errorTextAppearance, 0);
    boolean bool1 = paramContext.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
    boolean bool2 = paramContext.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
    setCounterMaxLength(paramContext.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
    this.o = paramContext.getResourceId(R.styleable.TextInputLayout_counterTextAppearance, 0);
    this.p = paramContext.getResourceId(R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
    paramContext.recycle();
    setErrorEnabled(bool1);
    setCounterEnabled(bool2);
    if (android.support.v4.view.cb.e(this) == 0) {
      android.support.v4.view.cb.c(this, 1);
    }
    android.support.v4.view.cb.a(this, new cd(this, null));
  }
  
  private LinearLayout.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {}
    for (paramLayoutParams = (LinearLayout.LayoutParams)paramLayoutParams; this.b; paramLayoutParams = new LinearLayout.LayoutParams(paramLayoutParams))
    {
      if (this.d == null) {
        this.d = new Paint();
      }
      this.d.setTypeface(this.t.b());
      this.d.setTextSize(this.t.d());
      paramLayoutParams.topMargin = ((int)-this.d.ascent());
      return paramLayoutParams;
    }
    paramLayoutParams.topMargin = 0;
    return paramLayoutParams;
  }
  
  private void a()
  {
    android.support.v4.view.cb.a(this.e, android.support.v4.view.cb.m(this.a), 0, android.support.v4.view.cb.n(this.a), this.a.getPaddingBottom());
  }
  
  private void a(float paramFloat)
  {
    if (this.t.c() == paramFloat) {
      return;
    }
    if (this.v == null)
    {
      this.v = cy.a();
      this.v.a(a.a);
      this.v.a(200);
      this.v.a(new cb(this));
    }
    this.v.a(this.t.c(), paramFloat);
    this.v.a();
  }
  
  private void a(int paramInt)
  {
    boolean bool2 = this.q;
    if (this.n == -1)
    {
      this.m.setText(String.valueOf(paramInt));
      this.q = false;
      if ((this.a != null) && (bool2 != this.q))
      {
        a(false);
        b();
      }
      return;
    }
    boolean bool1;
    label66:
    TextView localTextView;
    Context localContext;
    if (paramInt > this.n)
    {
      bool1 = true;
      this.q = bool1;
      if (bool2 != this.q)
      {
        localTextView = this.m;
        localContext = getContext();
        if (!this.q) {
          break label158;
        }
      }
    }
    label158:
    for (int i1 = this.p;; i1 = this.o)
    {
      localTextView.setTextAppearance(localContext, i1);
      this.m.setText(getContext().getString(R.string.character_counter_pattern, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.n) }));
      break;
      bool1 = false;
      break label66;
    }
  }
  
  private static void a(Drawable paramDrawable)
  {
    paramDrawable.clearColorFilter();
    if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22))
    {
      if (!(paramDrawable instanceof InsetDrawable)) {
        break label38;
      }
      a(((InsetDrawable)paramDrawable).getDrawable());
    }
    for (;;)
    {
      return;
      label38:
      if ((paramDrawable instanceof q))
      {
        a(((q)paramDrawable).a());
        return;
      }
      if ((paramDrawable instanceof DrawableContainer))
      {
        paramDrawable = (DrawableContainer.DrawableContainerState)((DrawableContainer)paramDrawable).getConstantState();
        if (paramDrawable != null)
        {
          int i1 = 0;
          int i2 = paramDrawable.getChildCount();
          while (i1 < i2)
          {
            a(paramDrawable.getChild(i1));
            i1 += 1;
          }
        }
      }
    }
  }
  
  private void a(TextView paramTextView)
  {
    if (this.e != null)
    {
      this.e.removeView(paramTextView);
      int i1 = this.f - 1;
      this.f = i1;
      if (i1 == 0) {
        this.e.setVisibility(8);
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt)
  {
    if (this.e == null)
    {
      this.e = new LinearLayout(getContext());
      this.e.setOrientation(0);
      addView(this.e, -1, -2);
      Space localSpace = new Space(getContext());
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, 0, 1.0F);
      this.e.addView(localSpace, localLayoutParams);
      if (this.a != null) {
        a();
      }
    }
    this.e.setVisibility(0);
    this.e.addView(paramTextView, paramInt);
    this.f += 1;
  }
  
  private void a(boolean paramBoolean)
  {
    int i2 = 1;
    int i1;
    boolean bool;
    if ((this.a != null) && (!TextUtils.isEmpty(this.a.getText())))
    {
      i1 = 1;
      bool = a(getDrawableState(), 16842908);
      if (TextUtils.isEmpty(getError())) {
        break label119;
      }
      label46:
      if (this.r != null) {
        this.t.b(this.r.getDefaultColor());
      }
      if ((!this.q) || (this.m == null)) {
        break label124;
      }
      this.t.a(this.m.getCurrentTextColor());
    }
    for (;;)
    {
      if ((i1 == 0) && (!bool) && (i2 == 0)) {
        break label177;
      }
      b(paramBoolean);
      return;
      i1 = 0;
      break;
      label119:
      i2 = 0;
      break label46;
      label124:
      if ((bool) && (this.s != null)) {
        this.t.a(this.s.getDefaultColor());
      } else if (this.r != null) {
        this.t.a(this.r.getDefaultColor());
      }
    }
    label177:
    c(paramBoolean);
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int i2 = paramArrayOfInt.length;
    int i1 = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < i2)
      {
        if (paramArrayOfInt[i1] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  private void b()
  {
    c();
    Drawable localDrawable2 = this.a.getBackground();
    if (localDrawable2 == null) {
      return;
    }
    Drawable localDrawable1 = localDrawable2;
    if (cq.c(localDrawable2)) {
      localDrawable1 = localDrawable2.mutate();
    }
    if ((this.j) && (this.h != null))
    {
      localDrawable1.setColorFilter(aq.a(this.h.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    if ((this.q) && (this.m != null))
    {
      localDrawable1.setColorFilter(aq.a(this.m.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
      return;
    }
    a(localDrawable1);
    this.a.refreshDrawableState();
  }
  
  private void b(boolean paramBoolean)
  {
    if ((this.v != null) && (this.v.b())) {
      this.v.e();
    }
    if ((paramBoolean) && (this.u))
    {
      a(1.0F);
      return;
    }
    this.t.b(1.0F);
  }
  
  private void c()
  {
    int i1 = Build.VERSION.SDK_INT;
    if ((i1 != 21) && (i1 != 22)) {}
    Drawable localDrawable2;
    do
    {
      Drawable localDrawable1;
      do
      {
        return;
        localDrawable1 = this.a.getBackground();
      } while ((localDrawable1 == null) || (this.w));
      localDrawable2 = localDrawable1.getConstantState().newDrawable();
      if ((localDrawable1 instanceof DrawableContainer)) {
        this.w = aa.a((DrawableContainer)localDrawable1, localDrawable2.getConstantState());
      }
    } while (this.w);
    this.a.setBackgroundDrawable(localDrawable2);
    this.w = true;
  }
  
  private void c(boolean paramBoolean)
  {
    if ((this.v != null) && (this.v.b())) {
      this.v.e();
    }
    if ((paramBoolean) && (this.u))
    {
      a(0.0F);
      return;
    }
    this.t.b(0.0F);
  }
  
  private void setEditText(EditText paramEditText)
  {
    if (this.a != null) {
      throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    if (!(paramEditText instanceof bx)) {
      Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
    }
    this.a = paramEditText;
    this.t.a(this.a.getTypeface());
    this.t.a(this.a.getTextSize());
    int i1 = this.a.getGravity();
    this.t.d(0x800007 & i1 | 0x30);
    this.t.c(i1);
    this.a.addTextChangedListener(new by(this));
    if (this.r == null) {
      this.r = this.a.getHintTextColors();
    }
    if ((this.b) && (TextUtils.isEmpty(this.c)))
    {
      setHint(this.a.getHint());
      this.a.setHint(null);
    }
    if (this.m != null) {
      a(this.a.getText().length());
    }
    if (this.e != null) {
      a();
    }
    a(false);
  }
  
  private void setHintInternal(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
    this.t.a(paramCharSequence);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof EditText))
    {
      setEditText((EditText)paramView);
      super.addView(paramView, 0, a(paramLayoutParams));
      return;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.b) {
      this.t.a(paramCanvas);
    }
  }
  
  public int getCounterMaxLength()
  {
    return this.n;
  }
  
  public EditText getEditText()
  {
    return this.a;
  }
  
  public CharSequence getError()
  {
    if (this.g) {
      return this.k;
    }
    return null;
  }
  
  public CharSequence getHint()
  {
    if (this.b) {
      return this.c;
    }
    return null;
  }
  
  public Typeface getTypeface()
  {
    return this.t.b();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.b) && (this.a != null))
    {
      paramInt1 = this.a.getLeft() + this.a.getCompoundPaddingLeft();
      paramInt3 = this.a.getRight() - this.a.getCompoundPaddingRight();
      this.t.a(paramInt1, this.a.getTop() + this.a.getCompoundPaddingTop(), paramInt3, this.a.getBottom() - this.a.getCompoundPaddingBottom());
      this.t.b(paramInt1, getPaddingTop(), paramInt3, paramInt4 - paramInt2 - getPaddingBottom());
      this.t.e();
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof TextInputLayout.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (TextInputLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setError(paramParcelable.a);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState()
  {
    TextInputLayout.SavedState localSavedState = new TextInputLayout.SavedState(super.onSaveInstanceState());
    if (this.j) {
      localSavedState.a = getError();
    }
    return localSavedState;
  }
  
  public void refreshDrawableState()
  {
    super.refreshDrawableState();
    a(android.support.v4.view.cb.F(this));
  }
  
  public void setCounterEnabled(boolean paramBoolean)
  {
    if (this.l != paramBoolean)
    {
      if (!paramBoolean) {
        break label131;
      }
      this.m = new TextView(getContext());
      this.m.setMaxLines(1);
    }
    for (;;)
    {
      try
      {
        this.m.setTextAppearance(getContext(), this.o);
        a(this.m, -1);
        if (this.a == null)
        {
          a(0);
          this.l = paramBoolean;
          return;
        }
      }
      catch (Exception localException)
      {
        this.m.setTextAppearance(getContext(), R.style.TextAppearance_AppCompat_Caption);
        this.m.setTextColor(c.c(getContext(), R.color.design_textinput_error_color_light));
        continue;
        a(this.a.getText().length());
        continue;
      }
      label131:
      a(this.m);
      this.m = null;
    }
  }
  
  public void setCounterMaxLength(int paramInt)
  {
    if (this.n != paramInt)
    {
      if (paramInt <= 0) {
        break label39;
      }
      this.n = paramInt;
      if (this.l) {
        if (this.a != null) {
          break label47;
        }
      }
    }
    label39:
    label47:
    for (paramInt = 0;; paramInt = this.a.getText().length())
    {
      a(paramInt);
      return;
      this.n = -1;
      break;
    }
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    if (TextUtils.equals(this.k, paramCharSequence)) {}
    do
    {
      return;
      this.k = paramCharSequence;
      if (this.g) {
        break;
      }
    } while (TextUtils.isEmpty(paramCharSequence));
    setErrorEnabled(true);
    boolean bool2 = android.support.v4.view.cb.F(this);
    boolean bool1;
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      bool1 = true;
      this.j = bool1;
      android.support.v4.view.cb.s(this.h).b();
      if (!this.j) {
        break label164;
      }
      this.h.setText(paramCharSequence);
      this.h.setVisibility(0);
      if (bool2)
      {
        if (android.support.v4.view.cb.f(this.h) == 1.0F) {
          android.support.v4.view.cb.c(this.h, 0.0F);
        }
        android.support.v4.view.cb.s(this.h).a(1.0F).a(200L).a(a.d).a(new bz(this)).c();
      }
    }
    for (;;)
    {
      b();
      a(true);
      return;
      bool1 = false;
      break;
      label164:
      if (this.h.getVisibility() == 0) {
        if (bool2) {
          android.support.v4.view.cb.s(this.h).a(0.0F).a(200L).a(a.c).a(new ca(this, paramCharSequence)).c();
        } else {
          this.h.setVisibility(4);
        }
      }
    }
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    if (this.g != paramBoolean)
    {
      if (this.h != null) {
        android.support.v4.view.cb.s(this.h).b();
      }
      if (!paramBoolean) {
        break label125;
      }
    }
    for (this.h = new TextView(getContext());; this.h = null)
    {
      try
      {
        this.h.setTextAppearance(getContext(), this.i);
        this.h.setVisibility(4);
        android.support.v4.view.cb.d(this.h, 1);
        a(this.h, 0);
        this.g = paramBoolean;
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.h.setTextAppearance(getContext(), R.style.TextAppearance_AppCompat_Caption);
          this.h.setTextColor(c.c(getContext(), R.color.design_textinput_error_color_light));
        }
      }
      label125:
      this.j = false;
      b();
      a(this.h);
    }
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    if (this.b)
    {
      setHintInternal(paramCharSequence);
      sendAccessibilityEvent(2048);
    }
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean != this.b)
    {
      this.b = paramBoolean;
      localObject = this.a.getHint();
      if (this.b) {
        break label89;
      }
      if ((!TextUtils.isEmpty(this.c)) && (TextUtils.isEmpty((CharSequence)localObject))) {
        this.a.setHint(this.c);
      }
      setHintInternal(null);
    }
    for (;;)
    {
      if (this.a != null)
      {
        localObject = a(this.a.getLayoutParams());
        this.a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      return;
      label89:
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        if (TextUtils.isEmpty(this.c)) {
          setHint((CharSequence)localObject);
        }
        this.a.setHint(null);
      }
    }
  }
  
  public void setHintTextAppearance(int paramInt)
  {
    this.t.e(paramInt);
    this.s = ColorStateList.valueOf(this.t.g());
    if (this.a != null)
    {
      a(false);
      LinearLayout.LayoutParams localLayoutParams = a(this.a.getLayoutParams());
      this.a.setLayoutParams(localLayoutParams);
      this.a.requestLayout();
    }
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    this.t.a(paramTypeface);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\TextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */