package com.squareup.okhttp;

import d.i;

final class RequestBody$2
  extends RequestBody
{
  RequestBody$2(MediaType paramMediaType, int paramInt1, byte[] paramArrayOfByte, int paramInt2) {}
  
  public long contentLength()
  {
    return this.val$byteCount;
  }
  
  public MediaType contentType()
  {
    return this.val$contentType;
  }
  
  public void writeTo(i parami)
  {
    parami.c(this.val$content, this.val$offset, this.val$byteCount);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\RequestBody$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */