package com.squareup.okhttp.internal.io;

import d.ac;
import d.ad;
import d.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class FileSystem$1
  implements FileSystem
{
  public ac appendingSink(File paramFile)
  {
    try
    {
      ac localac = r.c(paramFile);
      return localac;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      paramFile.getParentFile().mkdirs();
    }
    return r.c(paramFile);
  }
  
  public void delete(File paramFile)
  {
    if ((!paramFile.delete()) && (paramFile.exists())) {
      throw new IOException("failed to delete " + paramFile);
    }
  }
  
  public void deleteContents(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IOException("not a readable directory: " + paramFile);
    }
    int j = arrayOfFile.length;
    int i = 0;
    while (i < j)
    {
      paramFile = arrayOfFile[i];
      if (paramFile.isDirectory()) {
        deleteContents(paramFile);
      }
      if (!paramFile.delete()) {
        throw new IOException("failed to delete " + paramFile);
      }
      i += 1;
    }
  }
  
  public boolean exists(File paramFile)
  {
    return paramFile.exists();
  }
  
  public void rename(File paramFile1, File paramFile2)
  {
    delete(paramFile2);
    if (!paramFile1.renameTo(paramFile2)) {
      throw new IOException("failed to rename " + paramFile1 + " to " + paramFile2);
    }
  }
  
  public ac sink(File paramFile)
  {
    try
    {
      ac localac = r.b(paramFile);
      return localac;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      paramFile.getParentFile().mkdirs();
    }
    return r.b(paramFile);
  }
  
  public long size(File paramFile)
  {
    return paramFile.length();
  }
  
  public ad source(File paramFile)
  {
    return r.a(paramFile);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\io\FileSystem$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */