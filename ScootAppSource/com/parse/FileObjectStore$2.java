package com.parse;

import java.io.File;
import java.util.concurrent.Callable;

class FileObjectStore$2
  implements Callable<T>
{
  FileObjectStore$2(FileObjectStore paramFileObjectStore) {}
  
  public T call()
  {
    if (!FileObjectStore.access$100(this.this$0).exists()) {
      return null;
    }
    return FileObjectStore.access$400(FileObjectStore.access$000(this.this$0), FileObjectStore.access$100(this.this$0), ParseObject.State.newBuilder(FileObjectStore.access$300(this.this$0)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\FileObjectStore$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */