package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new s();
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;
  
  public BackStackState(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public BackStackState(m paramm)
  {
    q localq = paramm.c;
    int n;
    for (int m = 0; localq != null; m = n)
    {
      n = m;
      if (localq.i != null) {
        n = m + localq.i.size();
      }
      localq = localq.a;
    }
    this.a = new int[m + paramm.e * 7];
    if (!paramm.l) {
      throw new IllegalStateException("Not on back stack");
    }
    localq = paramm.c;
    m = 0;
    if (localq != null)
    {
      int[] arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = localq.c;
      arrayOfInt = this.a;
      int i1 = n + 1;
      if (localq.d != null) {}
      for (m = localq.d.p;; m = -1)
      {
        arrayOfInt[n] = m;
        arrayOfInt = this.a;
        m = i1 + 1;
        arrayOfInt[i1] = localq.e;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localq.f;
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = localq.g;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localq.h;
        if (localq.i == null) {
          break label314;
        }
        i1 = localq.i.size();
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = i1;
        n = 0;
        while (n < i1)
        {
          this.a[m] = ((Fragment)localq.i.get(n)).p;
          n += 1;
          m += 1;
        }
      }
      for (;;)
      {
        localq = localq.a;
        break;
        label314:
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = 0;
      }
    }
    this.b = paramm.j;
    this.c = paramm.k;
    this.d = paramm.n;
    this.e = paramm.p;
    this.f = paramm.q;
    this.g = paramm.r;
    this.h = paramm.s;
    this.i = paramm.t;
    this.j = paramm.u;
    this.k = paramm.v;
  }
  
  public m a(aj paramaj)
  {
    m localm = new m(paramaj);
    int i1 = 0;
    int m = 0;
    while (m < this.a.length)
    {
      q localq = new q();
      Object localObject = this.a;
      int n = m + 1;
      localq.c = localObject[m];
      if (aj.a) {
        Log.v("FragmentManager", "Instantiate " + localm + " op #" + i1 + " base fragment #" + this.a[n]);
      }
      localObject = this.a;
      m = n + 1;
      n = localObject[n];
      if (n >= 0) {}
      for (localq.d = ((Fragment)paramaj.f.get(n));; localq.d = null)
      {
        localObject = this.a;
        n = m + 1;
        localq.e = localObject[m];
        localObject = this.a;
        m = n + 1;
        localq.f = localObject[n];
        localObject = this.a;
        n = m + 1;
        localq.g = localObject[m];
        localObject = this.a;
        m = n + 1;
        localq.h = localObject[n];
        localObject = this.a;
        n = m + 1;
        int i3 = localObject[m];
        m = n;
        if (i3 <= 0) {
          break;
        }
        localq.i = new ArrayList(i3);
        int i2 = 0;
        for (;;)
        {
          m = n;
          if (i2 >= i3) {
            break;
          }
          if (aj.a) {
            Log.v("FragmentManager", "Instantiate " + localm + " set remove fragment #" + this.a[n]);
          }
          localObject = (Fragment)paramaj.f.get(this.a[n]);
          localq.i.add(localObject);
          i2 += 1;
          n += 1;
        }
      }
      localm.f = localq.e;
      localm.g = localq.f;
      localm.h = localq.g;
      localm.i = localq.h;
      localm.a(localq);
      i1 += 1;
    }
    localm.j = this.b;
    localm.k = this.c;
    localm.n = this.d;
    localm.p = this.e;
    localm.l = true;
    localm.q = this.f;
    localm.r = this.g;
    localm.s = this.h;
    localm.t = this.i;
    localm.u = this.j;
    localm.v = this.k;
    localm.a(1);
    return localm;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\BackStackState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */