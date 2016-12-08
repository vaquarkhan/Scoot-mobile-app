package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ClientIdentity
  extends AbstractSafeParcelable
{
  public static final c CREATOR = new c();
  public final int a;
  public final String b;
  private final int c;
  
  ClientIdentity(int paramInt1, int paramInt2, String paramString)
  {
    this.c = paramInt1;
    this.a = paramInt2;
    this.b = paramString;
  }
  
  int a()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof ClientIdentity))) {
        return false;
      }
      paramObject = (ClientIdentity)paramObject;
    } while ((((ClientIdentity)paramObject).a == this.a) && (br.a(((ClientIdentity)paramObject).b, this.b)));
    return false;
  }
  
  public int hashCode()
  {
    return this.a;
  }
  
  public String toString()
  {
    return String.format("%d:%s", new Object[] { Integer.valueOf(this.a), this.b });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ClientIdentity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */