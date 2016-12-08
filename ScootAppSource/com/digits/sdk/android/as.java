package com.digits.sdk.android;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

abstract class as
  implements ar
{
  private void a(TextView paramTextView, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = R.id.dgts__callMeButton;; i = R.id.dgts__resendConfirmationButton)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramTextView.getLayoutParams();
      localLayoutParams.addRule(7, i);
      localLayoutParams.addRule(8, i);
      paramTextView.setLayoutParams(localLayoutParams);
      return;
    }
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2, Activity paramActivity) {}
  
  protected void a(Activity paramActivity, LinkTextView paramLinkTextView, String paramString)
  {
    paramLinkTextView.setText(paramString);
    paramLinkTextView.setOnClickListener(new aw(this, paramActivity));
  }
  
  public void a(Activity paramActivity, bn parambn, EditText paramEditText)
  {
    paramEditText.setOnEditorActionListener(new ax(this, parambn, paramActivity));
    paramEditText.addTextChangedListener(parambn.b());
  }
  
  public void a(Activity paramActivity, bn parambn, TextView paramTextView)
  {
    paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
    paramTextView.setOnClickListener(new ay(this, parambn));
  }
  
  public void a(Activity paramActivity, bn parambn, StateButton paramStateButton)
  {
    paramStateButton.setOnClickListener(new at(this, parambn, paramActivity));
  }
  
  void a(Activity paramActivity, bn parambn, ca paramca, InvertedStateButton paramInvertedStateButton)
  {
    paramInvertedStateButton.setEnabled(false);
    paramInvertedStateButton.setOnClickListener(new au(this, paramca, parambn, paramActivity, paramInvertedStateButton));
  }
  
  void a(Activity paramActivity, bn parambn, ca paramca, InvertedStateButton paramInvertedStateButton, AuthConfig paramAuthConfig)
  {
    if (paramAuthConfig.b) {}
    for (int i = 0;; i = 8)
    {
      paramInvertedStateButton.setVisibility(i);
      paramInvertedStateButton.setEnabled(false);
      paramInvertedStateButton.setOnClickListener(new av(this, paramca, parambn, paramActivity, paramInvertedStateButton));
      return;
    }
  }
  
  void a(bn parambn, TextView paramTextView, AuthConfig paramAuthConfig)
  {
    a(paramTextView, paramAuthConfig.b);
    parambn.e();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */