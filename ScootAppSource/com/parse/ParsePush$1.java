package com.parse;

import a.m;
import a.o;

class ParsePush$1
  implements m<String, o<Void>>
{
  ParsePush$1(ParsePush paramParsePush, ParsePush.State paramState) {}
  
  public o<Void> then(o<String> paramo)
  {
    paramo = (String)paramo.f();
    return ParsePush.getPushController().sendInBackground(this.val$state, paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParsePush$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */