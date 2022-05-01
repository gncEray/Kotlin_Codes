package com.chucky.timekeeper

//runnable
class MainActivity : AppCompatActivity() {

    var number = 0
    var runnable : Runnable = Runnable{ } //runnable oluşturma
    var handler : Handler = Handler(Looper.getMainLooper()) //handler oluşturma

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    } //onCreate ends

    fun start(view : View) {
        number = 0

        runnable = object : Runnable { //soyut sınıf oldugu için bu şekilde initialize ediliyor
            override fun run() {
                number = number + 1
                textView.text = "Time: $number"

                handler.postDelayed(this, 1000) //this burda Runnable'a referans veriyor, 1000 kısmında ise kaç saniye delay edileceğini soruyor
            } //override fun run ends
        } //runnable ends

        handler.post(runnable) //runnable'ı başlatan bu
        button.isEnabled = false
    } //start ends
    
    fun stop(view : View) {
        handler.removeCallbacks(runnable) //geri çağırmayı iptal ediyor üstteki runnable
        number = 0
        textView.text = "Time: 0"

        button.isEnabled = true

    } //stop ends

} //MainActivity ends
