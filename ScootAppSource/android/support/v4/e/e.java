package android.support.v4.e;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e<T>
  implements Parcelable.Creator<T>
{
  final f<T> a;
  
  public e(f<T> paramf)
  {
    this.a = paramf;
  }
  
  public T createFromParcel(Parcel paramParcel)
  {
    return (T)this.a.b(paramParcel, null);
  }
  
  public T[] newArray(int paramInt)
  {
    return this.a.b(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */