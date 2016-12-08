package com.parse;

class ParseObject$State$Builder
  extends ParseObject.State.Init<Builder>
{
  public ParseObject$State$Builder(ParseObject.State paramState)
  {
    super(paramState);
  }
  
  public ParseObject$State$Builder(String paramString)
  {
    super(paramString);
  }
  
  public ParseObject.State build()
  {
    return new ParseObject.State(this);
  }
  
  Builder self()
  {
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$State$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */