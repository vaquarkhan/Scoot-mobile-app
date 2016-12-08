package com.parse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

final class ParseObject$36
  extends ParseTraverser
{
  ParseObject$36(Collection paramCollection1, Collection paramCollection2, Set paramSet1, Set paramSet2) {}
  
  protected boolean visit(Object paramObject)
  {
    if ((paramObject instanceof ParseFile)) {
      if (this.val$dirtyFiles != null) {}
    }
    label188:
    for (;;)
    {
      return true;
      paramObject = (ParseFile)paramObject;
      if (((ParseFile)paramObject).getUrl() == null)
      {
        this.val$dirtyFiles.add(paramObject);
        return true;
        if (((paramObject instanceof ParseObject)) && (this.val$dirtyChildren != null))
        {
          ParseObject localParseObject = (ParseObject)paramObject;
          Object localObject = this.val$alreadySeen;
          paramObject = this.val$alreadySeenNew;
          if (localParseObject.getObjectId() != null) {
            paramObject = new HashSet();
          }
          for (;;)
          {
            if (((Set)localObject).contains(localParseObject)) {
              break label188;
            }
            localObject = new HashSet((Collection)localObject);
            ((Set)localObject).add(localParseObject);
            ParseObject.access$1400(ParseObject.access$1300(localParseObject), this.val$dirtyChildren, this.val$dirtyFiles, (Set)localObject, (Set)paramObject);
            if (!localParseObject.isDirty(false)) {
              break;
            }
            this.val$dirtyChildren.add(localParseObject);
            return true;
            if (((Set)paramObject).contains(localParseObject)) {
              throw new RuntimeException("Found a circular dependency while saving.");
            }
            paramObject = new HashSet((Collection)paramObject);
            ((Set)paramObject).add(localParseObject);
          }
        }
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObject$36.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */