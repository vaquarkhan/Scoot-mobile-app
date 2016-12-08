package com.codetroopers.betterpickers.radialtimepicker;

import java.util.ArrayList;
import java.util.Iterator;

final class s
{
  private int[] b;
  private ArrayList<s> c;
  
  public s(l paraml, int... paramVarArgs)
  {
    this.b = paramVarArgs;
    this.c = new ArrayList();
  }
  
  public void a(s params)
  {
    this.c.add(params);
  }
  
  public boolean a(int paramInt)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.b.length)
      {
        if (this.b[i] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public s b(int paramInt)
  {
    if (this.c == null) {
      return null;
    }
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      if (locals.a(paramInt)) {
        return locals;
      }
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */