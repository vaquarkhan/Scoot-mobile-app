package com.parse;

import java.util.AbstractList;
import java.util.List;

class Lists$Partition<T>
  extends AbstractList<List<T>>
{
  private final List<T> list;
  private final int size;
  
  public Lists$Partition(List<T> paramList, int paramInt)
  {
    this.list = paramList;
    this.size = paramInt;
  }
  
  public List<T> get(int paramInt)
  {
    paramInt = this.size * paramInt;
    int i = Math.min(this.size + paramInt, this.list.size());
    return this.list.subList(paramInt, i);
  }
  
  public int size()
  {
    return (int)Math.ceil(this.list.size() / this.size);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\Lists$Partition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */