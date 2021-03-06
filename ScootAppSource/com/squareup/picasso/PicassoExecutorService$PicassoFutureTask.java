package com.squareup.picasso;

import java.util.concurrent.FutureTask;

final class PicassoExecutorService$PicassoFutureTask
  extends FutureTask<BitmapHunter>
  implements Comparable<PicassoFutureTask>
{
  private final BitmapHunter hunter;
  
  public PicassoExecutorService$PicassoFutureTask(BitmapHunter paramBitmapHunter)
  {
    super(paramBitmapHunter, null);
    this.hunter = paramBitmapHunter;
  }
  
  public int compareTo(PicassoFutureTask paramPicassoFutureTask)
  {
    Picasso.Priority localPriority1 = this.hunter.getPriority();
    Picasso.Priority localPriority2 = paramPicassoFutureTask.hunter.getPriority();
    if (localPriority1 == localPriority2) {
      return this.hunter.sequence - paramPicassoFutureTask.hunter.sequence;
    }
    return localPriority2.ordinal() - localPriority1.ordinal();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\PicassoExecutorService$PicassoFutureTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */