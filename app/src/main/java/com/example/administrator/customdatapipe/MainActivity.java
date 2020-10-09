package com.example.administrator.customdatapipe;

import android.pt.CustomdataPipe;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CustomdataPipe customdataPipe;
    private TextView tvReceiveData;
    private EditText etSentData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvReceiveData = (TextView) findViewById(R.id.tv_receive_data);
        etSentData = (EditText) findViewById(R.id.et_sent_data);

        customdataPipe = new CustomdataPipe();

    }

    public void onClick(View view) {
        int open = customdataPipe.open();
        Log.i("yongjun_open", open + "");

        customDataPipe();
    }

    @Override
    protected void onStop() {
        super.onStop();
        customdataPipe.close();
    }

    public void customDataPipe() {
        String str = null;
        if(etSentData.getText().toString().isEmpty())
        {
            str = "1E,00,10,0B,00,FF,26,01,02,03,04,05,FF,AA,01,17," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03," +
                    "1E,00,10,0B,00,FF,26,01,02,03";
        }else
        {
            str = etSentData.getText().toString();
        }
        String temp_str[] = str.split(",");
        byte[] out_dat = new byte[1024];

        byte[] intbyte_dat = new byte[temp_str.length];

        for (int i = 0; i < intbyte_dat.length; i++) {
            intbyte_dat[i] = (byte) Integer.parseInt(temp_str[i], 16);
        }

        Log.i("lhj",  "intbyte_dat.length=" + intbyte_dat.length);
        int ret = customdataPipe.sent(intbyte_dat, intbyte_dat.length, out_dat);

        if (ret >= 0) {
            String out_temp = "";
            for (int i = 0; i < ret; i++) {
                out_temp += String.format("%02x", (out_dat[i] & 0xff)) + " ";
            }
            tvReceiveData.setText("receive data :  " + out_temp);
            Toast.makeText(MainActivity.this, "read length:" + ret, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
        }
    }
}
