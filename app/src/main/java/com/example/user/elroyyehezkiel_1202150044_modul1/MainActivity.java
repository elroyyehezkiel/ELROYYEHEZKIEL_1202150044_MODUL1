package com.example.user.elroyyehezkiel_1202150044_modul1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText UbahMenu;
    private EditText Porsi;
    private Button Eatbus;
    private Button Abnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UbahMenu = findViewById(R.id.Pesanan);
        Porsi = findViewById(R.id.JumlahPorsi);
        Eatbus = findViewById(R.id.button_eatbus);
        Abnormal = findViewById(R.id.button_abnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = UbahMenu.getText().toString();
        String jlmporsi = Porsi.getText().toString();
        String RM = Eatbus.getText().toString();


        intent.putExtra("Food", Makanan);
        intent.putExtra("jlmporsi", jlmporsi);
        intent.putExtra("RM", RM);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String Makanan = UbahMenu.getText().toString();
        String jlmporsi = Porsi.getText().toString();
        String RM = Abnormal.getText().toString();


        intent.putExtra("Food", Makanan);
        intent.putExtra("jlmporsi", jlmporsi);
        intent.putExtra("RM", RM);

        startActivity(intent);
    }
}