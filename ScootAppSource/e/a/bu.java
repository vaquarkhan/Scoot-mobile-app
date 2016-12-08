package e.a;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class bu
{
  public boolean a;
  public int[] b = new int[2];
  public int c;
  public int d;
  public int e;
  public boolean f;
  public int g;
  public int h;
  public boolean i;
  public int j;
  public int k;
  public int l;
  public int m;
  public boolean n;
  public boolean o;
  public boolean p;
  public int[] q;
  public int[] r;
  public int[] s;
  public boolean t;
  public int[] u;
  public bv v;
  
  public static bu a(ByteBuffer paramByteBuffer)
  {
    int i1 = 3;
    paramByteBuffer = new j(paramByteBuffer);
    bu localbu = new bu();
    localbu.d = o.a(paramByteBuffer, "PPS: pic_parameter_set_id");
    localbu.e = o.a(paramByteBuffer, "PPS: seq_parameter_set_id");
    localbu.a = o.c(paramByteBuffer, "PPS: entropy_coding_mode_flag");
    localbu.f = o.c(paramByteBuffer, "PPS: pic_order_present_flag");
    localbu.g = o.a(paramByteBuffer, "PPS: num_slice_groups_minus1");
    label436:
    int i2;
    if (localbu.g > 0)
    {
      localbu.h = o.a(paramByteBuffer, "PPS: slice_group_map_type");
      localbu.q = new int[localbu.g + 1];
      localbu.r = new int[localbu.g + 1];
      localbu.s = new int[localbu.g + 1];
      if (localbu.h == 0)
      {
        i1 = 0;
        while (i1 <= localbu.g)
        {
          localbu.s[i1] = o.a(paramByteBuffer, "PPS: run_length_minus1");
          i1 += 1;
        }
      }
      if (localbu.h == 2)
      {
        i1 = 0;
        while (i1 < localbu.g)
        {
          localbu.q[i1] = o.a(paramByteBuffer, "PPS: top_left");
          localbu.r[i1] = o.a(paramByteBuffer, "PPS: bottom_right");
          i1 += 1;
        }
      }
      if ((localbu.h == 3) || (localbu.h == 4) || (localbu.h == 5))
      {
        localbu.t = o.c(paramByteBuffer, "PPS: slice_group_change_direction_flag");
        localbu.c = o.a(paramByteBuffer, "PPS: slice_group_change_rate_minus1");
      }
    }
    else
    {
      localbu.b = new int[] { o.a(paramByteBuffer, "PPS: num_ref_idx_l0_active_minus1"), o.a(paramByteBuffer, "PPS: num_ref_idx_l1_active_minus1") };
      localbu.i = o.c(paramByteBuffer, "PPS: weighted_pred_flag");
      localbu.j = o.a(paramByteBuffer, 2, "PPS: weighted_bipred_idc");
      localbu.k = o.b(paramByteBuffer, "PPS: pic_init_qp_minus26");
      localbu.l = o.b(paramByteBuffer, "PPS: pic_init_qs_minus26");
      localbu.m = o.b(paramByteBuffer, "PPS: chroma_qp_index_offset");
      localbu.n = o.c(paramByteBuffer, "PPS: deblocking_filter_control_present_flag");
      localbu.o = o.c(paramByteBuffer, "PPS: constrained_intra_pred_flag");
      localbu.p = o.c(paramByteBuffer, "PPS: redundant_pic_cnt_present_flag");
      if (!o.b(paramByteBuffer)) {
        break label685;
      }
      localbu.v = new bv();
      localbu.v.a = o.c(paramByteBuffer, "PPS: transform_8x8_mode_flag");
      if (!o.c(paramByteBuffer, "PPS: pic_scaling_matrix_present_flag")) {
        break label671;
      }
      i1 = 0;
      if (!localbu.v.a) {
        break label641;
      }
      i2 = 1;
      label449:
      if (i1 >= i2 * 2 + 6) {
        break label671;
      }
      if (o.c(paramByteBuffer, "PPS: pic_scaling_list_present_flag"))
      {
        localbu.v.b.a = new ck[8];
        localbu.v.b.b = new ck[8];
        if (i1 >= 6) {
          break label646;
        }
        localbu.v.b.a[i1] = ck.a(paramByteBuffer, 16);
      }
    }
    for (;;)
    {
      i1 += 1;
      break label436;
      if (localbu.h != 6) {
        break;
      }
      if (localbu.g + 1 > 4) {}
      for (;;)
      {
        int i3 = o.a(paramByteBuffer, "PPS: pic_size_in_map_units_minus1");
        localbu.u = new int[i3 + 1];
        i2 = 0;
        while (i2 <= i3)
        {
          localbu.u[i2] = o.b(paramByteBuffer, i1, "PPS: slice_group_id [" + i2 + "]f");
          i2 += 1;
        }
        break;
        if (localbu.g + 1 > 2) {
          i1 = 2;
        } else {
          i1 = 1;
        }
      }
      label641:
      i2 = 0;
      break label449;
      label646:
      localbu.v.b.b[(i1 - 6)] = ck.a(paramByteBuffer, 64);
    }
    label671:
    localbu.v.c = o.b(paramByteBuffer, "PPS: second_chroma_qp_index_offset");
    label685:
    return localbu;
  }
  
  public void b(ByteBuffer paramByteBuffer)
  {
    int i1 = 3;
    paramByteBuffer = new k(paramByteBuffer);
    p.a(paramByteBuffer, this.d, "PPS: pic_parameter_set_id");
    p.a(paramByteBuffer, this.e, "PPS: seq_parameter_set_id");
    p.a(paramByteBuffer, this.a, "PPS: entropy_coding_mode_flag");
    p.a(paramByteBuffer, this.f, "PPS: pic_order_present_flag");
    p.a(paramByteBuffer, this.g, "PPS: num_slice_groups_minus1");
    label355:
    label375:
    int i2;
    if (this.g > 0)
    {
      p.a(paramByteBuffer, this.h, "PPS: slice_group_map_type");
      int[] arrayOfInt1 = new int[1];
      int[] arrayOfInt2 = new int[1];
      int[] arrayOfInt3 = new int[1];
      if (this.h == 0)
      {
        i1 = 0;
        while (i1 <= this.g)
        {
          p.a(paramByteBuffer, arrayOfInt3[i1], "PPS: ");
          i1 += 1;
        }
      }
      if (this.h == 2)
      {
        i1 = 0;
        while (i1 < this.g)
        {
          p.a(paramByteBuffer, arrayOfInt1[i1], "PPS: ");
          p.a(paramByteBuffer, arrayOfInt2[i1], "PPS: ");
          i1 += 1;
        }
      }
      if ((this.h == 3) || (this.h == 4) || (this.h == 5))
      {
        p.a(paramByteBuffer, this.t, "PPS: slice_group_change_direction_flag");
        p.a(paramByteBuffer, this.c, "PPS: slice_group_change_rate_minus1");
      }
    }
    else
    {
      p.a(paramByteBuffer, this.b[0], "PPS: num_ref_idx_l0_active_minus1");
      p.a(paramByteBuffer, this.b[1], "PPS: num_ref_idx_l1_active_minus1");
      p.a(paramByteBuffer, this.i, "PPS: weighted_pred_flag");
      p.a(paramByteBuffer, this.j, 2, "PPS: weighted_bipred_idc");
      p.b(paramByteBuffer, this.k, "PPS: pic_init_qp_minus26");
      p.b(paramByteBuffer, this.l, "PPS: pic_init_qs_minus26");
      p.b(paramByteBuffer, this.m, "PPS: chroma_qp_index_offset");
      p.a(paramByteBuffer, this.n, "PPS: deblocking_filter_control_present_flag");
      p.a(paramByteBuffer, this.o, "PPS: constrained_intra_pred_flag");
      p.a(paramByteBuffer, this.p, "PPS: redundant_pic_cnt_present_flag");
      if (this.v == null) {
        break label651;
      }
      p.a(paramByteBuffer, this.v.a, "PPS: transform_8x8_mode_flag");
      if (this.v.b == null) {
        break label546;
      }
      bool = true;
      p.a(paramByteBuffer, bool, "PPS: scalindMatrix");
      if (this.v.b == null) {
        break label638;
      }
      i1 = 0;
      if (!this.v.a) {
        break label552;
      }
      i2 = 1;
      label387:
      if (i1 >= i2 * 2 + 6) {
        break label638;
      }
      if (i1 >= 6) {
        break label563;
      }
      if (this.v.b.a[i1] == null) {
        break label557;
      }
    }
    label546:
    label552:
    label557:
    for (boolean bool = true;; bool = false)
    {
      p.a(paramByteBuffer, bool, "PPS: ");
      if (this.v.b.a[i1] != null) {
        this.v.b.a[i1].a(paramByteBuffer);
      }
      i1 += 1;
      break label375;
      if (this.h != 6) {
        break;
      }
      if (this.g + 1 > 4) {}
      for (;;)
      {
        p.a(paramByteBuffer, this.u.length, "PPS: ");
        i2 = 0;
        while (i2 <= this.u.length)
        {
          p.a(paramByteBuffer, this.u[i2], i1);
          i2 += 1;
        }
        break;
        if (this.g + 1 > 2) {
          i1 = 2;
        } else {
          i1 = 1;
        }
      }
      bool = false;
      break label355;
      i2 = 0;
      break label387;
    }
    label563:
    if (this.v.b.b[(i1 - 6)] != null) {}
    for (bool = true;; bool = false)
    {
      p.a(paramByteBuffer, bool, "PPS: ");
      if (this.v.b.b[(i1 - 6)] == null) {
        break;
      }
      this.v.b.b[(i1 - 6)].a(paramByteBuffer);
      break;
    }
    label638:
    p.b(paramByteBuffer, this.v.c, "PPS: ");
    label651:
    p.a(paramByteBuffer);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (bu)paramObject;
      if (!Arrays.equals(this.r, ((bu)paramObject).r)) {
        return false;
      }
      if (this.m != ((bu)paramObject).m) {
        return false;
      }
      if (this.o != ((bu)paramObject).o) {
        return false;
      }
      if (this.n != ((bu)paramObject).n) {
        return false;
      }
      if (this.a != ((bu)paramObject).a) {
        return false;
      }
      if (this.v == null)
      {
        if (((bu)paramObject).v != null) {
          return false;
        }
      }
      else if (!this.v.equals(((bu)paramObject).v)) {
        return false;
      }
      if (this.b[0] != paramObject.b[0]) {
        return false;
      }
      if (this.b[1] != paramObject.b[1]) {
        return false;
      }
      if (this.g != ((bu)paramObject).g) {
        return false;
      }
      if (this.k != ((bu)paramObject).k) {
        return false;
      }
      if (this.l != ((bu)paramObject).l) {
        return false;
      }
      if (this.f != ((bu)paramObject).f) {
        return false;
      }
      if (this.d != ((bu)paramObject).d) {
        return false;
      }
      if (this.p != ((bu)paramObject).p) {
        return false;
      }
      if (!Arrays.equals(this.s, ((bu)paramObject).s)) {
        return false;
      }
      if (this.e != ((bu)paramObject).e) {
        return false;
      }
      if (this.t != ((bu)paramObject).t) {
        return false;
      }
      if (this.c != ((bu)paramObject).c) {
        return false;
      }
      if (!Arrays.equals(this.u, ((bu)paramObject).u)) {
        return false;
      }
      if (this.h != ((bu)paramObject).h) {
        return false;
      }
      if (!Arrays.equals(this.q, ((bu)paramObject).q)) {
        return false;
      }
      if (this.j != ((bu)paramObject).j) {
        return false;
      }
    } while (this.i == ((bu)paramObject).i);
    return false;
  }
  
  public int hashCode()
  {
    int i8 = 1231;
    int i9 = Arrays.hashCode(this.r);
    int i10 = this.m;
    int i1;
    int i2;
    label42:
    int i3;
    label53:
    int i4;
    label63:
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i5;
    label109:
    int i16;
    int i6;
    label127:
    int i17;
    int i18;
    int i7;
    label154:
    int i19;
    int i20;
    int i21;
    int i22;
    int i23;
    if (this.o)
    {
      i1 = 1231;
      if (!this.n) {
        break label339;
      }
      i2 = 1231;
      if (!this.a) {
        break label346;
      }
      i3 = 1231;
      if (this.v != null) {
        break label353;
      }
      i4 = 0;
      i11 = this.b[0];
      i12 = this.b[1];
      i13 = this.g;
      i14 = this.k;
      i15 = this.l;
      if (!this.f) {
        break label365;
      }
      i5 = 1231;
      i16 = this.d;
      if (!this.p) {
        break label373;
      }
      i6 = 1231;
      i17 = Arrays.hashCode(this.s);
      i18 = this.e;
      if (!this.t) {
        break label381;
      }
      i7 = 1231;
      i19 = this.c;
      i20 = Arrays.hashCode(this.u);
      i21 = this.h;
      i22 = Arrays.hashCode(this.q);
      i23 = this.j;
      if (!this.i) {
        break label389;
      }
    }
    for (;;)
    {
      return ((((((i7 + (((i6 + ((i5 + ((((((i4 + (i3 + (i2 + (i1 + ((i9 + 31) * 31 + i10) * 31) * 31) * 31) * 31) * 31 + i11) * 31 + i12) * 31 + i13) * 31 + i14) * 31 + i15) * 31) * 31 + i16) * 31) * 31 + i17) * 31 + i18) * 31) * 31 + i19) * 31 + i20) * 31 + i21) * 31 + i22) * 31 + i23) * 31 + i8;
      i1 = 1237;
      break;
      label339:
      i2 = 1237;
      break label42;
      label346:
      i3 = 1237;
      break label53;
      label353:
      i4 = this.v.hashCode();
      break label63;
      label365:
      i5 = 1237;
      break label109;
      label373:
      i6 = 1237;
      break label127;
      label381:
      i7 = 1237;
      break label154;
      label389:
      i8 = 1237;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */