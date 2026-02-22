package i;

import R.class_4721;
import U.class_476;
import V.class_4922;
import V.class_4998;
import ac.class_411;
import ak.UtilityHelper;
import ak.class_285;
import com.borland.jbcl.layout.BoxLayout2;
import com.borland.jbcl.layout.VerticalFlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;

// $VF: renamed from: i.a
public class ExportDialog extends JDialog {
   // $VF: renamed from: a i.E
   private class_2016 field_25467;
   // $VF: renamed from: a boolean
   private boolean field_25468 = false;
   // $VF: renamed from: a javax.swing.ImageIcon
   private ImageIcon field_25469;
   // $VF: renamed from: b javax.swing.ImageIcon
   private ImageIcon field_25470;
   // $VF: renamed from: c javax.swing.ImageIcon
   private ImageIcon field_25471;
   // $VF: renamed from: a java.lang.String
   private static final String field_25472 = class_2003.method_6494("productionSheet.ProductionFiler.2");
   // $VF: renamed from: a ac.u
   private class_411 field_25473;
   // $VF: renamed from: a U.p
   private class_476 field_25474;
   // $VF: renamed from: a javax.swing.JPanel
   private final JPanel field_25475 = new JPanel();
   // $VF: renamed from: a javax.swing.JScrollPane
   private final JScrollPane field_25476 = new JScrollPane();
   // $VF: renamed from: a javax.swing.JList
   private final JList field_25477 = new JList();
   // $VF: renamed from: a V.m
   private final class_4922 field_25478 = new class_4922();
   // $VF: renamed from: b V.m
   private final class_4922 field_25479 = new class_4922();
   // $VF: renamed from: c V.m
   private final class_4922 field_25480 = new class_4922();
   // $VF: renamed from: a javax.swing.JTextField
   private final JTextField field_25481 = new JTextField();
   // $VF: renamed from: a V.o
   private final class_4998 field_25482 = new class_4998();
   // $VF: renamed from: b V.o
   private final class_4998 field_25483 = new class_4998();
   // $VF: renamed from: b javax.swing.JTextField
   private final JTextField field_25484 = new JTextField();
   // $VF: renamed from: d V.m
   private final class_4922 field_25485 = new class_4922();
   // $VF: renamed from: b javax.swing.JPanel
   private final JPanel field_25486 = new JPanel();
   // $VF: renamed from: c javax.swing.JPanel
   private final JPanel field_25487 = new JPanel();
   // $VF: renamed from: e V.m
   private final class_4922 field_25488 = new class_4922();
   // $VF: renamed from: d javax.swing.JPanel
   private final JPanel field_25489 = new JPanel();
   // $VF: renamed from: e javax.swing.JPanel
   private final JPanel field_25490 = new JPanel();
   // $VF: renamed from: a java.awt.BorderLayout
   private final BorderLayout field_25491 = new BorderLayout();
   // $VF: renamed from: a com.borland.jbcl.layout.VerticalFlowLayout
   private final VerticalFlowLayout field_25492 = new VerticalFlowLayout();
   // $VF: renamed from: f javax.swing.JPanel
   private final JPanel field_25493 = new JPanel();
   // $VF: renamed from: b com.borland.jbcl.layout.VerticalFlowLayout
   private final VerticalFlowLayout field_25494 = new VerticalFlowLayout();
   // $VF: renamed from: g javax.swing.JPanel
   private final JPanel field_25495 = new JPanel();
   // $VF: renamed from: b java.awt.BorderLayout
   private final BorderLayout field_25496 = new BorderLayout();
   // $VF: renamed from: h javax.swing.JPanel
   private final JPanel field_25497 = new JPanel();
   // $VF: renamed from: c java.awt.BorderLayout
   private final BorderLayout field_25498 = new BorderLayout();
   // $VF: renamed from: i javax.swing.JPanel
   private final JPanel field_25499 = new JPanel();
   // $VF: renamed from: a com.borland.jbcl.layout.BoxLayout2
   private final BoxLayout2 field_25500 = new BoxLayout2();
   // $VF: renamed from: d java.awt.BorderLayout
   private final BorderLayout field_25501 = new BorderLayout();
   // $VF: renamed from: c com.borland.jbcl.layout.VerticalFlowLayout
   private final VerticalFlowLayout field_25502 = new VerticalFlowLayout();
   // $VF: renamed from: a javax.swing.border.Border
   private final Border field_25503 = BorderFactory.createEmptyBorder(10, 10, 0, 10);
   // $VF: renamed from: b javax.swing.border.Border
   private final Border field_25504 = BorderFactory.createEmptyBorder(10, 10, 10, 10);
   // $VF: renamed from: c javax.swing.border.Border
   private final Border field_25505 = BorderFactory.createEmptyBorder(0, 10, 10, 10);
   // $VF: renamed from: d com.borland.jbcl.layout.VerticalFlowLayout
   private final VerticalFlowLayout field_25506 = new VerticalFlowLayout();
   // $VF: renamed from: j javax.swing.JPanel
   private final JPanel field_25507 = new JPanel();
   // $VF: renamed from: k javax.swing.JPanel
   private final JPanel field_25508 = new JPanel();
   // $VF: renamed from: e java.awt.BorderLayout
   private final BorderLayout field_25509 = new BorderLayout();
   // $VF: renamed from: a float
   private float field_25510 = 1.0F;
   // $VF: renamed from: b boolean
   private boolean field_25511 = false;
   // $VF: renamed from: a javax.swing.JCheckBox
   private final JCheckBox field_25512 = new JCheckBox();

   public ExportDialog(Frame var1, String var2, boolean var3) {
      super(var1, var2, true);

      try {
         this.method_27414();
      } catch (Throwable var5) {
         var5.printStackTrace();
      }
   }

   public ExportDialog() {
      this(null, class_2003.method_6494("MainMenu.132"), false);
   }

   public ExportDialog(class_2016 var1, class_411 var2, class_476 var3) {
      this(class_2012.method_6617(), class_2003.method_6494("MainMenu.132"), true);
      this.field_25467 = var1;
      this.field_25473 = var2;
      this.field_25474 = var3;
      this.field_25510 = class_2012.method_6632(2.5F);
      if (UtilityHelper.isMacOS()) {
         this.setAlwaysOnTop(true);
      }

      try {
         this.method_27414();
      } catch (Throwable var7) {
         var7.printStackTrace();
      }

      Image var4 = Toolkit.getDefaultToolkit().getImage(var1.method_6688().method_6522(class_2012.method_6613() ? "folder.dark.png" : "folder.png"));
      this.field_25469 = new ImageIcon(var4.getScaledInstance((int)Math.round(20.0F * this.field_25510 * 0.75), -1, 4));
      Image var5 = Toolkit.getDefaultToolkit().getImage(var1.method_6688().method_6522(class_2012.method_6613() ? "folder.dark.png" : "folder.png"));
      this.field_25470 = new ImageIcon(var5.getScaledInstance((int)Math.round(20.0F * this.field_25510 * 0.75), -1, 4));
      Image var6 = Toolkit.getDefaultToolkit().getImage(var1.method_6688().method_6522(class_2012.method_6613() ? "upFolder.dark.png" : "upFolder.png"));
      this.field_25471 = new ImageIcon(var6.getScaledInstance((int)Math.round(20.0F * this.field_25510 * 0.75), -1, 4));
      this.field_25475.setBackground(class_2012.method_6621());
      this.field_25495.setBackground(class_2012.method_6622());
      this.field_25477.setCellRenderer(new class_5021(this, null));
      this.field_25477.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.method_27415();
      var1.method_6679();
      class_2012.method_6649(this);
      UtilityHelper.configureRootPaneButtons(this.getRootPane(), this.field_25479, this.field_25478);
   }

   // $VF: renamed from: a () void
   private void method_27414() {
      this.setSize(new Dimension(Math.round(525.0F * this.field_25510), Math.round(525.0F * this.field_25510)));
      this.field_25475.setLayout(this.field_25501);
      this.field_25478.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.field_25478.setFocusPainted(false);
      this.field_25478.setText(class_2003.method_6494("productionSheet.ProductionFiler.11"));
      this.field_25478.addActionListener(new class_2036(this));
      this.field_25479.setEnabled(false);
      this.field_25479.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.field_25479.setFocusPainted(false);
      this.field_25479.setText(class_2003.method_6494("productionSheet.ProductionFiler.13"));
      this.field_25479.addActionListener(new class_2035(this));
      this.field_25477.setSelectionMode(0);
      this.field_25477.addMouseListener(new class_4471(this));
      this.field_25477.addListSelectionListener(new class_2034(this));
      this.field_25480.setFont(new Font("Dialog", 0, Math.round(10.0F * this.field_25510)));
      this.field_25480.setFocusPainted(false);
      this.field_25480.setText(class_2003.method_6494("productionSheet.ProductionFiler.15"));
      this.field_25480.addActionListener(new class_2033(this));
      this.field_25482.setFont(new Font("Default", 0, Math.round(11.0F * this.field_25510)));
      this.field_25482.setText(class_2003.method_6494("productionSheet.ProductionFiler.17"));
      this.field_25483.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.field_25483.setText(class_2003.method_6494("productionSheet.ProductionFiler.19"));
      this.field_25481.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.field_25481.setEditable(false);
      this.field_25485.setFont(new Font("Dialog", 0, Math.round(10.0F * this.field_25510)));
      this.field_25485.setFocusPainted(false);
      this.field_25485.setText(class_2003.method_6494("AppExporter.2"));
      this.field_25485.addActionListener(new class_2032(this));
      this.field_25486.setBorder(BorderFactory.createLoweredBevelBorder());
      this.field_25486.setOpaque(false);
      this.field_25486.setLayout(this.field_25502);
      this.field_25484.addKeyListener(new class_4257(this));
      this.field_25487.setBorder(BorderFactory.createLoweredBevelBorder());
      this.field_25487.setOpaque(false);
      this.field_25487.setLayout(this.field_25506);
      this.field_25488.setFont(new Font("Dialog", 0, Math.round(10.0F * this.field_25510)));
      this.field_25488.setText(class_2003.method_6494("productionSheet.ProductionFiler.26"));
      this.field_25488.addActionListener(new class_2031(this));
      this.field_25489.setLayout(this.field_25491);
      this.field_25490.setLayout(this.field_25492);
      this.field_25492.setAlignment(2);
      this.field_25493.setLayout(this.field_25494);
      this.field_25495.setLayout(this.field_25496);
      this.field_25497.setLayout(this.field_25498);
      this.field_25499.setLayout(this.field_25500);
      this.field_25499.setBorder(this.field_25503);
      this.field_25499.setOpaque(false);
      this.field_25497.setBorder(this.field_25504);
      this.field_25497.setOpaque(false);
      this.field_25489.setBorder(this.field_25505);
      this.field_25489.setOpaque(false);
      this.field_25506.setVgap(10);
      this.field_25508.setLayout(this.field_25509);
      this.field_25508.setBorder(BorderFactory.createLoweredBevelBorder());
      this.field_25484.setFont(new Font("Dialog", 0, Math.round(11.0F * this.field_25510)));
      this.field_25507.setOpaque(false);
      this.field_25507.setLayout(new BoxLayout(this.field_25507, 2));
      this.field_25490.setOpaque(false);
      this.field_25493.setOpaque(false);
      this.getContentPane().add(this.field_25475);
      this.field_25495.add(this.field_25486, "Center");
      this.field_25489.add(this.field_25490, "East");
      this.field_25490.add(this.field_25479);
      this.field_25490.add(this.field_25478);
      this.field_25489.add(this.field_25493, "Center");
      this.field_25493.add(this.field_25483);
      this.field_25493.add(this.field_25484);
      this.field_25497.add(this.field_25495, "East");
      this.field_25476.getViewport().add(this.field_25477, null);
      this.field_25499.add(this.field_25482);
      this.field_25499.add(this.field_25481);
      this.field_25499.add(this.field_25480);
      this.field_25475.add(this.field_25499, "North");
      this.field_25475.add(this.field_25497, "Center");
      this.field_25475.add(this.field_25489, "South");
      this.field_25486.add(this.field_25507);
      this.field_25507.add(this.field_25512);
      this.field_25512.setFocusable(false);
      this.field_25512.setOpaque(false);
      this.field_25512.setFont(new Font("", 0, Math.round(11.0F * this.field_25510)));
      this.field_25512.setText("Save As Beta Version");
      this.field_25512.setSelected(false);
      this.field_25512.setVisible(false);
      this.field_25487.add(this.field_25485, null);
      this.field_25487.add(this.field_25488, null);
      this.field_25497.add(this.field_25508, "Center");
      this.field_25508.add(this.field_25476, "Center");
      this.field_25495.add(this.field_25487, "North");
   }

   // $VF: renamed from: b () void
   private void method_27415() {
      String var1 = this.field_25467.method_6674().method_6735("AppExporter", this.field_25467.method_6688().method_6541());
      this.field_25481.setText(var1);
      String[] var2 = class_285.method_2381(var1);
      Vector var3 = new Vector();
      this.field_25488.setEnabled(var1.compareToIgnoreCase(this.field_25467.method_6688().method_6538()) != 0);
      this.field_25485.setEnabled(this.field_25488.isEnabled());
      if (this.field_25488.isEnabled()) {
         var3.addElement(field_25472);
      }

      for (int var4 = 0; var4 < var2.length; var4++) {
         String var5 = var2[var4].toLowerCase();
         if (var5.endsWith(".3da")) {
            var3.addElement(var2[var4]);
         }

         if (class_285.method_2394(var1 + var5)) {
            var3.addElement(var2[var4]);
         }
      }

      this.field_25477.setListData(var3);
   }

   // $VF: renamed from: e () java.lang.String
   private String method_27416() {
      FileDialog var1 = new FileDialog(class_2012.method_6617(), class_2003.method_6494("productionSheet.ProductionFiler.49"), 1);
      FileFilter3DA var2 = new FileFilter3DA(this, null);
      var1.setFilenameFilter(var2);
      var1.setDirectory(this.field_25467.method_6674().method_6735("AppExporter", this.field_25467.method_6688().method_6541()));
      var1.setVisible(true);
      String var3 = var1.getFile();
      if (var3 == null) {
         return null;
      } else {
         if (class_285.method_2385(var3, ".3da")) {
            var3 = class_285.method_2391(var3);
         }

         String var4 = class_285.method_2387(var3, ".3da");
         if (var4 == null) {
            return null;
         } else if (!var2.accept(null, var4)) {
            class_4721.method_25034(class_2012.method_6617(), var2.method_6966());
            return null;
         } else {
            String var5 = var1.getDirectory();
            this.field_25467.method_6674().method_6736("AppExporter", var5);
            return var4;
         }
      }
   }

   // $VF: renamed from: a (javax.swing.event.ListSelectionEvent) void
   private void method_27417(ListSelectionEvent var1) {
      this.field_25479.setEnabled(this.field_25477.getSelectedIndex() > -1);
      if (this.field_25479.isEnabled()) {
         String var2 = (String)this.field_25477.getSelectedValue();
         this.field_25484.setText(var2);
      }
   }

   // $VF: renamed from: a (java.awt.event.ActionEvent) void
   private void method_27418(ActionEvent var1) {
      this.field_25484.setText(this.method_27416());
      this.method_27415();
      this.field_25477.setSelectedValue(this.field_25484.getText(), true);
      this.field_25479.setEnabled(this.field_25484.getText().length() > 0);
   }

   // $VF: renamed from: b (java.awt.event.ActionEvent) void
   private void method_27419(ActionEvent var1) {
      this.field_25468 = false;
      this.setVisible(false);
   }

   // $VF: renamed from: c (java.awt.event.ActionEvent) void
   private void method_27420(ActionEvent var1) {
      if (!this.field_25468) {
         String var2 = this.field_25481.getText() + this.field_25484.getText();
         if (this.field_25481.getText().endsWith(this.field_25484.getText() + File.separator)) {
            var2 = this.field_25481.getText();
         }

         if (this.field_25484.getText().compareTo(field_25472) == 0) {
            this.field_25488.doClick();
         } else if ((class_285.method_2385(var2, ".3da") || !class_285.method_2394(var2)) && !this.field_25511) {
            if (class_285.method_2393(this.method_27426()) && !class_285.method_2394(var2)) {
               int var3 = class_4721.method_25037(
                  class_2012.method_6617(),
                  class_2003.method_6494("productionSheet.ProductionFiler.61")
                     + this.method_27428()
                     + class_2003.method_6494("productionSheet.ProductionFiler.62"),
                  class_2003.method_6494("productionSheet.ProductionFiler.63"),
                  1
               );
               if (var3 == 1) {
                  return;
               }
            }

            if (!class_285.method_2394(var2)) {
               this.field_25468 = true;
               this.method_27425();
               this.setVisible(false);
            }
         } else {
            if (var2.endsWith(File.separator)) {
               this.field_25467.method_6674().method_6736("AppExporter", var2);
            } else {
               this.field_25467.method_6674().method_6736("AppExporter", var2 + File.separator);
            }

            this.method_27415();
            this.field_25511 = false;
         }
      }
   }

   // $VF: renamed from: d (java.awt.event.ActionEvent) void
   private void method_27421(ActionEvent var1) {
      this.field_25467.method_6674().method_6736("AppExporter", this.field_25467.method_6688().method_6541());
      this.method_27415();
   }

