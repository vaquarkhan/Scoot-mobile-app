package com.appsee;

import android.view.MotionEvent;

class sc
{
  private static final int F = -1;
  private float A;
  private float B;
  private float D;
  private short[] E;
  private float G;
  private float M;
  private float c;
  private float e;
  private r f;
  private int g;
  private int h;
  private float j;
  private boolean l;
  
  public sc(r paramr)
  {
    this.f = paramr;
    this.h = -1;
    this.g = -1;
  }
  
  public static String C(String paramString)
  {
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int k = i - 1;
    for (i = k; k >= 0; i = k)
    {
      k = paramString.charAt(i);
      int m = i - 1;
      arrayOfChar[i] = ((char)(k ^ 0x62));
      if (m < 0) {
        break;
      }
      k = m - 1;
      arrayOfChar[m] = ((char)(paramString.charAt(m) ^ 0x9));
    }
    return new String(arrayOfChar);
  }
  
  public boolean C(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    }
    int i;
    do
    {
      do
      {
        return false;
        this.l = false;
        this.h = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
        return false;
      } while ((this.g != -1) || (this.h == -1));
      this.g = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
      this.e = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.h));
      this.A = paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.h));
      this.c = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.g));
      this.j = paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.g));
      return false;
      if (this.l)
      {
        float f1 = C(this.c, this.j, this.e, this.A, this.D, this.G, this.M, this.B);
        i = C(this.e, this.A, this.c, this.j);
        i = (int)wn.C(C(this.M, this.B, this.D, this.G) - i);
        if (this.f != null)
        {
          if (Math.abs(f1) > 30.0F) {
            this.f.C(f1, this.E, paramMotionEvent);
          }
          if (Math.abs(i) > 40) {
            this.f.C(i, this.E, paramMotionEvent);
          }
        }
      }
      this.h = -1;
      return false;
      i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
    } while ((i != this.h) && (i != this.g));
    this.E = new short[] { lb.C().C(this.h), lb.C().C(this.g) };
    this.l = true;
    this.M = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.h));
    this.B = paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.h));
    this.D = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.g));
    this.G = paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.g));
    this.g = -1;
    this.h = -1;
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */