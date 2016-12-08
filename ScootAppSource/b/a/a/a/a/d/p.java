package b.a.a.a.a.d;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class p
  extends q
{
  public p(Context paramContext, File paramFile, String paramString1, String paramString2)
  {
    super(paramContext, paramFile, paramString1, paramString2);
  }
  
  public OutputStream a(File paramFile)
  {
    return new GZIPOutputStream(new FileOutputStream(paramFile));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */