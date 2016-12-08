package com.c.a.c;

import android.content.Context;
import b.a.a.a.a.b.k;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class bv
{
  static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
  private static final FilenameFilter b = new bw();
  private static final short[] c = { 10, 20, 30, 60, 120, 300 };
  private final Object d = new Object();
  private final ar e;
  private Thread f;
  
  public bv(ar paramar)
  {
    if (paramar == null) {
      throw new IllegalArgumentException("createReportCall must not be null.");
    }
    this.e = paramar;
  }
  
  List<bu> a()
  {
    f.h().a("CrashlyticsCore", "Checking for crash reports...");
    synchronized (this.d)
    {
      File[] arrayOfFile = h.f().w().listFiles(b);
      ??? = new LinkedList();
      int j = arrayOfFile.length;
      int i = 0;
      if (i < j)
      {
        File localFile = arrayOfFile[i];
        f.h().a("CrashlyticsCore", "Found crash report " + localFile.getPath());
        ((List)???).add(new bz(localFile));
        i += 1;
      }
    }
    if (((List)???).isEmpty()) {
      f.h().a("CrashlyticsCore", "No reports found.");
    }
    return (List<bu>)???;
  }
  
  public void a(float paramFloat)
  {
    try
    {
      if (this.f == null)
      {
        this.f = new Thread(new bx(this, paramFloat), "Crashlytics Report Uploader");
        this.f.start();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean a(bu parambu)
  {
    boolean bool2 = false;
    synchronized (this.d)
    {
      try
      {
        localObject1 = h.f().E();
        localObject1 = new aq(new k().a((Context)localObject1), parambu);
        boolean bool3 = this.e.a((aq)localObject1);
        t localt = f.h();
        StringBuilder localStringBuilder = new StringBuilder().append("Crashlytics report upload ");
        if (!bool3) {
          break label131;
        }
        localObject1 = "complete: ";
        localt.c("CrashlyticsCore", (String)localObject1 + parambu.b());
        bool1 = bool2;
        if (bool3)
        {
          parambu.a();
          bool1 = true;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject1;
          label131:
          f.h().e("CrashlyticsCore", "Error occurred sending report " + parambu, localException);
          boolean bool1 = bool2;
        }
      }
      return bool1;
      localObject1 = "FAILED: ";
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */