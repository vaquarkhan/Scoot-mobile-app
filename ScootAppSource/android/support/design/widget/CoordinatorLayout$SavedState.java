package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.e.d;
import android.util.SparseArray;
import android.view.View.BaseSavedState;

public class CoordinatorLayout$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = d.a(new w());
  SparseArray<Parcelable> a;
  
  public CoordinatorLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    int j = paramParcel.readInt();
    int[] arrayOfInt = new int[j];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    this.a = new SparseArray(j);
    int i = 0;
    while (i < j)
    {
      this.a.append(arrayOfInt[i], paramParcel[i]);
      i += 1;
    }
  }
  
  public CoordinatorLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int j = 0;
    super.writeToParcel(paramParcel, paramInt);
    if (this.a != null) {}
    int[] arrayOfInt;
    Parcelable[] arrayOfParcelable;
    for (int i = this.a.size();; i = 0)
    {
      paramParcel.writeInt(i);
      arrayOfInt = new int[i];
      arrayOfParcelable = new Parcelable[i];
      while (j < i)
      {
        arrayOfInt[j] = this.a.keyAt(j);
        arrayOfParcelable[j] = ((Parcelable)this.a.valueAt(j));
        j += 1;
      }
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\CoordinatorLayout$SavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */