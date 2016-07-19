package com.samplea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_add;
    private EditText et_number;
    private int[] num = new int[5];
    private int sum, count = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_add = (Button) findViewById(R.id.btn_add);
        et_number = (EditText) findViewById(R.id.et_number);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count > 5) {
                    btn_add.setText(sum + "");
                    et_number.setText("Find sum on button");
                    et_number.setFocusable(false);
                    return;
                } else {
                    count++;
                    sum = sum + Integer.parseInt(et_number.getText().toString());
                    et_number.setText("");
                    et_number.setHint("Enter number " + count);
                }
            }
        });

    }
}
