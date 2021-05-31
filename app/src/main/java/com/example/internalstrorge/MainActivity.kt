package com.example.internalstrorge

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
import java.lang.Exception
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    val enter = enter_text.text.toString().trim()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val file = "hello file"

        // this button allow the user to sava the data inside the database(internal )
        btn_sava.setOnClickListener{
            val fileOutputStream : FileOutputStream

            try {
           val Fout:FileOutputStream = openFileOutput(file , Context.MODE_PRIVATE)
             Fout.write(enter_text.text.toString().toByteArray(Charsets.UTF_8))
                Fout.close()
                Toast.makeText(this , " file saved " , Toast.LENGTH_LONG).show()
            }catch (e:FileNotFoundException){
                e.printStackTrace()
            }catch (e :IOException){
                e.printStackTrace()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }

        btn_loasd.setOnClickListener{
           try {
               val fin = openFileInput(file)
               var temp = " "
               var bytes: ByteArray = fin.readBytes()

               for (bytes in bytes){
                   temp+= bytes.toChar()
               }
               txt_dislpay.setText(file)
               Toast.makeText(this , "File Read " , Toast.LENGTH_LONG).show()
           }catch (e : Exception){
               e.printStackTrace()
           }
        }
    }
}
