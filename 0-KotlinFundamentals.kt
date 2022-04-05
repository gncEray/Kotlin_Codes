package com.chucky.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Defining
        var myInteger: Int

        // Initialize
        myInteger = 10
        myInteger = 20
        val a: Int = 23

        //double and float
        val pi = 3.14
        println(pi * 2.0)
        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge: Double
        myAge = 23.0
        println(myAge / 2)


        //String
        val myString = "gnc Eray"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname
        println(fullname)

        val larsName: String = "Lars"
        println(myString.capitalize())


        //Boolean
        var myBoolean: Boolean = true
        myBoolean = false
        var isAlive = true


        //Conversion
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)


        //Arrays
        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1, "Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1, 2, 3, 4, 5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0, 2.0, 3.0)

        val mixedArray = arrayOf("Eray", 5)
        println(mixedArray[0])
        println(mixedArray[1])


        //List - ArrayList
        val myMusician = arrayListOf<String>("James", "Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0, "Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Eray")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        //Set
        val myExampleArray = arrayOf(1, 1, 2, 3, 4)

        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1, 1, 2, 3)

        println(mySet.size)
        //Map - HashMap

        //Key - Value
        val fruitArray = arrayOf("Apple", "Banana")
        val caloriesArray = arrayOf(100, 150)

        println("${fruitArray[0]} : ${caloriesArray[0]}")

        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("Apple", 100)
        fruitCalorieMap.put("Banana", 150)
        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String, String>()

        val myNewMap = hashMapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)
        println(myNewMap["C"])


        //If Control
        val myNumberAge = 52

        if (myNumberAge < 30) {
            println("< 30")
        } else if (myNumberAge >= 30 && myNumberAge < 40) {
            println("30 - 40")
        } else if (myNumberAge >= 40 && myNumberAge < 50) {
            println("40 - 50")
        } else {
            println(">=50")
        }
        //Switch - When
        val day = 3
        var dayString = ""

        /*
        if (day == 1) {
            dayString = "Monday"
        } else if ( day == 2) {
            dayString = "Tuesday"
        } else if (day == 3) {
            dayString = "Wednesday"
        }
        println(dayString)
         */

        when (day) {

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }

        println(dayString)


        //For Loop
        val myArrayofNumbers = arrayOf(12, 15, 18, 21, 24, 27, 30, 33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        for (num in myArrayofNumbers) {
            val z = num / 3 * 5
            println(z)
        }

        for (i in myArrayofNumbers.indices) {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9) {
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Eray")
        myStringArrayList.add("Gnc")
        myStringArrayList.add("Bar")

        for (str in myStringArrayList) {
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop
        var j = 0
        while (j < 10) {
            println(j)
            j = j + 1
        }


    } // onCreate ends

} // MainActivity ends


