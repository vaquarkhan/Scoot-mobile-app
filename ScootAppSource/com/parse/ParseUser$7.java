package com.parse;

import a.m;
import a.o;
import java.util.Map;

class ParseUser$7
  implements m<Void, o<Void>>
{
  ParseUser$7(ParseUser paramParseUser1, ParseUser paramParseUser2, String paramString1, String paramString2, Map paramMap) {}
  
  public o<Void> then(o<Void> paramo)
  {
    if ((paramo.d()) || (paramo.e())) {
      for (;;)
      {
        synchronized (this.val$user.mutex)
        {
          if (this.val$oldUsername != null)
          {
            this.val$user.setUsername(this.val$oldUsername);
            if (this.val$oldPassword != null)
            {
              this.val$user.setPassword(this.val$oldPassword);
              ParseUser.access$300(this.val$user, this.val$anonymousData);
              return paramo;
            }
          }
          else
          {
            this.val$user.revert("username");
          }
        }
        this.val$user.revert("password");
      }
    }
    this.val$user.revert("password");
    this.this$0.revert("password");
    this.this$0.mergeFromObject(this.val$user);
    return ParseUser.access$200(this.this$0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseUser$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */