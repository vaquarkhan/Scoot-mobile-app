package com.parse;

import a.m;
import a.o;

class GcmRegistrar$2
  implements m<String, Void>
{
  GcmRegistrar$2(GcmRegistrar paramGcmRegistrar) {}
  
  public Void then(o<String> arg1)
  {
    ??? = ???.g();
    if (??? != null) {
      PLog.e("com.parse.GcmRegistrar", "Got error when trying to register for GCM push", ???);
    }
    synchronized (GcmRegistrar.access$100(this.this$0))
    {
      GcmRegistrar.access$202(this.this$0, null);
      return null;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */