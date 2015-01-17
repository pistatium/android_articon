package articon.lib.pistatium.appspot.com.articon;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import articon.lib.pistatium.appspot.com.articon.articon.Articon;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Articon articon = new Articon();
        Bitmap bitmap = articon.generate("test");
        ImageView articonView = (ImageView)findViewById(R.id.view_articon);
        articonView.setImageBitmap(bitmap);

    }
}
