package com.chucky.alertmessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_LONG).show() //ilki context, ikinci mesaj, üçüncü mesajın uzunluğu
    } //onCreate ends

    fun save(view : View) {
        val alert = AlertDialog.Builder(this) //alert isimli değişkene uyarı fonksiyonu atıyoruz
        alert.setTitle("Save") //alert mesajında gösterilecek metnin başlığı
        alert.setMessage("Are You Sure?") //metnin alttaki kısmı, içeriği

        //positive button ve tıklanıldığında yapacağı işlem
        alert.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }

        //negative button ve tıklanıldığında yapacağı işlem
        alert.setNegativeButton("No") { dialog, which ->
            Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }

        alert.show()
    } //fun save ends
} //MainActivity ends
