package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import d.f;
import d.i;
import d.k;
import java.util.List;

final class MultipartBuilder$MultipartRequestBody
  extends RequestBody
{
  private final k boundary;
  private long contentLength = -1L;
  private final MediaType contentType;
  private final List<RequestBody> partBodies;
  private final List<Headers> partHeaders;
  
  public MultipartBuilder$MultipartRequestBody(MediaType paramMediaType, k paramk, List<Headers> paramList, List<RequestBody> paramList1)
  {
    if (paramMediaType == null) {
      throw new NullPointerException("type == null");
    }
    this.boundary = paramk;
    this.contentType = MediaType.parse(paramMediaType + "; boundary=" + paramk.a());
    this.partHeaders = Util.immutableList(paramList);
    this.partBodies = Util.immutableList(paramList1);
  }
  
  private long writeOrCountBytes(i parami, boolean paramBoolean)
  {
    long l1 = 0L;
    if (paramBoolean) {
      parami = new f();
    }
    for (i locali = parami;; locali = null)
    {
      int k = this.partHeaders.size();
      int i = 0;
      if (i < k)
      {
        Object localObject = (Headers)this.partHeaders.get(i);
        RequestBody localRequestBody = (RequestBody)this.partBodies.get(i);
        parami.c(MultipartBuilder.access$000());
        parami.b(this.boundary);
        parami.c(MultipartBuilder.access$100());
        if (localObject != null)
        {
          int j = 0;
          int m = ((Headers)localObject).size();
          while (j < m)
          {
            parami.b(((Headers)localObject).name(j)).c(MultipartBuilder.access$200()).b(((Headers)localObject).value(j)).c(MultipartBuilder.access$100());
            j += 1;
          }
        }
        localObject = localRequestBody.contentType();
        if (localObject != null) {
          parami.b("Content-Type: ").b(((MediaType)localObject).toString()).c(MultipartBuilder.access$100());
        }
        l2 = localRequestBody.contentLength();
        if (l2 != -1L) {
          parami.b("Content-Length: ").k(l2).c(MultipartBuilder.access$100());
        }
        while (!paramBoolean)
        {
          parami.c(MultipartBuilder.access$100());
          if (!paramBoolean) {
            break label305;
          }
          l1 = l2 + l1;
          parami.c(MultipartBuilder.access$100());
          i += 1;
          break;
        }
        locali.t();
        l2 = -1L;
      }
      label305:
      do
      {
        return l2;
        ((RequestBody)this.partBodies.get(i)).writeTo(parami);
        break;
        parami.c(MultipartBuilder.access$000());
        parami.b(this.boundary);
        parami.c(MultipartBuilder.access$000());
        parami.c(MultipartBuilder.access$100());
        l2 = l1;
      } while (!paramBoolean);
      long l2 = locali.a();
      locali.t();
      return l1 + l2;
    }
  }
  
  public long contentLength()
  {
    long l = this.contentLength;
    if (l != -1L) {
      return l;
    }
    l = writeOrCountBytes(null, true);
    this.contentLength = l;
    return l;
  }
  
  public MediaType contentType()
  {
    return this.contentType;
  }
  
  public void writeTo(i parami)
  {
    writeOrCountBytes(parami, false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\MultipartBuilder$MultipartRequestBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */