package com.parse;

import a.m;
import a.o;
import java.io.File;
import java.util.concurrent.CancellationException;

class ParseFileController$3$1
  implements m<Void, o<File>>
{
  ParseFileController$3$1(ParseFileController.3 param3, File paramFile) {}
  
  public o<File> then(o<Void> paramo)
  {
    if ((this.this$1.val$cancellationToken != null) && (this.this$1.val$cancellationToken.d())) {
      throw new CancellationException();
    }
    if (paramo.e())
    {
      ParseFileUtils.deleteQuietly(this.val$tempFile);
      return paramo.j();
    }
    ParseFileUtils.deleteQuietly(this.this$1.val$cacheFile);
    ParseFileUtils.moveFile(this.val$tempFile, this.this$1.val$cacheFile);
    return o.a(this.this$1.val$cacheFile);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController$3$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */