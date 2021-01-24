package threeri.com.a3riinstitute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rajkumar ji on 3/8/2017.
 */

public class User_Activity extends Activity {
    Button buttonuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);
        buttonuser=(Button)findViewById(R.id.User_Button_submit);
        buttonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User_Activity.this,Welcome_User_Activity.class);
                startActivity(intent);
            }
        });
    }
}
