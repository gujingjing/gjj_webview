package webview.demo.gjj.gjj_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_tie,ben_video;
    private WebView webview;
    private String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tie.setOnClickListener(this);
        ben_video.setOnClickListener(this);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setPluginState(WebSettings.PluginState.ON);
        webview.setWebChromeClient(new WebChromeClient());
        webview.getSettings().setJavaScriptEnabled(true); //Support JavaScript
        webview.getSettings().setSupportZoom(true); //Zoom Control on web (You don't need this if ROM supports Multi-Touch
        webview.getSettings().setBuiltInZoomControls(true); //Enable Multitouch if supported by ROM

        url="https://www.ibesteeth.com/community-react/?from=singlemessage&isappinstalled=1#/articledetail/1085?_k=yvtsut";
        webview.loadUrl(url);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_tie:
                url="http://baidu.ku6.com/kan/a90LO?fr=v.baidu.com/&fr=ps_ala11";
                webview.loadUrl(url);
                break;
            case R.id.ben_video:
                url="http://www.meipai.com/media/726519362";
                webview.loadUrl(url);
                break;
        }
    }
}
