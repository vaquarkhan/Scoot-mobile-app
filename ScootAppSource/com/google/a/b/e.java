package com.google.a.b;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class e
  implements Serializable, WildcardType
{
  private final Type a;
  private final Type b;
  
  public e(Type[] paramArrayOfType1, Type[] paramArrayOfType2)
  {
    if (paramArrayOfType2.length <= 1)
    {
      bool1 = true;
      a.a(bool1);
      if (paramArrayOfType1.length != 1) {
        break label87;
      }
      bool1 = true;
      label27:
      a.a(bool1);
      if (paramArrayOfType2.length != 1) {
        break label97;
      }
      a.a(paramArrayOfType2[0]);
      b.h(paramArrayOfType2[0]);
      if (paramArrayOfType1[0] != Object.class) {
        break label92;
      }
    }
    label87:
    label92:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      a.a(bool1);
      this.b = b.d(paramArrayOfType2[0]);
      this.a = Object.class;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label27;
    }
    label97:
    a.a(paramArrayOfType1[0]);
    b.h(paramArrayOfType1[0]);
    this.b = null;
    this.a = b.d(paramArrayOfType1[0]);
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof WildcardType)) && (b.a(this, (WildcardType)paramObject));
  }
  
  public Type[] getLowerBounds()
  {
    if (this.b != null) {
      return new Type[] { this.b };
    }
    return b.a;
  }
  
  public Type[] getUpperBounds()
  {
    return new Type[] { this.a };
  }
  
  public int hashCode()
  {
    if (this.b != null) {}
    for (int i = this.b.hashCode() + 31;; i = 1) {
      return i ^ this.a.hashCode() + 31;
    }
  }
  
  public String toString()
  {
    if (this.b != null) {
      return "? super " + b.f(this.b);
    }
    if (this.a == Object.class) {
      return "?";
    }
    return "? extends " + b.f(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */