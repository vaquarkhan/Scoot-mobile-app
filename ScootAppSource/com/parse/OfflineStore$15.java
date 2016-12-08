package com.parse;

import java.util.ArrayList;

class OfflineStore$15
  extends ParseTraverser
{
  OfflineStore$15(OfflineStore paramOfflineStore, ArrayList paramArrayList) {}
  
  protected boolean visit(Object paramObject)
  {
    if ((paramObject instanceof ParseObject)) {
      this.val$objectsInTree.add((ParseObject)paramObject);
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */