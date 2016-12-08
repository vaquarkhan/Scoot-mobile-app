package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

final class o
{
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
  
  public static boolean a(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public static Drawable b(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof ac)) {
      localObject = new y(paramDrawable);
    }
    return (Drawable)localObject;
  }
  
  public static int c(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\c\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */