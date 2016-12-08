package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.c.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class bo
{
  private static final int[] b = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private static final int[] c = { R.attr.textAllCaps };
  final TextView a;
  private gk d;
  private gk e;
  private gk f;
  private gk g;
  
  bo(TextView paramTextView)
  {
    this.a = paramTextView;
  }
  
  static bo a(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new bp(paramTextView);
    }
    return new bo(paramTextView);
  }
  
  protected static gk a(Context paramContext, aq paramaq, int paramInt)
  {
    paramContext = paramaq.b(paramContext, paramInt);
    if (paramContext != null)
    {
      paramaq = new gk();
      paramaq.d = true;
      paramaq.a = paramContext;
      return paramaq;
    }
    return null;
  }
  
  void a()
  {
    if ((this.d != null) || (this.e != null) || (this.f != null) || (this.g != null))
    {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.d);
      a(arrayOfDrawable[1], this.e);
      a(arrayOfDrawable[2], this.f);
      a(arrayOfDrawable[3], this.g);
    }
  }
  
  void a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, c);
    if (paramContext.hasValue(0)) {
      a(paramContext.getBoolean(0, false));
    }
    paramContext.recycle();
  }
  
  final void a(Drawable paramDrawable, gk paramgk)
  {
    if ((paramDrawable != null) && (paramgk != null)) {
      aq.a(paramDrawable, paramgk, this.a.getDrawableState());
    }
  }
  
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    int j = 1;
    Context localContext = this.a.getContext();
    Object localObject = aq.a();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    int i = localTypedArray.getResourceId(0, -1);
    if (localTypedArray.hasValue(1)) {
      this.d = a(localContext, (aq)localObject, localTypedArray.getResourceId(1, 0));
    }
    if (localTypedArray.hasValue(2)) {
      this.e = a(localContext, (aq)localObject, localTypedArray.getResourceId(2, 0));
    }
    if (localTypedArray.hasValue(3)) {
      this.f = a(localContext, (aq)localObject, localTypedArray.getResourceId(3, 0));
    }
    if (localTypedArray.hasValue(4)) {
      this.g = a(localContext, (aq)localObject, localTypedArray.getResourceId(4, 0));
    }
    localTypedArray.recycle();
    boolean bool;
    if (!(this.a.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      if (i == -1) {
        break label268;
      }
      localObject = localContext.obtainStyledAttributes(i, R.styleable.TextAppearance);
      if (!((TypedArray)localObject).hasValue(R.styleable.TextAppearance_textAllCaps)) {
        break label260;
      }
      bool = ((TypedArray)localObject).getBoolean(R.styleable.TextAppearance_textAllCaps, false);
      i = 1;
      ((TypedArray)localObject).recycle();
    }
    for (;;)
    {
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, c, paramInt, 0);
      if (paramAttributeSet.hasValue(0)) {
        bool = paramAttributeSet.getBoolean(0, false);
      }
      for (paramInt = j;; paramInt = i)
      {
        paramAttributeSet.recycle();
        if (paramInt != 0) {
          a(bool);
        }
        return;
      }
      label260:
      i = 0;
      bool = false;
      break;
      label268:
      i = 0;
      bool = false;
    }
  }
  
  void a(boolean paramBoolean)
  {
    TextView localTextView = this.a;
    if (paramBoolean) {}
    for (a locala = new a(this.a.getContext());; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */