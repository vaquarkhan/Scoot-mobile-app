package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.bf;
import com.mixpanel.android.mpmetrics.bg;

final class f
{
  private bf b;
  private final View c;
  private final TextView d;
  private final TextView e;
  private final ListView f;
  
  public f(CardCarouselLayout paramCardCarouselLayout, View paramView)
  {
    this.c = paramView;
    this.d = ((TextView)paramView.findViewWithTag("com_mixpanel_android_TAG_prompt_text"));
    this.e = ((EditText)paramView.findViewWithTag("com_mixpanel_android_TAG_text_answer"));
    this.f = ((ListView)paramView.findViewWithTag("com_mixpanel_android_TAG_choice_list"));
    this.e.setText("");
    this.e.setOnEditorActionListener(new g(this, paramCardCarouselLayout));
    this.f.setOnItemClickListener(new h(this, paramCardCarouselLayout));
  }
  
  public View a()
  {
    return this.c;
  }
  
  public void a(bf parambf, String paramString)
  {
    this.b = parambf;
    this.d.setText(this.b.b());
    InputMethodManager localInputMethodManager = (InputMethodManager)this.c.getContext().getSystemService("input_method");
    bg localbg = parambf.d();
    if (bg.c == localbg)
    {
      this.f.setVisibility(8);
      this.e.setVisibility(0);
      if (paramString != null) {
        this.e.setText(paramString);
      }
      if (this.a.getResources().getConfiguration().orientation == 1)
      {
        this.e.requestFocus();
        localInputMethodManager.showSoftInput(this.e, 0);
      }
    }
    for (;;)
    {
      this.c.invalidate();
      return;
      localInputMethodManager.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
      continue;
      if (bg.b != localbg) {
        break;
      }
      localInputMethodManager.hideSoftInputFromWindow(this.c.getWindowToken(), 0);
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      parambf = new c(parambf.c(), LayoutInflater.from(this.a.getContext()));
      this.f.setAdapter(parambf);
      this.f.clearChoices();
      if (paramString != null)
      {
        int i = 0;
        while (i < parambf.getCount())
        {
          if (parambf.a(i).equals(paramString)) {
            this.f.setItemChecked(i, true);
          }
          i += 1;
        }
      }
    }
    throw new j("No way to display question type " + localbg, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\surveys\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */