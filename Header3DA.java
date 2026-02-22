package i;

// $VF: renamed from: i.v
class Header3DA {
   // $VF: renamed from: a byte[]
   private byte[] field_4940;
   // $VF: renamed from: b byte[]
   private byte[] field_4941;
   // $VF: renamed from: c byte[]
   private byte[] field_4942;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_4943;

   public Header3DA(Exporter3DA var1) {
      this.field_4943 = var1;
      this.field_4940 = new byte[]{51, 68, 65, 80};
      this.field_4941 = new byte[]{1, 0, 0};
      this.field_4942 = new byte[]{1, 0, 0};
   }

   // $VF: renamed from: a () void
   public void method_6937() {
   }

   // $VF: renamed from: b () void
   private void method_6938() {
      Exporter3DA.staticWriteByteArray(this.field_4943, this.field_4940);
      Exporter3DA.staticWriteByteArray(this.field_4943, this.field_4941);
      Exporter3DA.staticWriteByteArray(this.field_4943, this.field_4942);
   }

   // $VF: renamed from: a (i.v) void
   // $VF: synthetic method
   static void method_6939(Header3DA var0) {
      var0.method_6938();
   }
}
