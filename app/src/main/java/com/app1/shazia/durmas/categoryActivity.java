package com.app1.shazia.durmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class categoryActivity extends AppCompatActivity {



    Button facebookButton;
    Button gmailButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_category );


        gmailButton = (Button) findViewById( R.id.button2 );
        facebookButton = (Button)findViewById( R.id.button4 );



gmailButton.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent catIntent = new Intent( categoryActivity.this,CategorySelection.class );
        Log.d( "Durmas", "Gmail intent" );
        startActivity( catIntent );
    }
} );


facebookButton.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent facebookIntent = new Intent( categoryActivity.this, CategorySelection.class );
        startActivity( facebookIntent );
        Log.d( "Durmas","Facebook Intent" );

    }
} );

    }
}
