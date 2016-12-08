package com.squareup.okhttp.internal.io;

import d.ac;
import d.ad;
import java.io.File;

public abstract interface FileSystem
{
  public static final FileSystem SYSTEM = new FileSystem.1();
  
  public abstract ac appendingSink(File paramFile);
  
  public abstract void delete(File paramFile);
  
  public abstract void deleteContents(File paramFile);
  
  public abstract boolean exists(File paramFile);
  
  public abstract void rename(File paramFile1, File paramFile2);
  
  public abstract ac sink(File paramFile);
  
  public abstract long size(File paramFile);
  
  public abstract ad source(File paramFile);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\io\FileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */