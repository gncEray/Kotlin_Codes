package com.chucky.storingData

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences : SharedPreferences //burda tanımlandı
    val ageFromPreferences : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = this.getSharedPreferences("com.chucky.storingdata", MODE_PRIVATE) //burda initialize edildi
        //MODE_PRIVATE means oluşturulan dosya yalnızca kendi uygulaması içinden çağrılabiliyor
        ageFromPreferences = sharedPreferences.getInt("age", -1) //ilki anahtar kelime ikincisi default değer
        //şimdi bu, eğer daha önceden eklenmişse "age" keywordü ile onu çağırıyor
        //eğer orada bir değer yoksa -1 olarak alıyor.

        if(ageFromPreferences == -1) {
            textView.text = "Your age: "
        }
        else {
            textView.text = "Your age: $ageFromPreferences"
        }

    } //onCreate ends


    fun save(view : View) {

        val myAge = editText.text.toString().toIntOrNull() //sayıyı emülatörden alıyor burda

        if(myAge != null) {
            textView.text = "Your age: $myAge"
            sharedPreferences.edit().putInt("age", myAge).apply() //burada kaydediyor küçük bir veritabanına
            //oraya kaydediyor ve "age" keywordünü kullanıyor. Yukardaki get de burada put edileni çağırıyor
        }
    } //save ends
    
    fun delete(view : View) {
        ageFromPreferences = sharedPreferences.getInt(“age”, -1)

        if(ageFromPreferences != -1) {
            sharedPreferences.edit().remove("age").apply()
            textView.text = "Your Age: "
        }

    } //delete ends

} //MainActivity ends
