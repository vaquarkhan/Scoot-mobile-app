package com.parse;

import java.io.File;
import java.util.concurrent.Callable;

class FileObjectStore$4
  implements Callable<Void>
{
  FileObjectStore$4(FileObjectStore paramFileObjectStore) {}
  
  public Void call()
  {
    if ((FileObjectStore.access$100(this.this$0).exists()) && (!ParseFileUtils.deleteQuietly(FileObjectStore.access$100(this.this$0)))) {
      throw new RuntimeException("Unable to delete");
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FileObjectStore$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */