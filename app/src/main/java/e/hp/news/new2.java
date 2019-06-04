package e.hp.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class new2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new2);
        final String url="file:///android_asset/art2.html";
        final WebView webView=(WebView) this.findViewById(R.id.wb2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
