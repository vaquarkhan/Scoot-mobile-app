package com.appsee;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TabWidget;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class ab
{
  private static List<Class<?>> A;
  private static final ArrayList<View> B;
  private static h D;
  private static final int[] E;
  private static HashMap<ob, List<Class<?>>> F;
  private static final List<View> G;
  private static final ArrayList<View> M;
  private static List<Class<?>> c;
  private static h e;
  private static List<Class<?>> f;
  private static List<Class<?>> g;
  private static final int[] j;
  private static int l = 10000;
  
  static
  {
    E = new int[2];
    j = new int[2];
    B = new ArrayList();
    M = new ArrayList();
    G = Collections.unmodifiableList(M);
    e = new yb();
    D = new eb();
    try
    {
      A = new ArrayList();
      f = new ArrayList();
      c = new ArrayList();
      F = new HashMap();
      g = new ArrayList();
      f.add(AbsListView.class);
      f.add(ScrollView.class);
      A.add(AbsListView.class);
      A.add(SeekBar.class);
      A.add(Button.class);
      A.add(ImageButton.class);
      A.add(EditText.class);
      A.add(TabWidget.class);
      C();
      A.addAll((Collection)F.get(ob.A));
      A.addAll((Collection)F.get(ob.e));
      A.addAll((Collection)F.get(ob.f));
      A.addAll((Collection)F.get(ob.D));
      A.addAll((Collection)F.get(ob.M));
      A.addAll((Collection)F.get(ob.B));
      A.addAll((Collection)F.get(ob.l));
      c.add(Button.class);
      c.add(ImageButton.class);
      c.addAll((Collection)F.get(ob.A));
      c.addAll((Collection)F.get(ob.M));
      c.addAll((Collection)F.get(ob.B));
      c.addAll((Collection)F.get(ob.D));
      c.addAll((Collection)F.get(ob.l));
      g.addAll((Collection)F.get(ob.A));
      g.addAll((Collection)F.get(ob.e));
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, sc.C("'{\020f\020)\016f\003m\013g\005)7@#g\003e\003p\030l\020"));
    }
  }
  
  public static int C(View paramView, Class<?> paramClass)
  {
    int k = 0;
    paramView = C(paramView, paramClass);
    int i = k;
    if (paramView != null)
    {
      i = k;
      if (!paramView.isEmpty())
      {
        paramView = paramView.iterator();
        i = 0;
        while (paramView.hasNext()) {
          if (((View)paramView.next()).isShown()) {
            i += 1;
          }
        }
      }
    }
    return i;
  }
  
  public static int C(ViewGroup paramViewGroup, View paramView)
  {
    paramViewGroup = C(paramViewGroup);
    if ((paramView != null) && (!paramViewGroup.isEmpty()))
    {
      if (paramViewGroup.size() > 1) {
        return paramViewGroup.indexOf(paramView.getClass());
      }
      return 0;
    }
    return -1;
  }
  
  public static int C(AbsListView paramAbsListView, int paramInt)
  {
    try
    {
      paramInt = ((Integer)lc.C(paramAbsListView, sc.C("\004`\fm/f\026`\rg0f\025"), 1, new Object[] { Integer.valueOf(paramInt - H(paramAbsListView).top) })).intValue();
      return paramInt;
    }
    catch (Exception localException)
    {
      ue.C(localException, sc.C("'{\020f\020)\005l\026}\013g\005)\016`\021}\024`\007~B}\r|\001a\007mB`\026l\017%BE\013z\026]\033y\0073B,\021"), new Object[] { paramAbsListView.getClass().getName() });
    }
    return -1;
  }
  
  public static Bitmap C(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    if (!(paramDrawable instanceof BitmapDrawable)) {
      paramDrawable = paramDrawable.getCurrent();
    }
    for (;;)
    {
      if (paramDrawable == null) {
        return null;
      }
      Rect localRect = paramDrawable.getBounds();
      if ((!(paramDrawable instanceof BitmapDrawable)) && (localRect.width() > 0) && (localRect.height() > 0))
      {
        int i = localRect.width();
        int k = localRect.height();
        Bitmap localBitmap = Bitmap.createBitmap(i, k, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        if ((i != localRect.width()) || (k != localRect.height())) {
          localCanvas.scale(i / localRect.width(), k / localRect.height());
        }
        paramDrawable.draw(localCanvas);
        return localBitmap;
      }
      return ((BitmapDrawable)paramDrawable).getBitmap();
    }
  }
  
  public static Point C(Point paramPoint)
  {
    Dimension localDimension = wn.C().C(true);
    ml localml = wn.C().C();
    if (localml == ml.f) {}
    do
    {
      return paramPoint;
      if (localml == ml.G) {
        return new Point(localDimension.getWidth() - paramPoint.x, localDimension.getHeight() - paramPoint.y);
      }
      if (localml == ml.M) {
        return new Point(localDimension.getWidth() - paramPoint.y, paramPoint.x);
      }
    } while (localml != ml.l);
    return new Point(paramPoint.y, localDimension.getHeight() - paramPoint.x);
  }
  
  public static Rect C()
  {
    return C(wn.C().C(true));
  }
  
  public static Rect C(Rect paramRect)
  {
    Rect localRect;
    if (paramRect == null) {
      localRect = null;
    }
    Dimension localDimension;
    ml localml;
    do
    {
      do
      {
        return localRect;
        if ((paramRect.width() < 1) || (paramRect.height() < 1)) {
          return null;
        }
        localDimension = wn.C().C(true);
        localml = wn.C().C();
        localRect = paramRect;
      } while (localml == ml.f);
      if (localml == ml.G) {
        return new Rect(localDimension.getWidth() - paramRect.right, localDimension.getHeight() - paramRect.bottom, localDimension.getWidth() - paramRect.left, localDimension.getHeight() - paramRect.top);
      }
      if (localml == ml.M) {
        return new Rect(localDimension.getWidth() - paramRect.bottom, paramRect.left, localDimension.getWidth() - paramRect.top, paramRect.right);
      }
      localRect = paramRect;
    } while (localml != ml.l);
    return new Rect(paramRect.top, localDimension.getHeight() - paramRect.right, paramRect.bottom, localDimension.getHeight() - paramRect.left);
  }
  
  public static Rect C(View paramView)
  {
    Rect localRect = new Rect();
    if (paramView == null) {
      return localRect;
    }
    paramView.getGlobalVisibleRect(localRect);
    paramView.getRootView().getLocationOnScreen(E);
    localRect.offset(E[0], E[1]);
    return localRect;
  }
  
  @TargetApi(16)
  public static Rect C(q paramq)
  {
    int k = 1;
    Window localWindow = paramq.C();
    paramq = paramq.C();
    int i;
    if ((localWindow != null) && (localWindow.getAttributes() != null) && ((localWindow.getAttributes().flags & 0x200) != 0))
    {
      i = 1;
      if ((Build.VERSION.SDK_INT < 16) || (paramq == null) || ((paramq.getSystemUiVisibility() & 0x2) == 0)) {
        break label98;
      }
    }
    for (;;)
    {
      if ((i == 0) && (k == 0)) {
        break label103;
      }
      paramq = wn.C().C();
      return new Rect(0, 0, paramq.getWidth(), paramq.getHeight());
      i = 0;
      break;
      label98:
      k = 0;
    }
    label103:
    return C(wn.C().C());
  }
  
  public static MenuItem C(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return (MenuItem)lc.C(paramView, sc.C("\005l\026@\026l\017M\003}\003"), null, new Object[0]);
  }
  
  public static View C(MotionEvent paramMotionEvent, View paramView)
  {
    int i = (short)(int)paramMotionEvent.getX(paramMotionEvent.getActionIndex());
    int k = (short)(int)paramMotionEvent.getY(paramMotionEvent.getActionIndex());
    paramMotionEvent = C(paramView);
    return C(paramView, (short)(i + paramMotionEvent.left), (short)(k + paramMotionEvent.top));
  }
  
  public static View C(View paramView)
  {
    return C(paramView, f, null);
  }
  
  public static View C(View paramView, Class<?> paramClass)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(paramClass);
    return C(paramView, localArrayList);
  }
  
  public static View C(ViewGroup paramViewGroup, View paramView)
  {
    Object localObject;
    if ((paramViewGroup == null) || (paramView == null))
    {
      localObject = null;
      return (View)localObject;
    }
    int i = 0;
    for (int k = 0;; k = i)
    {
      if (i >= paramViewGroup.getChildCount()) {
        break label55;
      }
      View localView = paramViewGroup.getChildAt(k);
      localObject = localView;
      if (H(paramView, localView)) {
        break;
      }
      i = k + 1;
    }
    label55:
    return null;
  }
  
  public static View C(List<View> paramList)
  {
    return C(paramList, e);
  }
  
  public static View C(List<View> paramList, h paramh)
  {
    int i = 0;
    for (int k = 0; i < paramList.size(); k = i)
    {
      View localView = C((View)paramList.get(k), paramh);
      if (localView != null) {
        return localView;
      }
      i = k + 1;
    }
    return null;
  }
  
  public static ImageView C(View paramView)
  {
    paramView = C(paramView, ImageView.class);
    if (!paramView.isEmpty())
    {
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        ImageView localImageView = (ImageView)paramView.next();
        if ((localImageView.isShown()) && (localImageView.getWidth() > 0) && (localImageView.getHeight() > 0)) {
          return localImageView;
        }
      }
    }
    return null;
  }
  
  public static String C(Rect paramRect)
  {
    return String.format(sc.C("J,\006%GmN,\006%GmK"), new Object[] { Integer.valueOf(paramRect.left), Integer.valueOf(paramRect.top), Integer.valueOf(paramRect.right), Integer.valueOf(paramRect.bottom) });
  }
  
  public static String C(View paramView)
  {
    if ((paramView != null) && ((paramView instanceof LinearLayout)))
    {
      paramView = (TextView)((LinearLayout)paramView).findViewById(16908299);
      if ((paramView != null) && (!bb.C(paramView.getText()))) {
        return paramView.getText().toString();
      }
    }
    return null;
  }
  
  public static String C(View paramView, boolean paramBoolean, List<Class<?>> paramList)
  {
    Object localObject1;
    if (!paramBoolean) {
      localObject1 = String.valueOf(C(paramView, paramView.getRootView(), paramList));
    }
    Object localObject2;
    do
    {
      return (String)localObject1;
      localObject1 = new ArrayList(2);
      ((List)localObject1).addAll((Collection)F.get(ob.E));
      ((List)localObject1).addAll((Collection)F.get(ob.f));
      ((List)localObject1).addAll(f);
      localObject2 = new ArrayList(paramList);
      ((List)localObject2).addAll((Collection)localObject1);
      localObject2 = String.valueOf(C(paramView, paramView.getRootView(), (List)localObject2));
      localObject3 = (AbsListView)C(paramView, AbsListView.class);
      if (localObject3 == null) {
        break;
      }
      vd.H(1, sc.C("6h\t`\fnBE\013z\026_\013l\025)\013g\fl\020)\013g\006l\032"));
      localObject3 = C((ViewGroup)localObject3, paramView);
      localObject1 = localObject2;
    } while (localObject3 == null);
    int i = C(paramView, (View)localObject3, paramList);
    return String.format(sc.C("GzL,\006"), new Object[] { localObject2, Integer.valueOf(i) });
    Object localObject3 = ((List)localObject1).iterator();
    for (;;)
    {
      localObject1 = localObject2;
      if (!((Iterator)localObject3).hasNext()) {
        break;
      }
      localObject1 = (Class)((Iterator)localObject3).next();
      View localView = C(paramView, (Class)localObject1);
      if (localView != null)
      {
        vd.C(1, sc.C("]\003b\013g\005)\013g\fl\020)\013g\006l\032)\004{\rdB,\021"), new Object[] { ((Class)localObject1).getName() });
        i = C(paramView, localView, paramList);
        localObject2 = String.format(sc.C("GzL,\006"), new Object[] { localObject2, Integer.valueOf(i) });
      }
    }
  }
  
  public static List<Class<?>> C()
  {
    return Collections.unmodifiableList(c);
  }
  
  public static List<View> C(View paramView)
  {
    return H(paramView, g);
  }
  
  public static <T extends View> List<T> C(View paramView, Class<?> paramClass)
  {
    ArrayList localArrayList1 = new ArrayList(1);
    ArrayList localArrayList2 = new ArrayList();
    localArrayList1.add(paramClass);
    C(paramView, localArrayList1, localArrayList2);
    return localArrayList2;
  }
  
  public static <T extends View> List<T> C(View paramView, List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    H(paramView, paramList, localArrayList);
    return localArrayList;
  }
  
  public static List<Class<?>> C(Class<?>... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList(paramVarArgs.length);
    int m = paramVarArgs.length;
    int i = 0;
    for (int k = 0; i < m; k = i)
    {
      Class<?> localClass = paramVarArgs[k];
      if (!localArrayList.contains(localClass)) {
        localArrayList.add(localClass);
      }
      i = k + 1;
    }
    return localArrayList;
  }
  
  public static List<View> C(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0)) {
      return null;
    }
    M.clear();
    B.clear();
    paramArrayOfObject = C(paramArrayOfObject);
    Object[] arrayOfObject = paramArrayOfObject.keySet().toArray();
    Arrays.sort(arrayOfObject);
    int m = arrayOfObject.length;
    int i = 0;
    for (int k = 0; i < m; k = i)
    {
      Object localObject = arrayOfObject[k];
      Iterator localIterator = ((List)paramArrayOfObject.get(localObject)).iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)localIterator.next();
        if ((localView.hasWindowFocus()) || (localObject.equals(Integer.valueOf(l)))) {
          B.add(localView);
        } else {
          M.add(localView);
        }
      }
      i = k + 1;
    }
    M.addAll(B);
    return G;
  }
  
  public static void C(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramView = C(paramView, "", paramBoolean2);
    if (paramBoolean1) {
      hp.C(paramView);
    }
  }
  
  public static boolean C(Drawable paramDrawable)
  {
    return (paramDrawable != null) && (paramDrawable.isVisible()) && (paramDrawable.getBounds().width() > 0) && (paramDrawable.getBounds().height() > 0);
  }
  
  public static boolean C(View paramView1, View paramView2)
  {
    if (paramView1 == null) {}
    for (;;)
    {
      return false;
      if (paramView1.equals(paramView2)) {
        return true;
      }
      if ((paramView1 instanceof ViewGroup))
      {
        paramView1 = (ViewGroup)paramView1;
        int i = 0;
        for (int k = 0; i < paramView1.getChildCount(); k = i)
        {
          if (C(paramView1.getChildAt(k), paramView2)) {
            return true;
          }
          i = k + 1;
        }
      }
    }
  }
  
  public static boolean C(View paramView, Class<?> paramClass)
  {
    return C(paramView, C(new Class[] { paramClass }));
  }
  
  public static boolean C(View paramView, List<Class<?>> paramList)
  {
    if (paramView == null) {
      return false;
    }
    paramList = H(paramView.getRootView(), paramList).iterator();
    label83:
    label86:
    while (paramList.hasNext())
    {
      View localView = (View)paramList.next();
      if (!paramView.equals(localView))
      {
        int i;
        if (localView != null)
        {
          i = 1;
          if (paramView.getId() != localView.getId()) {
            break label83;
          }
        }
        for (int k = 1;; k = 0)
        {
          if ((k & i) == 0) {
            break label86;
          }
          return false;
          i = 0;
          break;
        }
      }
    }
    return true;
  }
  
  public static boolean C(AbsListView paramAbsListView)
  {
    if ((paramAbsListView == null) || (paramAbsListView.getCount() == 0)) {}
    while ((paramAbsListView.getFirstVisiblePosition() == 0) && (paramAbsListView.getChildAt(0).getTop() >= paramAbsListView.getTop())) {
      return true;
    }
    return false;
  }
  
  public static boolean C(ob paramob, View paramView)
  {
    return C((List)F.get(paramob), paramView);
  }
  
  public static boolean C(List<Class<?>> paramList, View paramView)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((Class)paramList.next()).isInstance(paramView)) {
        return true;
      }
    }
    return false;
  }
  
  public static int H(ViewGroup paramViewGroup, View paramView)
  {
    if ((paramViewGroup == null) || (paramView == null))
    {
      k = -1;
      return k;
    }
    int k = 0;
    for (int i = 0;; i = k)
    {
      if (k >= paramViewGroup.getChildCount()) {
        break label44;
      }
      k = i;
      if (paramViewGroup.getChildAt(i) == paramView) {
        break;
      }
      k = i + 1;
    }
    label44:
    return -1;
  }
  
  public static Rect H(View paramView)
  {
    Rect localRect = new Rect();
    if (paramView == null) {
      return localRect;
    }
    paramView.getGlobalVisibleRect(localRect);
    paramView.getLocationInWindow(j);
    localRect.set(j[0], j[1], j[0] + localRect.width(), j[1] + localRect.height());
    return localRect;
  }
  
  public static View H(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return C(paramView, A);
  }
  
  public static View H(List<View> paramList)
  {
    return C(paramList, D);
  }
  
  public static String H(View paramView)
  {
    return C(paramView, true, c);
  }
  
  public static <T extends View> List<T> H(View paramView, List<Class<?>> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    C(paramView, paramList, localArrayList);
    return localArrayList;
  }
  
  public static boolean H(View paramView, Class<?> paramClass)
  {
    paramView = C(paramView, paramClass);
    if ((paramView == null) || (paramView.isEmpty())) {
      return false;
    }
    paramView = paramView.iterator();
    while (paramView.hasNext())
    {
      paramClass = (View)paramView.next();
      if ((paramClass.isShown()) && (paramClass.getWidth() > 0) && (paramClass.getHeight() > 0)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean H(AbsListView paramAbsListView)
  {
    boolean bool1 = C(paramAbsListView);
    boolean bool2 = a(paramAbsListView);
    return (!bool1) || (!bool2);
  }
  
  public static boolean H(List<String> paramList, View paramView)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((String)paramList.next()).equalsIgnoreCase(paramView.getClass().getName())) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean J(View paramView)
  {
    return C(c, paramView);
  }
  
  public static String K(View paramView)
  {
    paramView = C(paramView, TextView.class);
    if (!paramView.isEmpty())
    {
      paramView = paramView.iterator();
      while (paramView.hasNext())
      {
        TextView localTextView = (TextView)paramView.next();
        if ((!bb.C(localTextView.getText())) && (localTextView.isShown()) && (localTextView.getWidth() > 0) && (localTextView.getHeight() > 0)) {
          return localTextView.getText().toString();
        }
      }
    }
    return null;
  }
  
  public static boolean K(View paramView)
  {
    return C(g, paramView);
  }
  
  public static View a(View paramView)
  {
    if (paramView == null) {
      localObject = null;
    }
    do
    {
      return (View)localObject;
      if ((!paramView.isShown()) || (!paramView.isEnabled())) {
        break;
      }
      localObject = paramView;
    } while (paramView.isClickable());
    Object localObject = paramView.getParent();
    if ((!(localObject instanceof View)) || (paramView == null)) {
      return null;
    }
    return a((View)localObject);
  }
  
  public static <T extends View> T a(List<T> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        View localView = (View)paramList.next();
        if ((localView.isShown()) && (localView.getWidth() > 0) && (localView.getHeight() > 0)) {
          return localView;
        }
      }
    }
    return null;
  }
  
  public static String a(View paramView)
  {
    if (paramView == null) {
      return "";
    }
    for (;;)
    {
      try
      {
        if ((paramView instanceof TextView))
        {
          str1 = String.format(sc.C("+Gz@"), new Object[] { ((TextView)paramView).getText().toString() }).replace(sc.C("h"), sc.C("U\f")).replace(sc.C("o"), sc.C("U\020"));
          String str2 = sc.C("GzB!GmN,\006 B,\0213GkX,\0003GkX,\000,\021");
          String str3 = paramView.getClass().getName();
          int i = paramView.getId();
          int k = paramView.hashCode();
          String str4 = C(C(paramView));
          boolean bool1 = paramView.isShown();
          boolean bool2 = paramView.isClickable();
          boolean bool3 = paramView.isEnabled();
          boolean bool4 = A(paramView);
          if (str1 == null)
          {
            paramView = "";
            return String.format(str2, new Object[] { str3, Integer.valueOf(i), Integer.valueOf(k), str4, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), paramView });
          }
          paramView = str1;
          continue;
        }
        String str1 = null;
      }
      catch (Exception paramView)
      {
        return null;
      }
    }
  }
  
  public static boolean a(View paramView)
  {
    Rect localRect = C(paramView);
    if ((paramView.getWidth() < 2) || (paramView.getHeight() < 2)) {}
    while ((!C(paramView, localRect.left + 1, localRect.top + 1)) && (!C(paramView, localRect.right - 1, localRect.top + 1)) && (!C(paramView, localRect.left + 1, localRect.bottom - 1)) && (!C(paramView, localRect.right - 1, localRect.bottom - 1))) {
      return false;
    }
    return true;
  }
  
  public static boolean a(View paramView, Class<?> paramClass)
  {
    if (paramView == null) {}
    for (;;)
    {
      return false;
      if (paramClass.isInstance(paramView)) {
        return true;
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = 0;
        for (int k = 0; i < paramView.getChildCount(); k = i)
        {
          if (a(paramView.getChildAt(k), paramClass)) {
            return true;
          }
          i = k + 1;
        }
      }
    }
  }
  
  public static boolean a(AbsListView paramAbsListView)
  {
    if ((paramAbsListView == null) || (paramAbsListView.getCount() == 0)) {}
    while ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (paramAbsListView.getChildAt(paramAbsListView.getChildCount() - 1).getBottom() <= paramAbsListView.getBottom())) {
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */