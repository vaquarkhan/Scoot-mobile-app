package com.digits.sdk.a;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class b
{
  private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation" })));
  private final int b;
  private final boolean c;
  private final boolean d;
  private final boolean e;
  private final boolean f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final String l;
  private final String m;
  private StringBuilder n;
  private boolean o;
  
  public b(int paramInt, String paramString)
  {
    this.b = paramInt;
    if (c.c(paramInt)) {
      Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
    }
    boolean bool1;
    if ((c.b(paramInt)) || (c.c(paramInt)))
    {
      bool1 = true;
      this.c = bool1;
      this.f = c.d(paramInt);
      this.e = c.l(paramInt);
      this.d = c.k(paramInt);
      this.g = c.f(paramInt);
      this.i = c.g(paramInt);
      this.h = c.h(paramInt);
      this.j = c.k(paramInt);
      if (c.b(paramInt))
      {
        bool1 = bool2;
        if ("UTF-8".equalsIgnoreCase(paramString)) {}
      }
      else
      {
        bool1 = true;
      }
      this.k = bool1;
      if (!c.l(paramInt)) {
        break label191;
      }
      if ("SHIFT_JIS".equalsIgnoreCase(paramString)) {
        break label183;
      }
      if (!TextUtils.isEmpty(paramString)) {
        break label175;
      }
      this.l = "SHIFT_JIS";
      label159:
      this.m = "CHARSET=SHIFT_JIS";
    }
    for (;;)
    {
      a();
      return;
      bool1 = false;
      break;
      label175:
      this.l = paramString;
      break label159;
      label183:
      this.l = paramString;
      break label159;
      label191:
      if (TextUtils.isEmpty(paramString))
      {
        Log.i("vCard", "Use the charset \"UTF-8\" for export.");
        this.l = "UTF-8";
        this.m = "CHARSET=UTF-8";
      }
      else
      {
        this.l = paramString;
        this.m = ("CHARSET=" + paramString);
      }
    }
  }
  
  private List<String> a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    StringBuilder localStringBuilder = new StringBuilder();
    int i2 = paramString.length();
    int i1 = 0;
    if (i1 < i2)
    {
      char c1 = paramString.charAt(i1);
      if ((c1 == '\n') && (localStringBuilder.length() > 0))
      {
        localArrayList.add(localStringBuilder.toString());
        localStringBuilder = new StringBuilder();
      }
      for (;;)
      {
        i1 += 1;
        break;
        localStringBuilder.append(c1);
      }
    }
    if (localStringBuilder.length() > 0) {
      localArrayList.add(localStringBuilder.toString());
    }
    return localArrayList;
  }
  
  private void a(StringBuilder paramStringBuilder, Integer paramInteger)
  {
    if (this.e)
    {
      paramStringBuilder.append("VOICE");
      return;
    }
    paramStringBuilder = e.a(paramInteger);
    if (paramStringBuilder != null)
    {
      b(paramStringBuilder);
      return;
    }
    Log.e("vCard", "Unknown or unsupported (by vCard) Phone type: " + paramInteger);
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString)
  {
    if ((c.c(this.b)) || (((c.b(this.b)) || (this.h)) && (!this.e))) {
      paramStringBuilder.append("TYPE").append("=");
    }
    paramStringBuilder.append(paramString);
  }
  
  private boolean a(ContentValues paramContentValues)
  {
    String str1 = paramContentValues.getAsString("data3");
    String str2 = paramContentValues.getAsString("data5");
    String str3 = paramContentValues.getAsString("data2");
    String str4 = paramContentValues.getAsString("data4");
    String str5 = paramContentValues.getAsString("data6");
    String str6 = paramContentValues.getAsString("data9");
    String str7 = paramContentValues.getAsString("data8");
    String str8 = paramContentValues.getAsString("data7");
    paramContentValues = paramContentValues.getAsString("data1");
    return (!TextUtils.isEmpty(str1)) || (!TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3)) || (!TextUtils.isEmpty(str4)) || (!TextUtils.isEmpty(str5)) || (!TextUtils.isEmpty(str6)) || (!TextUtils.isEmpty(str7)) || (!TextUtils.isEmpty(str8)) || (!TextUtils.isEmpty(paramContentValues));
  }
  
  private boolean a(String... paramVarArgs)
  {
    if (!this.k) {}
    for (;;)
    {
      return false;
      int i2 = paramVarArgs.length;
      int i1 = 0;
      while (i1 < i2)
      {
        if (!e.a(new String[] { paramVarArgs[i1] })) {
          return true;
        }
        i1 += 1;
      }
    }
  }
  
  private void b(ContentValues paramContentValues)
  {
    String str5 = paramContentValues.getAsString("data9");
    String str3 = paramContentValues.getAsString("data8");
    String str4 = paramContentValues.getAsString("data7");
    String str2 = str4;
    String str1 = str3;
    paramContentValues = str5;
    if (this.j)
    {
      paramContentValues = e.f(str5);
      str1 = e.f(str3);
      str2 = e.f(str4);
    }
    if ((TextUtils.isEmpty(paramContentValues)) && (TextUtils.isEmpty(str1)) && (TextUtils.isEmpty(str2)))
    {
      if (this.e)
      {
        this.n.append("SOUND");
        this.n.append(";");
        this.n.append("X-IRMC-N");
        this.n.append(":");
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append("\r\n");
      }
      return;
    }
    if (c.c(this.b)) {}
    for (;;)
    {
      label193:
      if (this.g)
      {
        if (!TextUtils.isEmpty(str2))
        {
          if (!this.f) {
            break label1107;
          }
          if (e.b(new String[] { str2 })) {
            break label1107;
          }
          i1 = 1;
          label232:
          if (i1 == 0) {
            break label1112;
          }
          str3 = c(str2);
          label244:
          this.n.append("X-PHONETIC-FIRST-NAME");
          if (a(new String[] { str2 }))
          {
            this.n.append(";");
            this.n.append(this.m);
          }
          if (i1 != 0)
          {
            this.n.append(";");
            this.n.append("ENCODING=QUOTED-PRINTABLE");
          }
          this.n.append(":");
          this.n.append(str3);
          this.n.append("\r\n");
        }
        if (!TextUtils.isEmpty(str1))
        {
          if (!this.f) {
            break label1123;
          }
          if (e.b(new String[] { str1 })) {
            break label1123;
          }
          i1 = 1;
          label378:
          if (i1 == 0) {
            break label1128;
          }
          str2 = c(str1);
          label390:
          this.n.append("X-PHONETIC-MIDDLE-NAME");
          if (a(new String[] { str1 }))
          {
            this.n.append(";");
            this.n.append(this.m);
          }
          if (i1 != 0)
          {
            this.n.append(";");
            this.n.append("ENCODING=QUOTED-PRINTABLE");
          }
          this.n.append(":");
          this.n.append(str2);
          this.n.append("\r\n");
        }
        if (TextUtils.isEmpty(paramContentValues)) {
          break;
        }
        if (!this.f) {
          break label1139;
        }
        if (e.b(new String[] { paramContentValues })) {
          break label1139;
        }
        i1 = 1;
        label522:
        if (i1 == 0) {
          break label1144;
        }
        str1 = c(paramContentValues);
        label533:
        this.n.append("X-PHONETIC-LAST-NAME");
        if (a(new String[] { paramContentValues }))
        {
          this.n.append(";");
          this.n.append(this.m);
        }
        if (i1 != 0)
        {
          this.n.append(";");
          this.n.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.n.append(":");
        this.n.append(str1);
        this.n.append("\r\n");
        return;
        if (c.b(this.b))
        {
          str3 = e.b(this.b, paramContentValues, str1, str2);
          this.n.append("SORT-STRING");
          if (c.b(this.b)) {
            if (a(new String[] { str3 }))
            {
              this.n.append(";");
              this.n.append(this.m);
            }
          }
          this.n.append(":");
          this.n.append(d(str3));
          this.n.append("\r\n");
        }
        else if (this.d)
        {
          this.n.append("SOUND");
          this.n.append(";");
          this.n.append("X-IRMC-N");
          if (this.i) {
            break label1063;
          }
          if (e.b(new String[] { paramContentValues })) {
            if (e.b(new String[] { str1 })) {
              if (e.b(new String[] { str2 })) {
                break label1063;
              }
            }
          }
          i1 = 1;
          label845:
          if (i1 == 0) {
            break label1068;
          }
          str5 = c(paramContentValues);
          str4 = c(str1);
          str3 = c(str2);
          label872:
          if (a(new String[] { str5, str4, str3 }))
          {
            this.n.append(";");
            this.n.append(this.m);
          }
          this.n.append(":");
          if (TextUtils.isEmpty(str5)) {
            break label1154;
          }
          this.n.append(str5);
        }
      }
    }
    label1063:
    label1068:
    label1094:
    label1107:
    label1112:
    label1123:
    label1128:
    label1139:
    label1144:
    label1154:
    for (int i1 = 0;; i1 = 1)
    {
      int i2 = i1;
      if (!TextUtils.isEmpty(str4))
      {
        if (i1 == 0) {
          break label1094;
        }
        i1 = 0;
      }
      for (;;)
      {
        this.n.append(str4);
        i2 = i1;
        if (!TextUtils.isEmpty(str3))
        {
          if (i2 == 0) {
            this.n.append(' ');
          }
          this.n.append(str3);
        }
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append("\r\n");
        break label193;
        break;
        i1 = 0;
        break label845;
        str5 = d(paramContentValues);
        str4 = d(str1);
        str3 = d(str2);
        break label872;
        this.n.append(' ');
      }
      i1 = 0;
      break label232;
      str3 = d(str2);
      break label244;
      i1 = 0;
      break label378;
      str2 = d(str1);
      break label390;
      i1 = 0;
      break label522;
      str1 = d(paramContentValues);
      break label533;
    }
  }
  
  private void b(String paramString)
  {
    a(this.n, paramString);
  }
  
  private void b(String paramString1, String paramString2)
  {
    int i1;
    if (!this.i) {
      if (!e.b(new String[] { paramString2 }))
      {
        i1 = 1;
        if (i1 == 0) {
          break label130;
        }
      }
    }
    label130:
    for (String str = c(paramString2);; str = d(paramString2))
    {
      this.n.append(paramString1);
      if (a(new String[] { paramString2 }))
      {
        this.n.append(";");
        this.n.append(this.m);
      }
      if (i1 != 0)
      {
        this.n.append(";");
        this.n.append("ENCODING=QUOTED-PRINTABLE");
      }
      this.n.append(":");
      this.n.append(str);
      return;
      i1 = 0;
      break;
    }
  }
  
  private ContentValues c(List<ContentValues> paramList)
  {
    Object localObject1 = null;
    Iterator localIterator = paramList.iterator();
    paramList = null;
    Object localObject2;
    Integer localInteger;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localObject2 = (ContentValues)localIterator.next();
        if (localObject2 != null)
        {
          localInteger = ((ContentValues)localObject2).getAsInteger("is_super_primary");
          if ((localInteger == null) || (localInteger.intValue() <= 0)) {
            break;
          }
        }
      }
    }
    for (;;)
    {
      if (localObject2 == null) {
        if (localObject1 != null)
        {
          return (ContentValues)localObject1;
          if (paramList != null) {
            break label145;
          }
          localInteger = ((ContentValues)localObject2).getAsInteger("is_primary");
          if ((localInteger != null) && (localInteger.intValue() > 0) && (a((ContentValues)localObject2)))
          {
            paramList = (List<ContentValues>)localObject1;
            localObject1 = localObject2;
          }
        }
      }
      for (;;)
      {
        localObject2 = localObject1;
        localObject1 = paramList;
        paramList = (List<ContentValues>)localObject2;
        break;
        if ((localObject1 == null) && (a((ContentValues)localObject2)))
        {
          localObject1 = paramList;
          paramList = (List<ContentValues>)localObject2;
          continue;
          return new ContentValues();
          return (ContentValues)localObject2;
        }
        else
        {
          label145:
          localObject2 = paramList;
          paramList = (List<ContentValues>)localObject1;
          localObject1 = localObject2;
        }
      }
      localObject2 = paramList;
    }
  }
  
  private String c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = paramString.getBytes(this.l);
        paramString = arrayOfByte;
        i1 = 0;
        i2 = 0;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        int i3;
        int i4;
        Log.e("vCard", "Charset " + this.l + " cannot be used. " + "Try default charset");
        paramString = paramString.getBytes();
        int i1 = 0;
        int i2 = 0;
        continue;
      }
      if (i2 >= paramString.length) {
        break label163;
      }
      localStringBuilder.append(String.format("=%02X", new Object[] { Byte.valueOf(paramString[i2]) }));
      i3 = i2 + 1;
      i4 = i1 + 3;
      i1 = i4;
      i2 = i3;
      if (i4 >= 67)
      {
        localStringBuilder.append("=\r\n");
        i1 = 0;
        i2 = i3;
      }
    }
    label163:
    return localStringBuilder.toString();
  }
  
  private b d(List<ContentValues> paramList)
  {
    if ((this.e) || (this.j)) {
      Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      a("FN", "");
      return this;
    }
    ContentValues localContentValues = c(paramList);
    String str2 = localContentValues.getAsString("data3");
    String str3 = localContentValues.getAsString("data5");
    String str4 = localContentValues.getAsString("data2");
    String str5 = localContentValues.getAsString("data4");
    String str6 = localContentValues.getAsString("data6");
    String str1 = localContentValues.getAsString("data1");
    paramList = str2;
    if (TextUtils.isEmpty(str2))
    {
      paramList = str2;
      if (TextUtils.isEmpty(str4))
      {
        paramList = str2;
        if (TextUtils.isEmpty(str3))
        {
          paramList = str2;
          if (TextUtils.isEmpty(str5))
          {
            paramList = str2;
            if (TextUtils.isEmpty(str6))
            {
              if (TextUtils.isEmpty(str1))
              {
                a("FN", "");
                return this;
              }
              paramList = str1;
            }
          }
        }
      }
    }
    String str11 = localContentValues.getAsString("data9");
    String str12 = localContentValues.getAsString("data8");
    String str13 = localContentValues.getAsString("data7");
    str2 = d(paramList);
    String str7 = d(str4);
    String str8 = d(str3);
    String str9 = d(str5);
    String str10 = d(str6);
    this.n.append("N");
    if ((!TextUtils.isEmpty(str11)) || (!TextUtils.isEmpty(str12)) || (!TextUtils.isEmpty(str13)))
    {
      this.n.append(";");
      str11 = d(str11) + ';' + d(str13) + ';' + d(str12);
      this.n.append("SORT-AS=").append(e.e(str11));
    }
    this.n.append(":");
    this.n.append(str2);
    this.n.append(";");
    this.n.append(str7);
    this.n.append(";");
    this.n.append(str8);
    this.n.append(";");
    this.n.append(str9);
    this.n.append(";");
    this.n.append(str10);
    this.n.append("\r\n");
    if (TextUtils.isEmpty(str1))
    {
      Log.w("vCard", "DISPLAY_NAME is empty.");
      a("FN", d(e.a(c.e(this.b), paramList, str3, str4, str5, str6)));
    }
    for (;;)
    {
      b(localContentValues);
      return this;
      paramList = d(str1);
      this.n.append("FN");
      this.n.append(":");
      this.n.append(paramList);
      this.n.append("\r\n");
    }
  }
  
  private String d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i2 = paramString.length();
    int i1 = 0;
    if (i1 < i2)
    {
      char c1 = paramString.charAt(i1);
      switch (c1)
      {
      default: 
        localStringBuilder.append(c1);
      }
      for (;;)
      {
        i1 += 1;
        break;
        localStringBuilder.append('\\');
        localStringBuilder.append(';');
        continue;
        if ((i1 + 1 >= i2) || (paramString.charAt(i1) != '\n'))
        {
          localStringBuilder.append("\\n");
          continue;
          if (this.c)
          {
            localStringBuilder.append("\\\\");
          }
          else if (this.e)
          {
            localStringBuilder.append('\\');
            localStringBuilder.append(c1);
          }
          else
          {
            localStringBuilder.append(c1);
            continue;
            if (this.c) {
              localStringBuilder.append("\\,");
            } else {
              localStringBuilder.append(c1);
            }
          }
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  private void e(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i1 = 1;
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      if ((c.b(this.b)) || (c.c(this.b)))
      {
        if (c.c(this.b))
        {
          paramList = e.e(paramList);
          label63:
          if (TextUtils.isEmpty(paramList)) {
            break label90;
          }
          if (i1 == 0) {
            break label92;
          }
          i1 = 0;
        }
        for (;;)
        {
          b(paramList);
          break;
          paramList = e.d(paramList);
          break label63;
          label90:
          break;
          label92:
          this.n.append(";");
        }
      }
      if (e.c(paramList))
      {
        if (i1 != 0) {
          i1 = 0;
        }
        for (;;)
        {
          b(paramList);
          break;
          this.n.append(";");
        }
      }
    }
  }
  
  public b a(List<ContentValues> paramList)
  {
    if (c.c(this.b)) {
      paramList = d(paramList);
    }
    do
    {
      return paramList;
      if ((paramList != null) && (!paramList.isEmpty())) {
        break;
      }
      if (c.b(this.b))
      {
        a("N", "");
        a("FN", "");
        return this;
      }
      paramList = this;
    } while (!this.e);
    a("N", "");
    return this;
    ContentValues localContentValues = c(paramList);
    String str5 = localContentValues.getAsString("data3");
    String str3 = localContentValues.getAsString("data5");
    String str4 = localContentValues.getAsString("data2");
    String str2 = localContentValues.getAsString("data4");
    String str1 = localContentValues.getAsString("data6");
    paramList = localContentValues.getAsString("data1");
    boolean bool1;
    int i1;
    label286:
    int i2;
    label323:
    label367:
    String str6;
    if ((!TextUtils.isEmpty(str5)) || (!TextUtils.isEmpty(str4)))
    {
      bool1 = a(new String[] { str5, str4, str3, str2, str1 });
      if (!this.i)
      {
        if (e.b(new String[] { str5 })) {
          if (e.b(new String[] { str4 })) {
            if (e.b(new String[] { str3 })) {
              if (e.b(new String[] { str2 })) {
                if (e.b(new String[] { str1 })) {
                  break label616;
                }
              }
            }
          }
        }
        i1 = 1;
        if (TextUtils.isEmpty(paramList)) {
          break label621;
        }
        boolean bool2 = a(new String[] { paramList });
        if (this.i) {
          break label645;
        }
        if (e.b(new String[] { paramList })) {
          break label645;
        }
        i2 = 1;
        if (i1 == 0) {
          break label650;
        }
        str5 = c(str5);
        str4 = c(str4);
        str3 = c(str3);
        str2 = c(str2);
        str1 = c(str1);
        if (i2 == 0) {
          break label693;
        }
        str6 = c(paramList);
        label378:
        this.n.append("N");
        if (!this.e) {
          break label703;
        }
        if (bool1)
        {
          this.n.append(";");
          this.n.append(this.m);
        }
        if (i1 != 0)
        {
          this.n.append(";");
          this.n.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.n.append(":");
        this.n.append(paramList);
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        label506:
        this.n.append("\r\n");
        this.n.append("FN");
        if (bool2)
        {
          this.n.append(";");
          this.n.append(this.m);
        }
        if (i2 != 0)
        {
          this.n.append(";");
          this.n.append("ENCODING=QUOTED-PRINTABLE");
        }
        this.n.append(":");
        this.n.append(str6);
        this.n.append("\r\n");
      }
    }
    for (;;)
    {
      b(localContentValues);
      return this;
      label616:
      i1 = 0;
      break;
      label621:
      paramList = e.a(c.e(this.b), str5, str3, str4, str2, str1);
      break label286;
      label645:
      i2 = 0;
      break label323;
      label650:
      str5 = d(str5);
      str4 = d(str4);
      str3 = d(str3);
      str2 = d(str2);
      str1 = d(str1);
      break label367;
      label693:
      str6 = d(paramList);
      break label378;
      label703:
      if (bool1)
      {
        this.n.append(";");
        this.n.append(this.m);
      }
      if (i1 != 0)
      {
        this.n.append(";");
        this.n.append("ENCODING=QUOTED-PRINTABLE");
      }
      this.n.append(":");
      this.n.append(str5);
      this.n.append(";");
      this.n.append(str4);
      this.n.append(";");
      this.n.append(str3);
      this.n.append(";");
      this.n.append(str2);
      this.n.append(";");
      this.n.append(str1);
      break label506;
      if (!TextUtils.isEmpty(paramList))
      {
        b("N", paramList);
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append(";");
        this.n.append("\r\n");
        b("FN", paramList);
        this.n.append("\r\n");
      }
      else if (c.b(this.b))
      {
        a("N", "");
        a("FN", "");
      }
      else if (this.e)
      {
        a("N", "");
      }
    }
  }
  
  public b a(List<ContentValues> paramList, d paramd)
  {
    HashSet localHashSet;
    int i1;
    int i2;
    Object localObject2;
    String str1;
    Object localObject1;
    boolean bool;
    label90:
    int i3;
    if (paramList != null)
    {
      localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      i1 = 0;
      do
      {
        i2 = i1;
        if (!localIterator.hasNext()) {
          break label525;
        }
        paramList = (ContentValues)localIterator.next();
        localObject2 = paramList.getAsInteger("data2");
        str1 = paramList.getAsString("data3");
        localObject1 = paramList.getAsInteger("is_primary");
        if (localObject1 == null) {
          break label196;
        }
        if (((Integer)localObject1).intValue() <= 0) {
          break;
        }
        bool = true;
        localObject1 = paramList.getAsString("data1");
        paramList = (List<ContentValues>)localObject1;
        if (localObject1 != null) {
          paramList = ((String)localObject1).trim();
        }
      } while (TextUtils.isEmpty(paramList));
      if (localObject2 != null)
      {
        i3 = ((Integer)localObject2).intValue();
        label131:
        if (paramd == null) {
          break label208;
        }
        paramList = paramd.a(paramList, i3, str1, bool);
        i2 = i1;
        if (localHashSet.contains(paramList)) {
          break label560;
        }
        localHashSet.add(paramList);
        a(Integer.valueOf(i3), str1, paramList, bool);
      }
    }
    for (;;)
    {
      break;
      bool = false;
      break label90;
      label196:
      bool = false;
      break label90;
      i3 = 1;
      break label131;
      label208:
      if ((i3 == 6) || (c.j(this.b)))
      {
        i2 = 1;
        if (!localHashSet.contains(paramList))
        {
          localHashSet.add(paramList);
          a(Integer.valueOf(i3), str1, paramList, bool);
          i1 = 1;
        }
      }
      else
      {
        paramList = a(paramList);
        if (paramList.isEmpty()) {
          break;
        }
        localObject2 = paramList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str2 = (String)((Iterator)localObject2).next();
          if (!localHashSet.contains(str2))
          {
            localObject1 = str2.replace(',', 'p').replace(';', 'w');
            paramList = (List<ContentValues>)localObject1;
            if (TextUtils.equals((CharSequence)localObject1, str2))
            {
              paramList = new StringBuilder();
              i2 = str2.length();
              i1 = 0;
              while (i1 < i2)
              {
                char c1 = str2.charAt(i1);
                if ((Character.isDigit(c1)) || (c1 == '+')) {
                  paramList.append(c1);
                }
                i1 += 1;
              }
              i1 = e.a(this.b);
              paramList = f.a(paramList.toString(), i1);
            }
            localObject1 = paramList;
            if (c.c(this.b))
            {
              localObject1 = paramList;
              if (!TextUtils.isEmpty(paramList))
              {
                localObject1 = paramList;
                if (!paramList.startsWith("tel:")) {
                  localObject1 = "tel:" + paramList;
                }
              }
            }
            localHashSet.add(str2);
            a(Integer.valueOf(i3), str1, (String)localObject1, bool);
            continue;
            i2 = 0;
            label525:
            if ((i2 == 0) && (this.e)) {
              a(Integer.valueOf(1), "", "", false);
            }
            return this;
          }
        }
        i1 = 1;
        continue;
      }
      label560:
      i1 = i2;
    }
  }
  
  public void a()
  {
    this.n = new StringBuilder();
    this.o = false;
    a("BEGIN", "VCARD");
    if (c.c(this.b))
    {
      a("VERSION", "4.0");
      return;
    }
    if (c.b(this.b))
    {
      a("VERSION", "3.0");
      return;
    }
    if (!c.a(this.b)) {
      Log.w("vCard", "Unknown vCard version detected.");
    }
    a("VERSION", "2.1");
  }
  
  public void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    switch (paramInt)
    {
    default: 
      Log.e("vCard", "Unknown Email type: " + paramInt);
      localObject1 = localObject2;
    }
    for (;;)
    {
      paramString1 = new ArrayList();
      if (paramBoolean) {
        paramString1.add("PREF");
      }
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramString1.add(localObject1);
      }
      a("EMAIL", paramString1, paramString2);
      return;
      if (e.a(paramString1))
      {
        localObject1 = "CELL";
      }
      else
      {
        localObject1 = localObject2;
        if (!TextUtils.isEmpty(paramString1))
        {
          localObject1 = localObject2;
          if (e.c(new String[] { paramString1 }))
          {
            localObject1 = "X-" + paramString1;
            continue;
            localObject1 = "HOME";
            continue;
            localObject1 = "WORK";
            continue;
            localObject1 = "CELL";
          }
        }
      }
    }
  }
  
  public void a(Integer paramInteger, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.n.append("TEL");
    this.n.append(";");
    int i1;
    boolean bool;
    if (paramInteger == null)
    {
      i1 = 7;
      paramInteger = new ArrayList();
      bool = paramBoolean;
      switch (i1)
      {
      default: 
        bool = paramBoolean;
      case 8: 
      case 14: 
      case 16: 
      case 19: 
        label144:
        if (bool) {
          paramInteger.add("PREF");
        }
        if (paramInteger.isEmpty()) {
          a(this.n, Integer.valueOf(i1));
        }
        break;
      }
    }
    for (;;)
    {
      this.n.append(":");
      this.n.append(paramString2);
      this.n.append("\r\n");
      return;
      i1 = paramInteger.intValue();
      break;
      paramInteger.addAll(Arrays.asList(new String[] { "HOME" }));
      bool = paramBoolean;
      break label144;
      paramInteger.addAll(Arrays.asList(new String[] { "WORK" }));
      bool = paramBoolean;
      break label144;
      paramInteger.addAll(Arrays.asList(new String[] { "HOME", "FAX" }));
      bool = paramBoolean;
      break label144;
      paramInteger.addAll(Arrays.asList(new String[] { "WORK", "FAX" }));
      bool = paramBoolean;
      break label144;
      paramInteger.add("CELL");
      bool = paramBoolean;
      break label144;
      if (this.e)
      {
        paramInteger.add("VOICE");
        bool = paramBoolean;
        break label144;
      }
      paramInteger.add("PAGER");
      bool = paramBoolean;
      break label144;
      paramInteger.add("VOICE");
      bool = paramBoolean;
      break label144;
      paramInteger.add("CAR");
      bool = paramBoolean;
      break label144;
      paramInteger.add("WORK");
      bool = true;
      break label144;
      paramInteger.add("ISDN");
      bool = paramBoolean;
      break label144;
      bool = true;
      break label144;
      paramInteger.add("FAX");
      bool = paramBoolean;
      break label144;
      paramInteger.add("TLX");
      bool = paramBoolean;
      break label144;
      paramInteger.addAll(Arrays.asList(new String[] { "WORK", "CELL" }));
      bool = paramBoolean;
      break label144;
      paramInteger.add("WORK");
      if (this.e)
      {
        paramInteger.add("VOICE");
        bool = paramBoolean;
        break label144;
      }
      paramInteger.add("PAGER");
      bool = paramBoolean;
      break label144;
      paramInteger.add("MSG");
      bool = paramBoolean;
      break label144;
      if (TextUtils.isEmpty(paramString1))
      {
        paramInteger.add("VOICE");
        bool = paramBoolean;
        break label144;
      }
      if (e.a(paramString1))
      {
        paramInteger.add("CELL");
        bool = paramBoolean;
        break label144;
      }
      if (this.c)
      {
        paramInteger.add(paramString1);
        bool = paramBoolean;
        break label144;
      }
      String str = paramString1.toUpperCase(Locale.getDefault());
      if (e.b(str))
      {
        paramInteger.add(str);
        bool = paramBoolean;
        break label144;
      }
      bool = paramBoolean;
      if (!e.c(new String[] { paramString1 })) {
        break label144;
      }
      paramInteger.add("X-" + paramString1);
      bool = paramBoolean;
      break label144;
      e(paramInteger);
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, false, false);
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramString1, null, paramString2, paramBoolean1, paramBoolean2);
  }
  
  public void a(String paramString1, List<String> paramList, String paramString2)
  {
    boolean bool1;
    if (!e.a(new String[] { paramString2 }))
    {
      bool1 = true;
      if (!this.f) {
        break label59;
      }
      if (e.b(new String[] { paramString2 })) {
        break label59;
      }
    }
    label59:
    for (boolean bool2 = true;; bool2 = false)
    {
      a(paramString1, paramList, paramString2, bool1, bool2);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.n.append(paramString1);
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.n.append(";");
      e(paramList);
    }
    if (paramBoolean1)
    {
      this.n.append(";");
      this.n.append(this.m);
    }
    if (paramBoolean2)
    {
      this.n.append(";");
      this.n.append("ENCODING=QUOTED-PRINTABLE");
    }
    for (paramString1 = c(paramString2);; paramString1 = d(paramString2))
    {
      this.n.append(":");
      this.n.append(paramString1);
      this.n.append("\r\n");
      return;
    }
  }
  
  public b b(List<ContentValues> paramList)
  {
    if (paramList != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      int i1 = 0;
      Object localObject2;
      do
      {
        i2 = i1;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (ContentValues)localIterator.next();
        localObject1 = ((ContentValues)localObject2).getAsString("data1");
        paramList = (List<ContentValues>)localObject1;
        if (localObject1 != null) {
          paramList = ((String)localObject1).trim();
        }
      } while (TextUtils.isEmpty(paramList));
      Object localObject1 = ((ContentValues)localObject2).getAsInteger("data2");
      label97:
      boolean bool;
      if (localObject1 != null)
      {
        i1 = ((Integer)localObject1).intValue();
        localObject1 = ((ContentValues)localObject2).getAsString("data3");
        localObject2 = ((ContentValues)localObject2).getAsInteger("is_primary");
        if (localObject2 == null) {
          break label178;
        }
        if (((Integer)localObject2).intValue() <= 0) {
          break label172;
        }
        bool = true;
      }
      for (;;)
      {
        if (!localHashSet.contains(paramList))
        {
          localHashSet.add(paramList);
          a(i1, (String)localObject1, paramList, bool);
        }
        i1 = 1;
        break;
        i1 = 3;
        break label97;
        label172:
        bool = false;
        continue;
        label178:
        bool = false;
      }
    }
    int i2 = 0;
    if ((i2 == 0) && (this.e)) {
      a(1, "", "", false);
    }
    return this;
  }
  
  public String toString()
  {
    if (!this.o)
    {
      if (this.e)
      {
        a("X-CLASS", "PUBLIC");
        a("X-REDUCTION", "");
        a("X-NO", "");
        a("X-DCM-HMN-MODE", "");
      }
      a("END", "VCARD");
      this.o = true;
    }
    return this.n.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */