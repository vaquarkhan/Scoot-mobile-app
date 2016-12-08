package com.c.a.a;

import android.content.Context;
import android.os.Looper;
import b.a.a.a.a.b.ai;
import b.a.a.a.a.d.k;
import b.a.a.a.a.d.p;
import b.a.a.a.a.f.a;
import java.io.File;

final class i
{
  final Context a;
  final a b;
  
  public i(Context paramContext, a parama)
  {
    this.a = paramContext;
    this.b = parama;
  }
  
  public x a()
  {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
    ag localag = new ag();
    ai localai = new ai();
    Object localObject = this.b.a();
    localObject = new p(this.a, (File)localObject, "session_analytics.tap", "session_analytics_to_send");
    return new x(this.a, localag, localai, (k)localObject);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */