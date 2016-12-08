package com.scootapp.tv.d;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.sagar.taxiapp.beans.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public final class j
  extends AlertDialog.Builder
{
  private final Button a;
  private final ImageView b;
  private final ImageView c;
  private final TextView d;
  private final TextView e;
  private final View f;
  private final TextView g;
  private final View h;
  private final ImageView i;
  
  public j(Context paramContext)
  {
    super(paramContext);
    paramContext = View.inflate(paramContext, 2130968737, null);
    setView(paramContext);
    this.c = ((ImageView)paramContext.findViewById(2131755679));
    this.d = ((TextView)paramContext.findViewById(2131755681));
    this.e = ((TextView)paramContext.findViewById(2131755682));
    this.f = paramContext.findViewById(2131755680);
    this.g = ((TextView)paramContext.findViewById(2131755677));
    this.a = ((Button)paramContext.findViewById(2131755686));
    this.b = ((ImageView)paramContext.findViewById(2131755678));
    this.h = paramContext.findViewById(2131755683);
    this.i = ((ImageView)paramContext.findViewById(2131755685));
  }
  
  public j a(float paramFloat)
  {
    this.e.setTextSize(paramFloat);
    return this;
  }
  
  public j a(int paramInt)
  {
    this.e.setTextColor(paramInt);
    return this;
  }
  
  public j a(View.OnClickListener paramOnClickListener)
  {
    this.a.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public j a(CharSequence paramCharSequence)
  {
    this.d.setText(paramCharSequence);
    return this;
  }
  
  public j a(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (!paramString.isEmpty()) {}
    }
    else
    {
      str = "2130837901";
    }
    Picasso.with(getContext()).load(str).transform(new a(getContext())).fit().into(this.c, new k(this));
    return this;
  }
  
  public j b(int paramInt)
  {
    if (paramInt == 0)
    {
      this.h.setVisibility(8);
      return this;
    }
    Picasso.with(getContext()).load(paramInt).fit().into(this.i);
    return this;
  }
  
  public j b(View.OnClickListener paramOnClickListener)
  {
    this.b.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public j b(CharSequence paramCharSequence)
  {
    this.e.setText(paramCharSequence);
    return this;
  }
  
  public j b(String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (!paramString.isEmpty()) {}
    }
    else
    {
      str = "2130837901";
    }
    Picasso.with(getContext()).load(str).into(this.c, new l(this));
    return this;
  }
  
  public j c(CharSequence paramCharSequence)
  {
    this.a.setText(paramCharSequence);
    return this;
  }
  
  public j d(CharSequence paramCharSequence)
  {
    this.g.setText(String.format("%s Offer", new Object[] { paramCharSequence }));
    return this;
  }
  
  public AlertDialog show()
  {
    if ((this.d.getText().equals("")) || (this.d.getText().length() <= 0)) {
      this.d.setVisibility(8);
    }
    if ((this.e.getText().equals("")) || (this.e.getText().length() <= 0)) {
      this.e.setVisibility(8);
    }
    return super.show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */