package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

final class m
{
  public static void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public static Drawable b(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof ac)) {
      localObject = new w(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\c\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */