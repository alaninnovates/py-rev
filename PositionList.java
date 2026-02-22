package i;

import ac.class_394;
import ac.class_411;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.s
class PositionList extends ArrayList {
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_33471;

   public PositionList(Exporter3DA var1, class_411 var2, class_5289 var3) {
      this.field_33471 = var1;

      for (class_394 var5 : var3) {
         this.add(new PositionVisuals(var1, var2, var5));
      }
   }

   // $VF: renamed from: a () void
   public void method_34518() {
      for (PositionVisuals var2 : this) {
         var2.method_6946();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int method_34519() {
      int var1 = 0;
      var1 += 2;

      for (PositionVisuals var3 : this) {
         var1 += PositionVisuals.method_6949(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void method_34520() {
      Exporter3DA.staticWriteShortInt(this.field_33471, this.size());

      for (PositionVisuals var2 : this) {
         PositionVisuals.method_6950(var2);
      }
   }

   // $VF: renamed from: a (i.s) int
   // $VF: synthetic method
   static int method_34521(PositionList var0) {
      return var0.method_34519();
   }

   // $VF: renamed from: a (i.s) void
   // $VF: synthetic method
   static void method_34522(PositionList var0) {
      var0.method_34520();
   }
}
