package i;

import ac.class_411;
import ac.class_5289;

// $VF: renamed from: i.p
class PageHandler {
   // $VF: renamed from: a i.s
   private PositionList field_4958;
   // $VF: renamed from: a i.u
   private PanelList field_4959;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_4960;

   public PageHandler(Exporter3DA var1, class_411 var2, class_5289 var3) {
      this.field_4960 = var1;
      this.field_4958 = new PositionList(var1, var2, var3);
      this.field_4959 = new PanelList(var1, var3);
   }

   // $VF: renamed from: a () void
   public void method_6951() {
      this.field_4958.method_34518();
      this.field_4958 = null;
      this.field_4959.method_34513();
      this.field_4959 = null;
   }

   // $VF: renamed from: a () int
   private int method_6952() {
      return PositionList.method_34521(this.field_4958) + PanelList.method_34516(this.field_4959);
   }

   // $VF: renamed from: b () void
   private void method_6953() {
      PositionList.method_34522(this.field_4958);
      PanelList.method_34517(this.field_4959);
   }

   // $VF: renamed from: a (i.p) int
   // $VF: synthetic method
   static int method_6954(PageHandler var0) {
      return var0.method_6952();
   }

   // $VF: renamed from: a (i.p) void
   // $VF: synthetic method
   static void method_6955(PageHandler var0) {
      var0.method_6953();
   }
}
