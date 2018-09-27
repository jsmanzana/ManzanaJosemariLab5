package josemari.manzana.com.manzanajosemarilab5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);

    }

    public void process(View v){
        Intent i =null, chooser=null;
        if(v.getId() == R.id.btnActivity1){
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.0610410, 120.991841"));
            chooser = Intent.createChooser(i, "Choose a Map app");
            startActivity(chooser);
        }
    }
}
