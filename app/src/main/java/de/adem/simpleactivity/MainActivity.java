package de.adem.simpleactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View view){
        Intent generatorIntent = new Intent(this, GeneratorActivity.class);

        CheckBox cbSpecialCharacter= (CheckBox) findViewById(R.id.cbSpecialCharacter);
        CheckBox cbUpperCase= (CheckBox) findViewById(R.id.cbUpperCase);
        CheckBox cbLowerCase= (CheckBox) findViewById(R.id.cbLowerCase);
        CheckBox cbNumeric= (CheckBox) findViewById(R.id.cbNumeric);

        generatorIntent.putExtra("addSpecialCharacters", cbSpecialCharacter.isChecked());
        generatorIntent.putExtra("addUpperCase", cbUpperCase.isChecked());
        generatorIntent.putExtra("addLowerCase", cbLowerCase.isChecked());
        generatorIntent.putExtra("addNumeric", cbNumeric.isChecked());
        startActivity(generatorIntent);
    }
}
