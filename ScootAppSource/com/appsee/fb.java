package com.appsee;

import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;

class fb
{
  private static final String A = "Appsee_3p";
  private static fb G;
  private HashMap<String, tb> l;
  
  public static fb C()
  {
    try
    {
      if (G == null) {
        G = new fb();
      }
      fb localfb = G;
      return localfb;
    }
    finally {}
  }
  
  public static tb C(String paramString)
  {
    boolean bool2 = true;
    tb localtb = new tb();
    paramString = paramString.substring("Appsee_3p".length() + 1);
    int i = paramString.lastIndexOf(mb.C("X"));
    localtb.H(paramString.substring(0, i));
    paramString = paramString.substring(i + 1);
    if (paramString.charAt(1) == '1')
    {
      bool1 = true;
      localtb.C(bool1);
      if (paramString.charAt(3) != '1') {
        break label96;
      }
    }
    label96:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localtb.H(bool1);
      return localtb;
      bool1 = false;
      break;
    }
  }
  
  public static String C(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 1;
    String str = mb.C("at\033\"7X!\" wac");
    int i;
    if (paramBoolean1)
    {
      i = 1;
      if (!paramBoolean2) {
        break label59;
      }
    }
    for (;;)
    {
      return String.format(str, new Object[] { "Appsee_3p", paramString, Integer.valueOf(i), Integer.valueOf(j) });
      i = 0;
      break;
      label59:
      j = 0;
    }
  }
  
  public String C(String arg1, boolean paramBoolean)
  {
    if (bb.C(???))
    {
      vd.H(3, mb.C("\007f* 0'6b0u-b2bdN\000'\"h6'wu '4f6s='i'\ri2f(n '*f)b"));
      return null;
    }
    String str1 = ???.trim().toLowerCase();
    synchronized (this.l)
    {
      String str2 = C(str1, false, paramBoolean);
      if (!this.l.containsKey(str2))
      {
        String str3 = UUID.randomUUID().toString().replace(kl.C("j"), "");
        this.l.put(str2, new tb(str1, str3, false, paramBoolean));
        if (paramBoolean) {
          gb.C(str2, str3);
        }
      }
      str1 = ((tb)this.l.get(str2)).H();
      return str1;
    }
  }
  
  public JSONArray C()
  {
    return C(true);
  }
  
  public void C()
  {
    synchronized (this.l)
    {
      this.l.putAll(gb.C("Appsee_3p"));
      return;
    }
  }
  
  public void C(String arg1, String paramString2, boolean paramBoolean)
  {
    if (bb.C(???))
    {
      vd.H(3, kl.C("\004R)\0243\0234V3\023tA#\0237R5G>\023\016wg\036gz)E&_.Wg]&^\""));
      return;
    }
    String str1 = ???.trim().toLowerCase();
    for (;;)
    {
      synchronized (this.l)
      {
        String str2 = C(str1, true, paramBoolean);
        if (bb.C(paramString2))
        {
          this.l.remove(str1);
          if (paramBoolean) {
            gb.C(str2, paramString2);
          }
          return;
        }
      }
      this.l.put(str1, new tb(str1, paramString2, true, paramBoolean));
    }
  }
  
  public void H()
  {
    synchronized (this.l)
    {
      this.l.clear();
      C();
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\fb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */