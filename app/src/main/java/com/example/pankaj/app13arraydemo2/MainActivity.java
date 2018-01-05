package com.example.pankaj.app13arraydemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtIndex = findViewById(R.id.txtIndex);
        TextView txtValue = findViewById(R.id.txtValue);

        String oldtxtIndexValue;
        String oldtxtValueValue;

        final int LENGHT_OF_ARRAY = 15;
        float [] floatNumberArray = new  float[LENGHT_OF_ARRAY];

        for (int index = 0;index < floatNumberArray.length; index++){

            floatNumberArray[index] = 5 + 3 * index;
        }

        for (int index = 0; index < floatNumberArray.length;index++){

            oldtxtIndexValue = txtIndex.getText().toString();
            oldtxtValueValue = txtValue.getText().toString();

            txtIndex.setText(oldtxtIndexValue + index + "\n");
            txtValue.setText(oldtxtValueValue + floatNumberArray[index] + "\n");
        }
    }
}
