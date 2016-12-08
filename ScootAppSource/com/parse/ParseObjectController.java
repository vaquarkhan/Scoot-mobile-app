package com.parse;

import a.o;
import java.util.List;

abstract interface ParseObjectController
{
  public abstract List<o<Void>> deleteAllAsync(List<ParseObject.State> paramList, String paramString);
  
  public abstract o<Void> deleteAsync(ParseObject.State paramState, String paramString);
  
  public abstract o<ParseObject.State> fetchAsync(ParseObject.State paramState, String paramString, ParseDecoder paramParseDecoder);
  
  public abstract List<o<ParseObject.State>> saveAllAsync(List<ParseObject.State> paramList, List<ParseOperationSet> paramList1, String paramString, List<ParseDecoder> paramList2);
  
  public abstract o<ParseObject.State> saveAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet, String paramString, ParseDecoder paramParseDecoder);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObjectController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */