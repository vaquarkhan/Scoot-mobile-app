package b.a.a.a.a.g;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import b.a.a.a.a.b.m;
import b.a.a.a.f;
import b.a.a.a.t;

public final class n
{
  public final String a;
  public final int b;
  public final int c;
  public final int d;
  
  public n(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public static n a(Context paramContext, String paramString)
  {
    if (paramString != null) {
      try
      {
        int i = m.l(paramContext);
        f.h().a("Fabric", "App icon resource ID is " + i);
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(paramContext.getResources(), i, localOptions);
        paramContext = new n(paramString, i, localOptions.outWidth, localOptions.outHeight);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        f.h().e("Fabric", "Failed to load icon", paramContext);
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\g\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */