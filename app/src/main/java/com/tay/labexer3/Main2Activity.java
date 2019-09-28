package com.tay.labexer3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {
    CheckBox checkBox, checkbox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("SUBJECTS TAKEN");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FileInputStream reader = null;
        String str = "";
        try {
            reader = openFileInput("data.txt");
            int token;
            while((token = reader.read()) != -1) {
                str = str + (char)token;
            }
            reader.close();
            try {
                String[] x = str.split("_");
                ((CheckBox) (findViewById(R.id.checkBox))).setText((x[0]));
                ((CheckBox) (findViewById(R.id.checkBox2))).setText((x[1]));
                ((CheckBox) (findViewById(R.id.checkBox3))).setText((x[2]));
                ((CheckBox) (findViewById(R.id.checkBox4))).setText((x[3]));
                ((CheckBox) (findViewById(R.id.checkBox5))).setText((x[4]));
                ((CheckBox) (findViewById(R.id.checkBox6))).setText((x[5]));
                ((CheckBox) (findViewById(R.id.checkBox7))).setText((x[6]));
                ((CheckBox) (findViewById(R.id.checkBox8))).setText((x[7]));
            }catch (Exception e) {
                Log.d("error", "subject not found...");
            }
        } catch (FileNotFoundException e) {
            Log.d("error", "file not found...");
        } catch (IOException e) {
            Log.d("error", "IO error...");
        }
    }

    public void confirm (View v){
        if (checkBox.isChecked()) ||
    }
}
