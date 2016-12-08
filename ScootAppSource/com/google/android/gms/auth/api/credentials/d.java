package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class d
{
  private final TreeSet<Character> a = new TreeSet();
  private final List<String> b = new ArrayList();
  private final List<Integer> c = new ArrayList();
  private int d = 12;
  private int e = 16;
  
  private TreeSet<Character> a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      throw new e(String.valueOf(paramString2).concat(" cannot be null or empty"));
    }
    TreeSet localTreeSet = new TreeSet();
    paramString1 = paramString1.toCharArray();
    int j = paramString1.length;
    int i = 0;
    while (i < j)
    {
      char c1 = paramString1[i];
      if (PasswordSpecification.a(c1, 32, 126)) {
        throw new e(String.valueOf(paramString2).concat(" must only contain ASCII printable characters"));
      }
      localTreeSet.add(Character.valueOf(c1));
      i += 1;
    }
    return localTreeSet;
  }
  
  private void b()
  {
    Iterator localIterator = this.c.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((Integer)localIterator.next()).intValue() + i) {}
    if (i > this.e) {
      throw new e("required character count cannot be greater than the max password size");
    }
  }
  
  private void c()
  {
    boolean[] arrayOfBoolean = new boolean[95];
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      char[] arrayOfChar = ((String)localIterator.next()).toCharArray();
      int j = arrayOfChar.length;
      int i = 0;
      while (i < j)
      {
        char c1 = arrayOfChar[i];
        if (arrayOfBoolean[(c1 - ' ')] != 0) {
          throw new e(58 + "character " + c1 + " occurs in more than one required character set");
        }
        arrayOfBoolean[(c1 - ' ')] = true;
        i += 1;
      }
    }
  }
  
  public PasswordSpecification a()
  {
    if (this.a.isEmpty()) {
      throw new e("no allowed characters specified");
    }
    b();
    c();
    return new PasswordSpecification(1, PasswordSpecification.a(this.a), this.b, this.c, this.d, this.e);
  }
  
  public d a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 1) {
      throw new e("minimumSize must be at least 1");
    }
    if (paramInt1 > paramInt2) {
      throw new e("maximumSize must be greater than or equal to minimumSize");
    }
    this.d = paramInt1;
    this.e = paramInt2;
    return this;
  }
  
  public d a(String paramString)
  {
    this.a.addAll(a(paramString, "allowedChars"));
    return this;
  }
  
  public d a(String paramString, int paramInt)
  {
    if (paramInt < 1) {
      throw new e("count must be at least 1");
    }
    paramString = a(paramString, "requiredChars");
    this.b.add(PasswordSpecification.a(paramString));
    this.c.add(Integer.valueOf(paramInt));
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */