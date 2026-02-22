package i;

import ak.class_285;
import java.io.File;
import java.io.FilenameFilter;

// $VF: renamed from: i.j
final class FileFilter3DA implements FilenameFilter {
   // $VF: renamed from: a i.a
   // $VF: synthetic field
   final ExportDialog field_4975;

   private FileFilter3DA(ExportDialog var1) {
      this.field_4975 = var1;
   }

   @Override
   public boolean accept(File var1, String var2) {
      return var2 == null ? false : class_285.method_2385(var2, ".3da");
   }

   // $VF: renamed from: a () java.lang.String
   public String method_6966() {
      return class_2003.method_6494("AppExporter.1");
   }

   // $VF: synthetic method
   FileFilter3DA(ExportDialog var1, class_2036 var2) {
      this(var1);
   }
}
