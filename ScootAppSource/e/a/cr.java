package e.a;

import java.lang.reflect.Array;
import java.util.ArrayList;

public final class cr
{
  private static int a(int paramInt)
  {
    int i = paramInt - 1;
    paramInt = 0;
    while (i != 0)
    {
      i >>= 1;
      paramInt += 1;
    }
    return paramInt;
  }
  
  private static void a(bn parambn, cq paramcq, j paramj)
  {
    if (parambn.a == bo.e) {
      paramcq.d = new cd(o.c(paramj, "SH: no_output_of_prior_pics_flag"), o.c(paramj, "SH: long_term_reference_flag"));
    }
    while (!o.c(paramj, "SH: adaptive_ref_pic_marking_mode_flag")) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i = o.a(paramj, "SH: memory_management_control_operation");
    parambn = null;
    switch (i)
    {
    }
    for (;;)
    {
      if (parambn != null) {
        localArrayList.add(parambn);
      }
      if (i != 0) {
        break;
      }
      paramcq.c = new ca((cc[])localArrayList.toArray(new cc[0]));
      return;
      parambn = new cc(cb.a, o.a(paramj, "SH: difference_of_pic_nums_minus1") + 1, 0);
      continue;
      parambn = new cc(cb.b, o.a(paramj, "SH: long_term_pic_num"), 0);
      continue;
      parambn = new cc(cb.c, o.a(paramj, "SH: difference_of_pic_nums_minus1") + 1, o.a(paramj, "SH: long_term_frame_idx"));
      continue;
      parambn = new cc(cb.d, o.a(paramj, "SH: max_long_term_frame_idx_plus1") - 1, 0);
      continue;
      parambn = new cc(cb.e, 0, 0);
      continue;
      parambn = new cc(cb.f, o.a(paramj, "SH: long_term_frame_idx"), 0);
    }
  }
  
  private static void a(cn paramcn, bu parambu, cq paramcq, j paramj)
  {
    paramcq.f = new bx();
    Object localObject;
    int[] arrayOfInt;
    int k;
    int m;
    int i;
    if (paramcq.t)
    {
      localObject = paramcq.u;
      arrayOfInt = new int[2];
      localObject[0] += 1;
      localObject[1] += 1;
      paramcq.f.a = o.a(paramj, "SH: luma_log2_weight_denom");
      if (paramcn.f != z.d) {
        paramcq.f.b = o.a(paramj, "SH: chroma_log2_weight_denom");
      }
      k = paramcq.f.a;
      m = 1 << paramcq.f.b;
      i = 0;
    }
    for (;;)
    {
      if (i >= 2) {
        break label369;
      }
      paramcq.f.c[i] = new int[arrayOfInt[i]];
      paramcq.f.e[i] = new int[arrayOfInt[i]];
      localObject = paramcq.f.d;
      int j = arrayOfInt[i];
      localObject[i] = ((int[][])Array.newInstance(Integer.TYPE, new int[] { 2, j }));
      localObject = paramcq.f.f;
      j = arrayOfInt[i];
      localObject[i] = ((int[][])Array.newInstance(Integer.TYPE, new int[] { 2, j }));
      j = 0;
      for (;;)
      {
        if (j < arrayOfInt[i])
        {
          paramcq.f.c[i][j] = (1 << k);
          paramcq.f.e[i][j] = 0;
          paramcq.f.d[i][0][j] = m;
          paramcq.f.f[i][0][j] = 0;
          paramcq.f.d[i][1][j] = m;
          paramcq.f.f[i][1][j] = 0;
          j += 1;
          continue;
          localObject = parambu.b;
          break;
        }
      }
      i += 1;
    }
    label369:
    a(paramcn, parambu, paramcq, paramj, arrayOfInt, 0);
    if (paramcq.i == cs.b) {
      a(paramcn, parambu, paramcq, paramj, arrayOfInt, 1);
    }
  }
  
  private static void a(cn paramcn, bu parambu, cq paramcq, j paramj, int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    while (i < paramArrayOfInt[paramInt])
    {
      if (o.c(paramj, "SH: luma_weight_l0_flag"))
      {
        paramcq.f.c[paramInt][i] = o.b(paramj, "SH: weight");
        paramcq.f.e[paramInt][i] = o.b(paramj, "SH: offset");
      }
      if ((paramcn.f != z.d) && (o.c(paramj, "SH: chroma_weight_l0_flag")))
      {
        paramcq.f.d[paramInt][0][i] = o.b(paramj, "SH: weight");
        paramcq.f.f[paramInt][0][i] = o.b(paramj, "SH: offset");
        paramcq.f.d[paramInt][1][i] = o.b(paramj, "SH: weight");
        paramcq.f.f[paramInt][1][i] = o.b(paramj, "SH: offset");
      }
      i += 1;
    }
  }
  
  private static void a(cq paramcq, j paramj)
  {
    paramcq.e = new int[2][][];
    if ((paramcq.i.a()) && (o.c(paramj, "SH: ref_pic_list_reordering_flag_l0"))) {
      paramcq.e[0] = b(paramj);
    }
    if ((paramcq.i == cs.b) && (o.c(paramj, "SH: ref_pic_list_reordering_flag_l1"))) {
      paramcq.e[1] = b(paramj);
    }
  }
  
  private static int[][] b(j paramj)
  {
    ax localax1 = new ax();
    ax localax2 = new ax();
    for (;;)
    {
      int i = o.a(paramj, "SH: reordering_of_pic_nums_idc");
      if (i == 3) {
        return new int[][] { localax1.a(), localax2.a() };
      }
      localax1.a(i);
      localax2.a(o.a(paramj, "SH: abs_diff_pic_num_minus1"));
    }
  }
  
  public cq a(cq paramcq, bn parambn, cn paramcn, bu parambu, j paramj)
  {
    paramcq.b = parambu;
    paramcq.a = paramcn;
    paramcq.l = o.b(paramj, paramcn.g + 4, "SH: frame_num");
    if (!paramcn.z)
    {
      paramcq.h = o.c(paramj, "SH: field_pic_flag");
      if (paramcq.h) {
        paramcq.m = o.c(paramj, "SH: bottom_field_flag");
      }
    }
    if (parambn.a == bo.e) {
      paramcq.n = o.a(paramj, "SH: idr_pic_id");
    }
    if (paramcn.a == 0)
    {
      paramcq.o = o.b(paramj, paramcn.h + 4, "SH: pic_order_cnt_lsb");
      if ((parambu.f) && (!paramcn.b)) {
        paramcq.p = o.b(paramj, "SH: delta_pic_order_cnt_bottom");
      }
    }
    paramcq.q = new int[2];
    if ((paramcn.a == 1) && (!paramcn.c))
    {
      paramcq.q[0] = o.b(paramj, "SH: delta_pic_order_cnt[0]");
      if ((parambu.f) && (!paramcn.b)) {
        paramcq.q[1] = o.b(paramj, "SH: delta_pic_order_cnt[1]");
      }
    }
    if (parambu.p) {
      paramcq.r = o.a(paramj, "SH: redundant_pic_cnt");
    }
    if (paramcq.i == cs.b) {
      paramcq.s = o.c(paramj, "SH: direct_spatial_mv_pred_flag");
    }
    if ((paramcq.i == cs.a) || (paramcq.i == cs.d) || (paramcq.i == cs.b))
    {
      paramcq.t = o.c(paramj, "SH: num_ref_idx_active_override_flag");
      if (paramcq.t)
      {
        paramcq.u[0] = o.a(paramj, "SH: num_ref_idx_l0_active_minus1");
        if (paramcq.i == cs.b) {
          paramcq.u[1] = o.a(paramj, "SH: num_ref_idx_l1_active_minus1");
        }
      }
    }
    a(paramcq, paramj);
    if (((parambu.i) && ((paramcq.i == cs.a) || (paramcq.i == cs.d))) || ((parambu.j == 1) && (paramcq.i == cs.b))) {
      a(paramcn, parambu, paramcq, paramj);
    }
    if (parambn.b != 0) {
      a(parambn, paramcq, paramj);
    }
    if ((parambu.a) && (paramcq.i.a())) {
      paramcq.v = o.a(paramj, "SH: cabac_init_idc");
    }
    paramcq.w = o.b(paramj, "SH: slice_qp_delta");
    if ((paramcq.i == cs.d) || (paramcq.i == cs.e))
    {
      if (paramcq.i == cs.d) {
        paramcq.x = o.c(paramj, "SH: sp_for_switch_flag");
      }
      paramcq.y = o.b(paramj, "SH: slice_qs_delta");
    }
    if (parambu.n)
    {
      paramcq.z = o.a(paramj, "SH: disable_deblocking_filter_idc");
      if (paramcq.z != 1)
      {
        paramcq.A = o.b(paramj, "SH: slice_alpha_c0_offset_div2");
        paramcq.B = o.b(paramj, "SH: slice_beta_offset_div2");
      }
    }
    if ((parambu.g > 0) && (parambu.h >= 3) && (parambu.h <= 5))
    {
      int j = at.a(paramcn) * (paramcn.j + 1) / (parambu.c + 1);
      int i = j;
      if (at.a(paramcn) * (paramcn.j + 1) % (parambu.c + 1) > 0) {
        i = j + 1;
      }
      paramcq.C = o.b(paramj, a(i + 1), "SH: slice_group_change_cycle");
    }
    return paramcq;
  }
  
  public cq a(j paramj)
  {
    cq localcq = new cq();
    localcq.g = o.a(paramj, "SH: first_mb_in_slice");
    int i = o.a(paramj, "SH: slice_type");
    localcq.i = cs.a(i % 5);
    if (i / 5 > 0) {}
    for (boolean bool = true;; bool = false)
    {
      localcq.j = bool;
      localcq.k = o.a(paramj, "SH: pic_parameter_set_id");
      return localcq;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */