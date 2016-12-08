package com.parse;

import java.lang.ref.WeakReference;

class ParseACL$UserResolutionListener
  implements GetCallback<ParseObject>
{
  private final WeakReference<ParseACL> parent;
  
  public ParseACL$UserResolutionListener(ParseACL paramParseACL)
  {
    this.parent = new WeakReference(paramParseACL);
  }
  
  public void done(ParseObject paramParseObject, ParseException paramParseException)
  {
    try
    {
      paramParseException = (ParseACL)this.parent.get();
      if (paramParseException != null) {
        paramParseException.resolveUser((ParseUser)paramParseObject);
      }
      return;
    }
    finally
    {
      paramParseObject.unregisterSaveListener(this);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseACL$UserResolutionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */