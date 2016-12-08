package com.sagar.taxiapp.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class h
  extends Fragment
  implements f, com.codetroopers.betterpickers.radialtimepicker.u
{
  private AutoCompleteTextView a;
  private int aA = 0;
  private int aB = 0;
  private int aC;
  private int aD;
  private int aE;
  private int aF;
  private int aG;
  private int aH;
  private boolean aI;
  private boolean aJ;
  private boolean aK;
  private boolean aL;
  private boolean aM = false;
  private boolean aN = true;
  private boolean aO = false;
  private Geocoder aP;
  private SharedPreferences.Editor aQ;
  private SharedPreferences aR;
  private TextWatcher aS = new q(this);
  private TextView ai;
  private TextView aj;
  private ImageView ak;
  private ImageView al;
  private ImageButton am;
  private Button an;
  private boolean ao = false;
  private boolean ap = false;
  private String aq;
  private String ar;
  private String as;
  private String at = "";
  private String au;
  private String av;
  private String aw;
  private String ax;
  private int ay = 0;
  private int az = 0;
  private AutoCompleteTextView b;
  private String c;
  private String d;
  private u e;
  private EditText f;
  private EditText g;
  private EditText h;
  private TextView i;
  
  private void a(String paramString, AutoCompleteTextView paramAutoCompleteTextView)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(l(), 2131034137);
    localAnimation.setAnimationListener(new j(this, paramAutoCompleteTextView, paramString));
    paramAutoCompleteTextView.startAnimation(localAnimation);
  }
  
  private void a(String paramString, EditText paramEditText)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(l(), 2131034137);
    localAnimation.setAnimationListener(new r(this, paramEditText, paramString));
    paramEditText.startAnimation(localAnimation);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968687, paramViewGroup, false);
    new s(this).execute(new String[0]);
    this.aR = l().getSharedPreferences("cityLatLng", 0);
    this.aQ = this.aR.edit();
    paramViewGroup = e.b.a.b.o_();
    this.aC = paramViewGroup.f();
    this.aD = paramViewGroup.e();
    this.aE = paramViewGroup.c();
    this.aF = this.aC;
    this.aG = this.aD;
    this.aH = this.aE;
    this.a = ((AutoCompleteTextView)paramLayoutInflater.findViewById(2131755226));
    this.b = ((AutoCompleteTextView)paramLayoutInflater.findViewById(2131755414));
    this.f = ((EditText)paramLayoutInflater.findViewById(2131755231));
    this.g = ((EditText)paramLayoutInflater.findViewById(2131755533));
    this.h = ((EditText)paramLayoutInflater.findViewById(2131755235));
    this.i = ((TextView)paramLayoutInflater.findViewById(2131755230));
    this.ai = ((TextView)paramLayoutInflater.findViewById(2131755234));
    this.aj = ((TextView)paramLayoutInflater.findViewById(2131755532));
    this.ak = ((ImageView)paramLayoutInflater.findViewById(2131755228));
    this.al = ((ImageView)paramLayoutInflater.findViewById(2131755536));
    this.am = ((ImageButton)paramLayoutInflater.findViewById(2131755534));
    this.an = ((Button)paramLayoutInflater.findViewById(2131755538));
    this.am.setOnClickListener(new i(this, paramViewGroup));
    this.f.setOnClickListener(new k(this));
    this.g.setOnClickListener(new l(this));
    this.g.addTextChangedListener(this.aS);
    this.h.setOnClickListener(new m(this));
    this.a.setOnClickListener(new n(this));
    this.b.setOnClickListener(new o(this));
    this.an.setOnClickListener(new p(this));
    return paramLayoutInflater;
  }
  
  public void a()
  {
    if (this.aM)
    {
      if (this.aA * 60 + this.aB - (this.ay * 60 + this.az) > 360)
      {
        this.aN = true;
        return;
      }
      this.aN = false;
      return;
    }
    this.aN = true;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getExtras().getString("cityName");
      if (!paramIntent.equalsIgnoreCase("Not Selected"))
      {
        if (this.ap == true) {
          this.a.setText(paramIntent);
        }
        for (;;)
        {
          new t(this, l(), paramIntent).execute(new String[0]);
          return;
          this.b.setText(paramIntent);
        }
      }
      return;
    }
    catch (NullPointerException paramIntent)
    {
      paramIntent.printStackTrace();
    }
  }
  
  public void a(com.codetroopers.betterpickers.calendardatepicker.b paramb, int paramInt1, int paramInt2, int paramInt3)
  {
    paramb = e.b.a.b.o_();
    int j = paramb.f();
    int k = paramb.e();
    if ((j == paramInt3) && (k == paramInt2 + 1))
    {
      this.aM = true;
      paramInt2 += 1;
      if (paramInt2 <= 9) {
        break label169;
      }
      paramb = "" + paramInt2;
      label66:
      if (paramInt3 <= 9) {
        break label193;
      }
    }
    label169:
    label193:
    for (String str = "" + paramInt3;; str = "0" + paramInt3)
    {
      if (!this.ao) {
        break label219;
      }
      this.aC = paramInt3;
      this.aD = paramInt2;
      this.aE = paramInt1;
      this.f.setText(str + "/" + paramb + "/" + paramInt1);
      return;
      this.aM = false;
      break;
      paramb = "0" + paramInt2;
      break label66;
    }
    label219:
    this.ao = true;
    this.aF = paramInt3;
    this.aG = paramInt2;
    this.aH = paramInt1;
    this.g.setText(str + "/" + paramb + "/" + paramInt1);
  }
  
  public void a(com.codetroopers.betterpickers.radialtimepicker.l paraml, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= 9))
    {
      paraml = "0" + paramInt1;
      if ((paramInt2 < 0) || (paramInt2 > 9)) {
        break label232;
      }
    }
    label232:
    for (Object localObject = "0" + paramInt2;; localObject = "" + paramInt2)
    {
      paraml = paraml + ":" + (String)localObject;
      localObject = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));
      this.ay = ((Calendar)localObject).get(11);
      this.az = ((Calendar)localObject).get(12);
      this.aA = paramInt1;
      this.aB = paramInt2;
      try
      {
        localObject = new SimpleDateFormat("H:mm").parse(paraml);
        this.at = (paraml + ":00");
        localObject = new SimpleDateFormat("hh:mm a").format((Date)localObject);
        paraml = (com.codetroopers.betterpickers.radialtimepicker.l)localObject;
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
        }
      }
      this.h.setText(paraml);
      this.h.setText(paraml);
      return;
      paraml = "" + paramInt1;
      break;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((paramString1.length() != 0) && (paramString2.length() != 0))
    {
      if (paramString1.equalsIgnoreCase(paramString2))
      {
        this.aO = true;
        return;
      }
      this.aO = false;
      return;
    }
    this.aO = false;
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    if (j() != null)
    {
      this.c = j().getString("param1");
      this.d = j().getString("param2");
    }
  }
  
  public void e()
  {
    super.e();
    this.e = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */