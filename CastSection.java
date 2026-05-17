package i;

import U.class_476;
import ac.class_411;
import ac.class_418;
import ac.class_5294;
import java.util.ArrayList;

// $VF: renamed from: i.m
class CastSection extends ArrayList {
   // $VF: renamed from: a byte[]
   private byte[] sectionHeader;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public CastSection(Exporter3DA exporter, class_411 document, class_476 performerManager) {
      this.exporter = exporter;
      this.sectionHeader = new byte[]{67, 65, 83, 84}; // CAST
      class_5294 castMembers = document.method_3805();
      castMembers.method_34031(document);

      for (class_418 castMember : castMembers) {
         performerManager.method_4632().method_34013(castMember);
      }

      performerManager.method_4632().method_34042();

      for (class_418 castMember : performerManager.method_4632()) {
         this.add(new CastMember(exporter, castMember));
      }

      performerManager.method_4632().method_34033();
   }

   // $VF: renamed from: a () void
   public void initializeMembers() {
      for (CastMember var2 : this) {
         var2.initialize();
      }

      this.clear();
   }

   // $VF: renamed from: a () int
   private int calculateSectionSize() {
      int var1 = 0;
      var1 += 2;

      for (CastMember var3 : this) {
         var1 += CastMember.staticCalculateSize(var3);
      }

      return var1;
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteHeaderAndData(this.exporter, this.sectionHeader, this.calculateSectionSize());
      Exporter3DA.staticWriteShortInt(this.exporter, this.size());

      for (CastMember var2 : this) {
         CastMember.staticWriteData(var2);
      }
   }

   // $VF: renamed from: a (i.m) void
   // $VF: synthetic method
   static void write(CastSection var0) {
      var0.writeSectionData();
   }
}
