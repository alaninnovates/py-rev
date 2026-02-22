package i;

import ac.class_411;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.q
class PageSection extends ArrayList {
   // $VF: renamed from: a byte[]
   private byte[] field_33472;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_33473;

   public PageSection(Exporter3DA var1, class_411 var2) {
      this.field_33473 = var1;
      this.field_33472 = new byte[]{80, 65, 71, 69};

      for (class_5289 var5 : var2.method_3830()) {
         this.add(new PageHandler(var1, var2, var5));
      }
   }

   // $VF: renamed from: a () void
   public void method_34523() {
      for (PageHandler var2 : this) {
         var2.method_6951();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int method_34524() {
      int var1 = 0;
      var1 += 2;

      for (PageHandler var3 : this) {
         var1 += PageHandler.method_6954(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void method_34525() {
      Exporter3DA.staticWriteHeaderAndData(this.field_33473, this.field_33472, this.method_34524());
      Exporter3DA.staticWriteShortInt(this.field_33473, (short)this.size());

      for (PageHandler var2 : this) {
         PageHandler.method_6955(var2);
      }
   }

   // $VF: renamed from: a (i.q) void
   // $VF: synthetic method
   static void method_34526(PageSection var0) {
      var0.method_34525();
   }
}
