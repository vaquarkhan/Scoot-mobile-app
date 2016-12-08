package com.digits.sdk.a;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e
{
  private static final SparseArray<String> a = new SparseArray();
  private static final Set<String> b;
  private static final Map<String, Integer> c = new HashMap();
  private static final SparseArray<String> d;
  private static final Set<String> e = new HashSet(Arrays.asList(new String[] { "MOBILE", "携帯電話", "携帯", "ケイタイ", "ｹｲﾀｲ" }));
  private static final Set<Character> f = new HashSet(Arrays.asList(new Character[] { Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ') }));
  private static final int[] g = { 58, 59, 44, 32 };
  private static final int[] h = { 59, 58 };
  
  static
  {
    a.put(9, "CAR");
    c.put("CAR", Integer.valueOf(9));
    a.put(6, "PAGER");
    c.put("PAGER", Integer.valueOf(6));
    a.put(11, "ISDN");
    c.put("ISDN", Integer.valueOf(11));
    c.put("HOME", Integer.valueOf(1));
    c.put("WORK", Integer.valueOf(3));
    c.put("CELL", Integer.valueOf(2));
    c.put("OTHER", Integer.valueOf(7));
    c.put("CALLBACK", Integer.valueOf(8));
    c.put("COMPANY-MAIN", Integer.valueOf(10));
    c.put("RADIO", Integer.valueOf(14));
    c.put("TTY-TDD", Integer.valueOf(16));
    c.put("ASSISTANT", Integer.valueOf(19));
    c.put("VOICE", Integer.valueOf(7));
    b = new HashSet();
    b.add("MODEM");
    b.add("MSG");
    b.add("BBS");
    b.add("VIDEO");
    d = new SparseArray();
    d.put(0, "X-AIM");
    d.put(1, "X-MSN");
    d.put(2, "X-YAHOO");
    d.put(3, "X-SKYPE-USERNAME");
    d.put(5, "X-GOOGLE-TALK");
    d.put(6, "X-ICQ");
    d.put(7, "X-JABBER");
    d.put(4, "X-QQ");
    d.put(8, "X-NETMEETING");
  }
  
  public static int a(int paramInt)
  {
    if (c.i(paramInt)) {
      return 2;
    }
    return 1;
  }
  
  public static String a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramString1 = a(paramInt, paramString1, paramString2, paramString3);
    paramInt = 1;
    if (!TextUtils.isEmpty(paramString4))
    {
      localStringBuilder.append(paramString4);
      paramInt = 0;
    }
    int k = paramString1.length;
    int i = 0;
    if (i < k)
    {
      paramString2 = paramString1[i];
      int j = paramInt;
      if (!TextUtils.isEmpty(paramString2))
      {
        if (paramInt == 0) {
          break label94;
        }
        paramInt = 0;
      }
      for (;;)
      {
        localStringBuilder.append(paramString2);
        j = paramInt;
        i += 1;
        paramInt = j;
        break;
        label94:
        localStringBuilder.append(' ');
      }
    }
    if (!TextUtils.isEmpty(paramString5))
    {
      if (paramInt == 0) {
        localStringBuilder.append(' ');
      }
      localStringBuilder.append(paramString5);
    }
    return localStringBuilder.toString();
  }
  
  public static String a(Integer paramInteger)
  {
    return (String)a.get(paramInteger.intValue());
  }
  
  private static String a(String paramString, int[] paramArrayOfInt)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = "";
    }
    paramString = new StringBuilder();
    int n = str.length();
    int i = 0;
    int j = 0;
    while (i < n)
    {
      int i1 = str.codePointAt(i);
      int k = j;
      if (i1 >= 32)
      {
        if (i1 == 34) {
          k = j;
        }
      }
      else
      {
        i = str.offsetByCodePoints(i, 1);
        j = k;
        continue;
      }
      paramString.appendCodePoint(i1);
      int i2 = paramArrayOfInt.length;
      int m = 0;
      for (;;)
      {
        k = j;
        if (m >= i2) {
          break;
        }
        if (i1 == paramArrayOfInt[m])
        {
          k = 1;
          break;
        }
        m += 1;
      }
    }
    paramString = paramString.toString();
    if (paramString.length() != 0)
    {
      if (!d(new String[] { paramString })) {}
    }
    else {
      return "";
    }
    if (j != 0) {
      return '"' + paramString + '"';
    }
    return paramString;
  }
  
  public static boolean a(String paramString)
  {
    return ("_AUTO_CELL".equals(paramString)) || (e.contains(paramString));
  }
  
  public static boolean a(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return true;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      if ((!TextUtils.isEmpty(str)) && (!g.a(str))) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean a(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return true;
    }
    return a(Arrays.asList(paramVarArgs));
  }
  
  public static String[] a(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    String[] arrayOfString = new String[3];
    switch (c.e(paramInt))
    {
    default: 
      arrayOfString[0] = paramString3;
      arrayOfString[1] = paramString2;
      arrayOfString[2] = paramString1;
      return arrayOfString;
    case 8: 
      if (a(new String[] { paramString1 })) {
        if (a(new String[] { paramString3 }))
        {
          arrayOfString[0] = paramString3;
          arrayOfString[1] = paramString2;
          arrayOfString[2] = paramString1;
          return arrayOfString;
        }
      }
      arrayOfString[0] = paramString1;
      arrayOfString[1] = paramString2;
      arrayOfString[2] = paramString3;
      return arrayOfString;
    }
    arrayOfString[0] = paramString2;
    arrayOfString[1] = paramString3;
    arrayOfString[2] = paramString1;
    return arrayOfString;
  }
  
  public static String b(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    return a(paramInt, paramString1, paramString2, paramString3, null, null);
  }
  
  public static boolean b(String paramString)
  {
    return b.contains(paramString);
  }
  
  public static boolean b(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return true;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      if (!TextUtils.isEmpty(str))
      {
        int j = str.length();
        for (int i = 0; i < j; i = str.offsetByCodePoints(i, 1))
        {
          int k = str.codePointAt(i);
          if ((32 > k) || (k > 126)) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public static boolean b(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return true;
    }
    return b(Arrays.asList(paramVarArgs));
  }
  
  public static boolean c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return true;
      int j = paramString.length();
      for (int i = 0; i < j; i = paramString.offsetByCodePoints(i, 1))
      {
        int k = paramString.codePointAt(i);
        if ((32 > k) || (k > 126) || (f.contains(Character.valueOf((char)k)))) {
          return false;
        }
      }
    }
  }
  
  public static boolean c(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return true;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      if (!TextUtils.isEmpty(str))
      {
        int j = str.length();
        for (int i = 0; i < j; i = str.offsetByCodePoints(i, 1))
        {
          int k = str.codePointAt(i);
          if (((97 > k) || (k >= 123)) && ((65 > k) || (k >= 91)) && ((48 > k) || (k >= 58)) && (k != 45)) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public static boolean c(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return true;
    }
    return c(Arrays.asList(paramVarArgs));
  }
  
  public static String d(String paramString)
  {
    return a(paramString, g);
  }
  
  public static boolean d(Collection<String> paramCollection)
  {
    if (paramCollection == null) {
      return true;
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      String str = (String)paramCollection.next();
      if (!TextUtils.isEmpty(str))
      {
        int j = str.length();
        for (int i = 0; i < j; i = str.offsetByCodePoints(i, 1)) {
          if (!Character.isWhitespace(str.codePointAt(i))) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public static boolean d(String... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return true;
    }
    return d(Arrays.asList(paramVarArgs));
  }
  
  public static String e(String paramString)
  {
    return a(paramString, h);
  }
  
  public static String f(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString.length();
    int i = 0;
    if (i < j)
    {
      char c1 = paramString.charAt(i);
      String str = a.a(c1);
      if (str != null) {
        localStringBuilder.append(str);
      }
      for (;;)
      {
        i = paramString.offsetByCodePoints(i, 1);
        break;
        localStringBuilder.append(c1);
      }
    }
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */