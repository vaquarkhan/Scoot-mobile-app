package com.parse;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class OfflineQueryLogic$16
  implements Comparator<T>
{
  OfflineQueryLogic$16(String paramString, ParseGeoPoint paramParseGeoPoint, List paramList) {}
  
  public int compare(T paramT1, T paramT2)
  {
    Object localObject1;
    int j;
    if (this.val$nearSphereKey != null)
    {
      try
      {
        localObject1 = (ParseGeoPoint)OfflineQueryLogic.access$200(paramT1, this.val$nearSphereKey);
        localObject2 = (ParseGeoPoint)OfflineQueryLogic.access$200(paramT2, this.val$nearSphereKey);
        double d1 = ((ParseGeoPoint)localObject1).distanceInRadiansTo(this.val$nearSphereValue);
        double d2 = ((ParseGeoPoint)localObject2).distanceInRadiansTo(this.val$nearSphereValue);
        if (d1 == d2) {
          break label88;
        }
        if (d1 - d2 > 0.0D)
        {
          j = 1;
          return j;
        }
      }
      catch (ParseException paramT1)
      {
        throw new RuntimeException(paramT1);
      }
      return -1;
    }
    label88:
    Object localObject2 = this.val$keys.iterator();
    label99:
    if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      if (!((String)localObject1).startsWith("-")) {
        break label221;
      }
      localObject1 = ((String)localObject1).substring(1);
    }
    label221:
    for (int i = 1;; i = 0)
    {
      try
      {
        localObject3 = OfflineQueryLogic.access$200(paramT1, (String)localObject1);
        localObject4 = OfflineQueryLogic.access$200(paramT2, (String)localObject1);
      }
      catch (ParseException paramT1)
      {
        try
        {
          Object localObject3;
          Object localObject4;
          int k = OfflineQueryLogic.access$000(localObject3, localObject4);
          if (k == 0) {
            break label99;
          }
          j = k;
          if (i == 0) {
            break;
          }
          return -k;
        }
        catch (IllegalArgumentException paramT1)
        {
          throw new IllegalArgumentException(String.format("Unable to sort by key %s.", new Object[] { localObject1 }), paramT1);
        }
        paramT1 = paramT1;
        throw new RuntimeException(paramT1);
      }
      return 0;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineQueryLogic$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */