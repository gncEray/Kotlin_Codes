package com.chucky.gotonextactivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    } // onCreate ends

    fun next(view : View) {
        val intent = Intent(applicationContext, NextActivity::class.java) //ilki context: android projesi içinde ne olup ne bittiğini anlamak için oluşturulan bir yapı her şey birbirinden context sayesinde haberdar oluyor
        //ikinci ise gitmek istediği sınıf
        startActivity(intent) //aktiviteyi başlat
    }

} // MainActivity ends
