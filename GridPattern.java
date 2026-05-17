package i;

import ac.class_411;
import ad.class_5267;
import ak.UtilityHelper;
import java.util.ArrayList;
import java.util.Iterator;

// $VF: renamed from: i.x
class GridPattern {
   // $VF: renamed from: a byte[]
   private byte[] sectionHeader;
   // $VF: renamed from: a short
   private short field_4929;
   // $VF: renamed from: a java.lang.String
   private String field_4930;
   // $VF: renamed from: a int
   private int field_4931;
   // $VF: renamed from: a i.l
   // $VF: synthetic field
   final Exporter3DA exporter;

   public GridPattern(Exporter3DA var1, class_411 var2) {
      this.exporter = var1;
      this.sectionHeader = new byte[]{71, 82, 68, 49}; // GRD1
      this.field_4929 = this.method_6930(var2); // seems to be some kind of known grid pattern? 00 00 in the 3da file given
      this.field_4931 = var2.method_3821().size(); // some size variable?
      this.field_4930 = this.method_6931(var2);
   }

   // $VF: renamed from: a () void
   public void initializeGridPattern() {
   }

   // $VF: renamed from: a () int
   private int calculateSectionSize() {
      return 4 + Exporter3DA.staticCalculateStringSize(this.exporter, this.field_4930);
   }

   // $VF: renamed from: b () void
   private void writeSectionData() {
      Exporter3DA.staticWriteHeaderAndData(this.exporter, this.sectionHeader, this.calculateSectionSize());
      Exporter3DA.staticWriteShortInt(this.exporter, this.field_4929);
      Exporter3DA.staticWriteShortInt(this.exporter, this.field_4931);
      Exporter3DA.staticWriteString(this.exporter, this.field_4930);
   }

   // $VF: renamed from: a (ac.u) short
   private short method_6930(class_411 var1) {
      int var2 = 8;
      int var3 = 8;
      int var4 = 0;
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;
      ArrayList var9 = new ArrayList();

      for (String var12 : var1.method_3821()) {
         if (var12.startsWith("UNIT")) {
            var4 = class_5267.method_33300(var12, 1);
         }

         if (var12.startsWith("GRID")) {
            var2 = class_5267.method_33300(var12, 1);
            var3 = class_5267.method_33300(var12, 3);
         }

         if (var12.startsWith("BORD")) {
            var5 = class_5267.method_33301(var12, 1);
            var6 = class_5267.method_33301(var12, 2);
            var7 = class_5267.method_33301(var12, 3);
            var8 = class_5267.method_33301(var12, 4);
         }

         if (var12.startsWith("HZHS")) {
            var9.add(class_5267.method_33301(var12, 1));
         }
      }

      if (var4 == 1) {
         if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 26.0F) == 0) {
            return 12;
         }

         if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 30.0F) == 0) {
            return 10;
         }

         if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 40.0F) == 0) {
            return 11;
         }
      } else {
         if (var2 == 8 && var3 == 8) {
            if (Math.abs(var6) + Math.abs(var8) == 52.5) {
               Iterator var14 = var9.iterator();
               if (var14.hasNext()) {
                  float var16 = (Float)var14.next();
                  if (Math.abs(var16) != 6.25 && Math.abs(var16) != 7.0833) {
                     return 1;
                  }

                  return 3;
               }
            } else if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 53.33F) == 0) {
               for (float var15 : var9) {
                  if (Math.abs(var15) == 8.75 || Math.abs(var15) == 9.66) {
                     return 2;
                  }

                  if (Math.abs(var15) == 6.25 || Math.abs(var15) == 7.0833) {
                     return 15;
                  }

                  if (Math.abs(var15) == 3.5 || Math.abs(var15) == 3.0833) {
                     return 4;
                  }
               }
            } else if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 30.0F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 20.0F) == 0) {
                  return 7;
               }
            } else {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 70.0F) == 0) {
                  return 5;
               }

               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 60.0F) == 0) {
                  return 6;
               }

               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 237.5F) == 0) {
                  return 8;
               }

               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 26.0F) == 0) {
                  return 9;
               }

               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 24.67F) == 0) {
                  return 9;
               }

               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 31.67F) == 0) {
                  return 13;
               }

               if (UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2) < 50.0F) {
                  return 14;
               }
            }

            return 0;
         }

         if (var2 == 6 && var3 == 6) {
            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 30.0F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 20.0F) == 0) {
                  return 40;
               }

               return 41;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 28.33F) == 0) {
               return 42;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 26.66F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 20.0F) == 0) {
                  return 43;
               }

               return 44;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 23.32F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 16.66F) == 0) {
                  return 45;
               }

               return 46;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 20.0F) == 0) {
               return 47;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 100.0F) == 0) {
               return 48;
            }
         }

         if (var2 == 15 && var3 == 15) {
            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 30.0F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 20.0F) == 0) {
                  return 20;
               }

               return 21;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 28.33F) == 0) {
               return 22;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 26.66F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 20.0F) == 0) {
                  return 23;
               }

               return 24;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 23.32F) == 0) {
               if (Float.compare(UtilityHelper.roundFloat(Math.abs(var6) + Math.abs(var8), 2), 16.66F) == 0) {
                  return 25;
               }

               return 26;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 20.0F) == 0) {
               return 27;
            }

            if (Float.compare(UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2), 100.0F) == 0) {
               return 28;
            }
         }

         if (UtilityHelper.roundFloat(Math.abs(var5) + Math.abs(var7), 2) < 50.0F) {
            return 14;
         }
      }

      return 0;
   }

   // $VF: renamed from: a (ac.u) java.lang.String
   private String method_6931(class_411 var1) {
      StringBuffer var2 = new StringBuffer();
      class_5267 var3 = var1.method_3821();

      for (int var4 = 0; var4 < this.field_4931; var4++) {
         var2.append((String)var3.elementAt(var4));
         var2.append("\n");
      }

      return var2.toString();
   }

   // $VF: renamed from: a (i.x) void
   // $VF: synthetic method
   static void write(GridPattern var0) {
      var0.writeSectionData();
   }
}
