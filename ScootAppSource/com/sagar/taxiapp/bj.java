package com.sagar.taxiapp;

import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.parse.ParseCloud;
import com.parse.ParseObject;
import com.parse.ParseUser;
import java.util.HashMap;

final class bj
  implements View.OnClickListener
{
  bj(LocalCarRentalPrePaymentPage paramLocalCarRentalPrePaymentPage, ParseUser paramParseUser) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.b.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("INTERCITY/RENTAL").c("Rental Pay Now button clicked").a());
    LocalCarRentalPrePaymentPage.a(this.b, LocalCarRentalPrePaymentPage.a(this.b).getText().toString());
    LocalCarRentalPrePaymentPage.b(this.b, LocalCarRentalPrePaymentPage.b(this.b).getText().toString());
    LocalCarRentalPrePaymentPage.c(this.b, LocalCarRentalPrePaymentPage.c(this.b).getText().toString());
    LocalCarRentalPrePaymentPage.d(this.b, LocalCarRentalPrePaymentPage.d(this.b).getText().toString());
    LocalCarRentalPrePaymentPage.e(this.b, LocalCarRentalPrePaymentPage.e(this.b).getText().toString());
    if (LocalCarRentalPrePaymentPage.a(LocalCarRentalPrePaymentPage.f(this.b)))
    {
      LocalCarRentalPrePaymentPage.a(this.b, true);
      if (LocalCarRentalPrePaymentPage.g(this.b).length() <= 0) {
        break label967;
      }
      LocalCarRentalPrePaymentPage.b(this.b, true);
      label193:
      if (LocalCarRentalPrePaymentPage.h(this.b).length() <= 0) {
        break label979;
      }
      LocalCarRentalPrePaymentPage.c(this.b, true);
      label215:
      if (LocalCarRentalPrePaymentPage.i(this.b).length() < 10) {
        break label991;
      }
      LocalCarRentalPrePaymentPage.d(this.b, true);
      label239:
      if (LocalCarRentalPrePaymentPage.j(this.b).length() <= 0) {
        break label1003;
      }
      LocalCarRentalPrePaymentPage.e(this.b, true);
      label261:
      if (!LocalCarRentalPrePaymentPage.k(this.b).isChecked()) {
        break label1015;
      }
      LocalCarRentalPrePaymentPage.f(this.b, true);
      label283:
      if ((!LocalCarRentalPrePaymentPage.l(this.b)) || (!LocalCarRentalPrePaymentPage.m(this.b)) || (!LocalCarRentalPrePaymentPage.n(this.b)) || (!LocalCarRentalPrePaymentPage.o(this.b)) || (!LocalCarRentalPrePaymentPage.p(this.b)) || (!LocalCarRentalPrePaymentPage.q(this.b))) {
        break label1051;
      }
      LocalCarRentalPrePaymentPage.a(this.b, new ProgressDialog(this.b));
      LocalCarRentalPrePaymentPage.r(this.b).setTitle("Booking Cab");
      LocalCarRentalPrePaymentPage.r(this.b).setMessage("Initiating Payment...");
      LocalCarRentalPrePaymentPage.r(this.b).setCancelable(false);
      LocalCarRentalPrePaymentPage.r(this.b).setIndeterminate(true);
      LocalCarRentalPrePaymentPage.r(this.b).show();
      paramView = new HashMap();
      if (this.a == null)
      {
        this.b.q = new ParseObject("CarRentalUsersWithoutSignup");
        this.b.q.put("username", LocalCarRentalPrePaymentPage.f(this.b));
        this.b.q.put("email", LocalCarRentalPrePaymentPage.f(this.b));
        this.b.q.put("firstName", LocalCarRentalPrePaymentPage.g(this.b));
        this.b.q.put("lastName", LocalCarRentalPrePaymentPage.h(this.b));
        this.b.q.put("phone", LocalCarRentalPrePaymentPage.i(this.b));
        this.b.q.put("usertype", "Unauthenticated");
        this.b.q.put("displayPictureUrl", "NA");
        this.b.q.saveInBackground();
      }
      if (!LocalCarRentalPrePaymentPage.s(this.b).equalsIgnoreCase("clear car rental")) {
        break label1027;
      }
      paramView.put("mobileNum", LocalCarRentalPrePaymentPage.i(this.b));
      paramView.put("email", LocalCarRentalPrePaymentPage.f(this.b));
      paramView.put("firstName", LocalCarRentalPrePaymentPage.g(this.b));
      paramView.put("lastName", LocalCarRentalPrePaymentPage.h(this.b));
      paramView.put("pickupAddress", LocalCarRentalPrePaymentPage.j(this.b));
      paramView.put("days", LocalCarRentalPrePaymentPage.t(this.b));
      paramView.put("cars", LocalCarRentalPrePaymentPage.u(this.b));
      paramView.put("paidAmount", LocalCarRentalPrePaymentPage.v(this.b));
      paramView.put("balanceAmount", LocalCarRentalPrePaymentPage.w(this.b));
      paramView.put("totalAmount", LocalCarRentalPrePaymentPage.x(this.b));
      paramView.put("perKmRateCharge", LocalCarRentalPrePaymentPage.y(this.b));
      paramView.put("nightHalt", LocalCarRentalPrePaymentPage.z(this.b));
      paramView.put("userId", LocalCarRentalPrePaymentPage.A(this.b));
      paramView.put("carName", LocalCarRentalPrePaymentPage.B(this.b));
      paramView.put("pickupCity", LocalCarRentalPrePaymentPage.C(this.b));
      paramView.put("pickupDate", LocalCarRentalPrePaymentPage.D(this.b));
      paramView.put("pickupTime", LocalCarRentalPrePaymentPage.E(this.b));
      paramView.put("tripTypeOption", LocalCarRentalPrePaymentPage.F(this.b));
      paramView.put("userIPAddress", LocalCarRentalPrePaymentPage.G(this.b));
      paramView.put("travelTypeOption", LocalCarRentalPrePaymentPage.H(this.b));
      paramView.put("extraHourRate", LocalCarRentalPrePaymentPage.I(this.b));
      paramView.put("localBasicRate", LocalCarRentalPrePaymentPage.J(this.b));
      paramView.put("scootTime", LocalCarRentalPrePaymentPage.K(this.b));
      ParseCloud.callFunctionInBackground("CCRBookingRequest", paramView, new bk(this, paramView));
    }
    label967:
    label979:
    label991:
    label1003:
    label1015:
    label1027:
    label1051:
    do
    {
      return;
      LocalCarRentalPrePaymentPage.a(this.b, false);
      break;
      LocalCarRentalPrePaymentPage.b(this.b, false);
      break label193;
      LocalCarRentalPrePaymentPage.c(this.b, false);
      break label215;
      LocalCarRentalPrePaymentPage.d(this.b, false);
      break label239;
      LocalCarRentalPrePaymentPage.e(this.b, false);
      break label261;
      LocalCarRentalPrePaymentPage.f(this.b, false);
      break label283;
      paramView.put("provName", LocalCarRentalPrePaymentPage.s(this.b));
      this.b.a(paramView);
      return;
      if (!LocalCarRentalPrePaymentPage.m(this.b)) {
        LocalCarRentalPrePaymentPage.a(this.b, "First Name", LocalCarRentalPrePaymentPage.a(this.b));
      }
      if (!LocalCarRentalPrePaymentPage.n(this.b)) {
        LocalCarRentalPrePaymentPage.a(this.b, "Last Name", LocalCarRentalPrePaymentPage.b(this.b));
      }
      if (!LocalCarRentalPrePaymentPage.l(this.b)) {
        LocalCarRentalPrePaymentPage.a(this.b, "Email Id", LocalCarRentalPrePaymentPage.c(this.b));
      }
      if (!LocalCarRentalPrePaymentPage.o(this.b)) {
        LocalCarRentalPrePaymentPage.a(this.b, "Phone Number", LocalCarRentalPrePaymentPage.d(this.b));
      }
      if (!LocalCarRentalPrePaymentPage.p(this.b)) {
        LocalCarRentalPrePaymentPage.a(this.b, "Enter Your Address", LocalCarRentalPrePaymentPage.e(this.b));
      }
    } while (LocalCarRentalPrePaymentPage.q(this.b));
    Toast.makeText(this.b, "You must accept cancellation policy to proceed.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */