package ak;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

// $VF: renamed from: ak.af
public class UtilityHelper {
    // $VF: renamed from: a (java.lang.String) boolean
    public static boolean isNull(String str) {
       return str == null;
    }

    // $VF: renamed from: b (java.lang.String) boolean
    public static boolean isNullOrEmpty(String str) {
       return str == null ? true : str.length() == 0;
    }

    // $VF: renamed from: a (java.util.Vector) boolean
    public static boolean isNullOrEmptyVector(Vector vector) {
       if (vector == null) {
          return true;
       } else if (vector.isEmpty()) {
          return true;
       } else {
          for (Object item : vector) {
             if (item != null) {
                return false;
             }
          }

          return true;
       }
    }

    // $VF: renamed from: a (java.lang.String, java.lang.String) boolean
    public static boolean equalsIgnoreCase(String str1, String str2) {
       if (str1 == null && str2 == null) {
          return true;
       } else if (str1 != null && str2 == null) {
          return false;
       } else {
          return str1 == null && str2 != null ? false : str1.equalsIgnoreCase(str2);
       }
    }

    // $VF: renamed from: a (java.awt.Color, java.awt.Color) boolean
    public static boolean colorsEqual(Color color1, Color color2) {
       if (color1 == null && color2 == null) {
          return true;
       } else if (color1 != null && color2 == null) {
          return false;
       } else {
          return color1 == null && color2 != null ? false : color1.equals(color2);
       }
    }

    // $VF: renamed from: a (java.lang.String, boolean) int
    public static int calculateStringLength(String str, boolean compact) {
       if (compact) {
          return str == null ? 1 : Math.min(str.getBytes("UTF-8").length, 127) + 1;
       } else {
          return str == null ? 2 : str.getBytes("UTF-8").length + 2;
       }
    }

    // $VF: renamed from: a (java.lang.String) int
    public static int calculateUTF8StringLength(String str) {
       return calculateStringLength(str, false);
    }

    // $VF: renamed from: a () boolean
    public static boolean isMacOS() {
       return System.getProperty("os.name").toLowerCase().indexOf("mac") != -1;
    }

    // $VF: renamed from: b () boolean
    public static boolean isMacOSLeopard() {
       return !isMacOS() ? false : System.getProperty("os.version").startsWith("10.5");
    }

    // $VF: renamed from: a (int) boolean
    public static boolean isArrowKey(int keyCode) {
       return keyCode == 37 || keyCode == 39 || keyCode == 38 || keyCode == 40;
    }

    // $VF: renamed from: a (long, int) byte[]
    public static byte[] longToByteArray(long value, int length) {
       byte[] result = new byte[length];

       for (int i = 0; i < length; i++) {
          result[length - 1 - i] = new Long(value % 256L).byteValue();
          value >>= 8;
       }

       return result;
    }

    // $VF: renamed from: a (int) byte[]
    public static byte[] intToByteArray(int value) {
       return longToByteArray(value, 4);
    }

    // $VF: renamed from: a (short) byte[]
    public static byte[] shortToByteArray(short value) {
       return longToByteArray(value, 2);
    }

    // $VF: renamed from: a (java.awt.Frame, javax.swing.JDialog) void
    public static void centerDialogOnFrame(Frame frame, JDialog dialog) {
       Dimension frameDim = frame.getSize();
       Dimension dialogDim = dialog.getSize();
       if (dialogDim.height > frameDim.height) {
          dialogDim.height = frameDim.height;
       }

       if (dialogDim.width > frameDim.width) {
          dialogDim.width = frameDim.width;
       }

       dialog.setLocation(new Point(frame.getX() + (frameDim.width - dialogDim.width) / 2, frame.getY() + (frameDim.height - dialogDim.height) / 2));
    }

    // $VF: renamed from: a (java.awt.Point, java.awt.Container) java.awt.Point
    public static Point convertPointToScreen(Point point, Container container) {
       Point screenPoint = new Point(point);
       SwingUtilities.convertPointToScreen(screenPoint, container);
       return screenPoint;
    }

    // $VF: renamed from: b (int) boolean
    public static boolean isBitSet(int value) {
       return (value & 1) == 1;
    }

    // $VF: renamed from: a (javax.swing.JRootPane, javax.swing.JButton, javax.swing.JButton) void
    public static void configureRootPaneButtons(JRootPane rootPane, JButton defaultButton, JButton cancelButton) {
       if (defaultButton != null) {
          rootPane.setDefaultButton(defaultButton);
       }

       if (cancelButton != null) {
          KeyStroke escapeStroke = KeyStroke.getKeyStroke("ESCAPE");
          rootPane.getInputMap(2).remove(escapeStroke);
          rootPane.getActionMap().remove("ESCAPE");
          KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(27, 0, false);
          class_4528 escapeAction = new class_4528(cancelButton);
          rootPane.getInputMap(2).put(escapeKeyStroke, "ESCAPE");
          rootPane.getActionMap().put("ESCAPE", escapeAction);
       }
    }

    // $VF: renamed from: a (double) java.lang.String
    public static String formatTime(double seconds) {
       int totalSeconds = (int)Math.round(seconds);
       int minutes = totalSeconds / 60;
       int secs = totalSeconds % 60;
       return minutes + ":" + (secs < 10 ? "0" : "") + secs;
    }

    // $VF: renamed from: a (float, int) float
    public static float roundFloat(float value, int scale) {
       BigDecimal decimal = new BigDecimal(Float.toString(value));
       decimal = decimal.setScale(scale, 4);
       return decimal.floatValue();
    }

    // $VF: renamed from: a (double, int) double
    public static double roundDouble(double value, int scale) {
       BigDecimal decimal = new BigDecimal(Double.toString(value));
       decimal = decimal.setScale(scale, 4);
       return decimal.doubleValue();
    }

    // $VF: renamed from: a (byte[]) java.lang.String
    public static String byteArrayToHexString(byte[] bytes) {
       char[] hexChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
       char[] result = new char[bytes.length * 2];

       for (int i = 0; i < bytes.length; i++) {
          int byteValue = bytes[i] & 255;
          result[i * 2] = hexChars[byteValue / 16];
          result[i * 2 + 1] = hexChars[byteValue % 16];
       }

       return new String(result);
    }
}
