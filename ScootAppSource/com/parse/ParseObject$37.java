package com.parse;

import a.l;

class ParseObject$37
  extends ParseTraverser
{
  ParseObject$37(ParseObject paramParseObject, l paraml) {}
  
  protected boolean visit(Object paramObject)
  {
    if (((paramObject instanceof ParseFile)) && (((ParseFile)paramObject).isDirty())) {
      this.val$result.a(Boolean.valueOf(false));
    }
    if (((paramObject instanceof ParseObject)) && (((ParseObject)paramObject).getObjectId() == null)) {
      this.val$result.a(Boolean.valueOf(false));
    }
    return ((Boolean)this.val$result.a()).booleanValue();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$37.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */