package com.squareup.okhttp;

import d.f;

public final class FormEncodingBuilder
{
  private static final MediaType CONTENT_TYPE = MediaType.parse("application/x-www-form-urlencoded");
  private final f content = new f();
  
  public FormEncodingBuilder add(String paramString1, String paramString2)
  {
    if (this.content.a() > 0L) {
      this.content.b(38);
    }
    HttpUrl.canonicalize(this.content, paramString1, 0, paramString1.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
    this.content.b(61);
    HttpUrl.canonicalize(this.content, paramString2, 0, paramString2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
    return this;
  }
  
  public FormEncodingBuilder addEncoded(String paramString1, String paramString2)
  {
    if (this.content.a() > 0L) {
      this.content.b(38);
    }
    HttpUrl.canonicalize(this.content, paramString1, 0, paramString1.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true, true);
    this.content.b(61);
    HttpUrl.canonicalize(this.content, paramString2, 0, paramString2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, true, true);
    return this;
  }
  
  public RequestBody build()
  {
    return RequestBody.create(CONTENT_TYPE, this.content.v());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\FormEncodingBuilder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */