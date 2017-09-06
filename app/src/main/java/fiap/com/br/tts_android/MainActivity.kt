package fiap.com.br.tts_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tts: TextToSpeech


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        tts = TextToSpeech(this) {
            tts.language = Locale("pt-BR")
        }

        }

        fun soltaSom(v: View){
            tts.speak(edtTexto.toString(), TextToSpeech.QUEUE_FLUSH, null)
        }



    override fun onDestroy() {
        super.onDestroy()
        tts.shutdown();
    }
}
