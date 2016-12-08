package com.codetroopers.betterpickers.radialtimepicker;

final class c
  implements Runnable
{
  c(RadialPickerLayout paramRadialPickerLayout) {}
  
  public void run()
  {
    RadialPickerLayout.b(this.a).setAmOrPmPressed(RadialPickerLayout.a(this.a));
    RadialPickerLayout.b(this.a).invalidate();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\radialtimepicker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */