package i;

import ac.class_418;

// $VF: renamed from: i.n
class CastMember {
   // $VF: renamed from: a long
   private long id;
   // $VF: renamed from: a java.lang.String
   private String name;
   // $VF: renamed from: b java.lang.String
   private String label;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public CastMember(Exporter3DA var1, class_418 var2) {
      this.exporter = var1;
      this.id = var2.method_4197();
      this.name = var2.method_4201();
      this.label = var2.method_4204();
   }

   // $VF: renamed from: a () void
   public void initialize() {
   }

   // $VF: renamed from: a () int
   private int calculateSize() {
      return 2 + Exporter3DA.staticCalculateStringSize(this.exporter, this.name) + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.label);
   }

   // $VF: renamed from: b () void
   private void writeData() {
      Exporter3DA.staticWriteShortInt(this.exporter, (short)this.id);
      Exporter3DA.staticWriteString(this.exporter, this.name);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.label);
   }

   // $VF: renamed from: a (i.n) int
   // $VF: synthetic method
   static int staticCalculateSize(CastMember var0) {
      return var0.calculateSize();
   }

   // $VF: renamed from: a (i.n) void
   // $VF: synthetic method
   static void staticWriteData(CastMember var0) {
      var0.writeData();
   }
}
