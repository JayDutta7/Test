package app.matrix.wallpaperpexels.ui.activity.home.navigationDrawer

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import app.matrix.wallpaperpexels.R
import app.matrix.wallpaperpexels.WallPaperApp
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.firebase.auth.FirebaseAuth
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.fragment_bottomsheet.*

class BottomNavigationDrawerFragment : BottomSheetDialogFragment(), iNavigationDrawerView {


    private var navpresenter: NavigationDrawerPresenter? = null


    @BindView(R.id.member_pic)
    lateinit var member_pic: CircleImageView

    @BindView(R.id.name_profile)
    lateinit var name_profile: AppCompatTextView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bottomsheet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.let { ButterKnife.bind(it) }

        navpresenter = NavigationDrawerPresenter(this)
        navpresenter!!.initView()


    }

    override fun initView() {
        navigation_view.setNavigationItemSelectedListener { menuItem ->
            // Bottom Navigation Drawer menu item clicks
            when (menuItem.itemId) {
                R.id.settings -> settings()
                R.id.account -> account()
                R.id.share -> share()
                R.id.about -> about()
                R.id.signOut -> SignOut()
            }
            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here
            true
        }
    }

    // This is an extension method for easy Toast call
    private fun toast(message: CharSequence) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        // toast.setGravity(Gravity.BOTTOM, 0, 600)
        toast.show()
    }


    override fun settings() {
        toast(getString(R.string.nav1_clicked))
    }

    override fun account() {
        toast(getString(R.string.nav1_clicked))
    }

    override fun share() {
        toast(getString(R.string.nav1_clicked))
    }

    override fun about() {
        toast(getString(R.string.nav1_clicked))
    }

    override fun SignOut() {
        if (FirebaseAuth.getInstance() != null)
        //Logout from Firebase
            FirebaseAuth.getInstance().signOut()

        //Clear Local Database
        WallPaperApp.getPref().clearSharedPreference()

        val mainIntent = Intent(activity, LoginActivity::class.java)
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        activity!!.startActivity(mainIntent)
    }

}