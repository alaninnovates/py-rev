package i;

import ac.class_411;

// $VF: renamed from: i.w
class GeneralInfo {
   // $VF: renamed from: a byte[]
   private byte[] field_4933;
   // $VF: renamed from: a java.lang.String
   private String field_4934;
   // $VF: renamed from: b java.lang.String
   private String field_4935;
   // $VF: renamed from: a short
   private short field_4936;
   // $VF: renamed from: a int
   private int field_4937;
   // $VF: renamed from: c java.lang.String
   private String field_4938;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_4939;

   public GeneralInfo(Exporter3DA var1, class_411 var2) {
      this.field_4939 = var1;
      this.field_4933 = new byte[]{71, 69, 78, 49}; // GEN1
      Exporter3DA.method_6913(var1, var2.method_3831().method_33463(0));
      this.field_4934 = var2.method_3887();
      this.field_4935 = var2.method_3803();
      this.field_4936 = var2.method_3817();
      this.field_4937 = Exporter3DA.method_6914(var1).method_33419();
      this.field_4938 = var2.method_3842();
   }

   // $VF: renamed from: a () void
   public void method_6933() {
   }

   // $VF: renamed from: a () int
   private int method_6934() {
      return Exporter3DA.staticCalculateUTF8StringSize(this.field_4939, this.field_4934)
         + Exporter3DA.staticCalculateUTF8StringSize(this.field_4939, this.field_4935)
         + 2
         + 4
         + Exporter3DA.staticCalculateStringSize(this.field_4939, this.field_4938);
   }

   // $VF: renamed from: b () void
   private void method_6935() {
      Exporter3DA.staticWriteHeaderAndData(this.field_4939, this.field_4933, this.method_6934());
      Exporter3DA.staticWriteUTF8String(this.field_4939, this.field_4934);
      Exporter3DA.staticWriteUTF8String(this.field_4939, this.field_4935);
      Exporter3DA.staticWriteShortInt(this.field_4939, this.field_4936);
      Exporter3DA.staticWriteInt(this.field_4939, this.field_4937);
      Exporter3DA.staticWriteString(this.field_4939, this.field_4938);
   }

   // $VF: renamed from: a (i.w) void
   // $VF: synthetic method
   static void method_6936(GeneralInfo var0) {
      var0.method_6935();
   }
}
