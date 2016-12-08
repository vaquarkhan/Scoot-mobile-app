package com.parse;

import a.m;
import a.o;

class GcmRegistrar$1
  implements m<Boolean, o<Void>>
{
  GcmRegistrar$1(GcmRegistrar paramGcmRegistrar, ParseInstallation paramParseInstallation) {}
  
  public o<Void> then(o<Boolean> paramo)
  {
    if (!((Boolean)paramo.f()).booleanValue()) {
      return o.a(null);
    }
    if (this.val$installation.getPushType() != PushType.GCM) {
      this.val$installation.setPushType(PushType.GCM);
    }
    GcmRegistrar.access$000(this.this$0);
    return o.a(null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\GcmRegistrar$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */