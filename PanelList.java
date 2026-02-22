package i;

import ac.class_419;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.u
class PanelList extends ArrayList {
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_33470;

   public PanelList(Exporter3DA var1, class_5289 var2) {
      this.field_33470 = var1;

      for (class_419 var5 : var2.method_33818()) {
         PerformerPosition var6 = new PerformerPosition(var1, var5);
         if (PerformerPosition.method_6943(var6) != null) {
            this.add(var6);
         }
      }
   }

   // $VF: renamed from: a () void
   public void method_34513() {
      for (PerformerPosition var2 : this) {
         var2.method_6940();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int method_34514() {
      int var1 = 0;
      var1 += 2;

      for (PerformerPosition var3 : this) {
         var1 += PerformerPosition.method_6944(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void method_34515() {
      Exporter3DA.staticWriteShortInt(this.field_33470, this.size());

      for (PerformerPosition var2 : this) {
         PerformerPosition.method_6945(var2);
      }
   }

   // $VF: renamed from: a (i.u) int
   // $VF: synthetic method
   static int method_34516(PanelList var0) {
      return var0.method_34514();
   }

   // $VF: renamed from: a (i.u) void
   // $VF: synthetic method
   static void method_34517(PanelList var0) {
      var0.method_34515();
   }
}
