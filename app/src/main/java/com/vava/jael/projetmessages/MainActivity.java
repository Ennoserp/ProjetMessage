package com.vava.jael.projetmessages;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnvoyer=(Button) findViewById(R.id.send_btn);
        final EditText numero = (EditText) findViewById(R.id.numero_input);
        final EditText message = (EditText) findViewById(R.id.texte_input);
        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @SuppressWarnings("deprecation")
                public void onClick(View v){
                    String num = numero.getText().toString();
                    String msg = message.getText().toString();
                    if (num.length()>=4 && msg.length()>0) {
                        SmsManager.getDefault().sendTextMessage(num, null, msg, null, null);
                        numero.setText("");
                        message.setText("");
                    }else{
                        Toast.makeText(MainActivity.this, "BUG", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }
}
