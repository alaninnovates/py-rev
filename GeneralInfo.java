package i;

import ac.class_411;

// $VF: renamed from: i.w
class GeneralInfo {
   // $VF: renamed from: a byte[]
   private byte[] sectionHeader;
   // $VF: renamed from: a java.lang.String
   private String drillTitle;
   // $VF: renamed from: b java.lang.String
   private String authorInfo;
   // $VF: renamed from: a short
   private short animationFixedTempoBPM;
   // $VF: renamed from: a int
   private int field_4937;
   // $VF: renamed from: c java.lang.String
   private String symbolFont;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public GeneralInfo(Exporter3DA var1, class_411 var2) {
      this.exporter = var1;
      this.sectionHeader = new byte[]{71, 69, 78, 49}; // GEN1
      Exporter3DA.method_6913(var1, var2.method_3831().method_33463(0));
      this.drillTitle = var2.method_3887(); // drill title
      this.authorInfo = var2.method_3803();
      this.animationFixedTempoBPM = var2.method_3817();
      this.field_4937 = Exporter3DA.method_6914(var1).method_33419();
      this.symbolFont = var2.method_3842(); // font
   }

   // $VF: renamed from: a () void
   public void initializeGeneralInfo() {
   }

   // $VF: renamed from: a () int
   private int calculateSectionSize() {
      return Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.drillTitle)
         + Exporter3DA.staticCalculateUTF8StringSize(this.exporter, this.authorInfo)
         + 2
         + 4
         + Exporter3DA.staticCalculateStringSize(this.exporter, this.symbolFont);
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteHeaderAndData(this.exporter, this.sectionHeader, this.calculateSectionSize());
      Exporter3DA.staticWriteUTF8String(this.exporter, this.drillTitle);
      Exporter3DA.staticWriteUTF8String(this.exporter, this.authorInfo);
      Exporter3DA.staticWriteShortInt(this.exporter, this.animationFixedTempoBPM);
      Exporter3DA.staticWriteInt(this.exporter, this.field_4937);
      Exporter3DA.staticWriteString(this.exporter, this.symbolFont);
   }

   // $VF: renamed from: a (i.w) void
   // $VF: synthetic method
   static void write(GeneralInfo var0) {
      var0.writeSectionData();
   }
}
