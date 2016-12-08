package com.digits.sdk.android;

import java.text.Collator;
import java.util.Locale;

final class ah
  implements Comparable<ah>
{
  public final String a;
  public final int b;
  private final Collator c = Collator.getInstance(Locale.getDefault());
  
  public ah(String paramString, int paramInt)
  {
    this.c.setStrength(0);
    this.a = paramString;
    this.b = paramInt;
  }
  
  public int a(ah paramah)
  {
    return this.c.compare(this.a, paramah.a);
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
      paramObject = (ah)paramObject;
      if (this.b != ((ah)paramObject).b) {
        break;
      }
      if (this.a == null) {
        break label63;
      }
    } while (this.a.equals(((ah)paramObject).a));
    label63:
    while (((ah)paramObject).a != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    if (this.a != null) {}
    for (int i = this.a.hashCode();; i = 0) {
      return i * 31 + this.b;
    }
  }
  
  public String toString()
  {
    return this.a + " +" + this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */