package com.parse;

import a.m;
import a.o;

class CachedCurrentInstallationController$2$1$1
  implements m<ParseInstallation, ParseInstallation>
{
  CachedCurrentInstallationController$2$1$1(CachedCurrentInstallationController.2.1 param1) {}
  
  public ParseInstallation then(o<ParseInstallation> paramo)
  {
    paramo = (ParseInstallation)paramo.f();
    if (paramo == null)
    {
      paramo = (ParseInstallation)ParseObject.create(ParseInstallation.class);
      paramo.updateDeviceInfo(CachedCurrentInstallationController.access$000(this.this$2.this$1.this$0));
    }
    synchronized (CachedCurrentInstallationController.access$200(this.this$2.this$1.this$0))
    {
      this.this$2.this$1.this$0.currentInstallation = paramo;
      return paramo;
      CachedCurrentInstallationController.access$000(this.this$2.this$1.this$0).set(paramo.getInstallationId());
      PLog.v("com.parse.CachedCurrentInstallationController", "Successfully deserialized Installation object");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentInstallationController$2$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */