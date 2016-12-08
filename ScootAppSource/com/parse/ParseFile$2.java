package com.parse;

import a.m;
import a.o;

class ParseFile$2
  implements m<Void, o<Void>>
{
  ParseFile$2(ParseFile paramParseFile, o paramo, String paramString, ProgressCallback paramProgressCallback) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if (!this.this$0.isDirty()) {
      return o.a(null);
    }
    if ((this.val$cancellationToken != null) && (this.val$cancellationToken.d())) {
      return o.i();
    }
    if (this.this$0.data != null) {}
    for (paramo = ParseFile.getFileController().saveAsync(ParseFile.access$400(this.this$0), this.this$0.data, this.val$sessionToken, ParseFile.access$500(this.val$uploadProgressCallback), this.val$cancellationToken);; paramo = ParseFile.getFileController().saveAsync(ParseFile.access$400(this.this$0), this.this$0.file, this.val$sessionToken, ParseFile.access$500(this.val$uploadProgressCallback), this.val$cancellationToken)) {
      return paramo.d(new ParseFile.2.1(this));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */