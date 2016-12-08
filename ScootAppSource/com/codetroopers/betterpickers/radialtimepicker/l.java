package com.codetroopers.betterpickers.radialtimepicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.w;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.style;
import com.codetroopers.betterpickers.R.styleable;
import com.codetroopers.betterpickers.a;
import com.codetroopers.betterpickers.c;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public final class l
  extends w
  implements e
{
  private int aA;
  private boolean aB;
  private int aC;
  private char aD;
  private String aE;
  private String aF;
  private boolean aG;
  private ArrayList<Integer> aH;
  private s aI;
  private int aJ;
  private int aK;
  private String aL;
  private String aM;
  private String aN;
  private String aO;
  private t ai;
  private u aj;
  private a ak;
  private Button al;
  private TextView am;
  private TextView an;
  private TextView ao;
  private TextView ap;
  private TextView aq;
  private View ar;
  private RadialPickerLayout as;
  private int at;
  private int au;
  private String av;
  private String aw;
  private String ax;
  private boolean ay;
  private int az;
  
  private boolean T()
  {
    s locals = this.aI;
    Iterator localIterator = this.aH.iterator();
    while (localIterator.hasNext())
    {
      locals = locals.b(((Integer)localIterator.next()).intValue());
      if (locals == null) {
        return false;
      }
    }
    return true;
  }
  
  private boolean U()
  {
    boolean bool = false;
    if (this.aB)
    {
      int[] arrayOfInt = a(null);
      return (arrayOfInt[0] >= 0) && (arrayOfInt[1] >= 0) && (arrayOfInt[1] < 60);
    }
    if ((this.aH.contains(Integer.valueOf(i(0)))) || (this.aH.contains(Integer.valueOf(i(1))))) {
      bool = true;
    }
    return bool;
  }
  
  private int V()
  {
    int i = ((Integer)this.aH.remove(this.aH.size() - 1)).intValue();
    if (!U()) {
      this.al.setEnabled(false);
    }
    return i;
  }
  
  private void W()
  {
    this.aI = new s(this, new int[0]);
    if (this.aB)
    {
      locals1 = new s(this, new int[] { 7, 8, 9, 10, 11, 12 });
      locals2 = new s(this, new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
      locals1.a(locals2);
      locals3 = new s(this, new int[] { 7, 8 });
      this.aI.a(locals3);
      locals4 = new s(this, new int[] { 7, 8, 9, 10, 11, 12 });
      locals3.a(locals4);
      locals4.a(locals1);
      locals4.a(new s(this, new int[] { 13, 14, 15, 16 }));
      locals4 = new s(this, new int[] { 13, 14, 15, 16 });
      locals3.a(locals4);
      locals4.a(locals1);
      locals3 = new s(this, new int[] { 9 });
      this.aI.a(locals3);
      locals4 = new s(this, new int[] { 7, 8, 9, 10 });
      locals3.a(locals4);
      locals4.a(locals1);
      locals4 = new s(this, new int[] { 11, 12 });
      locals3.a(locals4);
      locals4.a(locals2);
      locals2 = new s(this, new int[] { 10, 11, 12, 13, 14, 15, 16 });
      this.aI.a(locals2);
      locals2.a(locals1);
      return;
    }
    s locals1 = new s(this, new int[] { i(0), i(1) });
    s locals2 = new s(this, new int[] { 8 });
    this.aI.a(locals2);
    locals2.a(locals1);
    s locals3 = new s(this, new int[] { 7, 8, 9 });
    locals2.a(locals3);
    locals3.a(locals1);
    s locals4 = new s(this, new int[] { 7, 8, 9, 10, 11, 12 });
    locals3.a(locals4);
    locals4.a(locals1);
    s locals5 = new s(this, new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
    locals4.a(locals5);
    locals5.a(locals1);
    locals4 = new s(this, new int[] { 13, 14, 15, 16 });
    locals3.a(locals4);
    locals4.a(locals1);
    locals3 = new s(this, new int[] { 10, 11, 12 });
    locals2.a(locals3);
    locals2 = new s(this, new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
    locals3.a(locals2);
    locals2.a(locals1);
    locals3 = new s(this, new int[] { 9, 10, 11, 12, 13, 14, 15, 16 });
    this.aI.a(locals3);
    locals3.a(locals1);
    locals2 = new s(this, new int[] { 7, 8, 9, 10, 11, 12 });
    locals3.a(locals2);
    locals3 = new s(this, new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
    locals2.a(locals3);
    locals3.a(locals1);
  }
  
  public static l a(u paramu, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    l locall = new l();
    locall.b(paramu, paramInt1, paramInt2, paramBoolean);
    return locall;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    Object localObject;
    if (this.aB) {
      localObject = "%02d";
    }
    for (;;)
    {
      localObject = String.format((String)localObject, new Object[] { Integer.valueOf(paramInt) });
      this.am.setText((CharSequence)localObject);
      this.an.setText((CharSequence)localObject);
      if (paramBoolean) {
        c.a(this.as, (CharSequence)localObject);
      }
      return;
      String str = "%d";
      int i = paramInt % 12;
      localObject = str;
      paramInt = i;
      if (i == 0)
      {
        paramInt = 12;
        localObject = str;
      }
    }
  }
  
  private void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.as.a(paramInt, paramBoolean1);
    int i;
    Object localObject;
    if (paramInt == 0)
    {
      int j = this.as.getHours();
      i = j;
      if (!this.aB) {
        i = j % 12;
      }
      this.as.setContentDescription(this.aL + ": " + i);
      if (paramBoolean3) {
        c.a(this.as, this.aM);
      }
      localObject = this.am;
      if (paramInt != 0) {
        break label230;
      }
      i = this.at;
      label106:
      if (paramInt != 1) {
        break label239;
      }
    }
    label230:
    label239:
    for (paramInt = this.at;; paramInt = this.au)
    {
      this.am.setTextColor(i);
      this.ao.setTextColor(paramInt);
      localObject = c.a((View)localObject, 0.85F, 1.1F);
      if (paramBoolean2) {
        ((com.d.a.s)localObject).d(300L);
      }
      ((com.d.a.s)localObject).a();
      return;
      i = this.as.getMinutes();
      this.as.setContentDescription(this.aN + ": " + i);
      if (paramBoolean3) {
        c.a(this.as, this.aO);
      }
      localObject = this.ao;
      break;
      i = this.au;
      break label106;
    }
  }
  
  private int[] a(Boolean[] paramArrayOfBoolean)
  {
    int i;
    int j;
    int m;
    if ((!this.aB) && (U()))
    {
      i = ((Integer)this.aH.get(this.aH.size() - 1)).intValue();
      if (i == i(0))
      {
        i = 0;
        j = 2;
        m = i;
        i = j;
      }
    }
    for (;;)
    {
      int i2 = -1;
      int i1 = -1;
      int n = i;
      label64:
      if (n <= this.aH.size())
      {
        int i3 = h(((Integer)this.aH.get(this.aH.size() - n)).intValue());
        int k;
        if (n == i)
        {
          k = i3;
          j = i2;
        }
        for (;;)
        {
          n += 1;
          i2 = j;
          i1 = k;
          break label64;
          if (i != i(1)) {
            break label308;
          }
          i = 1;
          break;
          if (n == i + 1)
          {
            i1 += i3 * 10;
            j = i2;
            k = i1;
            if (paramArrayOfBoolean != null)
            {
              j = i2;
              k = i1;
              if (i3 == 0)
              {
                paramArrayOfBoolean[1] = Boolean.valueOf(true);
                j = i2;
                k = i1;
              }
            }
          }
          else if (n == i + 2)
          {
            j = i3;
            k = i1;
          }
          else
          {
            j = i2;
            k = i1;
            if (n == i + 3)
            {
              i2 += i3 * 10;
              j = i2;
              k = i1;
              if (paramArrayOfBoolean != null)
              {
                j = i2;
                k = i1;
                if (i3 == 0)
                {
                  paramArrayOfBoolean[0] = Boolean.valueOf(true);
                  j = i2;
                  k = i1;
                }
              }
            }
          }
        }
      }
      return new int[] { i2, i1, m };
      label308:
      i = -1;
      break;
      i = 1;
      m = -1;
    }
  }
  
  private void c(int paramInt)
  {
    if (paramInt == 0)
    {
      this.aq.setText(this.av);
      c.a(this.as, this.av);
      this.ar.setContentDescription(this.av);
      return;
    }
    if (paramInt == 1)
    {
      this.aq.setText(this.aw);
      c.a(this.as, this.aw);
      this.ar.setContentDescription(this.aw);
      return;
    }
    this.aq.setText(this.aE);
  }
  
  private void d(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 60) {
      i = 0;
    }
    String str = String.format(Locale.getDefault(), "%02d", new Object[] { Integer.valueOf(i) });
    c.a(this.as, str);
    this.ao.setText(str);
    this.ap.setText(str);
  }
  
  private boolean e(int paramInt)
  {
    if ((paramInt == 111) || (paramInt == 4))
    {
      a();
      return true;
    }
    if (paramInt == 61)
    {
      if (this.aG)
      {
        if (U()) {
          g(true);
        }
        return true;
      }
    }
    else
    {
      if (paramInt == 66)
      {
        if (this.aG)
        {
          if (!U()) {
            return true;
          }
          g(false);
        }
        if (this.aj != null) {
          this.aj.a(this, this.as.getHours(), this.as.getMinutes());
        }
        a();
        return true;
      }
      if (paramInt != 67) {
        break label220;
      }
      if ((this.aG) && (!this.aH.isEmpty()))
      {
        paramInt = V();
        if (paramInt != i(0)) {
          break label179;
        }
        str = this.av;
        c.a(this.as, String.format(this.aF, new Object[] { str }));
        h(true);
      }
    }
    label179:
    label220:
    while ((paramInt != 7) && (paramInt != 8) && (paramInt != 9) && (paramInt != 10) && (paramInt != 11) && (paramInt != 12) && (paramInt != 13) && (paramInt != 14) && (paramInt != 15) && (paramInt != 16) && ((this.aB) || ((paramInt != i(0)) && (paramInt != i(1))))) {
      for (;;)
      {
        String str;
        return false;
        if (paramInt == i(1)) {
          str = this.aw;
        } else {
          str = String.format("%d", new Object[] { Integer.valueOf(h(paramInt)) });
        }
      }
    }
    if (!this.aG)
    {
      if (this.as == null)
      {
        Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
        return true;
      }
      this.aH.clear();
      f(paramInt);
      return true;
    }
    if (g(paramInt)) {
      h(false);
    }
    return true;
  }
  
  private void f(int paramInt)
  {
    if ((this.as.a(false)) && ((paramInt == -1) || (g(paramInt))))
    {
      this.aG = true;
      this.al.setEnabled(false);
      h(false);
    }
  }
  
  private void g(boolean paramBoolean)
  {
    this.aG = false;
    if (!this.aH.isEmpty())
    {
      int[] arrayOfInt = a(null);
      this.as.a(arrayOfInt[0], arrayOfInt[1]);
      if (!this.aB) {
        this.as.setAmOrPm(arrayOfInt[2]);
      }
      this.aH.clear();
    }
    if (paramBoolean)
    {
      h(false);
      this.as.a(true);
    }
  }
  
  private boolean g(int paramInt)
  {
    if (((this.aB) && (this.aH.size() == 4)) || ((!this.aB) && (U()))) {
      return false;
    }
    this.aH.add(Integer.valueOf(paramInt));
    if (!T())
    {
      V();
      return false;
    }
    paramInt = h(paramInt);
    c.a(this.as, String.format("%d", new Object[] { Integer.valueOf(paramInt) }));
    if (U())
    {
      if ((!this.aB) && (this.aH.size() <= 3))
      {
        this.aH.add(this.aH.size() - 1, Integer.valueOf(7));
        this.aH.add(this.aH.size() - 1, Integer.valueOf(7));
      }
      this.al.setEnabled(true);
    }
    return true;
  }
  
  private int h(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 7: 
      return 0;
    case 8: 
      return 1;
    case 9: 
      return 2;
    case 10: 
      return 3;
    case 11: 
      return 4;
    case 12: 
      return 5;
    case 13: 
      return 6;
    case 14: 
      return 7;
    case 15: 
      return 8;
    }
    return 9;
  }
  
  private void h(boolean paramBoolean)
  {
    int i = 0;
    if ((!paramBoolean) && (this.aH.isEmpty()))
    {
      int j = this.as.getHours();
      int k = this.as.getMinutes();
      a(j, true);
      d(k);
      if (!this.aB) {
        if (j >= 12) {
          break label86;
        }
      }
      for (;;)
      {
        c(i);
        a(this.as.getCurrentItemShowing(), true, true, true);
        this.al.setEnabled(true);
        return;
        label86:
        i = 1;
      }
    }
    Object localObject = new Boolean[2];
    localObject[0] = Boolean.valueOf(false);
    localObject[1] = Boolean.valueOf(false);
    int[] arrayOfInt = a((Boolean[])localObject);
    String str;
    if (localObject[0].booleanValue())
    {
      str = "%02d";
      label135:
      if (!localObject[1].booleanValue()) {
        break label259;
      }
      localObject = "%02d";
      label149:
      if (arrayOfInt[0] != -1) {
        break label267;
      }
      str = this.aE;
      label163:
      if (arrayOfInt[1] != -1) {
        break label300;
      }
    }
    label259:
    label267:
    label300:
    for (localObject = this.aE;; localObject = String.format((String)localObject, new Object[] { Integer.valueOf(arrayOfInt[1]) }).replace(' ', this.aD))
    {
      this.am.setText(str);
      this.an.setText(str);
      this.am.setTextColor(this.au);
      this.ao.setText((CharSequence)localObject);
      this.ap.setText((CharSequence)localObject);
      this.ao.setTextColor(this.au);
      if (this.aB) {
        break;
      }
      c(arrayOfInt[2]);
      return;
      str = "%2d";
      break label135;
      localObject = "%2d";
      break label149;
      str = String.format(str, new Object[] { Integer.valueOf(arrayOfInt[0]) }).replace(' ', this.aD);
      break label163;
    }
  }
  
  private int i(int paramInt)
  {
    Object localObject;
    int k;
    if ((this.aJ == -1) || (this.aK == -1))
    {
      localObject = KeyCharacterMap.load(-1);
      k = 0;
    }
    for (;;)
    {
      if (k < Math.max(this.av.length(), this.aw.length()))
      {
        int i = this.av.toLowerCase(Locale.getDefault()).charAt(k);
        int j = this.aw.toLowerCase(Locale.getDefault()).charAt(k);
        if (i == j) {
          break label158;
        }
        localObject = ((KeyCharacterMap)localObject).getEvents(new char[] { i, j });
        if ((localObject == null) || (localObject.length != 4)) {
          break label145;
        }
        this.aJ = localObject[0].getKeyCode();
        this.aK = localObject[2].getKeyCode();
      }
      while (paramInt == 0)
      {
        return this.aJ;
        label145:
        Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
      }
      label158:
      k += 1;
    }
    if (paramInt == 1) {
      return this.aK;
    }
    return -1;
  }
  
  public void S()
  {
    this.ak.c();
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (g_()) {
      b().getWindow().requestFeature(1);
    }
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.radial_time_picker_dialog, null);
    Object localObject = new r(this, null);
    paramLayoutInflater.findViewById(R.id.time_picker_dialog).setOnKeyListener((View.OnKeyListener)localObject);
    paramViewGroup = m();
    TypedArray localTypedArray = l().obtainStyledAttributes(this.aC, R.styleable.BetterPickersDialog);
    this.aL = paramViewGroup.getString(R.string.hour_picker_description);
    this.aM = paramViewGroup.getString(R.string.select_hours);
    this.aN = paramViewGroup.getString(R.string.minute_picker_description);
    this.aO = paramViewGroup.getString(R.string.select_minutes);
    this.at = localTypedArray.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue);
    this.au = localTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.numbers_text_color);
    this.am = ((TextView)paramLayoutInflater.findViewById(R.id.hours));
    this.am.setOnKeyListener((View.OnKeyListener)localObject);
    this.an = ((TextView)paramLayoutInflater.findViewById(R.id.hour_space));
    this.ap = ((TextView)paramLayoutInflater.findViewById(R.id.minutes_space));
    this.ao = ((TextView)paramLayoutInflater.findViewById(R.id.minutes));
    this.ao.setOnKeyListener((View.OnKeyListener)localObject);
    this.aq = ((TextView)paramLayoutInflater.findViewById(R.id.ampm_label));
    this.aq.setOnKeyListener((View.OnKeyListener)localObject);
    String[] arrayOfString = new DateFormatSymbols().getAmPmStrings();
    this.av = arrayOfString[0];
    this.aw = arrayOfString[1];
    this.ak = new a(l());
    this.as = ((RadialPickerLayout)paramLayoutInflater.findViewById(R.id.time_picker));
    this.as.setOnValueSelectedListener(this);
    this.as.setOnKeyListener((View.OnKeyListener)localObject);
    this.as.a(l(), this.ak, this.az, this.aA, this.aB);
    int j = 0;
    int i = j;
    if (paramBundle != null)
    {
      i = j;
      if (paramBundle.containsKey("current_item_showing")) {
        i = paramBundle.getInt("current_item_showing");
      }
    }
    a(i, false, true, true);
    this.as.invalidate();
    this.am.setOnClickListener(new m(this));
    this.ao.setOnClickListener(new n(this));
    this.al = ((Button)paramLayoutInflater.findViewById(R.id.done_button));
    if (this.ax != null) {
      this.al.setText(this.ax);
    }
    this.al.setTextColor(this.at);
    this.al.setOnClickListener(new o(this));
    this.al.setOnKeyListener((View.OnKeyListener)localObject);
    localObject = (Button)paramLayoutInflater.findViewById(R.id.cancel_button);
    ((Button)localObject).setTextColor(this.at);
    ((Button)localObject).setOnClickListener(new p(this));
    this.ar = paramLayoutInflater.findViewById(R.id.ampm_hitspace);
    if (this.aB)
    {
      this.aq.setVisibility(8);
      localObject = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject).addRule(13);
      ((TextView)paramLayoutInflater.findViewById(R.id.separator)).setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.ay = true;
      a(this.az, true);
      d(this.aA);
      this.aE = paramViewGroup.getString(R.string.time_placeholder);
      this.aF = paramViewGroup.getString(R.string.deleted_key);
      this.aD = this.aE.charAt(0);
      this.aK = -1;
      this.aJ = -1;
      W();
      if (!this.aG) {
        break label874;
      }
      this.aH = paramBundle.getIntegerArrayList("typed_times");
      f(-1);
      this.am.invalidate();
    }
    for (;;)
    {
      this.as.setTheme(localTypedArray);
      i = localTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor1, R.color.bpWhite);
      j = localTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor2, R.color.circle_background);
      localTypedArray.getColor(R.styleable.BetterPickersDialog_bpLineColor, R.color.bpLine_background);
      int k = localTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.numbers_text_color);
      paramLayoutInflater.findViewById(R.id.time_display_background).setBackgroundColor(i);
      paramLayoutInflater.findViewById(R.id.ok_cancel_buttons_layout).setBackgroundColor(i);
      paramLayoutInflater.findViewById(R.id.time_display).setBackgroundColor(i);
      ((TextView)paramLayoutInflater.findViewById(R.id.separator)).setTextColor(k);
      ((TextView)paramLayoutInflater.findViewById(R.id.ampm_label)).setTextColor(k);
      this.as.setBackgroundColor(j);
      return paramLayoutInflater;
      this.aq.setVisibility(0);
      if (this.az < 12) {}
      for (i = 0;; i = 1)
      {
        c(i);
        this.ar.setOnClickListener(new q(this));
        break;
      }
      label874:
      if (this.aH == null) {
        this.aH = new ArrayList();
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 == 0)
    {
      a(paramInt2, false);
      String str = String.format("%d", new Object[] { Integer.valueOf(paramInt2) });
      if ((this.ay) && (paramBoolean))
      {
        a(1, true, true, false);
        str = str + ". " + this.aO;
        c.a(this.as, str);
      }
    }
    do
    {
      return;
      this.as.setContentDescription(this.aL + ": " + paramInt2);
      break;
      if (paramInt1 == 1)
      {
        d(paramInt2);
        this.as.setContentDescription(this.aN + ": " + paramInt2);
        return;
      }
      if (paramInt1 == 2)
      {
        c(paramInt2);
        return;
      }
    } while (paramInt1 != 3);
    if (!U()) {
      this.aH.clear();
    }
    g(true);
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("hour_of_day")) && (paramBundle.containsKey("minute")) && (paramBundle.containsKey("is_24_hour_view")))
    {
      this.az = paramBundle.getInt("hour_of_day");
      this.aA = paramBundle.getInt("minute");
      this.aB = paramBundle.getBoolean("is_24_hour_view");
      this.aG = paramBundle.getBoolean("in_kb_mode");
      this.aC = paramBundle.getInt("theme");
    }
  }
  
  public void b(int paramInt)
  {
    this.aC = paramInt;
  }
  
  public void b(u paramu, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.aj = paramu;
    this.az = paramInt1;
    this.aA = paramInt2;
    this.aB = paramBoolean;
    this.aG = false;
    this.aC = R.style.BetterPickersRadialTimePickerDialog;
  }
  
  public void e(Bundle paramBundle)
  {
    if (this.as != null)
    {
      paramBundle.putInt("hour_of_day", this.as.getHours());
      paramBundle.putInt("minute", this.as.getMinutes());
      paramBundle.putBoolean("is_24_hour_view", this.aB);
      paramBundle.putInt("current_item_showing", this.as.getCurrentItemShowing());
      paramBundle.putBoolean("in_kb_mode", this.aG);
      if (this.aG) {
        paramBundle.putIntegerArrayList("typed_times", this.aH);
      }
      paramBundle.putInt("theme", this.aC);
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (this.ai != null) {
      this.ai.a(paramDialogInterface);
    }
  }
  
  public void w()
  {
    super.w();
    this.ak.a();
  }
  
  public void x()
  {
    super.x();
    this.ak.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */