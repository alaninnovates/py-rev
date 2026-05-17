package i;

import ac.class_394;
import ac.class_411;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.s
class VisualPositionList extends ArrayList {
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public VisualPositionList(Exporter3DA var1, class_411 var2, class_5289 var3) {
      this.exporter = var1;

      for (class_394 var5 : var3) {
         this.add(new VisualPosition(var1, var2, var5));
      }
   }

   // $VF: renamed from: a () void
   public void cleanup() {
      for (VisualPosition var2 : this) {
         var2.cleanup();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int calculateSectionSize() {
      int var1 = 0;
      var1 += 2;

      for (VisualPosition var3 : this) {
         var1 += VisualPosition.staticCalculateSectionSize(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteShortInt(this.exporter, this.size());

      for (VisualPosition var2 : this) {
         VisualPosition.write(var2);
      }
   }

   // $VF: renamed from: a (i.s) int
   // $VF: synthetic method
   static int staticCalculateSectionSize(PerformerPositionList var0) {
      return var0.calculateSectionSize();
   }

   // $VF: renamed from: a (i.s) void
   // $VF: synthetic method
   static void write(PerformerPositionList var0) {
      var0.writeSectionData();
   }
}
