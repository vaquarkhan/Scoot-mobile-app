package com.google.android.gms.common.internal;

import java.util.Arrays;

public abstract class v
{
  public static final v a = a("\t\n\013\f\r     　 ᠎ ").a(a(' ', ' '));
  public static final v b = a("\t\n\013\f\r     　").a(a(' ', ' ')).a(a(' ', ' '));
  public static final v c = a('\000', '');
  public static final v d;
  public static final v e = a('\t', '\r').a(a('\034', ' ')).a(a(' ')).a(a('᠎')).a(a(' ', ' ')).a(a(' ', '​')).a(a(' ', ' ')).a(a(' ')).a(a('　'));
  public static final v f = new w();
  public static final v g = new ac();
  public static final v h = new ad();
  public static final v i = new ae();
  public static final v j = new af();
  public static final v k = a('\000', '\037').a(a('', ''));
  public static final v l = a('\000', ' ').a(a('', ' ')).a(a('­')).a(a('؀', '؃')).a(a("۝܏ ឴឵᠎")).a(a(' ', '‏')).a(a(' ', ' ')).a(a(' ', '⁤')).a(a('⁪', '⁯')).a(a('　')).a(a(55296, 63743)).a(a("﻿￹￺￻"));
  public static final v m = a('\000', 'ӹ').a(a('־')).a(a('א', 'ת')).a(a('׳')).a(a('״')).a(a('؀', 'ۿ')).a(a('ݐ', 'ݿ')).a(a('฀', '๿')).a(a('Ḁ', '₯')).a(a('℀', '℺')).a(a(64336, 65023)).a(a(65136, 65279)).a(a(65377, 65500));
  public static final v n = new ag();
  public static final v o = new x();
  
  static
  {
    v localv = a('0', '9');
    char[] arrayOfChar = "٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０".toCharArray();
    int i2 = arrayOfChar.length;
    int i1 = 0;
    while (i1 < i2)
    {
      char c1 = arrayOfChar[i1];
      localv = localv.a(a(c1, (char)(c1 + '\t')));
      i1 += 1;
    }
    d = localv;
  }
  
  public static v a(char paramChar)
  {
    return new y(paramChar);
  }
  
  public static v a(char paramChar1, char paramChar2)
  {
    if (paramChar2 >= paramChar1) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool);
      return new ab(paramChar1, paramChar2);
    }
  }
  
  public static v a(CharSequence paramCharSequence)
  {
    switch (paramCharSequence.length())
    {
    default: 
      paramCharSequence = paramCharSequence.toString().toCharArray();
      Arrays.sort(paramCharSequence);
      return new aa(paramCharSequence);
    case 0: 
      return o;
    case 1: 
      return a(paramCharSequence.charAt(0));
    }
    return new z(paramCharSequence.charAt(0), paramCharSequence.charAt(1));
  }
  
  public v a(v paramv)
  {
    return new ah(Arrays.asList(new v[] { this, (v)b.a(paramv) }));
  }
  
  public abstract boolean b(char paramChar);
  
  public boolean b(CharSequence paramCharSequence)
  {
    int i1 = paramCharSequence.length() - 1;
    while (i1 >= 0)
    {
      if (!b(paramCharSequence.charAt(i1))) {
        return false;
      }
      i1 -= 1;
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */