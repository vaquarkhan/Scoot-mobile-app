package com.parse;

import com.parse.http.ParseHttpResponse;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

class ParseAWSRequest$1
  implements Callable<Void>
{
  ParseAWSRequest$1(ParseAWSRequest paramParseAWSRequest, ParseHttpResponse paramParseHttpResponse, ProgressCallback paramProgressCallback) {}
  
  public Void call()
  {
    long l3 = this.val$response.getTotalSize();
    long l1 = 0L;
    try
    {
      localObject1 = this.val$response.getContent();
      try
      {
        localObject3 = ParseFileUtils.openOutputStream(ParseAWSRequest.access$000(this.this$0));
        byte[] arrayOfByte = new byte[32768];
        for (;;)
        {
          int i = ((InputStream)localObject1).read(arrayOfByte, 0, arrayOfByte.length);
          if (i == -1) {
            break;
          }
          ((FileOutputStream)localObject3).write(arrayOfByte, 0, i);
          long l2 = l1 + i;
          l1 = l2;
          if (this.val$downloadProgressCallback != null)
          {
            l1 = l2;
            if (l3 != -1L)
            {
              i = Math.round((float)l2 / (float)l3 * 100.0F);
              this.val$downloadProgressCallback.done(Integer.valueOf(i));
              l1 = l2;
            }
          }
        }
        ParseIOUtils.closeQuietly((InputStream)localObject3);
      }
      finally
      {
        localObject3 = localObject1;
        localObject1 = localObject4;
      }
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = null;
      }
    }
    throw ((Throwable)localObject1);
    ParseIOUtils.closeQuietly((InputStream)localObject1);
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAWSRequest$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */