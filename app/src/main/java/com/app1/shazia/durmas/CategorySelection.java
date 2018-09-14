package com.app1.shazia.durmas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CategorySelection extends AppCompatActivity {
    Button backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        backButton = (Button)findViewById( R.id.button3 ) ;

        setContentView( R.layout.activity_category_selection );

        backButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(CategorySelection.this, categoryActivity.class );

                startActivity( backIntent );

                Log.d("Durmas","Back Intent started");
            }
        } );


            }


}
