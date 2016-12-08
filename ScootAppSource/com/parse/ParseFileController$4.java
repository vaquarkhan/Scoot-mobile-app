package com.parse;

import java.io.File;
import java.util.concurrent.Callable;

class ParseFileController$4
  implements Callable<Boolean>
{
  ParseFileController$4(ParseFileController paramParseFileController, File paramFile) {}
  
  public Boolean call()
  {
    return Boolean.valueOf(this.val$cacheFile.exists());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFileController$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */