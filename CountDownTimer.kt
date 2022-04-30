package com.chucky.countDownTimer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Countdown timer

        object : CountDownTimer(10000:1000) { //here, it takes as millisecond so 10000 means 10; 1000 means 1 second
        override fun onFinish() { //en son ne yapman gerektiğini soruyor
            textView.text = "Countdown has ended!"
        }
            override fun onTick(millisUntilFinished: Long) { //here, millisUntilFinished kalan zamanı söylüyor
                //ve her bir adımda yapılacak işlemi
                textView.text = "Last ${millisUntilFinished/1000} second"
            } //onTick ends

        }.start() //bunu çağırmayı unutma -!- // countdown ends

    } //onCreate ends

} //MainActivity ends
