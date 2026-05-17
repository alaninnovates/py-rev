package i;

import ac.class_411;
import ac.class_5289;

// $VF: renamed from: i.p
class PageHandler {
   // $VF: renamed from: a i.s
   private VisualPositionList visualPositionList;
   // $VF: renamed from: a i.u
   private PerformerPositionList performerPositionList;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public PageHandler(Exporter3DA var1, class_411 var2, class_5289 var3) {
      this.exporter = var1;
      this.visualPositionList = new VisualPositionList(var1, var2, var3);
      this.performerPositionList = new PerformerPositionList(var1, var3);
   }

   // $VF: renamed from: a () void
   public void cleanup() {
      this.visualPositionList.cleanup();
      this.visualPositionList = null;
      this.performerPositionList.cleanup();
      this.performerPositionList = null;
   }

   // $VF: renamed from: a () int
   private int calculatePageSize() {
      return VisualPositionList.staticCalculateSectionSize(this.visualPositionList) + PerformerPositionList.staticCalculateSectionSize(this.performerPositionList);
   }

   // $VF: renamed from: b () void
   private void write() {
      VisualPositionList.write(this.visualPositionList);
      PerformerPositionList.write(this.performerPositionList);
   }

   // $VF: renamed from: a (i.p) int
   // $VF: synthetic method
   static int staticCalculatePageSize(PageHandler var0) {
      return var0.calculatePageSize();
   }

   // $VF: renamed from: a (i.p) void
   // $VF: synthetic method
   static void staticWrite(PageHandler var0) {
      var0.write();
   }
}
