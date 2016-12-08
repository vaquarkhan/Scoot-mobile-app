package com.parse;

import a.o;
import java.util.List;

class OfflineQueryController
  extends AbstractQueryController
{
  private final ParseQueryController networkController;
  private final OfflineStore offlineStore;
  
  public OfflineQueryController(OfflineStore paramOfflineStore, ParseQueryController paramParseQueryController)
  {
    this.offlineStore = paramOfflineStore;
    this.networkController = paramParseQueryController;
  }
  
  public <T extends ParseObject> o<Integer> countAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramState.isFromLocalDatastore()) {
      return this.offlineStore.countFromPinAsync(paramState.pinName(), paramState, paramParseUser);
    }
    return this.networkController.countAsync(paramState, paramParseUser, paramo);
  }
  
  public <T extends ParseObject> o<List<T>> findAsync(ParseQuery.State<T> paramState, ParseUser paramParseUser, o<Void> paramo)
  {
    if (paramState.isFromLocalDatastore()) {
      return this.offlineStore.findFromPinAsync(paramState.pinName(), paramState, paramParseUser);
    }
    return this.networkController.findAsync(paramState, paramParseUser, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */