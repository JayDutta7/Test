package app.matrix.wallpaperpexels.ui.activity.forgotpassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.matrix.wallpaperpexels.R

class ForgotPasswordActivity : AppCompatActivity(),IForgotPasswordView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

    }
}
