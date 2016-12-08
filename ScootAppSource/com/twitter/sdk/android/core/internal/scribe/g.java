package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

public class g
{
  @com.google.a.a.c(a="event_namespace")
  final c a;
  @com.google.a.a.c(a="ts")
  final String b;
  @com.google.a.a.c(a="format_version")
  final String c;
  @com.google.a.a.c(a="_category_")
  final String d;
  @com.google.a.a.c(a="items")
  final List<Object> e;
  
  public g(String paramString, c paramc, long paramLong, List<Object> paramList)
  {
    this.d = paramString;
    this.a = paramc;
    this.b = String.valueOf(paramLong);
    this.c = "2";
    this.e = Collections.unmodifiableList(paramList);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (g)paramObject;
      if (this.d != null)
      {
        if (this.d.equals(((g)paramObject).d)) {}
      }
      else {
        while (((g)paramObject).d != null) {
          return false;
        }
      }
      if (this.a != null)
      {
        if (this.a.equals(((g)paramObject).a)) {}
      }
      else {
        while (((g)paramObject).a != null) {
          return false;
        }
      }
      if (this.c != null)
      {
        if (this.c.equals(((g)paramObject).c)) {}
      }
      else {
        while (((g)paramObject).c != null) {
          return false;
        }
      }
      if (this.b != null)
      {
        if (this.b.equals(((g)paramObject).b)) {}
      }
      else {
        while (((g)paramObject).b != null) {
          return false;
        }
      }
      if (this.e == null) {
        break;
      }
    } while (this.e.equals(((g)paramObject).e));
    for (;;)
    {
      return false;
      if (((g)paramObject).e == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int n = 0;
    int i;
    int j;
    label33:
    int k;
    if (this.a != null)
    {
      i = this.a.hashCode();
      if (this.b == null) {
        break label111;
      }
      j = this.b.hashCode();
      if (this.c == null) {
        break label116;
      }
      k = this.c.hashCode();
      label48:
      if (this.d == null) {
        break label121;
      }
    }
    label111:
    label116:
    label121:
    for (int m = this.d.hashCode();; m = 0)
    {
      if (this.e != null) {
        n = this.e.hashCode();
      }
      return (m + (k + (j + i * 31) * 31) * 31) * 31 + n;
      i = 0;
      break;
      j = 0;
      break label33;
      k = 0;
      break label48;
    }
  }
  
  public String toString()
  {
    return "event_namespace=" + this.a + ", ts=" + this.b + ", format_version=" + this.c + ", _category_=" + this.d + ", items=" + new StringBuilder().append("[").append(TextUtils.join(", ", this.e)).append("]").toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */