package com.parse;

import java.util.Map;
import java.util.concurrent.Callable;

class ParseAuthenticationManager$2
  implements Callable<Boolean>
{
  ParseAuthenticationManager$2(ParseAuthenticationManager paramParseAuthenticationManager, AuthenticationCallback paramAuthenticationCallback, Map paramMap) {}
  
  public Boolean call()
  {
    return Boolean.valueOf(this.val$callback.onRestore(this.val$authData));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseAuthenticationManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */