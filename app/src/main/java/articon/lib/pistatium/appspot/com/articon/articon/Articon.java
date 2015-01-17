package articon.lib.pistatium.appspot.com.articon.articon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by kimihiro on 15/01/17.
 */
public class Articon {

    private Options mOptions;

    public Articon() {
        setDefaultOptions();
    }

    public void setOptions(Options options) {
        this.mOptions = options;
    }

    public Bitmap generate(String string) {
        Bitmap bitmap = generateCanvas(string);
        return bitmap;
    }


    protected Bitmap generateCanvas(String string) {
        return ArticonCanvas.generate(mOptions, string);
    }



    protected void setDefaultOptions() {
        Options.Builder builder = Options.create();
        try {
            this.mOptions = builder.build();
        } catch (Options.InvalidParameterException e) {
            e.printStackTrace();
        }
    }
}
