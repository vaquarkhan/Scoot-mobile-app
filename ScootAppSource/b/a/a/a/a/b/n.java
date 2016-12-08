package b.a.a.a.a.b;

import java.io.File;
import java.util.Comparator;

final class n
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    return (int)(paramFile1.lastModified() - paramFile2.lastModified());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */