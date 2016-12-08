package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class Status
  extends AbstractSafeParcelable
  implements x
{
  public static final Parcelable.Creator<Status> CREATOR = new ah();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  public static final Status f = new Status(17);
  private final int g;
  private final int h;
  private final String i;
  private final PendingIntent j;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramString;
    this.j = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  private String h()
  {
    if (this.i != null) {
      return this.i;
    }
    return p.a(this.h);
  }
  
  PendingIntent a()
  {
    return this.j;
  }
  
  public void a(Activity paramActivity, int paramInt)
  {
    if (!e()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.j.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public Status b()
  {
    return this;
  }
  
  public String c()
  {
    return this.i;
  }
  
  int d()
  {
    return this.g;
  }
  
  public boolean e()
  {
    return this.j != null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((this.g != ((Status)paramObject).g) || (this.h != ((Status)paramObject).h) || (!br.a(this.i, ((Status)paramObject).i)) || (!br.a(this.j, ((Status)paramObject).j)));
    return true;
  }
  
  public boolean f()
  {
    return this.h <= 0;
  }
  
  public int g()
  {
    return this.h;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j });
  }
  
  public String toString()
  {
    return br.a(this).a("statusCode", h()).a("resolution", this.j).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ah.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */