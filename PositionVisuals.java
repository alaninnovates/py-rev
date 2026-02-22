package i;

import ac.class_394;
import ac.class_411;
import ai.class_1657;
import java.awt.Color;

// $VF: renamed from: i.r
class PositionVisuals {
   // $VF: renamed from: a long
   private long field_4953;
   // $VF: renamed from: a ai.c
   private class_1657 field_4954;
   // $VF: renamed from: a java.awt.Color
   private Color field_4955;
   // $VF: renamed from: a char
   private char field_4956;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_4957;

   public PositionVisuals(Exporter3DA var1, class_411 var2, class_394 var3) {
      this.field_4957 = var1;
      this.field_4953 = var3.method_3485();
      this.field_4954 = var3.field_1779;
      this.field_4955 = var3.method_3494(var2);
      this.field_4956 = var3.field_1777;
   }

   // $VF: renamed from: a () void
   public void method_6946() {
      this.field_4954 = null;
   }

   // $VF: renamed from: a () int
   private int method_6947() {
      return 14;
   }

   // $VF: renamed from: b () void
   private void method_6948() {
      Exporter3DA.staticWriteShortInt(this.field_4957, (short)this.field_4953);
      Exporter3DA.staticWritePoint(this.field_4957, this.field_4954);
      Exporter3DA.staticWriteColor(this.field_4957, this.field_4955);
      Exporter3DA.staticWriteChar(this.field_4957, this.field_4956);
   }

   // $VF: renamed from: a (i.r) int
   // $VF: synthetic method
   static int method_6949(PositionVisuals var0) {
      return var0.method_6947();
   }

   // $VF: renamed from: a (i.r) void
   // $VF: synthetic method
   static void method_6950(PositionVisuals var0) {
      var0.method_6948();
   }
}
