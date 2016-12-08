package com.mixpanel.android.surveys;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class s
  extends Animation
{
  private s(SurveyChoiceView paramSurveyChoiceView) {}
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = 0.0F;
    float f2 = 1.0F;
    if (paramFloat <= 0.5F) {
      f1 = paramFloat - 0.5F;
    }
    for (paramFloat = f2;; paramFloat = 1.0F + (paramFloat - 0.5F) * 2.0F)
    {
      SurveyChoiceView.a(this.a, f1);
      SurveyChoiceView.b(this.a, paramFloat);
      this.a.requestLayout();
      return;
    }
  }
  
  public boolean willChangeBounds()
  {
    return false;
  }
  
  public boolean willChangeTransformationMatrix()
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */