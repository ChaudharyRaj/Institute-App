package threeri.com.a3riinstitute;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by rajkumar ji on 3/8/2017.
 */

public class Admin_Activity extends Activity {
    Button buttonAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_layout);
        buttonAdmin=(Button) findViewById(R.id.Admin_Button);
        buttonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admin_Activity.this,Welcome_Admin_Activity.class);
                startActivity(intent);
            }
        });
    }
}
