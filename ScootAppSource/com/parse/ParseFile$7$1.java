package com.parse;

import a.m;
import a.o;
import java.io.File;
import java.io.IOException;

class ParseFile$7$1
  implements m<File, byte[]>
{
  ParseFile$7$1(ParseFile.7 param7) {}
  
  public byte[] then(o<File> paramo)
  {
    paramo = (File)paramo.f();
    try
    {
      paramo = ParseFileUtils.readFileToByteArray(paramo);
      return paramo;
    }
    catch (IOException paramo) {}
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseFile$7$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */