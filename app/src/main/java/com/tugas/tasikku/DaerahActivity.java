package com.tugas.tasikku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DaerahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daerah);

        WebView webView = (WebView) findViewById(R.id.webviewdaerah);

        String text = "Tasikmalaya adalah sebuah kota dan kabupaten di Priangan Timur, Provinsi Jawa Barat. Terletak pada 106 km sebelah timur kota Bandung dan berada di daerah pegunungan." +
                "<br><br>Selain dikenal sebagai kota santri. Tasikmalaya juga merupakan kota dengan berbagai potensi wisata dari mulai wisata budaya hingga wisata alam yang sangat cocok dan menarik untuk di kunjungi, untuk wisata alam sendiri, di Tasikmalaya terdapat banyak tempat yang sangat indah, mulai dari pantai, air terjun dan pegunungan." +
                "<br><br><br>Menarik Bukan?? Tunggu Apa Lagi! Yuk Kita (Ameng) Ke Tasikmalaya!!";

        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
    }
}
