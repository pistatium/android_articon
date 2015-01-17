package articon.lib.pistatium.appspot.com.articon.articon;

/**
 * Created by kimihiro on 15/01/17.
 */
public class Options {

    // Initial values
    private static final int CANVAS_WIDTH = 512;
    private static final int CANVAS_HEIGHT = 512;
    private static final int PADDING_SIZE = 6;
    private static final int SHADOW_SIZE = 3;
    private static final int ROUND_SIZE = 50;
    private static final int BORDER_WIDTH = 3;

    int canvasWidth = CANVAS_WIDTH;
    int canvasHeight = CANVAS_HEIGHT;
    int paddingSize = PADDING_SIZE;
    int shadowSize = SHADOW_SIZE;
    int roundSize = ROUND_SIZE;
    int borderWidth = BORDER_WIDTH;

    Options() {}

    public static Builder create() {
        return new Builder();
    }

    public static class Builder {
        final Options mOptions = new Options();

        public Builder setCanvasWidth(int width) {
            if (width <= 0) {
                L.error("Invalid canvasWidth");
                return this;
            }
            mOptions.canvasWidth = width;
            return this;
        }
        public Builder setCanvasHeight(int height) {
            if (height <= 0) {
                L.error("Invalid canvasHeight");
                return this;
            }
            mOptions.canvasHeight = height;
            return this;
        }
        public Builder paddingSize(int size) {
            if (size <= 0) {
                L.error("Invalid paddingSize");
                return this;
            }
            mOptions.paddingSize = size;
            return this;
        }
        public Builder setShadowSize(int size) {
            if (size <= 0) {
                L.error("Invalid shadowSize");
                return this;
            }
            mOptions.shadowSize = size;
            return this;
        }
        public Builder setRoundSize(int size) {
            if (size <= 0) {
                L.error("Invalid roundSize");
                return this;
            }
            mOptions.roundSize = size;
            return this;
        }
        public Builder setBorderWidth(int width) {
            if (width <= 0) {
                L.error("Invalid borderWidth");
                return this;
            }
            mOptions.borderWidth = width;
            return this;
        }
        public Options build() throws InvalidParameterException{
            if (mOptions.canvasWidth < mOptions.paddingSize * 2) {
                throw new InvalidParameterException("CanvasWidth must be greater than padding");
            }
            if (mOptions.canvasHeight < mOptions.paddingSize * 2) {
                throw new InvalidParameterException("CanvasHeight must be greater than padding");
            }
            return mOptions;
        }
    }

    public static class InvalidParameterException extends Exception {
        public InvalidParameterException(String str) {
            super(str);
        }
    }
}
