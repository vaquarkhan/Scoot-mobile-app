package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

final class l
{
  public static Drawable a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof ac)) {
      localObject = new u(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\c\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */