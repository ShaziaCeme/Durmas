package com.app1.shazia.durmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class categoryActivity extends AppCompatActivity {


    Button facebookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_category );
        facebookButton = (Button) findViewById( R.id.button);
        facebookButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(categoryActivity.this,CategorySelection.class );
                Log.d("Durmas","Login Intent started");
                startActivity( loginIntent );

            }
        } );

    }
}
