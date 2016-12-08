package b.a.a.a.a.f;

import android.content.Context;
import b.a.a.a.f;
import b.a.a.a.q;
import b.a.a.a.t;
import java.io.File;

public final class b
  implements a
{
  private final Context a;
  private final String b;
  private final String c;
  
  public b(q paramq)
  {
    if (paramq.E() == null) {
      throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }
    this.a = paramq.E();
    this.b = paramq.G();
    this.c = ("Android/" + this.a.getPackageName());
  }
  
  public File a()
  {
    return a(this.a.getFilesDir());
  }
  
  File a(File paramFile)
  {
    if (paramFile != null)
    {
      if ((paramFile.exists()) || (paramFile.mkdirs())) {
        return paramFile;
      }
      f.h().d("Fabric", "Couldn't create file");
    }
    for (;;)
    {
      return null;
      f.h().a("Fabric", "Null File");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */