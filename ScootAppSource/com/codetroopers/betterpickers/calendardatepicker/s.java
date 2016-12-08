package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.codetroopers.betterpickers.R.color;
import com.codetroopers.betterpickers.R.dimen;
import com.codetroopers.betterpickers.R.layout;
import com.codetroopers.betterpickers.R.styleable;
import java.util.ArrayList;

public final class s
  extends ListView
  implements AdapterView.OnItemClickListener, e
{
  private final a a;
  private u b;
  private int c;
  private int d;
  private TextViewWithCircularIndicator e;
  private int f;
  private int g;
  private int h;
  
  public s(Context paramContext, a parama)
  {
    super(paramContext);
    this.a = parama;
    this.a.a(this);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    parama = paramContext.getResources();
    this.c = parama.getDimensionPixelOffset(R.dimen.date_picker_view_animator_height);
    this.d = parama.getDimensionPixelOffset(R.dimen.year_label_height);
    setVerticalFadingEdgeEnabled(true);
    setFadingEdgeLength(this.d / 3);
    a(paramContext);
    setOnItemClickListener(this);
    setSelector(new StateListDrawable());
    setDividerHeight(0);
    a();
    this.h = R.color.circle_background;
    this.g = R.color.bpBlue;
    this.f = R.color.ampm_text_color;
  }
  
  private int a(TextView paramTextView)
  {
    return Integer.valueOf(paramTextView.getText().toString()).intValue();
  }
  
  private void a(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    int i = this.a.c().a;
    while (i <= this.a.d().a)
    {
      localArrayList.add(String.format("%d", new Object[] { Integer.valueOf(i) }));
      i += 1;
    }
    this.b = new u(this, paramContext, R.layout.calendar_year_label_text_view, localArrayList);
    setAdapter(this.b);
  }
  
  public void a()
  {
    this.b.notifyDataSetChanged();
    a(this.a.c_().a - this.a.c().a);
  }
  
  public void a(int paramInt)
  {
    a(paramInt, this.c / 2 - this.d / 2);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    post(new t(this, paramInt1, paramInt2));
  }
  
  public int getFirstPositionOffset()
  {
    View localView = getChildAt(0);
    if (localView == null) {
      return 0;
    }
    return localView.getTop();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      paramAccessibilityEvent.setFromIndex(0);
      paramAccessibilityEvent.setToIndex(0);
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.e_();
    paramAdapterView = (TextViewWithCircularIndicator)paramView;
    if (paramAdapterView != null)
    {
      if (paramAdapterView != this.e)
      {
        if (this.e != null)
        {
          this.e.a(false);
          this.e.requestLayout();
        }
        paramAdapterView.a(true);
        paramAdapterView.requestLayout();
        this.e = paramAdapterView;
      }
      this.a.a_(a(paramAdapterView));
      this.b.notifyDataSetChanged();
    }
  }
  
  public void setTheme(TypedArray paramTypedArray)
  {
    this.h = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainColor2, R.color.circle_background);
    this.g = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpAccentColor, R.color.bpBlue);
    this.f = paramTypedArray.getColor(R.styleable.BetterPickersDialog_bpMainTextColor, R.color.ampm_text_color);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */