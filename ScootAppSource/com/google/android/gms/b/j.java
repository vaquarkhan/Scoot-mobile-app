package com.google.android.gms.b;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class j
  implements Cloneable
{
  private h<?, ?> a;
  private Object b;
  private List<o> c = new ArrayList();
  
  private byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(e.a(arrayOfByte));
    return arrayOfByte;
  }
  
  int a()
  {
    int j;
    if (this.b != null)
    {
      j = this.a.a(this.b);
      return j;
    }
    Iterator localIterator = this.c.iterator();
    for (int i = 0;; i = ((o)localIterator.next()).a() + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
    }
  }
  
  void a(e parame)
  {
    if (this.b != null) {
      this.a.a(this.b, parame);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext()) {
        ((o)localIterator.next()).a(parame);
      }
    }
  }
  
  void a(o paramo)
  {
    this.c.add(paramo);
  }
  
  public final j b()
  {
    j localj = new j();
    try
    {
      localj.a = this.a;
      if (this.c == null) {
        localj.c = null;
      }
      while (this.b == null)
      {
        return localj;
        localj.c.addAll(this.c);
      }
      if (!(this.b instanceof m)) {
        break label93;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localCloneNotSupportedException.b = ((m)((m)this.b).clone());
    return localCloneNotSupportedException;
    label93:
    if ((this.b instanceof byte[]))
    {
      localCloneNotSupportedException.b = ((byte[])this.b).clone();
      return localCloneNotSupportedException;
    }
    Object localObject1;
    Object localObject2;
    int i;
    if ((this.b instanceof byte[][]))
    {
      localObject1 = (byte[][])this.b;
      localObject2 = new byte[localObject1.length][];
      localCloneNotSupportedException.b = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((byte[])localObject1[i].clone());
        i += 1;
      }
    }
    if ((this.b instanceof boolean[]))
    {
      localCloneNotSupportedException.b = ((boolean[])this.b).clone();
      return localCloneNotSupportedException;
    }
    if ((this.b instanceof int[]))
    {
      localCloneNotSupportedException.b = ((int[])this.b).clone();
      return localCloneNotSupportedException;
    }
    if ((this.b instanceof long[]))
    {
      localCloneNotSupportedException.b = ((long[])this.b).clone();
      return localCloneNotSupportedException;
    }
    if ((this.b instanceof float[]))
    {
      localCloneNotSupportedException.b = ((float[])this.b).clone();
      return localCloneNotSupportedException;
    }
    if ((this.b instanceof double[]))
    {
      localCloneNotSupportedException.b = ((double[])this.b).clone();
      return localCloneNotSupportedException;
    }
    if ((this.b instanceof m[]))
    {
      localObject1 = (m[])this.b;
      localObject2 = new m[localObject1.length];
      localCloneNotSupportedException.b = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((m)localObject1[i].clone());
        i += 1;
      }
    }
    return localCloneNotSupportedException;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof j));
      paramObject = (j)paramObject;
      if ((this.b == null) || (((j)paramObject).b == null)) {
        break;
      }
      bool1 = bool2;
    } while (this.a != ((j)paramObject).a);
    if (!this.a.b.isArray()) {
      return this.b.equals(((j)paramObject).b);
    }
    if ((this.b instanceof byte[])) {
      return Arrays.equals((byte[])this.b, (byte[])((j)paramObject).b);
    }
    if ((this.b instanceof int[])) {
      return Arrays.equals((int[])this.b, (int[])((j)paramObject).b);
    }
    if ((this.b instanceof long[])) {
      return Arrays.equals((long[])this.b, (long[])((j)paramObject).b);
    }
    if ((this.b instanceof float[])) {
      return Arrays.equals((float[])this.b, (float[])((j)paramObject).b);
    }
    if ((this.b instanceof double[])) {
      return Arrays.equals((double[])this.b, (double[])((j)paramObject).b);
    }
    if ((this.b instanceof boolean[])) {
      return Arrays.equals((boolean[])this.b, (boolean[])((j)paramObject).b);
    }
    return Arrays.deepEquals((Object[])this.b, (Object[])((j)paramObject).b);
    if ((this.c != null) && (((j)paramObject).c != null)) {
      return this.c.equals(((j)paramObject).c);
    }
    try
    {
      bool1 = Arrays.equals(c(), ((j)paramObject).c());
      return bool1;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(c());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */