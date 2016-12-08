package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class bt
{
  private final List<String> a;
  private final Object b;
  
  private bt(Object paramObject)
  {
    this.b = b.a(paramObject);
    this.a = new ArrayList();
  }
  
  public bt a(String paramString, Object paramObject)
  {
    List localList = this.a;
    paramString = (String)b.a(paramString);
    paramObject = String.valueOf(String.valueOf(paramObject));
    localList.add(String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length() + paramString + "=" + (String)paramObject);
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
    int j = this.a.size();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append((String)this.a.get(i));
      if (i < j - 1) {
        localStringBuilder.append(", ");
      }
      i += 1;
    }
    return '}';
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */