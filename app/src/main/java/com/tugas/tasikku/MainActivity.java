package com.tugas.tasikku;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PindahInfoDaerah(View view) {
        Intent intent = new Intent(MainActivity.this, DaerahActivity.class);
        startActivity(intent);
    }

    public void PindahInfoWisata(View view) {
        Intent intent = new Intent(MainActivity.this, WisataActivity.class);
        startActivity(intent);
    }

    public void PindahInfoMakanan(View view) {
        Intent intent = new Intent(MainActivity.this, MakananActivity.class);
        startActivity(intent);
    }

    public void PindainInfoAplikasi(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}