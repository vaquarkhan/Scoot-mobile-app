package com.mixpanel.android.a.b;

import android.annotation.SuppressLint;
import com.mixpanel.android.a.e.h;
import com.mixpanel.android.a.e.i;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint({"Assert", "UseValueOf"})
public class d
  extends a
{
  private ByteBuffer g;
  private com.mixpanel.android.a.d.d h = null;
  private final Random i = new Random();
  
  static
  {
    if (!d.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      return;
    }
  }
  
  private byte a(com.mixpanel.android.a.d.e parame)
  {
    if (parame == com.mixpanel.android.a.d.e.a) {
      return 0;
    }
    if (parame == com.mixpanel.android.a.d.e.b) {
      return 1;
    }
    if (parame == com.mixpanel.android.a.d.e.c) {
      return 2;
    }
    if (parame == com.mixpanel.android.a.d.e.f) {
      return 8;
    }
    if (parame == com.mixpanel.android.a.d.e.d) {
      return 9;
    }
    if (parame == com.mixpanel.android.a.d.e.e) {
      return 10;
    }
    throw new RuntimeException("Don't know how to handle " + parame.toString());
  }
  
  private com.mixpanel.android.a.d.e a(byte paramByte)
  {
    switch (paramByte)
    {
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      throw new com.mixpanel.android.a.c.c("unknow optcode " + (short)paramByte);
    case 0: 
      return com.mixpanel.android.a.d.e.a;
    case 1: 
      return com.mixpanel.android.a.d.e.b;
    case 2: 
      return com.mixpanel.android.a.d.e.c;
    case 8: 
      return com.mixpanel.android.a.d.e.f;
    case 9: 
      return com.mixpanel.android.a.d.e.d;
    }
    return com.mixpanel.android.a.d.e.e;
  }
  
  private String a(String paramString)
  {
    paramString = paramString.trim();
    paramString = paramString + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
      return com.mixpanel.android.a.f.a.a(localMessageDigest.digest(paramString.getBytes()));
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  private byte[] a(long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    while (j < paramInt)
    {
      arrayOfByte[j] = ((byte)(int)(paramLong >>> paramInt * 8 - 8 - j * 8));
      j += 1;
    }
    return arrayOfByte;
  }
  
  public static int b(com.mixpanel.android.a.e.f paramf)
  {
    int j = -1;
    paramf = paramf.b("Sec-WebSocket-Version");
    if (paramf.length() > 0) {}
    try
    {
      j = new Integer(paramf.trim()).intValue();
      return j;
    }
    catch (NumberFormatException paramf) {}
    return -1;
  }
  
  public c a(com.mixpanel.android.a.e.a parama)
  {
    int j = b(parama);
    if ((j == 7) || (j == 8))
    {
      if (a(parama)) {
        return c.a;
      }
      return c.b;
    }
    return c.b;
  }
  
  public c a(com.mixpanel.android.a.e.a parama, h paramh)
  {
    if ((!parama.c("Sec-WebSocket-Key")) || (!paramh.c("Sec-WebSocket-Accept"))) {
      return c.b;
    }
    paramh = paramh.b("Sec-WebSocket-Accept");
    if (a(parama.b("Sec-WebSocket-Key")).equals(paramh)) {
      return c.a;
    }
    return c.b;
  }
  
  public com.mixpanel.android.a.e.b a(com.mixpanel.android.a.e.b paramb)
  {
    paramb.a("Upgrade", "websocket");
    paramb.a("Connection", "Upgrade");
    paramb.a("Sec-WebSocket-Version", "8");
    byte[] arrayOfByte = new byte[16];
    this.i.nextBytes(arrayOfByte);
    paramb.a("Sec-WebSocket-Key", com.mixpanel.android.a.f.a.a(arrayOfByte));
    return paramb;
  }
  
  public com.mixpanel.android.a.e.c a(com.mixpanel.android.a.e.a parama, i parami)
  {
    parami.a("Upgrade", "websocket");
    parami.a("Connection", parama.b("Connection"));
    parami.a("Switching Protocols");
    parama = parama.b("Sec-WebSocket-Key");
    if (parama == null) {
      throw new com.mixpanel.android.a.c.d("missing Sec-WebSocket-Key");
    }
    parami.a("Sec-WebSocket-Accept", a(parama));
    return parami;
  }
  
  public ByteBuffer a(com.mixpanel.android.a.d.d paramd)
  {
    int k = -128;
    int i2 = 0;
    ByteBuffer localByteBuffer1 = paramd.c();
    int m;
    int j;
    label39:
    label49:
    int i1;
    label57:
    ByteBuffer localByteBuffer2;
    if (this.d == com.mixpanel.android.a.c.a)
    {
      m = 1;
      if (localByteBuffer1.remaining() > 125) {
        break label151;
      }
      j = 1;
      if (j <= 1) {
        break label172;
      }
      n = j + 1;
      if (m == 0) {
        break label178;
      }
      i1 = 4;
      localByteBuffer2 = ByteBuffer.allocate(i1 + (n + 1) + localByteBuffer1.remaining());
      i1 = a(paramd.f());
      if (!paramd.d()) {
        break label184;
      }
    }
    label151:
    label172:
    label178:
    label184:
    for (int n = -128;; n = 0)
    {
      localByteBuffer2.put((byte)((byte)n | i1));
      paramd = a(localByteBuffer1.remaining(), j);
      if ((f) || (paramd.length == j)) {
        break label190;
      }
      throw new AssertionError();
      m = 0;
      break;
      if (localByteBuffer1.remaining() <= 65535)
      {
        j = 2;
        break label39;
      }
      j = 8;
      break label39;
      n = j;
      break label49;
      i1 = 0;
      break label57;
    }
    label190:
    if (j == 1)
    {
      j = paramd[0];
      if (m != 0) {}
      for (;;)
      {
        localByteBuffer2.put((byte)(j | k));
        if (m == 0) {
          break;
        }
        paramd = ByteBuffer.allocate(4);
        paramd.putInt(this.i.nextInt());
        localByteBuffer2.put(paramd.array());
        j = i2;
        while (localByteBuffer1.hasRemaining())
        {
          localByteBuffer2.put((byte)(localByteBuffer1.get() ^ paramd.get(j % 4)));
          j += 1;
        }
        k = 0;
      }
    }
    if (j == 2)
    {
      if (m != 0) {}
      for (;;)
      {
        localByteBuffer2.put((byte)(k | 0x7E));
        localByteBuffer2.put(paramd);
        break;
        k = 0;
      }
    }
    if (j == 8)
    {
      if (m != 0) {}
      for (;;)
      {
        localByteBuffer2.put((byte)(k | 0x7F));
        localByteBuffer2.put(paramd);
        break;
        k = 0;
      }
    }
    throw new RuntimeException("Size representation not supported/specified");
    localByteBuffer2.put(localByteBuffer1);
    if ((!f) && (localByteBuffer2.remaining() != 0)) {
      throw new AssertionError(localByteBuffer2.remaining());
    }
    localByteBuffer2.flip();
    return localByteBuffer2;
  }
  
  public void a()
  {
    this.g = null;
  }
  
  public int b()
  {
    return b.c;
  }
  
  public a c()
  {
    return new d();
  }
  
  public List<com.mixpanel.android.a.d.d> c(ByteBuffer paramByteBuffer)
  {
    LinkedList localLinkedList = new LinkedList();
    if (this.g != null) {}
    try
    {
      paramByteBuffer.mark();
      int j = paramByteBuffer.remaining();
      int k = this.g.remaining();
      if (k > j)
      {
        this.g.put(paramByteBuffer.array(), paramByteBuffer.position(), j);
        paramByteBuffer.position(j + paramByteBuffer.position());
        return Collections.emptyList();
      }
      this.g.put(paramByteBuffer.array(), paramByteBuffer.position(), k);
      paramByteBuffer.position(paramByteBuffer.position() + k);
      localLinkedList.add(e((ByteBuffer)this.g.duplicate().position(0)));
      this.g = null;
      while (paramByteBuffer.hasRemaining())
      {
        paramByteBuffer.mark();
        try
        {
          localLinkedList.add(e(paramByteBuffer));
        }
        catch (e locale2)
        {
          paramByteBuffer.reset();
          this.g = ByteBuffer.allocate(a(locale2.a()));
          this.g.put(paramByteBuffer);
        }
      }
      return localLinkedList;
    }
    catch (e locale1)
    {
      this.g.limit();
      ByteBuffer localByteBuffer = ByteBuffer.allocate(a(locale1.a()));
      if ((!f) && (localByteBuffer.limit() <= this.g.limit())) {
        throw new AssertionError();
      }
      this.g.rewind();
      localByteBuffer.put(this.g);
      this.g = localByteBuffer;
    }
    return c(paramByteBuffer);
  }
  
  public com.mixpanel.android.a.d.d e(ByteBuffer paramByteBuffer)
  {
    int k = 2;
    int i1 = 0;
    int i2 = paramByteBuffer.remaining();
    if (i2 < 2) {
      throw new e(this, 2);
    }
    int n = paramByteBuffer.get();
    if (n >> 8 != 0) {}
    for (boolean bool = true;; bool = false)
    {
      j = (byte)((n & 0x7F) >> 4);
      if (j == 0) {
        break;
      }
      throw new com.mixpanel.android.a.c.c("bad rsv " + j);
    }
    int j = paramByteBuffer.get();
    if ((j & 0xFFFFFF80) != 0) {}
    com.mixpanel.android.a.d.e locale;
    for (int m = 1;; m = 0)
    {
      j = (byte)(j & 0x7F);
      locale = a((byte)(n & 0xF));
      if ((bool) || ((locale != com.mixpanel.android.a.d.e.d) && (locale != com.mixpanel.android.a.d.e.e) && (locale != com.mixpanel.android.a.d.e.f))) {
        break;
      }
      throw new com.mixpanel.android.a.c.c("control frames may no be fragmented");
    }
    if ((j >= 0) && (j <= 125)) {
      if (m == 0) {
        break label398;
      }
    }
    label398:
    for (n = 4;; n = 0)
    {
      k = n + k + j;
      if (i2 >= k) {
        break label404;
      }
      throw new e(this, k);
      if ((locale == com.mixpanel.android.a.d.e.d) || (locale == com.mixpanel.android.a.d.e.e) || (locale == com.mixpanel.android.a.d.e.f)) {
        throw new com.mixpanel.android.a.c.c("more than 125 octets");
      }
      if (j == 126)
      {
        if (i2 < 4) {
          throw new e(this, 4);
        }
        localObject = new byte[3];
        localObject[1] = paramByteBuffer.get();
        localObject[2] = paramByteBuffer.get();
        j = new BigInteger((byte[])localObject).intValue();
        k = 4;
        break;
      }
      if (i2 < 10) {
        throw new e(this, 10);
      }
      localObject = new byte[8];
      j = 0;
      while (j < 8)
      {
        localObject[j] = paramByteBuffer.get();
        j += 1;
      }
      long l = new BigInteger((byte[])localObject).longValue();
      if (l > 2147483647L) {
        throw new com.mixpanel.android.a.c.e("Payloadsize is to big...");
      }
      j = (int)l;
      k = 10;
      break;
    }
    label404:
    Object localObject = ByteBuffer.allocate(a(j));
    if (m != 0)
    {
      byte[] arrayOfByte = new byte[4];
      paramByteBuffer.get(arrayOfByte);
      k = i1;
      while (k < j)
      {
        ((ByteBuffer)localObject).put((byte)(paramByteBuffer.get() ^ arrayOfByte[(k % 4)]));
        k += 1;
      }
    }
    ((ByteBuffer)localObject).put(paramByteBuffer.array(), paramByteBuffer.position(), ((ByteBuffer)localObject).limit());
    paramByteBuffer.position(paramByteBuffer.position() + ((ByteBuffer)localObject).limit());
    if (locale == com.mixpanel.android.a.d.e.f) {
      paramByteBuffer = new com.mixpanel.android.a.d.b();
    }
    for (;;)
    {
      ((ByteBuffer)localObject).flip();
      paramByteBuffer.a((ByteBuffer)localObject);
      return paramByteBuffer;
      paramByteBuffer = new com.mixpanel.android.a.d.f();
      paramByteBuffer.a(bool);
      paramByteBuffer.a(locale);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */