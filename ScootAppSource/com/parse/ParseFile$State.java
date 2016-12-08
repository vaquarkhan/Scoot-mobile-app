package com.parse;

class ParseFile$State
{
  private final String contentType;
  private final String name;
  private final String url;
  
  private ParseFile$State(ParseFile.State.Builder paramBuilder)
  {
    if (ParseFile.State.Builder.access$100(paramBuilder) != null) {}
    for (String str = ParseFile.State.Builder.access$100(paramBuilder);; str = "file")
    {
      this.name = str;
      this.contentType = ParseFile.State.Builder.access$200(paramBuilder);
      this.url = ParseFile.State.Builder.access$300(paramBuilder);
      return;
    }
  }
  
  public String mimeType()
  {
    return this.contentType;
  }
  
  public String name()
  {
    return this.name;
  }
  
  public String url()
  {
    return this.url;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */