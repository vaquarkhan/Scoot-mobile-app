package com.mixpanel.android.a.b;

import com.mixpanel.android.a.e.h;
import com.mixpanel.android.a.e.i;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class a
{
  public static int a = 1000;
  public static int b = 64;
  public static final byte[] c = com.mixpanel.android.a.f.c.a("<policy-file-request/>\000");
  protected int d = 0;
  protected com.mixpanel.android.a.d.e e = null;
  
  public static com.mixpanel.android.a.e.c a(ByteBuffer paramByteBuffer, int paramInt)
  {
    Object localObject1 = b(paramByteBuffer);
    if (localObject1 == null) {
      throw new com.mixpanel.android.a.c.a(paramByteBuffer.capacity() + 128);
    }
    Object localObject2 = ((String)localObject1).split(" ", 3);
    if (localObject2.length != 3) {
      throw new com.mixpanel.android.a.c.d();
    }
    if (paramInt == com.mixpanel.android.a.c.a)
    {
      localObject1 = new com.mixpanel.android.a.e.e();
      i locali = (i)localObject1;
      locali.a(Short.parseShort(localObject2[1]));
      locali.a(localObject2[2]);
    }
    for (localObject2 = b(paramByteBuffer);; localObject2 = b(paramByteBuffer))
    {
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
        break label178;
      }
      localObject2 = ((String)localObject2).split(":", 2);
      if (localObject2.length != 2)
      {
        throw new com.mixpanel.android.a.c.d("not an http header");
        localObject1 = new com.mixpanel.android.a.e.d();
        ((com.mixpanel.android.a.e.b)localObject1).a(localObject2[1]);
        break;
      }
      ((com.mixpanel.android.a.e.c)localObject1).a(localObject2[0], localObject2[1].replaceFirst("^ +", ""));
    }
    label178:
    if (localObject2 == null) {
      throw new com.mixpanel.android.a.c.a();
    }
    return (com.mixpanel.android.a.e.c)localObject1;
  }
  
  public static ByteBuffer a(ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    byte b1;
    for (int i = 48;; i = b1) {
      if (paramByteBuffer.hasRemaining())
      {
        b1 = paramByteBuffer.get();
        localByteBuffer.put(b1);
        if ((i == 13) && (b1 == 10))
        {
          localByteBuffer.limit(localByteBuffer.position() - 2);
          localByteBuffer.position(0);
          return localByteBuffer;
        }
      }
      else
      {
        paramByteBuffer.position(paramByteBuffer.position() - localByteBuffer.position());
        return null;
      }
    }
  }
  
  public static String b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer = a(paramByteBuffer);
    if (paramByteBuffer == null) {
      return null;
    }
    return com.mixpanel.android.a.f.c.a(paramByteBuffer.array(), 0, paramByteBuffer.limit());
  }
  
  public int a(int paramInt)
  {
    if (paramInt < 0) {
      throw new com.mixpanel.android.a.c.b(1002, "Negative count");
    }
    return paramInt;
  }
  
  public abstract c a(com.mixpanel.android.a.e.a parama);
  
  public abstract c a(com.mixpanel.android.a.e.a parama, h paramh);
  
  public abstract com.mixpanel.android.a.e.b a(com.mixpanel.android.a.e.b paramb);
  
  public abstract com.mixpanel.android.a.e.c a(com.mixpanel.android.a.e.a parama, i parami);
  
  public abstract ByteBuffer a(com.mixpanel.android.a.d.d paramd);
  
  public List<com.mixpanel.android.a.d.d> a(com.mixpanel.android.a.d.e parame, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    if ((parame != com.mixpanel.android.a.d.e.c) && (parame != com.mixpanel.android.a.d.e.b) && (parame != com.mixpanel.android.a.d.e.b)) {
      throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
    }
    com.mixpanel.android.a.d.f localf;
    if (this.e != null)
    {
      this.e = com.mixpanel.android.a.d.e.a;
      localf = new com.mixpanel.android.a.d.f(this.e);
    }
    for (;;)
    {
      try
      {
        localf.a(paramByteBuffer);
        localf.a(paramBoolean);
        if (!paramBoolean) {
          break label107;
        }
        this.e = null;
        return Collections.singletonList(localf);
      }
      catch (com.mixpanel.android.a.c.b parame)
      {
        throw new RuntimeException(parame);
      }
      this.e = parame;
      break;
      label107:
      this.e = parame;
    }
  }
  
  public List<ByteBuffer> a(com.mixpanel.android.a.e.f paramf, int paramInt)
  {
    return a(paramf, paramInt, true);
  }
  
  public List<ByteBuffer> a(com.mixpanel.android.a.e.f paramf, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = new StringBuilder(100);
    if ((paramf instanceof com.mixpanel.android.a.e.a))
    {
      ((StringBuilder)localObject1).append("GET ");
      ((StringBuilder)localObject1).append(((com.mixpanel.android.a.e.a)paramf).a());
      ((StringBuilder)localObject1).append(" HTTP/1.1");
    }
    Object localObject2;
    for (;;)
    {
      ((StringBuilder)localObject1).append("\r\n");
      localObject2 = paramf.b();
      while (((Iterator)localObject2).hasNext())
      {
        String str1 = (String)((Iterator)localObject2).next();
        String str2 = paramf.b(str1);
        ((StringBuilder)localObject1).append(str1);
        ((StringBuilder)localObject1).append(": ");
        ((StringBuilder)localObject1).append(str2);
        ((StringBuilder)localObject1).append("\r\n");
      }
      if (!(paramf instanceof h)) {
        break;
      }
      ((StringBuilder)localObject1).append("HTTP/1.1 101 " + ((h)paramf).a());
    }
    throw new RuntimeException("unknow role");
    ((StringBuilder)localObject1).append("\r\n");
    localObject1 = com.mixpanel.android.a.f.c.b(((StringBuilder)localObject1).toString());
    if (paramBoolean)
    {
      paramf = paramf.c();
      if (paramf != null) {
        break label267;
      }
    }
    label267:
    for (paramInt = 0;; paramInt = paramf.length)
    {
      localObject2 = ByteBuffer.allocate(paramInt + localObject1.length);
      ((ByteBuffer)localObject2).put((byte[])localObject1);
      if (paramf != null) {
        ((ByteBuffer)localObject2).put(paramf);
      }
      ((ByteBuffer)localObject2).flip();
      return Collections.singletonList(localObject2);
      paramf = null;
      break;
    }
  }
  
  public abstract void a();
  
  protected boolean a(com.mixpanel.android.a.e.f paramf)
  {
    return (paramf.b("Upgrade").equalsIgnoreCase("websocket")) && (paramf.b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade"));
  }
  
  public abstract int b();
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  public abstract a c();
  
  public abstract List<com.mixpanel.android.a.d.d> c(ByteBuffer paramByteBuffer);
  
  public com.mixpanel.android.a.e.f d(ByteBuffer paramByteBuffer)
  {
    return a(paramByteBuffer, this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */