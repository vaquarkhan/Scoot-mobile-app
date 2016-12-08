package com.parse;

import java.io.IOException;
import java.util.concurrent.Callable;

class GcmRegistrar$5
  implements Callable<Long>
{
  GcmRegistrar$5(GcmRegistrar paramGcmRegistrar) {}
  
  public Long call()
  {
    synchronized (GcmRegistrar.access$400(this.this$0))
    {
      long l = GcmRegistrar.access$500(this.this$0);
      if (l == 0L) {}
      try
      {
        String str = ParseFileUtils.readFileToString(GcmRegistrar.getLocalDeviceTokenLastModifiedFile(), "UTF-8");
        GcmRegistrar.access$502(this.this$0, Long.valueOf(str).longValue());
        l = GcmRegistrar.access$500(this.this$0);
        return Long.valueOf(l);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          GcmRegistrar.access$502(this.this$0, 0L);
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */