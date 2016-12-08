package com.sagar.taxiapp.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.f;
import com.codetroopers.betterpickers.radialtimepicker.l;
import com.codetroopers.betterpickers.radialtimepicker.u;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class av
  extends Fragment
  implements f, u
{
  private String a;
  private ImageView aA;
  private ImageView aB;
  private Button aC;
  private RadioButton aD;
  private RadioButton aE;
  private bh aF;
  private Geocoder aG;
  private SharedPreferences.Editor aH;
  private SharedPreferences aI;
  private boolean ai;
  private boolean aj;
  private boolean ak = false;
  private boolean al = true;
  private int am = 0;
  private int an = 0;
  private int ao = 0;
  private int ap = 0;
  private String aq;
  private String ar;
  private AutoCompleteTextView as;
  private EditText at;
  private EditText au;
  private EditText av;
  private TextView aw;
  private TextView ax;
  private TextView ay;
  private ImageView az;
  private String b;
  private String c;
  private String d;
  private String e = "";
  private String f;
  private String g;
  private boolean h;
  private boolean i;
  
  private void a(String paramString, AutoCompleteTextView paramAutoCompleteTextView)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(l(), 2131034137);
    localAnimation.setAnimationListener(new be(this, paramAutoCompleteTextView, paramString));
    paramAutoCompleteTextView.startAnimation(localAnimation);
  }
  
  private void a(String paramString, EditText paramEditText)
  {
    Animation localAnimation = AnimationUtils.loadAnimation(l(), 2131034137);
    localAnimation.setAnimationListener(new bd(this, paramEditText, paramString));
    paramEditText.startAnimation(localAnimation);
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130968688, paramViewGroup, false);
    new bf(this).execute(new String[0]);
    this.aI = l().getSharedPreferences("cityLatLng", 0);
    this.aH = this.aI.edit();
    this.as = ((AutoCompleteTextView)paramLayoutInflater.findViewById(2131755226));
    this.at = ((EditText)paramLayoutInflater.findViewById(2131755231));
    this.au = ((EditText)paramLayoutInflater.findViewById(2131755546));
    this.av = ((EditText)paramLayoutInflater.findViewById(2131755235));
    this.aw = ((TextView)paramLayoutInflater.findViewById(2131755230));
    this.ay = ((TextView)paramLayoutInflater.findViewById(2131755542));
    this.ax = ((TextView)paramLayoutInflater.findViewById(2131755545));
    this.az = ((ImageView)paramLayoutInflater.findViewById(2131755228));
    this.aA = ((ImageView)paramLayoutInflater.findViewById(2131755536));
    this.aB = ((ImageView)paramLayoutInflater.findViewById(2131755541));
    this.aC = ((Button)paramLayoutInflater.findViewById(2131755538));
    this.aD = ((RadioButton)paramLayoutInflater.findViewById(2131755548));
    this.aE = ((RadioButton)paramLayoutInflater.findViewById(2131755550));
    this.aD.setChecked(true);
    this.aD.setOnClickListener(new aw(this));
    this.aE.setOnClickListener(new ax(this));
    this.au.setOnClickListener(new ay(this));
    this.at.setOnClickListener(new az(this));
    this.av.setOnClickListener(new ba(this));
    this.as.setOnClickListener(new bb(this));
    this.aC.setOnClickListener(new bc(this));
    return paramLayoutInflater;
  }
  
  public void a()
  {
    if (this.ak)
    {
      if (this.ao * 60 + this.ap - (this.am * 60 + this.an) > 240)
      {
        this.al = true;
        return;
      }
      this.al = false;
      return;
    }
    this.al = true;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getExtras().getString("cityName");
      if (!paramIntent.equalsIgnoreCase("Not Selected"))
      {
        this.as.setText(paramIntent);
        new bg(this, l(), paramIntent).execute(new String[0]);
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
      this.ak = true;
      paramInt2 += 1;
      if (paramInt2 <= 9) {
        break label146;
      }
      paramb = "" + paramInt2;
      label66:
      if (paramInt3 <= 9) {
        break label170;
      }
    }
    label146:
    label170:
    for (String str = "" + paramInt3;; str = "0" + paramInt3)
    {
      this.at.setText(str + "/" + paramb + "/" + paramInt1);
      return;
      this.ak = false;
      break;
      paramb = "0" + paramInt2;
      break label66;
    }
  }
  
  public void a(l paraml, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= 9))
    {
      paraml = "0" + paramInt1;
      if ((paramInt2 < 0) || (paramInt2 > 9)) {
        break label224;
      }
    }
    label224:
    for (Object localObject = "0" + paramInt2;; localObject = "" + paramInt2)
    {
      paraml = paraml + ":" + (String)localObject;
      localObject = Calendar.getInstance(TimeZone.getTimeZone("GMT+5:30"));
      this.am = ((Calendar)localObject).get(11);
      this.an = ((Calendar)localObject).get(12);
      this.ao = paramInt1;
      this.ap = paramInt2;
      try
      {
        localObject = new SimpleDateFormat("H:mm").parse(paraml);
        this.e = (paraml + ":00");
        localObject = new SimpleDateFormat("hh:mm a").format((Date)localObject);
        paraml = (l)localObject;
      }
      catch (ParseException localParseException)
      {
        for (;;)
        {
          localParseException.printStackTrace();
        }
      }
      this.av.setText(paraml);
      return;
      paraml = "" + paramInt1;
      break;
    }
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    if (j() != null)
    {
      this.a = j().getString("param1");
      this.b = j().getString("param2");
    }
  }
  
  public void e()
  {
    super.e();
    this.aF = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */