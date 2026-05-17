package i;

import ac.class_395;
import ac.class_411;
import java.util.ArrayList;

// $VF: renamed from: i.y
class ProductionTab extends ArrayList {
   // $VF: renamed from: a byte[]
   private byte[] sectionHeader;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public ProductionTab(Exporter3DA exporter, class_411 document) {
      this.exporter = exporter;
      this.sectionHeader = new byte[]{80, 84, 65, 66}; // PTAB

      for (class_395 var5 : document.method_3831().method_33463(0)) {
         if (!var5.method_3613()) {
            this.add(new ProductionProperty(exporter, var5));
         }
      }
   }

   // $VF: renamed from: a () void
   public void initializePerformers() {
      for (ProductionProperty var2 : this) {
         var2.initialize();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int calculateTabSize() {
      int var1 = 0;
      var1 += 2;

      for (ProductionProperty var3 : this) {
         var1 += ProductionProperty.staticCalculateSize(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void writeTabData() {
      Exporter3DA.staticWriteHeaderAndData(this.exporter, this.sectionHeader, this.calculateTabSize());
      Exporter3DA.staticWriteShortInt(this.exporter, this.size());

      for (ProductionProperty var2 : this) {
         ProductionProperty.staticWriteData(var2);
      }
   }

   // $VF: renamed from: a (i.y) void
   // $VF: synthetic method
   static void write(ProductionTab var0) {
      var0.writeTabData();
   }
}
