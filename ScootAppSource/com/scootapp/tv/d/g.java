package com.scootapp.tv.d;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class g
  extends AlertDialog.Builder
{
  private final View a;
  private final TextView b;
  private final ImageView c;
  private final TextView d;
  private final View e;
  private final Button f;
  private final Button g;
  
  public g(Context paramContext)
  {
    super(paramContext);
    this.a = View.inflate(paramContext, 2130968654, null);
    setView(this.a);
    this.b = ((TextView)this.a.findViewById(2131755112));
    this.d = ((TextView)this.a.findViewById(2131755464));
    this.c = ((ImageView)this.a.findViewById(2131755105));
    this.e = this.a.findViewById(2131755463);
    this.f = ((Button)this.a.findViewById(2131755466));
    this.g = ((Button)this.a.findViewById(2131755465));
  }
  
  public g a(int paramInt)
  {
    this.d.setText(paramInt);
    return this;
  }
  
  public g a(Drawable paramDrawable)
  {
    this.c.setImageDrawable(paramDrawable);
    return this;
  }
  
  public g a(View.OnClickListener paramOnClickListener)
  {
    this.f.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public g a(CharSequence paramCharSequence)
  {
    this.b.setText(paramCharSequence);
    return this;
  }
  
  public g b(int paramInt)
  {
    this.c.setImageResource(paramInt);
    return this;
  }
  
  public g b(View.OnClickListener paramOnClickListener)
  {
    this.g.setOnClickListener(paramOnClickListener);
    return this;
  }
  
  public g b(CharSequence paramCharSequence)
  {
    this.d.setText(paramCharSequence);
    return this;
  }
  
  public g c(int paramInt)
  {
    this.f.setTextColor(paramInt);
    return this;
  }
  
  public g c(CharSequence paramCharSequence)
  {
    this.f.setText(paramCharSequence);
    return this;
  }
  
  public g d(int paramInt)
  {
    this.g.setTextColor(paramInt);
    return this;
  }
  
  public g d(CharSequence paramCharSequence)
  {
    this.g.setText(paramCharSequence);
    return this;
  }
  
  public AlertDialog show()
  {
    if ((this.b.getText().equals("")) || (this.b.getText().length() <= 0)) {
      this.a.findViewById(2131755110).setVisibility(8);
    }
    if ((this.d.getText().equals("")) || (this.d.getText().length() <= 0)) {
      this.a.findViewById(2131755113).setVisibility(8);
    }
    if ((this.g.getText().equals("")) || (this.g.getText().length() <= 0)) {
      this.g.setVisibility(8);
    }
    return super.show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */