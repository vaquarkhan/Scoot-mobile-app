package com.squareup.okhttp;

import d.k;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class MultipartBuilder
{
  public static final MediaType ALTERNATIVE;
  private static final byte[] COLONSPACE = { 58, 32 };
  private static final byte[] CRLF = { 13, 10 };
  private static final byte[] DASHDASH = { 45, 45 };
  public static final MediaType DIGEST;
  public static final MediaType FORM;
  public static final MediaType MIXED = MediaType.parse("multipart/mixed");
  public static final MediaType PARALLEL;
  private final k boundary;
  private final List<RequestBody> partBodies = new ArrayList();
  private final List<Headers> partHeaders = new ArrayList();
  private MediaType type = MIXED;
  
  static
  {
    ALTERNATIVE = MediaType.parse("multipart/alternative");
    DIGEST = MediaType.parse("multipart/digest");
    PARALLEL = MediaType.parse("multipart/parallel");
    FORM = MediaType.parse("multipart/form-data");
  }
  
  public MultipartBuilder()
  {
    this(UUID.randomUUID().toString());
  }
  
  public MultipartBuilder(String paramString)
  {
    this.boundary = k.a(paramString);
  }
  
  private static StringBuilder appendQuotedString(StringBuilder paramStringBuilder, String paramString)
  {
    paramStringBuilder.append('"');
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default: 
        paramStringBuilder.append(c);
      }
      for (;;)
      {
        i += 1;
        break;
        paramStringBuilder.append("%0A");
        continue;
        paramStringBuilder.append("%0D");
        continue;
        paramStringBuilder.append("%22");
      }
    }
    paramStringBuilder.append('"');
    return paramStringBuilder;
  }
  
  public MultipartBuilder addFormDataPart(String paramString1, String paramString2)
  {
    return addFormDataPart(paramString1, null, RequestBody.create(null, paramString2));
  }
  
  public MultipartBuilder addFormDataPart(String paramString1, String paramString2, RequestBody paramRequestBody)
  {
    if (paramString1 == null) {
      throw new NullPointerException("name == null");
    }
    StringBuilder localStringBuilder = new StringBuilder("form-data; name=");
    appendQuotedString(localStringBuilder, paramString1);
    if (paramString2 != null)
    {
      localStringBuilder.append("; filename=");
      appendQuotedString(localStringBuilder, paramString2);
    }
    return addPart(Headers.of(new String[] { "Content-Disposition", localStringBuilder.toString() }), paramRequestBody);
  }
  
  public MultipartBuilder addPart(Headers paramHeaders, RequestBody paramRequestBody)
  {
    if (paramRequestBody == null) {
      throw new NullPointerException("body == null");
    }
    if ((paramHeaders != null) && (paramHeaders.get("Content-Type") != null)) {
      throw new IllegalArgumentException("Unexpected header: Content-Type");
    }
    if ((paramHeaders != null) && (paramHeaders.get("Content-Length") != null)) {
      throw new IllegalArgumentException("Unexpected header: Content-Length");
    }
    this.partHeaders.add(paramHeaders);
    this.partBodies.add(paramRequestBody);
    return this;
  }
  
  public MultipartBuilder addPart(RequestBody paramRequestBody)
  {
    return addPart(null, paramRequestBody);
  }
  
  public RequestBody build()
  {
    if (this.partHeaders.isEmpty()) {
      throw new IllegalStateException("Multipart body must have at least one part.");
    }
    return new MultipartBuilder.MultipartRequestBody(this.type, this.boundary, this.partHeaders, this.partBodies);
  }
  
  public MultipartBuilder type(MediaType paramMediaType)
  {
    if (paramMediaType == null) {
      throw new NullPointerException("type == null");
    }
    if (!paramMediaType.type().equals("multipart")) {
      throw new IllegalArgumentException("multipart != " + paramMediaType);
    }
    this.type = paramMediaType;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\MultipartBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */