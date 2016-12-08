package android.support.v4.app;

import android.view.View;

final class x
  extends ae
{
  x(Fragment paramFragment) {}
  
  public View a(int paramInt)
  {
    if (this.a.R == null) {
      throw new IllegalStateException("Fragment does not have a view");
    }
    return this.a.R.findViewById(paramInt);
  }
  
  public boolean a()
  {
    return this.a.R != null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */