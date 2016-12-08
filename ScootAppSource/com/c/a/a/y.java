package com.c.a.a;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.ah;
import b.a.a.a.a.d.o;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.n;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import java.io.File;
import java.util.Iterator;
import java.util.List;

final class y
  extends a
  implements o
{
  private final String b;
  
  public y(q paramq, String paramString1, String paramString2, n paramn, String paramString3)
  {
    super(paramq, paramString1, paramString2, paramn, d.b);
    this.b = paramString3;
  }
  
  public boolean a(List<File> paramList)
  {
    boolean bool = false;
    e locale = b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()).a("X-CRASHLYTICS-API-KEY", this.b);
    Iterator localIterator = paramList.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      locale.a("session_analytics_file_" + i, localFile.getName(), "application/vnd.crashlytics.android.events", localFile);
      i += 1;
    }
    f.h().a("Answers", "Sending " + paramList.size() + " analytics files to " + a());
    i = locale.b();
    f.h().a("Answers", "Response code for analytics file send is " + i);
    if (ah.a(i) == 0) {
      bool = true;
    }
    return bool;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */