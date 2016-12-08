package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.os.AsyncTask;
import com.mixpanel.android.b.a;

final class h
  extends AsyncTask<Void, Void, Void>
{
  private final i a;
  private final Activity b;
  private Bitmap c;
  private int d;
  
  public h(Activity paramActivity, i parami)
  {
    this.b = paramActivity;
    this.a = parami;
    this.d = -16777216;
  }
  
  protected Void a(Void... paramVarArgs)
  {
    if (this.c != null) {}
    try
    {
      com.mixpanel.android.b.i.a(this.c, 20);
      new Canvas(this.c).drawColor(f.a(), PorterDuff.Mode.SRC_ATOP);
      return null;
    }
    catch (ArrayIndexOutOfBoundsException paramVarArgs)
    {
      this.c = null;
      return null;
    }
    catch (OutOfMemoryError paramVarArgs)
    {
      this.c = null;
    }
    return null;
  }
  
  protected void a(Void paramVoid)
  {
    this.a.a(this.c, this.d);
  }
  
  protected void onPreExecute()
  {
    this.c = a.a(this.b, 2, 2, true);
    this.d = a.a(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */