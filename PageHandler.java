package i;

import ac.class_411;
import ac.class_5289;

// $VF: renamed from: i.p
class PageHandler {
   // $VF: renamed from: a i.s
   private PositionList positionList;
   // $VF: renamed from: a i.u
   private PanelList panelList;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public PageHandler(Exporter3DA var1, class_411 var2, class_5289 var3) {
      this.exporter = var1;
      this.positionList = new PositionList(var1, var2, var3);
      this.panelList = new PanelList(var1, var3);
   }

   // $VF: renamed from: a () void
   public void cleanup() {
      this.positionList.method_34518();
      this.positionList = null;
      this.panelList.method_34513();
      this.panelList = null;
   }

   // $VF: renamed from: a () int
   private int calculatePageSize() {
      return PositionList.method_34521(this.positionList) + PanelList.method_34516(this.panelList);
   }

   // $VF: renamed from: b () void
   private void write() {
      PositionList.method_34522(this.positionList);
      PanelList.method_34517(this.panelList);
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
