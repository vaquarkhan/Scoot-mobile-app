package com.appsee;

import java.io.File;
import java.util.Comparator;

class ic
  implements Comparator<File>
{
  ic(qc paramqc) {}
  
  public int C(File paramFile1, File paramFile2)
  {
    int i = qc.C(this.l, bb.C(paramFile1.getName()));
    int j = qc.C(this.l, bb.C(paramFile2.getName()));
    if (i < j) {}
    do
    {
      return -1;
      if (i > j) {
        return 1;
      }
    } while (paramFile1.lastModified() < paramFile2.lastModified());
    return 1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */