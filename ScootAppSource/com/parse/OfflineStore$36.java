package com.parse;

import a.m;
import a.o;
import java.util.List;

class OfflineStore$36
  implements m<List<ParsePin>, ParsePin>
{
  OfflineStore$36(OfflineStore paramOfflineStore, String paramString) {}
  
  public ParsePin then(o<List<ParsePin>> paramo)
  {
    if ((paramo.f() != null) && (((List)paramo.f()).size() > 0)) {}
    for (paramo = (ParsePin)((List)paramo.f()).get(0);; paramo = null)
    {
      Object localObject = paramo;
      if (paramo == null)
      {
        localObject = (ParsePin)ParseObject.create(ParsePin.class);
        ((ParsePin)localObject).setName(this.val$name);
      }
      return (ParsePin)localObject;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$36.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */