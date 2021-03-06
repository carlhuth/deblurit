package tk.standy66.deblurit.tools;

import android.os.Environment;
import android.util.Log;

public class Defaults {
    public static int getMaxOutputSize() {
        float maxMemory = Utils.getMaxMemory();
        int ans = 768;
        Log.i("Defaults", String.format("Total memory allowed to use: %fMB", maxMemory));
        if (maxMemory >= 16)
            ans = 1024;
        if (maxMemory >= 64)
            ans = 2048;
        if (maxMemory >= 192)
            ans = 4096;
        if (maxMemory >= 256)
            ans = 8192;
        return ans;
    }

    public static String getSavePath() {
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
        path += "/DeblurIt";
        return path;
    }

    public static String getFormat() {
        return "JPEG";
    }

    public static String getMode() {
        return "Ask";
    }


}
