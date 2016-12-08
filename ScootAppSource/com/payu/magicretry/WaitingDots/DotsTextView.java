package com.payu.magicretry.WaitingDots;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.payu.magicretry.R.styleable;
import java.util.ArrayList;
import java.util.Iterator;

public class DotsTextView
  extends TextView
{
  private e a;
  private e b;
  private e c;
  private int d = 700;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private Handler j;
  private AnimatorSet k = new AnimatorSet();
  private float l;
  
  public DotsTextView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public DotsTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public DotsTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private ObjectAnimator a(e parame, float paramFloat)
  {
    return a(parame, 0.0F, -this.l * paramFloat);
  }
  
  private ObjectAnimator a(e parame, float paramFloat1, float paramFloat2)
  {
    parame = ObjectAnimator.ofFloat(parame, "translationX", new float[] { paramFloat1, paramFloat2 });
    parame.setDuration(this.d);
    return parame;
  }
  
  private ObjectAnimator a(e parame, int paramInt)
  {
    return a(parame, -this.l * paramInt, 0.0F);
  }
  
  private ObjectAnimator a(e parame, long paramLong)
  {
    parame = ObjectAnimator.ofFloat(parame, "translationY", new float[] { 0.0F, -this.e });
    parame.setEvaluator(new b(this));
    parame.setDuration(this.i);
    parame.setStartDelay(paramLong);
    parame.setRepeatCount(-1);
    parame.setRepeatMode(1);
    return parame;
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this.j = new Handler(Looper.getMainLooper());
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WaitingDots);
      this.i = paramContext.getInt(R.styleable.WaitingDots_period, 6000);
      this.e = paramContext.getInt(R.styleable.WaitingDots_jumpHeight, (int)(getTextSize() / 4.0F));
      this.f = paramContext.getBoolean(R.styleable.WaitingDots_autoplay, true);
      paramContext.recycle();
    }
    this.a = new e();
    this.b = new e();
    this.c = new e();
    paramContext = new SpannableString("...");
    paramContext.setSpan(this.a, 0, 1, 33);
    paramContext.setSpan(this.b, 1, 2, 33);
    paramContext.setSpan(this.c, 2, 3, 33);
    setText(paramContext, TextView.BufferType.SPANNABLE);
    this.l = getPaint().measureText(".", 0, 1);
    paramContext = a(this.a, 0L);
    paramContext.addUpdateListener(new a(this));
    this.k.playTogether(new Animator[] { paramContext, a(this.b, this.i / 6), a(this.c, this.i * 2 / 6) });
    this.g = this.f;
    if (this.f) {
      a();
    }
  }
  
  private void setAllAnimationsRepeatCount(int paramInt)
  {
    Iterator localIterator = this.k.getChildAnimations().iterator();
    while (localIterator.hasNext())
    {
      Animator localAnimator = (Animator)localIterator.next();
      if ((localAnimator instanceof ObjectAnimator)) {
        ((ObjectAnimator)localAnimator).setRepeatCount(paramInt);
      }
    }
  }
  
  public void a()
  {
    this.g = true;
    setAllAnimationsRepeatCount(-1);
    this.k.start();
  }
  
  public void b()
  {
    this.g = false;
    setAllAnimationsRepeatCount(0);
  }
  
  public void c()
  {
    a(this.c, 2.0F).start();
    ObjectAnimator localObjectAnimator = a(this.b, 1.0F);
    localObjectAnimator.addUpdateListener(new c(this));
    localObjectAnimator.start();
    this.h = true;
  }
  
  public void d()
  {
    a(this.c, 2).start();
    ObjectAnimator localObjectAnimator = a(this.b, 1);
    localObjectAnimator.addUpdateListener(new d(this));
    localObjectAnimator.start();
    this.h = false;
  }
  
  public void e()
  {
    d();
    a();
  }
  
  public void f()
  {
    c();
    b();
  }
  
  public void setJumpHeight(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setPeriod(int paramInt)
  {
    this.i = paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\WaitingDots\DotsTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */