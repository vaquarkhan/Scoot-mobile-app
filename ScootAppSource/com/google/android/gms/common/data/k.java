package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class k<T extends SafeParcelable>
  extends a<T>
{
  private static final String[] b = { "data" };
  private final Parcelable.Creator<T> c;
  
  public k(DataHolder paramDataHolder, Parcelable.Creator<T> paramCreator)
  {
    super(paramDataHolder);
    this.c = paramCreator;
  }
  
  public T b(int paramInt)
  {
    Object localObject = this.a.e("data", paramInt, this.a.a(paramInt));
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall((byte[])localObject, 0, localObject.length);
    localParcel.setDataPosition(0);
    localObject = (SafeParcelable)this.c.createFromParcel(localParcel);
    localParcel.recycle();
    return (T)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */