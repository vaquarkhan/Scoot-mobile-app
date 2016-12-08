package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache.Editor;
import com.squareup.okhttp.internal.DiskLruCache.Snapshot;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.StatusLine;
import d.ad;
import d.i;
import d.j;
import d.k;
import d.r;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;

final class Cache$Entry
{
  private final int code;
  private final Handshake handshake;
  private final String message;
  private final Protocol protocol;
  private final String requestMethod;
  private final Headers responseHeaders;
  private final String url;
  private final Headers varyHeaders;
  
  public Cache$Entry(Response paramResponse)
  {
    this.url = paramResponse.request().urlString();
    this.varyHeaders = OkHeaders.varyHeaders(paramResponse);
    this.requestMethod = paramResponse.request().method();
    this.protocol = paramResponse.protocol();
    this.code = paramResponse.code();
    this.message = paramResponse.message();
    this.responseHeaders = paramResponse.headers();
    this.handshake = paramResponse.handshake();
  }
  
  public Cache$Entry(ad paramad)
  {
    try
    {
      j localj1 = r.a(paramad);
      this.url = localj1.r();
      this.requestMethod = localj1.r();
      Object localObject = new Headers.Builder();
      int k = Cache.access$1000(localj1);
      int i = 0;
      while (i < k)
      {
        ((Headers.Builder)localObject).addLenient(localj1.r());
        i += 1;
      }
      this.varyHeaders = ((Headers.Builder)localObject).build();
      localObject = StatusLine.parse(localj1.r());
      this.protocol = ((StatusLine)localObject).protocol;
      this.code = ((StatusLine)localObject).code;
      this.message = ((StatusLine)localObject).message;
      localObject = new Headers.Builder();
      k = Cache.access$1000(localj1);
      i = j;
      while (i < k)
      {
        ((Headers.Builder)localObject).addLenient(localj1.r());
        i += 1;
      }
      this.responseHeaders = ((Headers.Builder)localObject).build();
      if (isHttps())
      {
        localObject = localj1.r();
        if (((String)localObject).length() > 0) {
          throw new IOException("expected \"\" but was \"" + (String)localObject + "\"");
        }
      }
    }
    finally
    {
      paramad.close();
    }
    for (this.handshake = Handshake.get(localj2.r(), readCertificateList(localj2), readCertificateList(localj2));; this.handshake = null)
    {
      paramad.close();
      return;
    }
  }
  
  private boolean isHttps()
  {
    return this.url.startsWith("https://");
  }
  
  /* Error */
  private List<Certificate> readCertificateList(j paramj)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 95	com/squareup/okhttp/Cache:access$1000	(Ld/j;)I
    //   4: istore_3
    //   5: iload_3
    //   6: iconst_m1
    //   7: if_icmpne +11 -> 18
    //   10: invokestatic 168	java/util/Collections:emptyList	()Ljava/util/List;
    //   13: astore 4
    //   15: aload 4
    //   17: areturn
    //   18: ldc -86
    //   20: invokestatic 176	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   23: astore 6
    //   25: new 178	java/util/ArrayList
    //   28: dup
    //   29: iload_3
    //   30: invokespecial 181	java/util/ArrayList:<init>	(I)V
    //   33: astore 5
    //   35: iconst_0
    //   36: istore_2
    //   37: aload 5
    //   39: astore 4
    //   41: iload_2
    //   42: iload_3
    //   43: if_icmpge -28 -> 15
    //   46: aload_1
    //   47: invokeinterface 86 1 0
    //   52: astore 4
    //   54: new 183	d/f
    //   57: dup
    //   58: invokespecial 184	d/f:<init>	()V
    //   61: astore 7
    //   63: aload 7
    //   65: aload 4
    //   67: invokestatic 190	d/k:b	(Ljava/lang/String;)Ld/k;
    //   70: invokevirtual 193	d/f:a	(Ld/k;)Ld/f;
    //   73: pop
    //   74: aload 5
    //   76: aload 6
    //   78: aload 7
    //   80: invokevirtual 197	d/f:g	()Ljava/io/InputStream;
    //   83: invokevirtual 201	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   86: invokeinterface 207 2 0
    //   91: pop
    //   92: iload_2
    //   93: iconst_1
    //   94: iadd
    //   95: istore_2
    //   96: goto -59 -> 37
    //   99: astore_1
    //   100: new 122	java/io/IOException
    //   103: dup
    //   104: aload_1
    //   105: invokevirtual 210	java/security/cert/CertificateException:getMessage	()Ljava/lang/String;
    //   108: invokespecial 139	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	Entry
    //   0	112	1	paramj	j
    //   36	60	2	i	int
    //   4	40	3	j	int
    //   13	53	4	localObject	Object
    //   33	42	5	localArrayList	java.util.ArrayList
    //   23	54	6	localCertificateFactory	java.security.cert.CertificateFactory
    //   61	18	7	localf	d.f
    // Exception table:
    //   from	to	target	type
    //   18	35	99	java/security/cert/CertificateException
    //   46	92	99	java/security/cert/CertificateException
  }
  
  private void writeCertList(i parami, List<Certificate> paramList)
  {
    try
    {
      parami.k(paramList.size());
      parami.i(10);
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        parami.b(k.a(((Certificate)paramList.get(i)).getEncoded()).b());
        parami.i(10);
        i += 1;
      }
      return;
    }
    catch (CertificateEncodingException parami)
    {
      throw new IOException(parami.getMessage());
    }
  }
  
  public boolean matches(Request paramRequest, Response paramResponse)
  {
    return (this.url.equals(paramRequest.urlString())) && (this.requestMethod.equals(paramRequest.method())) && (OkHeaders.varyMatches(paramResponse, this.varyHeaders, paramRequest));
  }
  
  public Response response(Request paramRequest, DiskLruCache.Snapshot paramSnapshot)
  {
    paramRequest = this.responseHeaders.get("Content-Type");
    String str = this.responseHeaders.get("Content-Length");
    Request localRequest = new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build();
    return new Response.Builder().request(localRequest).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new Cache.CacheResponseBody(paramSnapshot, paramRequest, str)).handshake(this.handshake).build();
  }
  
  public void writeTo(DiskLruCache.Editor paramEditor)
  {
    int j = 0;
    paramEditor = r.a(paramEditor.newSink(0));
    paramEditor.b(this.url);
    paramEditor.i(10);
    paramEditor.b(this.requestMethod);
    paramEditor.i(10);
    paramEditor.k(this.varyHeaders.size());
    paramEditor.i(10);
    int k = this.varyHeaders.size();
    int i = 0;
    while (i < k)
    {
      paramEditor.b(this.varyHeaders.name(i));
      paramEditor.b(": ");
      paramEditor.b(this.varyHeaders.value(i));
      paramEditor.i(10);
      i += 1;
    }
    paramEditor.b(new StatusLine(this.protocol, this.code, this.message).toString());
    paramEditor.i(10);
    paramEditor.k(this.responseHeaders.size());
    paramEditor.i(10);
    k = this.responseHeaders.size();
    i = j;
    while (i < k)
    {
      paramEditor.b(this.responseHeaders.name(i));
      paramEditor.b(": ");
      paramEditor.b(this.responseHeaders.value(i));
      paramEditor.i(10);
      i += 1;
    }
    if (isHttps())
    {
      paramEditor.i(10);
      paramEditor.b(this.handshake.cipherSuite());
      paramEditor.i(10);
      writeCertList(paramEditor, this.handshake.peerCertificates());
      writeCertList(paramEditor, this.handshake.localCertificates());
    }
    paramEditor.close();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Cache$Entry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */