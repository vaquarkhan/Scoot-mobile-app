package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlacePhotoResult
  extends AbstractSafeParcelable
  implements x
{
  public static final Parcelable.Creator<PlacePhotoResult> CREATOR = new y();
  final int a;
  final BitmapTeleporter b;
  private final Status c;
  private final Bitmap d;
  
  PlacePhotoResult(int paramInt, Status paramStatus, BitmapTeleporter paramBitmapTeleporter)
  {
    this.a = paramInt;
    this.c = paramStatus;
    this.b = paramBitmapTeleporter;
    if (this.b != null)
    {
      this.d = paramBitmapTeleporter.a();
      return;
    }
    this.d = null;
  }
  
  public Status b()
  {
    return this.c;
  }
  
  public String toString()
  {
    return br.a(this).a("status", this.c).a("bitmap", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    y.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\PlacePhotoResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */