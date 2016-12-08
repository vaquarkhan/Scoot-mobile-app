package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.mixpanel.android.surveys.k;

final class an
  implements i
{
  an(al paramal, UpdateDisplayState.DisplayState.SurveyState paramSurveyState, Activity paramActivity, int paramInt) {}
  
  public void a(Bitmap paramBitmap, int paramInt)
  {
    this.a.a(paramBitmap);
    this.a.a(paramInt);
    paramBitmap = new Intent(this.b.getApplicationContext(), k.class);
    paramBitmap.addFlags(268435456);
    paramBitmap.addFlags(131072);
    paramBitmap.putExtra("com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY", this.c);
    this.b.startActivity(paramBitmap);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */