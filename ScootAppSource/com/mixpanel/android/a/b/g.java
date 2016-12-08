package com.mixpanel.android.a.b;

import com.mixpanel.android.a.d.d;
import com.mixpanel.android.a.d.e;
import com.mixpanel.android.a.d.f;
import com.mixpanel.android.a.e.h;
import com.mixpanel.android.a.e.i;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class g
  extends a
{
  protected boolean f = false;
  protected List<d> g = new LinkedList();
  protected ByteBuffer h;
  private final Random i = new Random();
  
  public c a(com.mixpanel.android.a.e.a parama)
  {
    if ((parama.c("Origin")) && (a(parama))) {
      return c.a;
    }
    return c.b;
  }
  
  public c a(com.mixpanel.android.a.e.a parama, h paramh)
  {
    if ((parama.b("WebSocket-Origin").equals(paramh.b("Origin"))) && (a(paramh))) {
      return c.a;
    }
    return c.b;
  }
  
  public com.mixpanel.android.a.e.b a(com.mixpanel.android.a.e.b paramb)
  {
    paramb.a("Upgrade", "WebSocket");
    paramb.a("Connection", "Upgrade");
    if (!paramb.c("Origin")) {
      paramb.a("Origin", "random" + this.i.nextInt());
    }
    return paramb;
  }
  
  public com.mixpanel.android.a.e.c a(com.mixpanel.android.a.e.a parama, i parami)
  {
    parami.a("Web Socket Protocol Handshake");
    parami.a("Upgrade", "WebSocket");
    parami.a("Connection", parama.b("Connection"));
    parami.a("WebSocket-Origin", parama.b("Origin"));
    parami.a("WebSocket-Location", "ws://" + parama.b("Host") + parama.a());
    return parami;
  }
  
  public ByteBuffer a(d paramd)
  {
    if (paramd.f() != e.b) {
      throw new RuntimeException("only text frames supported");
    }
    paramd = paramd.c();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramd.remaining() + 2);
    localByteBuffer.put((byte)0);
    paramd.mark();
    localByteBuffer.put(paramd);
    paramd.reset();
    localByteBuffer.put((byte)-1);
    localByteBuffer.flip();
    return localByteBuffer;
  }
  
  public void a()
  {
    this.f = false;
    this.h = null;
  }
  
  public int b()
  {
    return b.a;
  }
  
  public a c()
  {
    return new g();
  }
  
  public List<d> c(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = e(paramByteBuffer);
    if (paramByteBuffer == null) {
      throw new com.mixpanel.android.a.c.b(1002);
    }
    return paramByteBuffer;
  }
  
  public ByteBuffer d()
  {
    return ByteBuffer.allocate(b);
  }
  
  protected List<d> e(ByteBuffer paramByteBuffer)
  {
    Object localObject2 = null;
    while (paramByteBuffer.hasRemaining())
    {
      byte b = paramByteBuffer.get();
      if (b == 0)
      {
        if (this.f) {
          throw new com.mixpanel.android.a.c.c("unexpected START_OF_FRAME");
        }
        this.f = true;
      }
      else if (b == -1)
      {
        if (!this.f) {
          throw new com.mixpanel.android.a.c.c("unexpected END_OF_FRAME");
        }
        if (this.h != null)
        {
          this.h.flip();
          localObject1 = new f();
          ((f)localObject1).a(this.h);
          ((f)localObject1).a(true);
          ((f)localObject1).a(e.b);
          this.g.add(localObject1);
          this.h = null;
          paramByteBuffer.mark();
        }
        this.f = false;
      }
      else
      {
        localObject1 = localObject2;
        if (!this.f) {
          return localObject1;
        }
        if (this.h == null) {
          this.h = d();
        }
        for (;;)
        {
          this.h.put(b);
          break;
          if (!this.h.hasRemaining()) {
            this.h = f(this.h);
          }
        }
      }
    }
    Object localObject1 = this.g;
    this.g = new LinkedList();
    return (List<d>)localObject1;
  }
  
  public ByteBuffer f(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.flip();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(a(paramByteBuffer.capacity() * 2));
    localByteBuffer.put(paramByteBuffer);
    return localByteBuffer;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */