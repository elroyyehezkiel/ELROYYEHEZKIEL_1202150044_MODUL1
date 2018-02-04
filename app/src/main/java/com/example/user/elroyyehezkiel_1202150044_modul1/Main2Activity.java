package com.example.user.elroyyehezkiel_1202150044_modul1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Food = intent.getStringExtra("Food");
        String jlmporsi = intent.getStringExtra("jlmporsi");
        String Rm = intent.getStringExtra("RM");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Porsi = findViewById(R.id.Jumlah);
        TextView Reatbos = findViewById(R.id.RumahMakan2);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int a = Integer.parseInt(jlmporsi);

        int HargaEatbus = 50000 * a;
        String b = String.valueOf(HargaEatbus);

        int c = Integer.parseInt(jlmporsi);
        int HargaAbnormal = 30000 * c;
        String d = String.valueOf(HargaAbnormal);


        if (Rm.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Food);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(b);
                Toast.makeText(this, "cari Duit dulu lahh", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Food);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(b);
                Toast.makeText(this, "datang lagi ya nanti", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Food);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(d);
                Toast.makeText(this, "Ngutang itu malu cari uang dulu lahh", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Food);
                Porsi.setText(jlmporsi);
                Reatbos.setText(Rm);
                Hitung.setText(d);
                Toast.makeText(this, "datang lagi ya", Toast.LENGTH_LONG).show();
            }
        }

    }

}