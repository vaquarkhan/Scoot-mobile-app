package com.payu.payuui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.payu.india.Model.StoredCard;
import java.util.ArrayList;

final class n
  implements View.OnClickListener
{
  int a;
  ImageView b;
  ImageView c;
  TextView d;
  TextView e;
  RelativeLayout f;
  LinearLayout g;
  Button h;
  EditText i;
  
  public n(m paramm, View paramView)
  {
    this.b = ((ImageView)paramView.findViewById(R.id.image_view_card_icon));
    this.d = ((TextView)paramView.findViewById(R.id.text_view_card_number));
    this.c = ((ImageView)paramView.findViewById(R.id.image_view_card_trash));
    this.e = ((TextView)paramView.findViewById(R.id.text_view_card_name));
    this.g = ((LinearLayout)paramView.findViewById(R.id.linear_layout_row));
    this.f = ((RelativeLayout)paramView.findViewById(R.id.linear_layout_cvv_paynow));
    this.h = ((Button)paramView.findViewById(R.id.button_pay_now));
    this.i = ((EditText)paramView.findViewById(R.id.edit_text_cvv));
    this.h.setOnClickListener(this);
    this.c.setOnClickListener(this);
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    if (this.f.getVisibility() == 0)
    {
      this.f.setVisibility(8);
      if (paramView.getId() != R.id.image_view_card_trash) {
        break label71;
      }
      PayUOneClickPaymentActivity.a(this.j.a, (StoredCard)PayUOneClickPaymentActivity.b(this.j.a).get(this.a));
    }
    label71:
    while (paramView.getId() != R.id.button_pay_now)
    {
      return;
      this.f.setVisibility(0);
      break;
    }
    PayUOneClickPaymentActivity.b(this.j.a, (StoredCard)PayUOneClickPaymentActivity.b(this.j.a).get(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\payuui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */