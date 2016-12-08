package android.support.v7.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.widget.gm;

final class am
  implements h
{
  private am(ak paramak) {}
  
  public Drawable a()
  {
    gm localgm = gm.a(b(), null, new int[] { R.attr.homeAsUpIndicator });
    Drawable localDrawable = localgm.a(0);
    localgm.a();
    return localDrawable;
  }
  
  public void a(int paramInt)
  {
    a locala = this.a.a();
    if (locala != null) {
      locala.a(paramInt);
    }
  }
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    a locala = this.a.a();
    if (locala != null)
    {
      locala.a(paramDrawable);
      locala.a(paramInt);
    }
  }
  
  public Context b()
  {
    return this.a.n();
  }
  
  public boolean c()
  {
    a locala = this.a.a();
    return (locala != null) && ((locala.a() & 0x4) != 0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */