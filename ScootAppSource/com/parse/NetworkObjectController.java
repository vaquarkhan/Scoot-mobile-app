package com.parse;

import a.o;
import java.util.ArrayList;
import java.util.List;

class NetworkObjectController
  implements ParseObjectController
{
  private ParseHttpClient client;
  private ParseObjectCoder coder;
  
  public NetworkObjectController(ParseHttpClient paramParseHttpClient)
  {
    this.client = paramParseHttpClient;
    this.coder = ParseObjectCoder.get();
  }
  
  public List<o<Void>> deleteAllAsync(List<ParseObject.State> paramList, String paramString)
  {
    int j = 0;
    int k = paramList.size();
    ArrayList localArrayList = new ArrayList(k);
    int i = 0;
    while (i < k)
    {
      ParseRESTObjectCommand localParseRESTObjectCommand = ParseRESTObjectCommand.deleteObjectCommand((ParseObject.State)paramList.get(i), paramString);
      localParseRESTObjectCommand.enableRetrying();
      localArrayList.add(localParseRESTObjectCommand);
      i += 1;
    }
    paramList = ParseRESTObjectBatchCommand.executeBatch(this.client, localArrayList, paramString);
    paramString = new ArrayList(k);
    i = j;
    while (i < k)
    {
      paramString.add(((o)paramList.get(i)).k());
      i += 1;
    }
    return paramString;
  }
  
  public o<Void> deleteAsync(ParseObject.State paramState, String paramString)
  {
    paramState = ParseRESTObjectCommand.deleteObjectCommand(paramState, paramString);
    paramState.enableRetrying();
    return paramState.executeAsync(this.client).k();
  }
  
  public o<ParseObject.State> fetchAsync(ParseObject.State paramState, String paramString, ParseDecoder paramParseDecoder)
  {
    paramString = ParseRESTObjectCommand.getObjectCommand(paramState.objectId(), paramState.className(), paramString);
    paramString.enableRetrying();
    return paramString.executeAsync(this.client).c(new NetworkObjectController.1(this, paramState, paramParseDecoder));
  }
  
  public List<o<ParseObject.State>> saveAllAsync(List<ParseObject.State> paramList, List<ParseOperationSet> paramList1, String paramString, List<ParseDecoder> paramList2)
  {
    int j = paramList.size();
    Object localObject1 = new ArrayList(j);
    Object localObject2 = PointerEncoder.get();
    int i = 0;
    while (i < j)
    {
      ParseObject.State localState = (ParseObject.State)paramList.get(i);
      ParseOperationSet localParseOperationSet = (ParseOperationSet)paramList1.get(i);
      ((List)localObject1).add(ParseRESTObjectCommand.saveObjectCommand(localState, this.coder.encode(localState, localParseOperationSet, (ParseEncoder)localObject2), paramString));
      i += 1;
    }
    paramList1 = ParseRESTObjectBatchCommand.executeBatch(this.client, (List)localObject1, paramString);
    paramString = new ArrayList(j);
    i = 0;
    while (i < j)
    {
      localObject1 = (ParseObject.State)paramList.get(i);
      localObject2 = (ParseDecoder)paramList2.get(i);
      paramString.add(((o)paramList1.get(i)).c(new NetworkObjectController.3(this, (ParseObject.State)localObject1, (ParseDecoder)localObject2)));
      i += 1;
    }
    return paramString;
  }
  
  public o<ParseObject.State> saveAsync(ParseObject.State paramState, ParseOperationSet paramParseOperationSet, String paramString, ParseDecoder paramParseDecoder)
  {
    paramParseOperationSet = ParseRESTObjectCommand.saveObjectCommand(paramState, this.coder.encode(paramState, paramParseOperationSet, PointerEncoder.get()), paramString);
    paramParseOperationSet.enableRetrying();
    return paramParseOperationSet.executeAsync(this.client).c(new NetworkObjectController.2(this, paramState, paramParseDecoder));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\NetworkObjectController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */