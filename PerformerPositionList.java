package i;

import ac.class_419;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.u
class PerformerPositionList extends ArrayList {
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public PerformerPositionList(Exporter3DA var1, class_5289 var2) {
      this.exporter = var1;

      for (class_419 var5 : var2.method_33818()) {
         PerformerPosition var6 = new PerformerPosition(var1, var5);
         if (PerformerPosition.method_6943(var6) != null) {
            this.add(var6);
         }
      }
   }

   // $VF: renamed from: a () void
   public void cleanup() {
      for (PerformerPosition var2 : this) {
         var2.cleanup();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int calculateSectionSize() {
      int var1 = 0;
      var1 += 2;

      for (PerformerPosition var3 : this) {
         var1 += PerformerPosition.staticCalculateSectionSize(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteShortInt(this.exporter, this.size());

      for (PerformerPosition var2 : this) {
         PerformerPosition.write(var2);
      }
   }

   // $VF: renamed from: a (i.u) int
   // $VF: synthetic method
   static int staticCalculateSectionSize(PerformerPositionList var0) {
      return var0.calculateSectionSize();
   }

   // $VF: renamed from: a (i.u) void
   // $VF: synthetic method
   static void write(PerformerPositionList var0) {
      var0.writeSectionData();
   }
}
