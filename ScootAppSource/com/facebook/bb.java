package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bb
  extends FilterOutputStream
  implements bd
{
  private final Map<GraphRequest, be> a;
  private final ap b;
  private final long c;
  private long d;
  private long e;
  private long f;
  private be g;
  
  bb(OutputStream paramOutputStream, ap paramap, Map<GraphRequest, be> paramMap, long paramLong)
  {
    super(paramOutputStream);
    this.b = paramap;
    this.a = paramMap;
    this.f = paramLong;
    this.c = w.h();
  }
  
  private void a()
  {
    if (this.d > this.e)
    {
      Iterator localIterator = this.b.e().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (aq)localIterator.next();
        if ((localObject instanceof ar))
        {
          Handler localHandler = this.b.c();
          localObject = (ar)localObject;
          if (localHandler == null) {
            ((ar)localObject).a(this.b, this.d, this.f);
          } else {
            localHandler.post(new bc(this, (ar)localObject));
          }
        }
      }
      this.e = this.d;
    }
  }
  
  private void a(long paramLong)
  {
    if (this.g != null) {
      this.g.a(paramLong);
    }
    this.d += paramLong;
    if ((this.d >= this.e + this.c) || (this.d >= this.f)) {
      a();
    }
  }
  
  public void a(GraphRequest paramGraphRequest)
  {
    if (paramGraphRequest != null) {}
    for (paramGraphRequest = (be)this.a.get(paramGraphRequest);; paramGraphRequest = null)
    {
      this.g = paramGraphRequest;
      return;
    }
  }
  
  public void close()
  {
    super.close();
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((be)localIterator.next()).a();
    }
    a();
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
    a(1L);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.out.write(paramArrayOfByte);
    a(paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    a(paramInt2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */