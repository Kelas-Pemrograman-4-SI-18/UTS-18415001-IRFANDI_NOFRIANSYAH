package com.example.uts_irfandi_18415001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDatadiri,txthasilhitung,txtni;
    EditText edtNpm,edtNama,edtMatakuliah,edtTugas,edtUts,edtUas;
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtDatadiri = (TextView) findViewById(R.id.txtna);
        txthasilhitung = (TextView) findViewById(R.id.txtno);
        txtni = (TextView)  findViewById(R.id.txtni);



        edtNpm = (EditText) findViewById(R.id.edtnpm);
        edtNama = (EditText) findViewById(R.id.edtnama);
        edtMatakuliah = (EditText) findViewById(R.id.edtmatakuliah);
        edtTugas = (EditText) findViewById(R.id.edttugas);
        edtUts = (EditText) findViewById(R.id.edtuts);
        edtUas = (EditText) findViewById(R.id.edtuas);

        btnHitung = (Button) findViewById(R.id.btnhitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNPM = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strMatakuliah = edtMatakuliah.getText().toString();

                int Tugas = Integer.parseInt(edtTugas.getText().toString());
                int UTS = Integer.parseInt(edtUts.getText().toString());
                int UAS = Integer.parseInt(edtUas.getText().toString());




                double NA = (Tugas * 0.3) + (UTS * 0.3) + (UAS * 0.4);
                if(NA > 80  && NA  <= 100  ){
                    txtni.setText("GRADE A");
                }else if (NA > 70 &&  NA <= 80){
                    txtni.setText("GRADE B");
                }else if(NA >= 60 && NA <= 70){
                    txtni.setText("GRADE C");
                }else if(NA >=50 && NA  <= 60){
                    txtni.setText("GRADE D");
                }else {
                    txtni.setText("GRADE E");
                }


                txtDatadiri.setText(strNPM+"\n"+strNama+"\n"+strMatakuliah);
                txthasilhitung.setText(String.valueOf(NA));

            }
        });

    }
}