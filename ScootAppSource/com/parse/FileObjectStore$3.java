package com.parse;

import java.io.File;
import java.util.concurrent.Callable;

class FileObjectStore$3
  implements Callable<Boolean>
{
  FileObjectStore$3(FileObjectStore paramFileObjectStore) {}
  
  public Boolean call()
  {
    return Boolean.valueOf(FileObjectStore.access$100(this.this$0).exists());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FileObjectStore$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */