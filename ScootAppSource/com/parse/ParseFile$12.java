package com.parse;

import a.m;
import a.o;
import java.io.File;

class ParseFile$12
  implements m<Void, o<File>>
{
  ParseFile$12(ParseFile paramParseFile, o paramo, ProgressCallback paramProgressCallback) {}
  
  public o<File> then(o<Void> paramo)
  {
    if ((this.val$cancellationToken != null) && (this.val$cancellationToken.d())) {
      return o.i();
    }
    return ParseFile.getFileController().fetchAsync(ParseFile.access$400(this.this$0), null, ParseFile.access$500(this.val$progressCallback), this.val$cancellationToken);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */