package i;

import ac.class_419;
import ac.class_420;
import ac.class_421;
import ai.class_1657;

// $VF: renamed from: i.t
class PerformerPosition {
   // $VF: renamed from: a short
   private short field_4944;
   // $VF: renamed from: b short
   private short field_4945;
   // $VF: renamed from: a long
   private long field_4946;
   // $VF: renamed from: a ai.c
   private class_1657 field_4947;
   // $VF: renamed from: b ai.c
   private class_1657 field_4948;
   // $VF: renamed from: a float
   private float field_4949;
   // $VF: renamed from: b float
   private float field_4950;
   // $VF: renamed from: a java.lang.String
   private String field_4951;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public PerformerPosition(Exporter3DA var1, class_419 var2) {
      this.exporter = var1;
      this.field_4951 = "";
      this.field_4944 = (short)var2.method_4232();
      if (var2.method_4235(4)) {
         class_421 var3 = (class_421)var2;
         this.field_4946 = var3.a();
         this.field_4945 = (short)var3.method_4288();
         this.field_4947 = var3.method_4296();
         this.field_4948 = var3.method_4297();
         this.field_4949 = var3.field_2050;
         this.field_4950 = var3.field_2051;
      }

      if (var2.method_4235(2)) {
         class_420 var4 = (class_420)var2;
         this.field_4946 = var4.a();
         this.field_4945 = 0;
         this.field_4947 = var4.method_4250();
         this.field_4948 = var4.method_4251();
         this.field_4949 = 0.0F;
         this.field_4950 = 0.0F;
         this.field_4951 = var4.method_4249();
      }
   }

   // $VF: renamed from: a () void
   public void method_6940() {
      this.field_4947 = null;
      this.field_4948 = null;
   }

   // $VF: renamed from: a () int
   private int method_6941() {
      return 30 + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4951);
   }

   // $VF: renamed from: b () void
   private void method_6942() {
      Exporter3DA.staticWriteShortInt(this.exporter, (short)this.field_4946);
      Exporter3DA.staticWriteShortInt(this.exporter, this.field_4944);
      Exporter3DA.staticWriteShortInt(this.exporter, this.field_4945);
      Exporter3DA.staticWritePoint(this.exporter, this.field_4947);
      Exporter3DA.staticWritePoint(this.exporter, this.field_4948);
      Exporter3DA.staticWriteFloat(this.exporter, this.field_4949);
      Exporter3DA.staticWriteFloat(this.exporter, this.field_4950);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4951);
   }

   // $VF: renamed from: a (i.t) ai.c
   // $VF: synthetic method
   static class_1657 method_6943(PerformerPosition var0) {
      return var0.field_4947;
   }

   // $VF: renamed from: a (i.t) int
   // $VF: synthetic method
   static int method_6944(PerformerPosition var0) {
      return var0.method_6941();
   }

   // $VF: renamed from: a (i.t) void
   // $VF: synthetic method
   static void method_6945(PerformerPosition var0) {
      var0.method_6942();
   }
}
