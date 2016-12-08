package com.parse;

import a.o;
import java.util.Arrays;

class OfflineObjectStore<T extends ParseObject>
  implements ParseObjectStore<T>
{
  private final String className;
  private final ParseObjectStore<T> legacy;
  private final String pinName;
  
  public OfflineObjectStore(Class<T> paramClass, String paramString, ParseObjectStore<T> paramParseObjectStore)
  {
    this(getSubclassingController().getClassName(paramClass), paramString, paramParseObjectStore);
  }
  
  public OfflineObjectStore(String paramString1, String paramString2, ParseObjectStore<T> paramParseObjectStore)
  {
    this.className = paramString1;
    this.pinName = paramString2;
    this.legacy = paramParseObjectStore;
  }
  
  private static ParseObjectSubclassingController getSubclassingController()
  {
    return ParseCorePlugins.getInstance().getSubclassingController();
  }
  
  private static <T extends ParseObject> o<T> migrate(ParseObjectStore<T> paramParseObjectStore1, ParseObjectStore<T> paramParseObjectStore2)
  {
    return paramParseObjectStore1.getAsync().d(new OfflineObjectStore.1(paramParseObjectStore1, paramParseObjectStore2));
  }
  
  public o<Void> deleteAsync()
  {
    o localo = ParseObject.unpinAllInBackground(this.pinName);
    return o.a(Arrays.asList(new o[] { this.legacy.deleteAsync(), localo })).b(new OfflineObjectStore.6(this, localo));
  }
  
  public o<Boolean> existsAsync()
  {
    return ParseQuery.getQuery(this.className).fromPin(this.pinName).ignoreACLs().countInBackground().d(new OfflineObjectStore.5(this));
  }
  
  public o<T> getAsync()
  {
    return ParseQuery.getQuery(this.className).fromPin(this.pinName).ignoreACLs().findInBackground().d(new OfflineObjectStore.4(this)).d(new OfflineObjectStore.3(this));
  }
  
  public o<Void> setAsync(T paramT)
  {
    return ParseObject.unpinAllInBackground(this.pinName).b(new OfflineObjectStore.2(this, paramT));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineObjectStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */