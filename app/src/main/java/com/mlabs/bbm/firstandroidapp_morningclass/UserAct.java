package com.mlabs.bbm.firstandroidapp_morningclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class UserAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final Button onTouchBtn = (Button)findViewById(R.id.onNextbtn);

        onTouchBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
                        public void onClick(View view) {

                Intent intent = new Intent(UserAct.this, OnTouchActivity.class);
                startActivity(intent);
            }
        });
        }

    @Override
    public void onBackPressed(){
        Intent back = new Intent(Intent.ACTION_MAIN);
        back.addCategory(Intent.CATEGORY_HOME);
        back.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(back);

    }
}

