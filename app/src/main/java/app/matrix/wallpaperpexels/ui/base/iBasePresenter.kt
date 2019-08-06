package app.matrix.trackingsolution.ui.base

interface iBasePresenter<V: iBaseView> {
     fun onAttach(baseView:V)
     fun onDetach()
     fun onDestroy()
}