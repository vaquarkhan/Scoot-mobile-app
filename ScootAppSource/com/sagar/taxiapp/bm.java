package com.sagar.taxiapp;

import android.widget.Toast;
import com.parse.FunctionCallback;
import com.parse.ParseException;
import com.scootapp.tv.a.a;
import java.util.HashMap;

final class bm
  implements FunctionCallback<String>
{
  bm(LocalCarRentalPrePaymentPage paramLocalCarRentalPrePaymentPage) {}
  
  public void a(String paramString, ParseException paramParseException)
  {
    if (paramParseException == null)
    {
      paramParseException = new HashMap();
      paramParseException.put("email", LocalCarRentalPrePaymentPage.f(this.a));
      paramParseException.put("firstName", LocalCarRentalPrePaymentPage.g(this.a));
      paramParseException.put("totalAmount", LocalCarRentalPrePaymentPage.x(this.a));
      paramParseException.put("tripId", paramString);
      a.a(this.a, paramParseException, this.a);
      return;
    }
    Toast.makeText(this.a, "Cab Booking Failed", 1).show();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */