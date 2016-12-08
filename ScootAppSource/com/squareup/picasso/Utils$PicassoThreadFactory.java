package com.squareup.picasso;

import java.util.concurrent.ThreadFactory;

class Utils$PicassoThreadFactory
  implements ThreadFactory
{
  public Thread newThread(Runnable paramRunnable)
  {
    return new Utils.PicassoThread(paramRunnable);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Utils$PicassoThreadFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */