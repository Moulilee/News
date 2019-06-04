package e.hp.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class new4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new4);
        final String url="file:///android_asset/art4.html";
        final WebView webView=(WebView) this.findViewById(R.id.wb4);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
