package app.matrix.wallpaperpexels.ui.activity.splash

import app.matrix.trackingsolution.ui.base.BasePresenter

class SplashPresenter<V : SplashMVP.iSplashView> : BasePresenter<V>(),
    SplashMVP.iSplashPresenter<V> {



    override fun moveToAnimatedPage() {

    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}