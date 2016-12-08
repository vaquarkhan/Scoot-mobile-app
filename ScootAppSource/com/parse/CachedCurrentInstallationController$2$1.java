package com.parse;

import a.m;
import a.o;

class CachedCurrentInstallationController$2$1
  implements m<Void, o<ParseInstallation>>
{
  CachedCurrentInstallationController$2$1(CachedCurrentInstallationController.2 param2) {}
  
  public o<ParseInstallation> then(o<Void> arg1)
  {
    synchronized (CachedCurrentInstallationController.access$200(this.this$1.this$0))
    {
      if (this.this$1.this$0.currentInstallation != null)
      {
        o localo = o.a(this.this$1.this$0.currentInstallation);
        return localo;
      }
      return CachedCurrentInstallationController.access$100(this.this$1.this$0).getAsync().a(new CachedCurrentInstallationController.2.1.1(this), ParseExecutors.io());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\CachedCurrentInstallationController$2$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */