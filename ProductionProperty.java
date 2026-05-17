package i;

import ac.class_395;
import ac.class_5386;

// $VF: renamed from: i.o
class ProductionProperty {
   // $VF: renamed from: a short
   private short field_4961;
   // $VF: renamed from: a java.lang.String
   private String field_4962;
   // $VF: renamed from: a ac.Y
   private class_5386 field_4963;
   // $VF: renamed from: b java.lang.String
   private String field_4964;
   // $VF: renamed from: c java.lang.String
   private String field_4965;
   // $VF: renamed from: d java.lang.String
   private String field_4966;
   // $VF: renamed from: e java.lang.String
   private String field_4967;
   // $VF: renamed from: f java.lang.String
   private String field_4968;
   // $VF: renamed from: g java.lang.String
   private String field_4969;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public ProductionProperty(Exporter3DA exporter, class_395 var2) {
      this.exporter = exporter;
      this.field_4961 = (short)var2.field_1807; // id
      this.field_4962 = var2.field_1808; //
      this.field_4963 = var2.field_1812; //
      this.field_4969 = var2.field_1813;
      this.field_4964 = var2.field_1814;
      this.field_4965 = var2.field_1815;
      this.field_4966 = var2.field_1816;
      this.field_4967 = var2.field_1817;
      this.field_4968 = var2.field_1818;
   }

   // $VF: renamed from: a () void
   public void initialize() {
   }

   // $VF: renamed from: a () int
   private int calculateSize() {
      return 2
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4962)
         + 1
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4969)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4964)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4965)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4966)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4967)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.field_4968);
   }

   // $VF: renamed from: b () void
   private void writeData() {
      Exporter3DA.staticWriteShortInt(this.exporter, this.field_4961);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4962);
      Exporter3DA.staticWriteByte(this.exporter, (byte)(this.field_4963 == class_5386.field_35120 ? 0 : 1));
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4969);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4964);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4965);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4966);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4967);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.field_4968);
   }

   // $VF: renamed from: a (i.o) int
   // $VF: synthetic method
   static int staticCalculateSize(ProductionProperty var0) {
      return var0.calculateSize();
   }

   // $VF: renamed from: a (i.o) void
   // $VF: synthetic method
   static void staticWriteData(ProductionProperty var0) {
      var0.writeData();
   }
}
