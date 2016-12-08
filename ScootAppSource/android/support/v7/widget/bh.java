package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.c;
import android.support.v4.view.bv;
import android.support.v7.appcompat.R.attr;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class bh
  extends Spinner
  implements bv
{
  private static final boolean a;
  private static final boolean b;
  private static final int[] c;
  private aq d;
  private al e;
  private Context f;
  private di g;
  private SpinnerAdapter h;
  private boolean i;
  private bk j;
  private int k;
  private final Rect l;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      a = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      b = bool;
      c = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }
  
  public bh(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.spinnerStyle);
  }
  
  public bh(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  public bh(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this(paramContext, paramAttributeSet, paramInt1, paramInt2, null);
  }
  
  /* Error */
  public bh(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, android.content.res.Resources.Theme paramTheme)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial 62	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new 64	android/graphics/Rect
    //   11: dup
    //   12: invokespecial 66	android/graphics/Rect:<init>	()V
    //   15: putfield 68	android/support/v7/widget/bh:l	Landroid/graphics/Rect;
    //   18: aload_1
    //   19: aload_2
    //   20: getstatic 73	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   23: iload_3
    //   24: iconst_0
    //   25: invokestatic 78	android/support/v7/widget/gm:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/gm;
    //   28: astore 10
    //   30: aload_0
    //   31: invokestatic 83	android/support/v7/widget/aq:a	()Landroid/support/v7/widget/aq;
    //   34: putfield 85	android/support/v7/widget/bh:d	Landroid/support/v7/widget/aq;
    //   37: aload_0
    //   38: new 87	android/support/v7/widget/al
    //   41: dup
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 85	android/support/v7/widget/bh:d	Landroid/support/v7/widget/aq;
    //   47: invokespecial 90	android/support/v7/widget/al:<init>	(Landroid/view/View;Landroid/support/v7/widget/aq;)V
    //   50: putfield 92	android/support/v7/widget/bh:e	Landroid/support/v7/widget/al;
    //   53: aload 5
    //   55: ifnull +285 -> 340
    //   58: aload_0
    //   59: new 94	android/support/v7/view/e
    //   62: dup
    //   63: aload_1
    //   64: aload 5
    //   66: invokespecial 97	android/support/v7/view/e:<init>	(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V
    //   69: putfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   72: aload_0
    //   73: getfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   76: ifnull +184 -> 260
    //   79: iload 4
    //   81: istore 7
    //   83: iload 4
    //   85: iconst_m1
    //   86: if_icmpne +71 -> 157
    //   89: getstatic 35	android/os/Build$VERSION:SDK_INT	I
    //   92: bipush 11
    //   94: if_icmplt +359 -> 453
    //   97: aload_1
    //   98: aload_2
    //   99: getstatic 42	android/support/v7/widget/bh:c	[I
    //   102: iload_3
    //   103: iconst_0
    //   104: invokevirtual 105	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   107: astore 8
    //   109: iload 4
    //   111: istore 6
    //   113: aload 8
    //   115: astore 5
    //   117: aload 8
    //   119: iconst_0
    //   120: invokevirtual 111	android/content/res/TypedArray:hasValue	(I)Z
    //   123: ifeq +16 -> 139
    //   126: aload 8
    //   128: astore 5
    //   130: aload 8
    //   132: iconst_0
    //   133: iconst_0
    //   134: invokevirtual 115	android/content/res/TypedArray:getInt	(II)I
    //   137: istore 6
    //   139: iload 6
    //   141: istore 7
    //   143: aload 8
    //   145: ifnull +12 -> 157
    //   148: aload 8
    //   150: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   153: iload 6
    //   155: istore 7
    //   157: iload 7
    //   159: iconst_1
    //   160: if_icmpne +100 -> 260
    //   163: new 120	android/support/v7/widget/bk
    //   166: dup
    //   167: aload_0
    //   168: aload_0
    //   169: getfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   172: aload_2
    //   173: iload_3
    //   174: invokespecial 123	android/support/v7/widget/bk:<init>	(Landroid/support/v7/widget/bh;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   177: astore 5
    //   179: aload_0
    //   180: getfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   183: aload_2
    //   184: getstatic 73	android/support/v7/appcompat/R$styleable:Spinner	[I
    //   187: iload_3
    //   188: iconst_0
    //   189: invokestatic 78	android/support/v7/widget/gm:a	(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/gm;
    //   192: astore 8
    //   194: aload_0
    //   195: aload 8
    //   197: getstatic 126	android/support/v7/appcompat/R$styleable:Spinner_android_dropDownWidth	I
    //   200: bipush -2
    //   202: invokevirtual 128	android/support/v7/widget/gm:f	(II)I
    //   205: putfield 130	android/support/v7/widget/bh:k	I
    //   208: aload 5
    //   210: aload 8
    //   212: getstatic 133	android/support/v7/appcompat/R$styleable:Spinner_android_popupBackground	I
    //   215: invokevirtual 136	android/support/v7/widget/gm:a	(I)Landroid/graphics/drawable/Drawable;
    //   218: invokevirtual 139	android/support/v7/widget/bk:a	(Landroid/graphics/drawable/Drawable;)V
    //   221: aload 5
    //   223: aload 10
    //   225: getstatic 142	android/support/v7/appcompat/R$styleable:Spinner_android_prompt	I
    //   228: invokevirtual 145	android/support/v7/widget/gm:d	(I)Ljava/lang/String;
    //   231: invokevirtual 148	android/support/v7/widget/bk:a	(Ljava/lang/CharSequence;)V
    //   234: aload 8
    //   236: invokevirtual 150	android/support/v7/widget/gm:a	()V
    //   239: aload_0
    //   240: aload 5
    //   242: putfield 152	android/support/v7/widget/bh:j	Landroid/support/v7/widget/bk;
    //   245: aload_0
    //   246: new 154	android/support/v7/widget/bi
    //   249: dup
    //   250: aload_0
    //   251: aload_0
    //   252: aload 5
    //   254: invokespecial 157	android/support/v7/widget/bi:<init>	(Landroid/support/v7/widget/bh;Landroid/view/View;Landroid/support/v7/widget/bk;)V
    //   257: putfield 159	android/support/v7/widget/bh:g	Landroid/support/v7/widget/di;
    //   260: aload 10
    //   262: getstatic 162	android/support/v7/appcompat/R$styleable:Spinner_android_entries	I
    //   265: invokevirtual 165	android/support/v7/widget/gm:e	(I)[Ljava/lang/CharSequence;
    //   268: astore 5
    //   270: aload 5
    //   272: ifnull +28 -> 300
    //   275: new 167	android/widget/ArrayAdapter
    //   278: dup
    //   279: aload_1
    //   280: ldc -88
    //   282: aload 5
    //   284: invokespecial 171	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   287: astore_1
    //   288: aload_1
    //   289: getstatic 176	android/support/v7/appcompat/R$layout:support_simple_spinner_dropdown_item	I
    //   292: invokevirtual 180	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   295: aload_0
    //   296: aload_1
    //   297: invokevirtual 184	android/support/v7/widget/bh:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   300: aload 10
    //   302: invokevirtual 150	android/support/v7/widget/gm:a	()V
    //   305: aload_0
    //   306: iconst_1
    //   307: putfield 186	android/support/v7/widget/bh:i	Z
    //   310: aload_0
    //   311: getfield 188	android/support/v7/widget/bh:h	Landroid/widget/SpinnerAdapter;
    //   314: ifnull +16 -> 330
    //   317: aload_0
    //   318: aload_0
    //   319: getfield 188	android/support/v7/widget/bh:h	Landroid/widget/SpinnerAdapter;
    //   322: invokevirtual 184	android/support/v7/widget/bh:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   325: aload_0
    //   326: aconst_null
    //   327: putfield 188	android/support/v7/widget/bh:h	Landroid/widget/SpinnerAdapter;
    //   330: aload_0
    //   331: getfield 92	android/support/v7/widget/bh:e	Landroid/support/v7/widget/al;
    //   334: aload_2
    //   335: iload_3
    //   336: invokevirtual 191	android/support/v7/widget/al:a	(Landroid/util/AttributeSet;I)V
    //   339: return
    //   340: aload 10
    //   342: getstatic 194	android/support/v7/appcompat/R$styleable:Spinner_popupTheme	I
    //   345: iconst_0
    //   346: invokevirtual 196	android/support/v7/widget/gm:g	(II)I
    //   349: istore 6
    //   351: iload 6
    //   353: ifeq +20 -> 373
    //   356: aload_0
    //   357: new 94	android/support/v7/view/e
    //   360: dup
    //   361: aload_1
    //   362: iload 6
    //   364: invokespecial 199	android/support/v7/view/e:<init>	(Landroid/content/Context;I)V
    //   367: putfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   370: goto -298 -> 72
    //   373: getstatic 37	android/support/v7/widget/bh:a	Z
    //   376: ifne +15 -> 391
    //   379: aload_1
    //   380: astore 5
    //   382: aload_0
    //   383: aload 5
    //   385: putfield 99	android/support/v7/widget/bh:f	Landroid/content/Context;
    //   388: goto -316 -> 72
    //   391: aconst_null
    //   392: astore 5
    //   394: goto -12 -> 382
    //   397: astore 9
    //   399: aconst_null
    //   400: astore 8
    //   402: aload 8
    //   404: astore 5
    //   406: ldc -55
    //   408: ldc -53
    //   410: aload 9
    //   412: invokestatic 208	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   415: pop
    //   416: iload 4
    //   418: istore 7
    //   420: aload 8
    //   422: ifnull -265 -> 157
    //   425: aload 8
    //   427: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   430: iload 4
    //   432: istore 7
    //   434: goto -277 -> 157
    //   437: astore_1
    //   438: aconst_null
    //   439: astore 5
    //   441: aload 5
    //   443: ifnull +8 -> 451
    //   446: aload 5
    //   448: invokevirtual 118	android/content/res/TypedArray:recycle	()V
    //   451: aload_1
    //   452: athrow
    //   453: iconst_1
    //   454: istore 7
    //   456: goto -299 -> 157
    //   459: astore_1
    //   460: goto -19 -> 441
    //   463: astore 9
    //   465: goto -63 -> 402
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	468	0	this	bh
    //   0	468	1	paramContext	Context
    //   0	468	2	paramAttributeSet	AttributeSet
    //   0	468	3	paramInt1	int
    //   0	468	4	paramInt2	int
    //   0	468	5	paramTheme	android.content.res.Resources.Theme
    //   111	252	6	m	int
    //   81	374	7	n	int
    //   107	319	8	localObject	Object
    //   397	14	9	localException1	Exception
    //   463	1	9	localException2	Exception
    //   28	313	10	localgm	gm
    // Exception table:
    //   from	to	target	type
    //   97	109	397	java/lang/Exception
    //   97	109	437	finally
    //   117	126	459	finally
    //   130	139	459	finally
    //   406	416	459	finally
    //   117	126	463	java/lang/Exception
    //   130	139	463	java/lang/Exception
  }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int m = Math.max(0, getSelectedItemPosition());
    int i5 = Math.min(paramSpinnerAdapter.getCount(), m + 15);
    int n = Math.max(0, m - (15 - (i5 - m)));
    View localView = null;
    int i1 = 0;
    m = 0;
    if (n < i5)
    {
      int i2 = paramSpinnerAdapter.getItemViewType(n);
      if (i2 == m) {
        break label204;
      }
      localView = null;
      m = i2;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(n, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(i3, i4);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      n += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.l);
        return this.l.left + this.l.right + i1;
      }
      return i1;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.e != null) {
      this.e.c();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    if (this.j != null) {
      return this.j.f();
    }
    if (b) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public int getDropDownVerticalOffset()
  {
    if (this.j != null) {
      return this.j.g();
    }
    if (b) {
      return super.getDropDownVerticalOffset();
    }
    return 0;
  }
  
  public int getDropDownWidth()
  {
    if (this.j != null) {
      return this.k;
    }
    if (b) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public Drawable getPopupBackground()
  {
    if (this.j != null) {
      return this.j.d();
    }
    if (b) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public Context getPopupContext()
  {
    if (this.j != null) {
      return this.f;
    }
    if (a) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public CharSequence getPrompt()
  {
    if (this.j != null) {
      return this.j.a();
    }
    return super.getPrompt();
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.e != null) {
      return this.e.a();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.e != null) {
      return this.e.b();
    }
    return null;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.j != null) && (this.j.k())) {
      this.j.i();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.j != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.g != null) && (this.g.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    if (this.j != null)
    {
      if (!this.j.k()) {
        this.j.c();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.i) {
      this.h = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.j == null);
    if (this.f == null) {}
    for (Context localContext = getContext();; localContext = this.f)
    {
      this.j.a(new bj(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.e != null) {
      this.e.a(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.e != null) {
      this.e.a(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.j != null) {
      this.j.b(paramInt);
    }
    while (!b) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.j != null) {
      this.j.c(paramInt);
    }
    while (!b) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (this.j != null) {
      this.k = paramInt;
    }
    while (!b) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.j != null) {
      this.j.a(paramDrawable);
    }
    while (!b) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(c.a(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.j != null)
    {
      this.j.a(paramCharSequence);
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.e != null) {
      this.e.a(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != null) {
      this.e.a(paramMode);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */