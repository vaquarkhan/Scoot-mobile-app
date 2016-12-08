package com.parse;

import a.m;
import a.o;
import com.parse.http.ParseHttpRequest.Method;
import java.io.File;

class ParseFileController$3
  implements m<Boolean, o<File>>
{
  ParseFileController$3(ParseFileController paramParseFileController, File paramFile, o paramo, ParseFile.State paramState, ProgressCallback paramProgressCallback) {}
  
  public o<File> then(o<Boolean> paramo)
  {
    if (((Boolean)paramo.f()).booleanValue()) {
      return o.a(this.val$cacheFile);
    }
    if ((this.val$cancellationToken != null) && (this.val$cancellationToken.d())) {
      return o.i();
    }
    paramo = this.this$0.getTempFile(this.val$state);
    return new ParseAWSRequest(ParseHttpRequest.Method.GET, this.val$state.url(), paramo).executeAsync(this.this$0.awsClient(), null, this.val$downloadProgressCallback, this.val$cancellationToken).b(new ParseFileController.3.1(this, paramo), ParseExecutors.io());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */