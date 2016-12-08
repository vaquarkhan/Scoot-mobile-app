package b.a.a.a.a.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public final class m<E extends l,  extends y,  extends u>
  extends PriorityBlockingQueue<E>
{
  final Queue<E> a = new LinkedList();
  private final ReentrantLock b = new ReentrantLock();
  
  public E a()
  {
    return b(0, null, null);
  }
  
  E a(int paramInt, Long paramLong, TimeUnit paramTimeUnit)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return (l)super.take();
    case 1: 
      return (l)super.peek();
    case 2: 
      return (l)super.poll();
    }
    return (l)super.poll(paramLong.longValue(), paramTimeUnit);
  }
  
  public E a(long paramLong, TimeUnit paramTimeUnit)
  {
    return b(3, Long.valueOf(paramLong), paramTimeUnit);
  }
  
  boolean a(int paramInt, E paramE)
  {
    try
    {
      this.b.lock();
      if (paramInt == 1) {
        super.remove(paramE);
      }
      boolean bool = this.a.offer(paramE);
      return bool;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  boolean a(E paramE)
  {
    return paramE.d();
  }
  
  <T> T[] a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    int i = paramArrayOfT1.length;
    int j = paramArrayOfT2.length;
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT1.getClass().getComponentType(), i + j);
    System.arraycopy(paramArrayOfT1, 0, arrayOfObject, 0, i);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, i, j);
    return arrayOfObject;
  }
  
  public E b()
  {
    try
    {
      l locall = b(1, null, null);
      return locall;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  E b(int paramInt, Long paramLong, TimeUnit paramTimeUnit)
  {
    for (;;)
    {
      l locall = a(paramInt, paramLong, paramTimeUnit);
      if ((locall == null) || (a(locall))) {
        return locall;
      }
      a(paramInt, locall);
    }
  }
  
  public E c()
  {
    try
    {
      l locall = b(2, null, null);
      return locall;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  public void clear()
  {
    try
    {
      this.b.lock();
      this.a.clear();
      super.clear();
      return;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  /* Error */
  public boolean contains(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: invokevirtual 63	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 125	java/util/concurrent/PriorityBlockingQueue:contains	(Ljava/lang/Object;)Z
    //   12: ifne +18 -> 30
    //   15: aload_0
    //   16: getfield 19	b/a/a/a/a/c/m:a	Ljava/util/Queue;
    //   19: aload_1
    //   20: invokeinterface 126 2 0
    //   25: istore_2
    //   26: iload_2
    //   27: ifeq +14 -> 41
    //   30: iconst_1
    //   31: istore_2
    //   32: aload_0
    //   33: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   36: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   39: iload_2
    //   40: ireturn
    //   41: iconst_0
    //   42: istore_2
    //   43: goto -11 -> 32
    //   46: astore_1
    //   47: aload_0
    //   48: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   51: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	m
    //   0	56	1	paramObject	Object
    //   25	18	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	26	46	finally
  }
  
  public void d()
  {
    try
    {
      this.b.lock();
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        l locall = (l)localIterator.next();
        if (a(locall))
        {
          super.offer(locall);
          localIterator.remove();
        }
      }
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public int drainTo(Collection<? super E> paramCollection)
  {
    int i;
    int j;
    try
    {
      this.b.lock();
      i = super.drainTo(paramCollection);
      j = this.a.size();
      while (!this.a.isEmpty()) {
        paramCollection.add(this.a.poll());
      }
    }
    finally
    {
      this.b.unlock();
    }
    return i + j;
  }
  
  public int drainTo(Collection<? super E> paramCollection, int paramInt)
  {
    try
    {
      this.b.lock();
      int i = super.drainTo(paramCollection, paramInt);
      while ((!this.a.isEmpty()) && (i <= paramInt))
      {
        paramCollection.add(this.a.poll());
        i += 1;
      }
      return i;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  /* Error */
  public boolean remove(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: invokevirtual 63	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 67	java/util/concurrent/PriorityBlockingQueue:remove	(Ljava/lang/Object;)Z
    //   12: ifne +18 -> 30
    //   15: aload_0
    //   16: getfield 19	b/a/a/a/a/c/m:a	Ljava/util/Queue;
    //   19: aload_1
    //   20: invokeinterface 170 2 0
    //   25: istore_2
    //   26: iload_2
    //   27: ifeq +14 -> 41
    //   30: iconst_1
    //   31: istore_2
    //   32: aload_0
    //   33: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   36: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   39: iload_2
    //   40: ireturn
    //   41: iconst_0
    //   42: istore_2
    //   43: goto -11 -> 32
    //   46: astore_1
    //   47: aload_0
    //   48: getfield 24	b/a/a/a/a/c/m:b	Ljava/util/concurrent/locks/ReentrantLock;
    //   51: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	m
    //   0	56	1	paramObject	Object
    //   25	18	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	26	46	finally
  }
  
  public boolean removeAll(Collection<?> paramCollection)
  {
    try
    {
      this.b.lock();
      boolean bool1 = super.removeAll(paramCollection);
      boolean bool2 = this.a.removeAll(paramCollection);
      return bool1 | bool2;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public int size()
  {
    try
    {
      this.b.lock();
      int i = this.a.size();
      int j = super.size();
      return i + j;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public Object[] toArray()
  {
    try
    {
      this.b.lock();
      Object[] arrayOfObject = a(super.toArray(), this.a.toArray());
      return arrayOfObject;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public <T> T[] toArray(T[] paramArrayOfT)
  {
    try
    {
      this.b.lock();
      paramArrayOfT = a(super.toArray(paramArrayOfT), this.a.toArray(paramArrayOfT));
      return paramArrayOfT;
    }
    finally
    {
      this.b.unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */