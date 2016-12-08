package com.parse;

import java.io.IOException;
import java.util.concurrent.Callable;

class GcmRegistrar$4
  implements Callable<Void>
{
  GcmRegistrar$4(GcmRegistrar paramGcmRegistrar) {}
  
  public Void call()
  {
    long l;
    synchronized (GcmRegistrar.access$400(this.this$0))
    {
      GcmRegistrar.access$502(this.this$0, ManifestInfo.getLastModified());
      l = GcmRegistrar.access$500(this.this$0);
    }
    try
    {
      ParseFileUtils.writeStringToFile(GcmRegistrar.getLocalDeviceTokenLastModifiedFile(), String.valueOf(l), "UTF-8");
      return null;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */