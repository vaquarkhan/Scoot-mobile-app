package android.support.b;

import java.io.File;
import java.io.FileFilter;

final class g
  implements FileFilter
{
  g(String paramString) {}
  
  public boolean accept(File paramFile)
  {
    return !paramFile.getName().startsWith(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */