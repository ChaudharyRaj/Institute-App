package threeri.com.a3riinstitute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rajkumar ji on 3/8/2017.
 */

public class Login_Activity extends Activity {
    Button User_Button,Admin_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_view);

        User_Button = (Button) findViewById(R.id.User_Button);
        Admin_Button =(Button) findViewById(R.id.Admin_Button);


        User_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_Activity.this,User_Activity.class);
                startActivity(intent);
            }
        });

        Admin_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Login_Activity.this,Admin_Activity.class);
                startActivity(i);
            }
        });

    }
}
