package cn.bluemobi.dylan.step.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.bluemobi.dylan.step.R;


public class User extends AppCompatActivity {
    private Button mReturnButton;
    private Button enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_success_login);
        setContentView(R.layout.user);
        mReturnButton = (Button)findViewById(R.id.returnback);
        enter =(Button)findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(User.this ,MainActivity.class);
                startActivity(i);
            }
        });
    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(User.this,Login.class) ;
        startActivity(intent3);
        finish();

    }


}