   // $VF: renamed from: a (java.awt.event.MouseEvent) void
   private void method_27422(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         if (!this.field_25477.getSelectedValue().toString().contains(".3da")) {
            this.field_25511 = true;
         }

         this.method_27417(null);
         if (this.field_25479.isEnabled()) {
            this.field_25479.doClick();
         }
      }
   }

   // $VF: renamed from: a (java.awt.event.KeyEvent) void
   private void method_27423(KeyEvent var1) {
      this.field_25479.setEnabled(true);
   }

   // $VF: renamed from: e (java.awt.event.ActionEvent) void
   private void method_27424(ActionEvent var1) {
      String var2 = this.field_25481.getText();
      var2 = new File(var2).getParent();
      if (var2 != null) {
         this.field_25467.method_6674().method_6736("AppExporter", var2 + File.separator);
         this.method_27415();
      }
   }

   // $VF: renamed from: c () void
   private void method_27425() {
      try {
         Exporter3DA var1 = new Exporter3DA(this.field_25473, this.field_25474);
         var1.method_6910(this.field_25512.isSelected());
         var1.method_6911(this.method_27426());
         var1.method_6892();
         class_4721.method_25033(
            class_2012.method_6617(), class_2003.method_6494("AppExporter.3") + " " + this.method_27426(), class_2003.method_6494("AppExporter.4"), 1
         );
      } catch (IOException var2) {
         var2.printStackTrace();
         class_4721.method_25033(
            class_2012.method_6617(),
            class_2003.method_6494("AppExporter.5") + class_2003.method_6494("productionSheet.ProductionFiler.81") + var2.getMessage(),
            class_2003.method_6494("AppExporter.4"),
            0
         );
      }
   }

   // $VF: renamed from: a () java.lang.String
   public String method_27426() {
      return this.method_27427() + this.method_27428();
   }

   // $VF: renamed from: b () java.lang.String
   public String method_27427() {
      return this.field_25481.getText();
   }

   // $VF: renamed from: c () java.lang.String
   public String method_27428() {
      String var1 = this.field_25484.getText();
      var1 = class_285.method_2390(var1, ".3da");
      return class_285.method_2387(var1, ".3da");
   }

   // $VF: renamed from: a (i.a) javax.swing.ImageIcon
   // $VF: synthetic method
   static ImageIcon method_27429(ExportDialog var0) {
      return var0.field_25470;
   }

   // $VF: renamed from: a (i.a) javax.swing.JTextField
   // $VF: synthetic method
   static JTextField method_27430(ExportDialog var0) {
      return var0.field_25481;
   }

   // $VF: renamed from: b (i.a) javax.swing.ImageIcon
   // $VF: synthetic method
   static ImageIcon method_27431(ExportDialog var0) {
      return var0.field_25469;
   }

   // $VF: renamed from: d () java.lang.String
   // $VF: synthetic method
   static String method_27432() {
      return field_25472;
   }

   // $VF: renamed from: c (i.a) javax.swing.ImageIcon
   // $VF: synthetic method
   static ImageIcon method_27433(ExportDialog var0) {
      return var0.field_25471;
   }

   // $VF: renamed from: a (i.a, java.awt.event.ActionEvent) void
   // $VF: synthetic method
   static void method_27434(ExportDialog var0, ActionEvent var1) {
      var0.method_27419(var1);
   }

   // $VF: renamed from: b (i.a, java.awt.event.ActionEvent) void
   // $VF: synthetic method
   static void method_27435(ExportDialog var0, ActionEvent var1) {
      var0.method_27420(var1);
   }

   // $VF: renamed from: a (i.a, java.awt.event.MouseEvent) void
   // $VF: synthetic method
   static void method_27436(ExportDialog var0, MouseEvent var1) {
      var0.method_27422(var1);
   }

   // $VF: renamed from: a (i.a, javax.swing.event.ListSelectionEvent) void
   // $VF: synthetic method
   static void method_27437(ExportDialog var0, ListSelectionEvent var1) {
      var0.method_27417(var1);
   }

   // $VF: renamed from: c (i.a, java.awt.event.ActionEvent) void
   // $VF: synthetic method
   static void method_27438(ExportDialog var0, ActionEvent var1) {
      var0.method_27418(var1);
   }

   // $VF: renamed from: d (i.a, java.awt.event.ActionEvent) void
   // $VF: synthetic method
   static void method_27439(ExportDialog var0, ActionEvent var1) {
      var0.method_27421(var1);
   }

   // $VF: renamed from: a (i.a, java.awt.event.KeyEvent) void
   // $VF: synthetic method
   static void method_27440(ExportDialog var0, KeyEvent var1) {
      var0.method_27423(var1);
   }

   // $VF: renamed from: e (i.a, java.awt.event.ActionEvent) void
   // $VF: synthetic method
   static void method_27441(ExportDialog var0, ActionEvent var1) {
      var0.method_27424(var1);
   }
}
