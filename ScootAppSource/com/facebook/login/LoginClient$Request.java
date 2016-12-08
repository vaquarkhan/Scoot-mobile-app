package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.b.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoginClient$Request
  implements Parcelable
{
  public static final Parcelable.Creator<Request> CREATOR = new k();
  private final g a;
  private Set<String> b;
  private final a c;
  private final String d;
  private final String e;
  private boolean f = false;
  
  private LoginClient$Request(Parcel paramParcel)
  {
    Object localObject1 = paramParcel.readString();
    if (localObject1 != null)
    {
      localObject1 = g.valueOf((String)localObject1);
      this.a = ((g)localObject1);
      localObject1 = new ArrayList();
      paramParcel.readStringList((List)localObject1);
      this.b = new HashSet((Collection)localObject1);
      String str = paramParcel.readString();
      localObject1 = localObject2;
      if (str != null) {
        localObject1 = a.valueOf(str);
      }
      this.c = ((a)localObject1);
      this.d = paramParcel.readString();
      this.e = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label117;
      }
    }
    label117:
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      return;
      localObject1 = null;
      break;
    }
  }
  
  LoginClient$Request(g paramg, Set<String> paramSet, a parama, String paramString1, String paramString2)
  {
    this.a = paramg;
    if (paramSet != null) {}
    for (;;)
    {
      this.b = paramSet;
      this.c = parama;
      this.d = paramString1;
      this.e = paramString2;
      return;
      paramSet = new HashSet();
    }
  }
  
  Set<String> a()
  {
    return this.b;
  }
  
  void a(Set<String> paramSet)
  {
    az.a(paramSet, "permissions");
    this.b = paramSet;
  }
  
  void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  g b()
  {
    return this.a;
  }
  
  a c()
  {
    return this.c;
  }
  
  String d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  String e()
  {
    return this.e;
  }
  
  boolean f()
  {
    return this.f;
  }
  
  boolean g()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      if (r.a((String)localIterator.next())) {
        return true;
      }
    }
    return false;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2 = null;
    Object localObject1;
    if (this.a != null)
    {
      localObject1 = this.a.name();
      paramParcel.writeString((String)localObject1);
      paramParcel.writeStringList(new ArrayList(this.b));
      localObject1 = localObject2;
      if (this.c != null) {
        localObject1 = this.c.name();
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeString(this.d);
      paramParcel.writeString(this.e);
      if (!this.f) {
        break label98;
      }
    }
    label98:
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      localObject1 = null;
      break;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\LoginClient$Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */