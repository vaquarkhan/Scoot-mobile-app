package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.R.dimen;
import android.support.design.R.id;
import android.support.design.R.layout;
import android.support.design.R.styleable;
import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Snackbar$SnackbarLayout
  extends LinearLayout
{
  private TextView a;
  private Button b;
  private int c;
  private int d;
  private bm e;
  private bl f;
  
  public Snackbar$SnackbarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SnackbarLayout);
    this.c = paramAttributeSet.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
    this.d = paramAttributeSet.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
    if (paramAttributeSet.hasValue(R.styleable.SnackbarLayout_elevation)) {
      cb.j(this, paramAttributeSet.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
    }
    paramAttributeSet.recycle();
    setClickable(true);
    LayoutInflater.from(paramContext).inflate(R.layout.design_layout_snackbar_include, this);
    cb.d(this, 1);
    cb.c(this, 1);
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2)
  {
    if (cb.A(paramView))
    {
      cb.a(paramView, cb.m(paramView), paramInt1, cb.n(paramView), paramInt2);
      return;
    }
    paramView.setPadding(paramView.getPaddingLeft(), paramInt1, paramView.getPaddingRight(), paramInt2);
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    if (paramInt1 != getOrientation())
    {
      setOrientation(paramInt1);
      bool = true;
    }
    if ((this.a.getPaddingTop() != paramInt2) || (this.a.getPaddingBottom() != paramInt3))
    {
      a(this.a, paramInt2, paramInt3);
      bool = true;
    }
    return bool;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    cb.c(this.a, 0.0F);
    cb.s(this.a).a(1.0F).a(paramInt2).b(paramInt1).c();
    if (this.b.getVisibility() == 0)
    {
      cb.c(this.b, 0.0F);
      cb.s(this.b).a(1.0F).a(paramInt2).b(paramInt1).c();
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    cb.c(this.a, 1.0F);
    cb.s(this.a).a(0.0F).a(paramInt2).b(paramInt1).c();
    if (this.b.getVisibility() == 0)
    {
      cb.c(this.b, 1.0F);
      cb.s(this.b).a(0.0F).a(paramInt2).b(paramInt1).c();
    }
  }
  
  Button getActionView()
  {
    return this.b;
  }
  
  TextView getMessageView()
  {
    return this.a;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.f != null) {
      this.f.a(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.f != null) {
      this.f.b(this);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(R.id.snackbar_text));
    this.b = ((Button)findViewById(R.id.snackbar_action));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.e != null) {
      this.e.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = paramInt1;
    if (this.c > 0)
    {
      i = paramInt1;
      if (getMeasuredWidth() > this.c)
      {
        i = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        super.onMeasure(i, paramInt2);
      }
    }
    int j = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
    int k = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
    if (this.a.getLayout().getLineCount() > 1)
    {
      paramInt1 = 1;
      if ((paramInt1 == 0) || (this.d <= 0) || (this.b.getMeasuredWidth() <= this.d)) {
        break label142;
      }
      if (!a(1, j, j - k)) {
        break label170;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        super.onMeasure(i, paramInt2);
      }
      return;
      paramInt1 = 0;
      break;
      label142:
      if (paramInt1 != 0) {}
      for (paramInt1 = j;; paramInt1 = k)
      {
        if (!a(0, paramInt1, paramInt1)) {
          break label170;
        }
        paramInt1 = 1;
        break;
      }
      label170:
      paramInt1 = 0;
    }
  }
  
  void setOnAttachStateChangeListener(bl parambl)
  {
    this.f = parambl;
  }
  
  void setOnLayoutChangeListener(bm parambm)
  {
    this.e = parambm;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\Snackbar$SnackbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */