package com.appsflyer.a;

import java.util.Scanner;

public final class b
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    this.c = paramString1;
    this.b = paramString2;
    this.a = paramString3;
  }
  
  public b(char[] paramArrayOfChar)
  {
    paramArrayOfChar = new Scanner(new String(paramArrayOfChar));
    while (paramArrayOfChar.hasNextLine())
    {
      String str = paramArrayOfChar.nextLine();
      if (str.startsWith("url=")) {
        this.c = str.substring("url=".length()).trim();
      } else if (str.startsWith("version=")) {
        this.a = str.substring("version=".length()).trim();
      } else if (str.startsWith("data=")) {
        this.b = str.substring("data=".length()).trim();
      }
    }
    paramArrayOfChar.close();
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */