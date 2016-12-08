package com.sagar.taxiapp.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import com.sagar.taxiapp.CarRentalCabsListingLocal;

final class bc
  implements View.OnClickListener
{
  bc(av paramav) {}
  
  public void onClick(View paramView)
  {
    av.a(this.a, av.h(this.a).getText().toString());
    av.b(this.a, av.i(this.a).getText().toString());
    av.c(this.a, av.j(this.a).getText().toString());
    this.a.a();
    if (av.k(this.a).length() > 0)
    {
      av.a(this.a, true);
      if (av.l(this.a).length() <= 0) {
        break label423;
      }
      av.b(this.a, true);
      label114:
      if (av.m(this.a).length() <= 0) {
        break label435;
      }
      av.c(this.a, true);
      label136:
      if (av.n(this.a).length() <= 0) {
        break label447;
      }
      av.d(this.a, true);
      label158:
      if ((!av.o(this.a)) || (!av.p(this.a)) || (!av.q(this.a)) || (!av.r(this.a)) || (!av.s(this.a))) {
        break label472;
      }
      if (!av.a(this.a).isChecked()) {
        break label459;
      }
      av.d(this.a, "1");
      label231:
      av.e(this.a, "2");
      paramView = new Intent(this.a.l(), CarRentalCabsListingLocal.class);
      paramView.putExtra("pickupCity", av.l(this.a));
      paramView.putExtra("pickupDate", av.m(this.a));
      paramView.putExtra("pickupTime", av.n(this.a));
      paramView.putExtra("tripTypeOption", av.t(this.a));
      paramView.putExtra("userIPAddress", av.u(this.a));
      paramView.putExtra("travelTypeOption", av.v(this.a));
      paramView.putExtra("days", av.k(this.a));
      paramView.putExtra("lat", av.w(this.a).getString("sourceCityLatLocal", ""));
      paramView.putExtra("lng", av.w(this.a).getString("sourceCityLngLocal", ""));
      this.a.a(paramView);
    }
    label423:
    label435:
    label447:
    label459:
    label472:
    do
    {
      return;
      av.a(this.a, false);
      break;
      av.b(this.a, false);
      break label114;
      av.c(this.a, false);
      break label136;
      av.d(this.a, false);
      break label158;
      av.d(this.a, "2");
      break label231;
      if (!av.o(this.a)) {
        av.a(this.a, "Enter Source City", av.h(this.a));
      }
      if (!av.p(this.a)) {
        av.a(this.a, "Select a Date", av.i(this.a));
      }
      if (!av.q(this.a)) {
        av.a(this.a, "Pick a Time", av.x(this.a));
      }
    } while (av.s(this.a));
    Toast.makeText(this.a.l(), "Pickup time should be atleast 4 hours from now", 1).show();
    av.a(this.a, "Pick a Time", av.x(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */