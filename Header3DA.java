package i;

// $VF: renamed from: i.v
class Header3DA {
   // $VF: renamed from: a byte[]
   private byte[] fileHeader;
   // $VF: renamed from: b byte[]
   private byte[] field_4941;
   // $VF: renamed from: c byte[]
   private byte[] field_4942;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA field_4943;

   public Header3DA(Exporter3DA var1) {
      this.field_4943 = var1;
      this.fileHeader = new byte[]{51, 68, 65, 80}; // 3DAP
      this.field_4941 = new byte[]{1, 0, 0};
      this.field_4942 = new byte[]{1, 0, 0};
   }

   // $VF: renamed from: a () void
   public void initializeHeader() {
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteByteArray(this.field_4943, this.fileHeader);
      Exporter3DA.staticWriteByteArray(this.field_4943, this.field_4941);
      Exporter3DA.staticWriteByteArray(this.field_4943, this.field_4942);
   }

   // $VF: renamed from: a (i.v) void
   // $VF: synthetic method
   static void write(Header3DA var0) {
      var0.writeSectionData();
   }
}
