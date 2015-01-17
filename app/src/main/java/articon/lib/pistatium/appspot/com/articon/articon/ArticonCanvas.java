package articon.lib.pistatium.appspot.com.articon.articon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by kimihiro on 15/01/17.
 */
class ArticonCanvas {

    private Options mOptions;
    private Canvas mCanvas;
    private Bitmap mBitmap;

    public static Bitmap generate(Options options, String string) {
        ArticonCanvas ac = new ArticonCanvas(options, string);
        ac.initializeCanvas();
        ac.setBoarder();
        ac.setBackground();
        ac.setSmallBubble();
        ac.setLargeBubble();
        ac.setHighlight();
        return ac.mBitmap;
    }

    private ArticonCanvas(Options options, String string) {
        this.mOptions = options;
    }
    private void initializeCanvas() {
        int width = this.mOptions.canvasWidth;
        int height = this.mOptions.canvasHeight;
        L.error("" + width + " :" + height);
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
    }
    protected void setBoarder() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int startX = mOptions.paddingSize;
        int startY = mOptions.paddingSize;
        int endX = mOptions.canvasWidth - mOptions.paddingSize;
        int endY = mOptions.canvasHeight - mOptions.paddingSize;
        RectF rectf = new RectF(startX, startY, endX, endY);
        paint.setStrokeWidth(mOptions.borderWidth);
        mCanvas.drawRoundRect(rectf, mOptions.roundSize, mOptions.roundSize, paint);
    }
    protected void setBackground() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GRAY);
        int startX = mOptions.paddingSize;
        int startY = mOptions.paddingSize;
        int endX = mOptions.canvasWidth - mOptions.paddingSize;
        int endY = mOptions.canvasHeight - mOptions.paddingSize;
        RectF rectf = new RectF(startX, startY, endX, endY);
        paint.setStrokeWidth(mOptions.borderWidth);
        mCanvas.drawRoundRect(rectf, mOptions.roundSize, mOptions.roundSize, paint);
    }
    protected void setSmallBubble() {

    }
    protected void setLargeBubble() {

    }
    protected void setHighlight() {

    }
}
