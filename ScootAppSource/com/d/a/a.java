package com.d.a;

import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  ArrayList<b> a = null;
  
  public void a() {}
  
  public void a(b paramb)
  {
    if (this.a == null) {
      this.a = new ArrayList();
    }
    this.a.add(paramb);
  }
  
  public void b() {}
  
  public void b(b paramb)
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.remove(paramb);
    } while (this.a.size() != 0);
    this.a = null;
  }
  
  public void c() {}
  
  public abstract boolean d();
  
  public boolean e()
  {
    return d();
  }
  
  public ArrayList<b> f()
  {
    return this.a;
  }
  
  public a g()
  {
    try
    {
      a locala = (a)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        locala.a = new ArrayList();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          locala.a.add(localArrayList.get(i));
          i += 1;
        }
      }
      return localCloneNotSupportedException;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */