package com.example.webbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView
    lateinit var button: Button
    lateinit var site: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        verticalLayout{
            linearLayout{
                site = editText().lparams(weight = 1f)
                button = button("Press Me!")
            }
            
            webView = webView{
               webViewClient = WebViewClient()
            }.lparams(width = matchParent, height = matchParent)
        }

        button.setOnClickListener { val address = site.text.toString()
        webView.loadUrl(address)}
    }

    private fun webView(s: () -> Unit): WebView {

    }

    private fun editText(): EditText {

    }

    private fun linearLayout(function: () -> Unit) {

    }

    private fun verticalLayout(function: () -> Unit) {

    }
}

private fun EditText.lparams(weight: Float): Float = weight

private operator fun Button.invoke(s: String): Button {

}
