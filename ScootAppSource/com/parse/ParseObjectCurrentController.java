package com.parse;

import a.o;

abstract interface ParseObjectCurrentController<T extends ParseObject>
{
  public abstract void clearFromDisk();
  
  public abstract void clearFromMemory();
  
  public abstract o<Boolean> existsAsync();
  
  public abstract o<T> getAsync();
  
  public abstract boolean isCurrent(T paramT);
  
  public abstract o<Void> setAsync(T paramT);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObjectCurrentController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */