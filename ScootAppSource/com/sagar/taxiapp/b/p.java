package com.sagar.taxiapp.b;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;
import com.sagar.taxiapp.CarRentalCabListings;

final class p
  implements View.OnClickListener
{
  p(h paramh) {}
  
  public void onClick(View paramView)
  {
    h.a(this.a, h.p(this.a).getText().toString());
    h.b(this.a, h.q(this.a).getText().toString());
    h.c(this.a, h.j(this.a).getText().toString());
    h.d(this.a, h.a(this.a).getText().toString());
    this.a.a();
    this.a.a(h.r(this.a), h.s(this.a));
    if (h.r(this.a).length() > 0)
    {
      h.c(this.a, true);
      if (h.s(this.a).length() <= 0) {
        break label535;
      }
      h.d(this.a, true);
      label156:
      if (h.t(this.a).length() <= 0) {
        break label547;
      }
      h.e(this.a, true);
      label178:
      if (h.u(this.a).length() <= 0) {
        break label559;
      }
      h.f(this.a, true);
      label200:
      if ((!h.v(this.a)) || (!h.w(this.a)) || (!h.x(this.a)) || (!h.y(this.a)) || (!h.z(this.a)) || (h.A(this.a))) {
        break label584;
      }
      if (h.B(this.a).length() != 0) {
        break label571;
      }
      h.e(this.a, "2");
      label283:
      h.f(this.a, "1");
      paramView = new Intent(this.a.l(), CarRentalCabListings.class);
      paramView.putExtra("pickupCity", h.r(this.a));
      paramView.putExtra("dropCity", h.s(this.a));
      paramView.putExtra("pickupDate", h.t(this.a));
      paramView.putExtra("pickupTime", h.u(this.a));
      paramView.putExtra("tripTypeOption", h.C(this.a));
      paramView.putExtra("userIPAddress", h.D(this.a));
      paramView.putExtra("travelTypeOption", h.E(this.a));
      paramView.putExtra("returnDate", h.B(this.a));
      paramView.putExtra("lat", h.F(this.a).getString("sourceCityLat", ""));
      paramView.putExtra("lng", h.F(this.a).getString("sourceCityLng", ""));
      paramView.putExtra("droplat", h.F(this.a).getString("destinationCityLat", ""));
      paramView.putExtra("droplng", h.F(this.a).getString("destinationCityLng", ""));
      this.a.a(paramView);
    }
    label535:
    label547:
    label559:
    label571:
    label584:
    do
    {
      return;
      h.c(this.a, false);
      break;
      h.d(this.a, false);
      break label156;
      h.e(this.a, false);
      break label178;
      h.f(this.a, false);
      break label200;
      h.e(this.a, "1");
      break label283;
      if (!h.v(this.a)) {
        h.a(this.a, "Enter Source City", h.p(this.a));
      }
      if (!h.w(this.a)) {
        h.a(this.a, "Enter Destination City", h.q(this.a));
      }
      if (!h.x(this.a)) {
        h.a(this.a, "Select a Date", h.j(this.a));
      }
      if (!h.y(this.a)) {
        h.a(this.a, "Pick a Time", h.G(this.a));
      }
      if (!h.z(this.a))
      {
        Toast.makeText(this.a.l(), "Pickup time should be atleast 6 hours from now.", 1).show();
        h.a(this.a, "Pickup Time", h.G(this.a));
      }
    } while (!h.A(this.a));
    Toast.makeText(this.a.l(), "Source and destination cities can not be same.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */