package de.adem.simpleactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class GeneratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        generatorIntent.putExtra("addSpecialCharacters", cbSpecialCharacter.isChecked());
//        generatorIntent.putExtra("addUpperCase", cbUpperCase.isChecked());
//        generatorIntent.putExtra("addLowerCase", cbLowerCase.isChecked());
//        generatorIntent.putExtra("addNumeric", cbNumeric.isChecked());

        boolean addSpecialCharacters = getIntent().getBooleanExtra("addSpecialCharacters", false);

        Snackbar.make(findViewById(R.id.generator_activity), "addSpecialCharacters: " + String.valueOf(addSpecialCharacters), Snackbar.LENGTH_LONG).show();
    }

}
