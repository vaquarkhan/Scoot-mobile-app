package com.parse;

import java.util.Comparator;
import java.util.concurrent.locks.Lock;

class LockSet$1
  implements Comparator<Lock>
{
  LockSet$1(LockSet paramLockSet) {}
  
  public int compare(Lock paramLock1, Lock paramLock2)
  {
    return LockSet.access$000(paramLock1).compareTo(LockSet.access$000(paramLock2));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\LockSet$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */