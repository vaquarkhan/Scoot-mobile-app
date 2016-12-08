package com.digits.sdk.android;

import java.lang.reflect.Field;

final class c
{
  private final int[] a;
  private final int b;
  
  public c()
  {
    Object localObject = Class.forName("android.support.v7.appcompat.R$styleable");
    Field localField = ((Class)localObject).getField("Theme");
    this.a = ((int[])localField.get(localField.getType()));
    localObject = ((Class)localObject).getField("Theme_windowActionBar");
    this.b = ((Integer)((Field)localObject).get(((Field)localObject).getType())).intValue();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */