package i;

import U.class_476;
import ac.class_407;
import ac.class_411;
import ac.class_5272;
import ai.class_1657;
import ak.UtilityHelper;
import ak.class_285;
import java.awt.Color;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// $VF: renamed from: i.l
public class Exporter3DA {
   // $VF: renamed from: a byte[]
   private final byte[] field_4915 = new byte[]{69, 78, 68, 32};
   // $VF: renamed from: a java.lang.String
   private String field_4916;
   // $VF: renamed from: a boolean
   private boolean field_4917 = false;
   // $VF: renamed from: a ac.u
   private class_411 field_4918;
   // $VF: renamed from: a U.p
   private class_476 field_4919;
   // $VF: renamed from: a java.io.DataOutputStream
   private DataOutputStream field_4920;
   // $VF: renamed from: a i.v
   private Header3DA field_4921;
   // $VF: renamed from: a i.w
   private GeneralInfo field_4922;
   // $VF: renamed from: a i.x
   private GridPattern field_4923;
   // $VF: renamed from: a i.m
   private CastSection field_4924;
   // $VF: renamed from: a i.y
   private PerformerTab field_4925;
   // $VF: renamed from: a i.q
   private PageSection field_4926;
   // $VF: renamed from: a ac.Z
   private class_5272 field_4927;

   public Exporter3DA(class_411 var1, class_476 var2) {
      this.field_4918 = var1;
      this.field_4919 = var2;
      new class_407(var1).method_3772();
   }

   // $VF: renamed from: a () void
   public void method_6892() {
      this.method_6894();
      this.field_4918 = null;
      this.field_4920 = null;
   }

   // $VF: renamed from: b () void
   private void method_6893() {
      this.method_6894();
      this.field_4921 = new Header3DA(this);
      this.field_4922 = new GeneralInfo(this, this.field_4918);
      this.field_4923 = new GridPattern(this, this.field_4918);
      this.field_4924 = new CastSection(this, this.field_4918, this.field_4919);
      this.field_4925 = new PerformerTab(this, this.field_4918);
      this.field_4926 = new PageSection(this, this.field_4918);
   }

   // $VF: renamed from: c () void
   private void method_6894() {
      if (this.field_4921 != null) {
         this.field_4921.initializeHeader();
      }

      if (this.field_4922 != null) {
         this.field_4922.initializeGeneralInfo();
      }

      if (this.field_4923 != null) {
         this.field_4923.method_6927();
      }

      if (this.field_4924 != null) {
         this.field_4924.initializeMembers();
      }

      if (this.field_4925 != null) {
         this.field_4925.initializePerformers();
      }

      if (this.field_4926 != null) {
         this.field_4926.initializePages();
      }

      this.field_4921 = null;
      this.field_4922 = null;
      this.field_4923 = null;
      this.field_4924 = null;
      this.field_4925 = null;
      this.field_4926 = null;
   }

   // $VF: renamed from: d () void
   private void method_6895() {
      String var1 = null;

      try {
         var1 = class_285.method_2398(this.field_4916) + System.currentTimeMillis() + ".tmp";
         this.field_4920 = new DataOutputStream(new FileOutputStream(var1));
         Header3DA.write(this.field_4921);
         GeneralInfo.write(this.field_4922);
         GridPattern.method_6932(this.field_4923);
         CastSection.write(this.field_4924);
         PerformerTab.write(this.field_4925);
         PageSection.write(this.field_4926);
         this.writeHeaderAndData(this.field_4915, 0);
         this.field_4920.close();
         this.field_4920 = null;
         class_285.method_2409(var1, this.field_4916);
         class_285.method_2405(var1);
      } catch (IOException var3) {
         if (this.field_4920 == null) {
            this.field_4920.close();
         }

         this.field_4920 = null;
         if (var1 != null) {
            class_285.method_2405(var1);
         }

         throw var3;
      }
   }

   // $VF: renamed from: a (java.lang.String) int
   private int method_6896(String var1) {
      return var1 == null ? 2 : var1.length() + 2;
   }

   // $VF: renamed from: b (java.lang.String) int
   private int method_6897(String var1) {
      int var2 = 0;

      try {
         if (var1 != null) {
            var2 = var1.getBytes("UTF-8").length + 2;
         } else {
            var2 = 2;
         }
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   // $VF: renamed from: a (float) byte[]
   private byte[] method_6898(float var1) {
      return UtilityHelper.intToByteArray(Math.round(var1 * 1000.0F));
   }

   // $VF: renamed from: a (byte[], int) void
   private void writeHeaderAndData(byte[] var1, int var2) {
      if (!this.field_4917) {
         writeByteArray(var1);
         writeInt(var2);
      }
   }

   // $VF: renamed from: a (ai.c) void
   private void writePoint(class_1657 var1) {
      writeByteArray(this.method_6898(var1.field_4211));
      writeByteArray(this.method_6898(var1.field_4212));
   }

   // $VF: renamed from: a (java.lang.Float) void
   private void writeFloat(Float var1) {
      writeByteArray(this.method_6898(var1));
   }

   // $VF: renamed from: a (java.awt.Color) void
   private void writeColor(Color var1) {
      writeByte((byte)var1.getRed());
      writeByte((byte)var1.getGreen());
      writeByte((byte)var1.getBlue());
   }

   // $VF: renamed from: a (char) void
   private void writeChar(char var1) {
      writeByte((byte)var1);
   }

   // $VF: renamed from: a (int) void
   private void writeShortInt(int var1) {
      writeByteArray(UtilityHelper.shortToByteArray((short)var1));
   }

   // $VF: renamed from: b (int) void
   private void writeInt(int var1) {
      writeByteArray(UtilityHelper.intToByteArray(var1));
   }

   // $VF: renamed from: b (java.lang.String) void
   private void writeString(String var1) {
      int var2 = var1 == null ? 2 : var1.length() + 2;
      if (var2 > 32767) {
         throw new IOException("String length too big.");
      } else {
         byte[] var3 = new byte[var2];
         byte[] var4 = UtilityHelper.shortToByteArray((short)var2);
         byte[] var5 = var1 == null ? new byte[0] : var1.getBytes();
         System.arraycopy(var4, 0, var3, 0, 2);
         if (var5.length > 0) {
            System.arraycopy(var5, 0, var3, 2, var5.length);
         }

         this.field_4920.write(var3);
      }
   }

   // $VF: renamed from: c (java.lang.String) void
   private void writeUTF8String(String var1) {
      int var2 = var1 == null ? 2 : var1.getBytes("UTF-8").length + 2;
      if (var2 > 32767) {
         throw new IOException("String length too big.");
      } else {
         byte[] var3 = new byte[var2];
         byte[] var4 = UtilityHelper.shortToByteArray((short)var2);
         byte[] var5 = var1 == null ? new byte[0] : var1.getBytes("UTF-8");
         System.arraycopy(var4, 0, var3, 0, 2);
         if (var5.length > 0) {
            System.arraycopy(var5, 0, var3, 2, var5.length);
         }

         this.field_4920.write(var3);
      }
   }

   // $VF: renamed from: a (byte[]) void
   private void writeByteArray(byte[] var1) {
      this.field_4920.write(var1);
   }

   // $VF: renamed from: a (byte) void
   private void writeByte(byte var1) {
      this.field_4920.write(var1);
   }

   // $VF: renamed from: a (boolean) void
   public void method_6910(boolean var1) {
      if (this.field_4917 != var1) {
         this.field_4917 = var1;
         if (this.field_4921 != null) {
            this.method_6893();
         }

         System.out.println("Beta: " + this.field_4917);
      }
   }

   // $VF: renamed from: a (java.lang.String) void
   public void method_6911(String var1) {
      this.field_4916 = var1;
      this.method_6893();
      this.method_6895();
      this.method_6894();
   }

   // $VF: renamed from: a (i.l, byte[]) void
   // $VF: synthetic method
   static void staticWriteByteArray(Exporter3DA var0, byte[] var1) {
      var0.writeByteArray(var1);
   }

   // $VF: renamed from: a (i.l, ac.Z) ac.Z
   // $VF: synthetic method
   static class_5272 method_6913(Exporter3DA var0, class_5272 var1) {
      return var0.field_4927 = var1;
   }

   // $VF: renamed from: a (i.l) ac.Z
   // $VF: synthetic method
   static class_5272 method_6914(Exporter3DA var0) {
      return var0.field_4927;
   }

   // $VF: renamed from: a (i.l, java.lang.String) int
   // $VF: synthetic method
   static int staticCalculateUTF8StringSize(Exporter3DA var0, String var1) {
      return var0.method_6897(var1);
   }

   // $VF: renamed from: b (i.l, java.lang.String) int
   // $VF: synthetic method
   static int staticCalculateStringSize(Exporter3DA var0, String var1) {
      return var0.method_6896(var1);
   }

   // $VF: renamed from: a (i.l, byte[], int) void
   // $VF: synthetic method
   static void staticWriteHeaderAndData(Exporter3DA var0, byte[] var1, int var2) {
      var0.writeHeaderAndData(var1, var2);
   }

   // $VF: renamed from: a (i.l, java.lang.String) void
   // $VF: synthetic method
   static void staticWriteUTF8String(Exporter3DA var0, String var1) {
      var0.writeUTF8String(var1);
   }

   // $VF: renamed from: a (i.l, int) void
   // $VF: synthetic method
   static void staticWriteShortInt(Exporter3DA var0, int var1) {
      var0.writeShortInt(var1);
   }

   // $VF: renamed from: b (i.l, int) void
   // $VF: synthetic method
   static void staticWriteInt(Exporter3DA var0, int var1) {
      var0.writeInt(var1);
   }

   // $VF: renamed from: b (i.l, java.lang.String) void
   // $VF: synthetic method
   static void staticWriteString(Exporter3DA var0, String var1) {
      var0.writeString(var1);
   }

   // $VF: renamed from: a (i.l, byte) void
   // $VF: synthetic method
   static void staticWriteByte(Exporter3DA var0, byte var1) {
      var0.writeByte(var1);
   }

   // $VF: renamed from: a (i.l, ai.c) void
   // $VF: synthetic method
   static void staticWritePoint(Exporter3DA var0, class_1657 var1) {
      var0.writePoint(var1);
   }

   // $VF: renamed from: a (i.l, java.awt.Color) void
   // $VF: synthetic method
   static void staticWriteColor(Exporter3DA var0, Color var1) {
      var0.writeColor(var1);
   }

   // $VF: renamed from: a (i.l, char) void
   // $VF: synthetic method
   static void staticWriteChar(Exporter3DA var0, char var1) {
      var0.writeChar(var1);
   }

   // $VF: renamed from: a (i.l, java.lang.Float) void
   // $VF: synthetic method
   static void staticWriteFloat(Exporter3DA var0, Float var1) {
      var0.writeFloat(var1);
   }
}
