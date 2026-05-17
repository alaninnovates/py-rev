package i;

import ac.class_411;
import ac.class_5289;
import java.util.ArrayList;

// $VF: renamed from: i.q
class PageSection extends ArrayList {
   // $VF: renamed from: a byte[]
   private byte[] sectionHeader;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public PageSection(Exporter3DA var1, class_411 var2) {
      this.exporter = var1;
      this.sectionHeader = new byte[]{80, 65, 71, 69}; // PAGE

      for (class_5289 var5 : var2.method_3830()) {
         this.add(new PageHandler(var1, var2, var5));
      }
   }

   // $VF: renamed from: a () void
   public void initializePages() {
      for (PageHandler var2 : this) {
         var2.cleanup();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int calculatePagesSize() {
      int var1 = 0;
      var1 += 2;

      for (PageHandler var3 : this) {
         var1 += PageHandler.staticCalculatePageSize(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void writePageData() {
      Exporter3DA.staticWriteHeaderAndData(this.exporter, this.sectionHeader, this.calculatePagesSize());
      Exporter3DA.staticWriteShortInt(this.exporter, (short)this.size());

      for (PageHandler var2 : this) {
         PageHandler.staticWrite(var2);
      }
   }

   // $VF: renamed from: a (i.q) void
   // $VF: synthetic method
   static void write(PageSection var0) {
      var0.writePageData();
   }
}
