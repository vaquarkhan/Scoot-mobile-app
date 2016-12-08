package com.payu.magicretry.WaitingDots;

import android.animation.TypeEvaluator;

final class b
  implements TypeEvaluator<Number>
{
  b(DotsTextView paramDotsTextView) {}
  
  public Number a(float paramFloat, Number paramNumber1, Number paramNumber2)
  {
    return Double.valueOf(Math.max(0.0D, Math.sin(paramFloat * 3.141592653589793D * 2.0D)) * (paramNumber2.floatValue() - paramNumber1.floatValue()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\magicretry\WaitingDots\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */