package com.squareup.okhttp.internal.framed;

import d.ad;
import d.f;
import d.n;

class NameValueBlockReader$1
  extends n
{
  NameValueBlockReader$1(NameValueBlockReader paramNameValueBlockReader, ad paramad)
  {
    super(paramad);
  }
  
  public long read(f paramf, long paramLong)
  {
    if (NameValueBlockReader.access$000(this.this$0) == 0) {}
    do
    {
      return -1L;
      paramLong = super.read(paramf, Math.min(paramLong, NameValueBlockReader.access$000(this.this$0)));
    } while (paramLong == -1L);
    NameValueBlockReader.access$002(this.this$0, (int)(NameValueBlockReader.access$000(this.this$0) - paramLong));
    return paramLong;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\NameValueBlockReader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */