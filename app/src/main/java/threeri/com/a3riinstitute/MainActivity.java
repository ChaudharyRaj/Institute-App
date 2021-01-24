package threeri.com.a3riinstitute;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler h=new Handler();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Login_Activity.class);
                startActivity(i);
            }
        };
        h.postDelayed(r,3000);
    }
}
