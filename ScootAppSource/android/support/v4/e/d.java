package android.support.v4.e;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class d
{
  public static <T> Parcelable.Creator<T> a(f<T> paramf)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      return h.a(paramf);
    }
    return new e(paramf);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */