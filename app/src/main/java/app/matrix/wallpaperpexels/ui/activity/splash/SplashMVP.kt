package app.matrix.wallpaperpexels.ui.activity.splash

import app.matrix.trackingsolution.ui.base.iBasePresenter
import app.matrix.trackingsolution.ui.base.iBaseView

interface SplashMVP {

    interface iSplashView:iBaseView{
        fun oneTimeWelcome()
        fun moveToLoginPage()
        fun moveToHomePage()
    }

    interface iSplashPresenter<V : iSplashView>:iBasePresenter<V>{
        fun moveToAnimatedPage()

    }

}