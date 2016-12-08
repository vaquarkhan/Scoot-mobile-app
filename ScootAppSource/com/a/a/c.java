package com.a.a;

import android.graphics.Typeface;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;

public final class c
  implements d, e, f
{
  public int a = -1;
  public float b;
  private String c = "";
  private int d = -7829368;
  private int e = 0;
  private int f = -1;
  private int g = -1;
  private Typeface h = Typeface.create("sans-serif-light", 0);
  private RectShape i = new RectShape();
  private int j = -1;
  private boolean k = false;
  private boolean l = false;
  
  public a a(String paramString, int paramInt)
  {
    c();
    return b(paramString, paramInt);
  }
  
  public e a()
  {
    return this;
  }
  
  public e a(int paramInt)
  {
    this.a = paramInt;
    return this;
  }
  
  public e a(Typeface paramTypeface)
  {
    this.h = paramTypeface;
    return this;
  }
  
  public a b(String paramString, int paramInt)
  {
    this.d = paramInt;
    this.c = paramString;
    return new a(this, null);
  }
  
  public e b(int paramInt)
  {
    this.j = paramInt;
    return this;
  }
  
  public f b()
  {
    return this;
  }
  
  public d c()
  {
    this.i = new OvalShape();
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */