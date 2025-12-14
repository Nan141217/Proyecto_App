<<<<<<< HEAD
package util

import android.content.Context
import android.content.Intent
import java.util.Objects

class Util {
    fun openActivity (context: Context,objClass: Class<*>){
         val intento= Intent(context,objClass)
        context.startActivity(intento)
=======
package Util

import android.content.Context
import android.content.Intent

class Util {
    fun openActivity(context: Context, target: Class<*>) {
        val intent = Intent(context, target)
        context.startActivity(intent)
>>>>>>> origin/main
    }
}