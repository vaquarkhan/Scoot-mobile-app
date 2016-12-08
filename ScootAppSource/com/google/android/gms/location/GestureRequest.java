package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class GestureRequest
  extends AbstractSafeParcelable
{
  public static final q CREATOR = new q();
  private static final List<Integer> a = Collections.unmodifiableList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18), Integer.valueOf(19) }));
  private static final List<Integer> b = Collections.unmodifiableList(Arrays.asList(new Integer[] { Integer.valueOf(1) }));
  private static final List<Integer> c = Collections.unmodifiableList(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(16), Integer.valueOf(18), Integer.valueOf(19) }));
  private static final List<Integer> d = Collections.unmodifiableList(Arrays.asList(new Integer[] { Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(17) }));
  private final int e;
  private final List<Integer> f;
  
  GestureRequest(int paramInt, List<Integer> paramList)
  {
    this.e = paramInt;
    this.f = paramList;
  }
  
  public int a()
  {
    return this.e;
  }
  
  public List<Integer> b()
  {
    return this.f;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    q.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\GestureRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */