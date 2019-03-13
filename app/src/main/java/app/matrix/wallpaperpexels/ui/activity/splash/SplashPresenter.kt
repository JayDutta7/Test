package app.matrix.wallpaperpexels.ui.activity.splash

import android.os.Handler
import app.matrix.wallpaperpexels.WallPaperApp
import app.matrix.wallpaperpexels.localdatabase.Constant


class SplashPresenter(private var view: ISplashView?) :  ISplashPresenter {

    override fun onAnimate() {
        Handler().postDelayed(
            {
                view?.moveToWelcomePage()

            },
            delayTime
        )
    }

    override fun onDestroy() {

    }


    companion object {
        private const val delayTime: Long = 3000 //Ms
    }


    override fun goToNextPage() {

        when {
            WallPaperApp.getPref().getValueBoolien(Constant.UserEmail) ->

                view?.moveToHomePage()


            else ->

                view?.moveToLoginPage()


        }

    }


}