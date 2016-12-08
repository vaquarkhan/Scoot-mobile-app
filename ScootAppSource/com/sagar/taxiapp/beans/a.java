package com.sagar.taxiapp.beans;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.squareup.picasso.Transformation;

public final class a
  implements Transformation
{
  RenderScript a;
  
  public a(Context paramContext)
  {
    this.a = RenderScript.create(paramContext);
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt)
  {
    int i2 = paramBitmap.getWidth();
    int i3 = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(i2, i3, paramBitmap.getConfig());
    int m = 0;
    int n;
    int k;
    int i4;
    int i;
    int j;
    if (m < i2)
    {
      n = 0;
      if (n < i3)
      {
        k = paramBitmap.getPixel(m, n);
        i4 = Color.alpha(k);
        i = Color.red(k);
        j = Color.green(k);
        k = Color.blue(k);
        i += paramInt;
        if (i > 255) {
          i = 255;
        }
      }
    }
    label96:
    label111:
    label202:
    label205:
    for (;;)
    {
      j += paramInt;
      if (j > 255) {
        j = 255;
      }
      for (;;)
      {
        int i1 = k + paramInt;
        if (i1 > 255) {
          k = 255;
        }
        for (;;)
        {
          localBitmap.setPixel(m, n, Color.argb(i4, i, j, k));
          n += 1;
          break;
          if (i >= 0) {
            break label205;
          }
          i = 0;
          break label96;
          if (j >= 0) {
            break label202;
          }
          j = 0;
          break label111;
          k = i1;
          if (i1 < 0) {
            k = 0;
          }
        }
        m += 1;
        break;
        return localBitmap;
      }
    }
  }
  
  public String key()
  {
    return "blur";
  }
  
  public Bitmap transform(Bitmap paramBitmap)
  {
    Bitmap localBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, true);
    Allocation localAllocation1 = Allocation.createFromBitmap(this.a, localBitmap, Allocation.MipmapControl.MIPMAP_FULL, 128);
    Allocation localAllocation2 = Allocation.createTyped(this.a, localAllocation1.getType());
    ScriptIntrinsicBlur localScriptIntrinsicBlur = ScriptIntrinsicBlur.create(this.a, Element.U8_4(this.a));
    localScriptIntrinsicBlur.setInput(localAllocation1);
    localScriptIntrinsicBlur.setRadius(10.0F);
    localScriptIntrinsicBlur.forEach(localAllocation2);
    localAllocation2.copyTo(localBitmap);
    paramBitmap.recycle();
    return a(localBitmap, -75);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */