package com.parse;

class ParseFile$State$Builder
{
  private String mimeType;
  private String name;
  private String url;
  
  public ParseFile$State$Builder() {}
  
  public ParseFile$State$Builder(ParseFile.State paramState)
  {
    this.name = paramState.name();
    this.mimeType = paramState.mimeType();
    this.url = paramState.url();
  }
  
  public ParseFile.State build()
  {
    return new ParseFile.State(this, null);
  }
  
  public Builder mimeType(String paramString)
  {
    this.mimeType = paramString;
    return this;
  }
  
  public Builder name(String paramString)
  {
    this.name = paramString;
    return this;
  }
  
  public Builder url(String paramString)
  {
    this.url = paramString;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$State$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */