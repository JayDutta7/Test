package app.matrix.trackingsolution.utility.globalMsg

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import app.matrix.trackingsolution.R
import com.google.android.material.snackbar.Snackbar


object GlobalViewMessage{




        /*------------------This is for Global Toast -------------------*/
        fun showShortToast(msg: String?, ctx: Context?) {
            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
        }

        fun showLongToast(msg: String?, ctx: Context?) {
            Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show()
        }
        /*------------------This is for Global Snackbar -------------------*/
        fun showSnackBarShort(view:View?,msg: CharSequence?,context:Context?){
            Snackbar.make(view!!, msg!!, Snackbar.LENGTH_SHORT)
                .setActionTextColor(ContextCompat.getColor(context!!,R.color.colorlogin))
                .show()
        }
        fun showSnackBarLong(view:View?,msg: CharSequence?,context:Context?){
            Snackbar.make(view!!, msg!!, Snackbar.LENGTH_LONG)
                .setActionTextColor(ContextCompat.getColor(context!!,R.color.colorlogin))
                .show()
        }






}