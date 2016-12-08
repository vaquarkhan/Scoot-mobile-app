package com.parse;

import a.o;

abstract interface ParseObjectStore<T extends ParseObject>
{
  public abstract o<Void> deleteAsync();
  
  public abstract o<Boolean> existsAsync();
  
  public abstract o<T> getAsync();
  
  public abstract o<Void> setAsync(T paramT);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObjectStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */