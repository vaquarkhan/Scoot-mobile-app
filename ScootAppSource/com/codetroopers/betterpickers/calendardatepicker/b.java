package com.codetroopers.betterpickers.calendardatepicker;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.w;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.id;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.string;
import com.codetroopers.betterpickers.R.style;
import com.codetroopers.betterpickers.R.styleable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class b
  extends w
  implements View.OnClickListener, a
{
  private static final l ai = new l(1900, 0, 1);
  private static final l aj = new l(2100, 11, 31);
  private static final SimpleDateFormat ak = new SimpleDateFormat("yyyy", Locale.getDefault());
  private static final SimpleDateFormat al = new SimpleDateFormat("dd", Locale.getDefault());
  private int aA = this.am.getFirstDayOfWeek();
  private l aB = ai;
  private l aC = aj;
  private com.codetroopers.betterpickers.a aD;
  private boolean aE = true;
  private String aF;
  private String aG;
  private String aH;
  private String aI;
  private int aJ;
  private int aK;
  private int aL;
  private final Calendar am = Calendar.getInstance();
  private f an;
  private g ao;
  private HashSet<e> ap = new HashSet();
  private AccessibleDateAnimator aq;
  private LinearLayout ar;
  private TextView as;
  private LinearLayout at;
  private TextView au;
  private TextView av;
  private TextView aw;
  private h ax;
  private s ay;
  private int az = -1;
  
  private void S()
  {
    Iterator localIterator = this.ap.iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).a();
    }
  }
  
  public static b a(f paramf, int paramInt1, int paramInt2, int paramInt3)
  {
    b localb = new b();
    localb.b(paramf, paramInt1, paramInt2, paramInt3);
    return localb;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i = this.am.get(5);
    paramInt1 = com.codetroopers.betterpickers.c.a(paramInt1, paramInt2);
    if (i > paramInt1) {
      this.am.set(5, paramInt1);
    }
  }
  
  private void c(int paramInt)
  {
    long l = this.am.getTimeInMillis();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localObject = com.codetroopers.betterpickers.c.a(this.at, 0.9F, 1.05F);
      if (this.aE)
      {
        ((com.d.a.s)localObject).d(500L);
        this.aE = false;
      }
      this.ax.a();
      if (this.az != paramInt)
      {
        this.at.setSelected(true);
        this.aw.setSelected(false);
        this.av.setTextColor(this.aK);
        this.au.setTextColor(this.aK);
        this.aw.setTextColor(this.aL);
        this.aq.setDisplayedChild(0);
        this.az = paramInt;
      }
      ((com.d.a.s)localObject).a();
      localObject = DateUtils.formatDateTime(l(), l, 16);
      this.aq.setContentDescription(this.aF + ": " + (String)localObject);
      com.codetroopers.betterpickers.c.a(this.aq, this.aG);
      return;
    }
    Object localObject = com.codetroopers.betterpickers.c.a(this.aw, 0.85F, 1.1F);
    if (this.aE)
    {
      ((com.d.a.s)localObject).d(500L);
      this.aE = false;
    }
    this.ay.a();
    if (this.az != paramInt)
    {
      this.at.setSelected(false);
      this.aw.setSelected(true);
      this.av.setTextColor(this.aL);
      this.au.setTextColor(this.aL);
      this.aw.setTextColor(this.aK);
      this.aq.setDisplayedChild(1);
      this.az = paramInt;
    }
    ((com.d.a.s)localObject).a();
    localObject = ak.format(Long.valueOf(l));
    this.aq.setContentDescription(this.aH + ": " + localObject);
    com.codetroopers.betterpickers.c.a(this.aq, this.aI);
  }
  
  private void g(boolean paramBoolean)
  {
    if (this.as != null) {
      this.as.setText(this.am.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
    }
    this.au.setText(this.am.getDisplayName(2, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()));
    this.av.setText(al.format(this.am.getTime()));
    this.aw.setText(ak.format(this.am.getTime()));
    long l = this.am.getTimeInMillis();
    this.aq.setDateMillis(l);
    String str = DateUtils.formatDateTime(l(), l, 24);
    this.at.setContentDescription(str);
    if (paramBoolean)
    {
      str = DateUtils.formatDateTime(l(), l, 20);
      com.codetroopers.betterpickers.c.a(this.aq, str);
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Log.d("DatePickerDialog", "onCreateView: ");
    if (g_()) {
      b().getWindow().requestFeature(1);
    }
    paramLayoutInflater = paramLayoutInflater.inflate(R.layout.calendar_date_picker_dialog, null);
    this.ar = ((LinearLayout)paramLayoutInflater.findViewById(R.id.day_picker_selected_date_layout));
    this.as = ((TextView)paramLayoutInflater.findViewById(R.id.date_picker_header));
    this.at = ((LinearLayout)paramLayoutInflater.findViewById(R.id.date_picker_month_and_day));
    this.at.setOnClickListener(this);
    this.au = ((TextView)paramLayoutInflater.findViewById(R.id.date_picker_month));
    this.av = ((TextView)paramLayoutInflater.findViewById(R.id.date_picker_day));
    this.aw = ((TextView)paramLayoutInflater.findViewById(R.id.date_picker_year));
    this.aw.setOnClickListener(this);
    int k = -1;
    int j = 0;
    int i = 0;
    if (paramBundle != null)
    {
      this.aA = paramBundle.getInt("week_start");
      this.aB = new l(paramBundle.getLong("date_start"));
      this.aC = new l(paramBundle.getLong("date_end"));
      i = paramBundle.getInt("current_view");
      k = paramBundle.getInt("list_position");
      j = paramBundle.getInt("list_position_offset");
      this.aJ = paramBundle.getInt("theme");
    }
    paramViewGroup = l();
    this.ax = new p(paramViewGroup, this);
    this.ay = new s(paramViewGroup, this);
    Object localObject = m();
    paramBundle = l().obtainStyledAttributes(this.aJ, R.styleable.BetterPickersDialog);
    this.aF = ((Resources)localObject).getString(R.string.day_picker_description);
    this.aG = ((Resources)localObject).getString(R.string.select_day);
    this.aH = ((Resources)localObject).getString(R.string.year_picker_description);
    this.aI = ((Resources)localObject).getString(R.string.select_year);
    this.aK = paramBundle.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue);
    this.aL = paramBundle.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.numbers_text_color);
    this.aq = ((AccessibleDateAnimator)paramLayoutInflater.findViewById(R.id.animator));
    this.aq.addView(this.ax);
    this.aq.addView(this.ay);
    this.aq.setDateMillis(this.am.getTimeInMillis());
    localObject = new AlphaAnimation(0.0F, 1.0F);
    ((Animation)localObject).setDuration(300L);
    this.aq.setInAnimation((Animation)localObject);
    localObject = new AlphaAnimation(1.0F, 0.0F);
    ((Animation)localObject).setDuration(300L);
    this.aq.setOutAnimation((Animation)localObject);
    localObject = (Button)paramLayoutInflater.findViewById(R.id.done_button);
    ((Button)localObject).setTextColor(this.aK);
    ((Button)localObject).setOnClickListener(new c(this));
    localObject = (Button)paramLayoutInflater.findViewById(R.id.cancel_button);
    ((Button)localObject).setTextColor(this.aK);
    ((Button)localObject).setOnClickListener(new d(this));
    g(false);
    c(i);
    if (k != -1)
    {
      if (i != 0) {
        break label702;
      }
      this.ax.a(k);
    }
    for (;;)
    {
      this.aD = new com.codetroopers.betterpickers.a(paramViewGroup);
      i = paramBundle.getColor(R.styleable.BetterPickersDialog_bpMainColor1, R.color.bpWhite);
      j = paramBundle.getColor(R.styleable.BetterPickersDialog_bpMainColor2, R.color.circle_background);
      k = paramBundle.getColor(R.styleable.BetterPickersDialog_bpLineColor, R.color.bpWhite);
      this.ax.setTheme(paramBundle);
      this.ay.setTheme(paramBundle);
      this.ar.setBackgroundColor(i);
      this.aw.setBackgroundColor(i);
      this.at.setBackgroundColor(i);
      paramLayoutInflater.setBackgroundColor(j);
      if (this.as != null) {
        this.as.setBackgroundColor(k);
      }
      this.ay.setBackgroundColor(j);
      this.ax.setBackgroundColor(j);
      return paramLayoutInflater;
      label702:
      if (i == 1) {
        this.ay.a(k, j);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.am.set(1, paramInt1);
    this.am.set(2, paramInt2);
    this.am.set(5, paramInt3);
    S();
    g(true);
  }
  
  public void a(e parame)
  {
    this.ap.add(parame);
  }
  
  public void a(l paraml1, l paraml2)
  {
    if (paraml1 == null)
    {
      this.aB = ai;
      if (paraml2 != null) {
        break label55;
      }
    }
    label55:
    for (this.aC = aj;; this.aC = paraml2)
    {
      if (this.aC.b(this.aB) >= 0) {
        break label63;
      }
      throw new IllegalArgumentException("End date must be larger than start date");
      this.aB = paraml1;
      break;
    }
    label63:
    if (this.ax != null) {
      this.ax.b();
    }
  }
  
  public void a_(int paramInt)
  {
    a(this.am.get(2), paramInt);
    this.am.set(1, paramInt);
    S();
    c(0);
    g(true);
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    l().getWindow().setSoftInputMode(3);
    if (paramBundle != null)
    {
      this.am.set(1, paramBundle.getInt("year"));
      this.am.set(2, paramBundle.getInt("month"));
      this.am.set(5, paramBundle.getInt("day"));
    }
  }
  
  public void b(int paramInt)
  {
    this.aJ = paramInt;
  }
  
  public void b(f paramf, int paramInt1, int paramInt2, int paramInt3)
  {
    this.an = paramf;
    this.am.set(1, paramInt1);
    this.am.set(2, paramInt2);
    this.am.set(5, paramInt3);
    this.aJ = R.style.BetterPickersRadialTimePickerDialog;
  }
  
  public l c()
  {
    return this.aB;
  }
  
  public l c_()
  {
    return new l(this.am);
  }
  
  public l d()
  {
    return this.aC;
  }
  
  public int d_()
  {
    return this.aA;
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("year", this.am.get(1));
    paramBundle.putInt("month", this.am.get(2));
    paramBundle.putInt("day", this.am.get(5));
    paramBundle.putInt("week_start", this.aA);
    paramBundle.putLong("date_start", this.aB.a());
    paramBundle.putLong("date_end", this.aC.a());
    paramBundle.putInt("current_view", this.az);
    paramBundle.putInt("theme", this.aJ);
    int i = -1;
    if (this.az == 0) {
      i = this.ax.getMostVisiblePosition();
    }
    for (;;)
    {
      paramBundle.putInt("list_position", i);
      return;
      if (this.az == 1)
      {
        i = this.ay.getFirstVisiblePosition();
        paramBundle.putInt("list_position_offset", this.ay.getFirstPositionOffset());
      }
    }
  }
  
  public void e_()
  {
    this.aD.c();
  }
  
  public void onClick(View paramView)
  {
    e_();
    if (paramView.getId() == R.id.date_picker_year) {
      c(1);
    }
    while (paramView.getId() != R.id.date_picker_month_and_day) {
      return;
    }
    c(0);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    if (this.ao != null) {
      this.ao.a(paramDialogInterface);
    }
  }
  
  public void w()
  {
    super.w();
    this.aD.a();
  }
  
  public void x()
  {
    super.x();
    this.aD.b();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */