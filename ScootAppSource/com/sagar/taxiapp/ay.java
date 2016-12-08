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
import com.sagar.taxiapp.beans.b;
import java.util.HashMap;

final class ay
  implements View.OnClickListener
{
  ay(CarRentalPrePaymentPage paramCarRentalPrePaymentPage, ParseUser paramParseUser) {}
  
  public void onClick(View paramView)
  {
    ((ApplicationTaxi)this.b.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("INTERCITY/RENTAL").c("Intercity Pay Now button clicked").a());
    CarRentalPrePaymentPage.a(this.b, CarRentalPrePaymentPage.a(this.b).getText().toString());
    CarRentalPrePaymentPage.b(this.b, CarRentalPrePaymentPage.b(this.b).getText().toString());
    CarRentalPrePaymentPage.c(this.b, CarRentalPrePaymentPage.c(this.b).getText().toString());
    CarRentalPrePaymentPage.d(this.b, CarRentalPrePaymentPage.d(this.b).getText().toString());
    CarRentalPrePaymentPage.e(this.b, CarRentalPrePaymentPage.e(this.b).getText().toString());
    if (CarRentalPrePaymentPage.a(CarRentalPrePaymentPage.f(this.b)))
    {
      CarRentalPrePaymentPage.a(this.b, true);
      if (CarRentalPrePaymentPage.g(this.b).length() <= 0) {
        break label1012;
      }
      CarRentalPrePaymentPage.b(this.b, true);
      label193:
      if (CarRentalPrePaymentPage.h(this.b).length() <= 0) {
        break label1024;
      }
      CarRentalPrePaymentPage.c(this.b, true);
      label215:
      if (CarRentalPrePaymentPage.i(this.b).length() < 10) {
        break label1036;
      }
      CarRentalPrePaymentPage.d(this.b, true);
      label239:
      if (CarRentalPrePaymentPage.j(this.b).length() <= 0) {
        break label1048;
      }
      CarRentalPrePaymentPage.e(this.b, true);
      label261:
      if (!CarRentalPrePaymentPage.k(this.b).isChecked()) {
        break label1060;
      }
      CarRentalPrePaymentPage.f(this.b, true);
      label283:
      if ((!CarRentalPrePaymentPage.l(this.b)) || (!CarRentalPrePaymentPage.m(this.b)) || (!CarRentalPrePaymentPage.n(this.b)) || (!CarRentalPrePaymentPage.o(this.b)) || (!CarRentalPrePaymentPage.p(this.b)) || (!CarRentalPrePaymentPage.q(this.b))) {
        break label1283;
      }
      CarRentalPrePaymentPage.a(this.b, new ProgressDialog(this.b));
      CarRentalPrePaymentPage.r(this.b).setTitle("Booking Cab");
      CarRentalPrePaymentPage.r(this.b).setMessage("Initiating Payment...");
      CarRentalPrePaymentPage.r(this.b).setCancelable(false);
      CarRentalPrePaymentPage.r(this.b).setIndeterminate(true);
      CarRentalPrePaymentPage.r(this.b).show();
      paramView = new HashMap();
      if (this.a == null)
      {
        this.b.p = new ParseObject("CarRentalUsersWithoutSignup");
        this.b.p.put("username", CarRentalPrePaymentPage.f(this.b));
        this.b.p.put("email", CarRentalPrePaymentPage.f(this.b));
        this.b.p.put("firstName", CarRentalPrePaymentPage.g(this.b));
        this.b.p.put("lastName", CarRentalPrePaymentPage.h(this.b));
        this.b.p.put("phone", CarRentalPrePaymentPage.i(this.b));
        this.b.p.put("usertype", "Unauthenticated");
        this.b.p.put("displayPictureUrl", "NA");
        this.b.p.saveInBackground();
      }
      if (!CarRentalPrePaymentPage.s(this.b).equalsIgnoreCase("clear car rental")) {
        break label1072;
      }
      paramView.put("mobileNum", CarRentalPrePaymentPage.i(this.b));
      paramView.put("email", CarRentalPrePaymentPage.f(this.b));
      paramView.put("firstName", CarRentalPrePaymentPage.g(this.b));
      paramView.put("lastName", CarRentalPrePaymentPage.h(this.b));
      paramView.put("pickupAddress", CarRentalPrePaymentPage.j(this.b));
      paramView.put("days", CarRentalPrePaymentPage.t(this.b));
      paramView.put("cars", CarRentalPrePaymentPage.u(this.b));
      paramView.put("paidAmount", CarRentalPrePaymentPage.v(this.b));
      paramView.put("balanceAmount", CarRentalPrePaymentPage.w(this.b));
      paramView.put("totalAmount", CarRentalPrePaymentPage.x(this.b));
      paramView.put("approxDistance", CarRentalPrePaymentPage.y(this.b));
      paramView.put("minimumChargedDistance", CarRentalPrePaymentPage.z(this.b));
      paramView.put("perKmRateCharge", CarRentalPrePaymentPage.A(this.b));
      paramView.put("driverCharges", CarRentalPrePaymentPage.B(this.b));
      paramView.put("nightHalt", CarRentalPrePaymentPage.C(this.b));
      paramView.put("userId", CarRentalPrePaymentPage.D(this.b));
      paramView.put("carName", CarRentalPrePaymentPage.E(this.b));
      paramView.put("pickupCity", CarRentalPrePaymentPage.F(this.b));
      paramView.put("dropCity", CarRentalPrePaymentPage.G(this.b));
      paramView.put("pickupDate", CarRentalPrePaymentPage.H(this.b));
      paramView.put("pickupTime", CarRentalPrePaymentPage.I(this.b));
      paramView.put("tripTypeOption", CarRentalPrePaymentPage.J(this.b));
      paramView.put("userIPAddress", CarRentalPrePaymentPage.K(this.b));
      paramView.put("travelTypeOption", CarRentalPrePaymentPage.L(this.b));
      paramView.put("onewayPerKmRate", CarRentalPrePaymentPage.M(this.b));
      paramView.put("scootTime", CarRentalPrePaymentPage.N(this.b));
      ParseCloud.callFunctionInBackground("CCRBookingRequest", paramView, new az(this, paramView));
    }
    label1012:
    label1024:
    label1036:
    label1048:
    label1060:
    label1072:
    label1283:
    do
    {
      return;
      CarRentalPrePaymentPage.a(this.b, false);
      break;
      CarRentalPrePaymentPage.b(this.b, false);
      break label193;
      CarRentalPrePaymentPage.c(this.b, false);
      break label215;
      CarRentalPrePaymentPage.d(this.b, false);
      break label239;
      CarRentalPrePaymentPage.e(this.b, false);
      break label261;
      CarRentalPrePaymentPage.f(this.b, false);
      break label283;
      if (CarRentalPrePaymentPage.s(this.b).equalsIgnoreCase("one way cabs"))
      {
        paramView = new b();
        paramView.e(CarRentalPrePaymentPage.x(this.b));
        paramView.f(CarRentalPrePaymentPage.E(this.b));
        paramView.d(CarRentalPrePaymentPage.y(this.b));
        paramView.a(String.format("%s %s", new Object[] { CarRentalPrePaymentPage.H(this.b), CarRentalPrePaymentPage.N(this.b) }));
        paramView.b(CarRentalPrePaymentPage.j(this.b));
        paramView.c(CarRentalPrePaymentPage.O(this.b));
        paramView.g(CarRentalPrePaymentPage.i(this.b));
        paramView.h(CarRentalPrePaymentPage.K(this.b));
        paramView.i(CarRentalPrePaymentPage.D(this.b));
        paramView.k(CarRentalPrePaymentPage.u(this.b));
        paramView.l(CarRentalPrePaymentPage.s(this.b));
        CarRentalPrePaymentPage.r(this.b).dismiss();
        this.b.a(paramView);
        return;
      }
      paramView.put("provName", CarRentalPrePaymentPage.s(this.b));
      this.b.a(paramView);
      return;
      if (!CarRentalPrePaymentPage.m(this.b)) {
        CarRentalPrePaymentPage.a(this.b, "First Name", CarRentalPrePaymentPage.a(this.b));
      }
      if (!CarRentalPrePaymentPage.n(this.b)) {
        CarRentalPrePaymentPage.a(this.b, "Last Name", CarRentalPrePaymentPage.b(this.b));
      }
      if (!CarRentalPrePaymentPage.l(this.b)) {
        CarRentalPrePaymentPage.a(this.b, "Email Id", CarRentalPrePaymentPage.c(this.b));
      }
      if (!CarRentalPrePaymentPage.o(this.b)) {
        CarRentalPrePaymentPage.a(this.b, "Phone Number", CarRentalPrePaymentPage.d(this.b));
      }
      if (!CarRentalPrePaymentPage.p(this.b)) {
        CarRentalPrePaymentPage.a(this.b, "Enter Your Address", CarRentalPrePaymentPage.e(this.b));
      }
    } while (CarRentalPrePaymentPage.q(this.b));
    Toast.makeText(this.b, "You must accept cancellation policy to proceed.", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */