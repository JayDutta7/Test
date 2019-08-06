package app.matrix.wallpaperpexels.network.basenetwork

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ConnectivityReceiver: BroadcastReceiver() {

    private val TAG:String =ConnectivityReceiver::class.java.simpleName

    override fun onReceive(context: Context?, intent: Intent?) {

        val status=NetworkUtil.getConnectivityStatusString(context)

        if(status.equals("No Internet")){
            Toast.makeText(context,status,Toast.LENGTH_SHORT).show()
            Log.e(TAG,status)
        }else{
            Toast.makeText(context,status,Toast.LENGTH_SHORT).show()
            Log.e(TAG,status)
        }

    }




}