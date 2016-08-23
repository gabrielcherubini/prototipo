package fastmenu.gcherubini.android.prototipo.login;

import android.support.v4.app.Fragment;

import fastmenu.gcherubini.android.prototipo.superclasses.SingleFragmentActivity;

/**
 * Created by Gabriel on 23/08/2016.
 */
public class LoginActivity extends SingleFragmentActivity
{
    @Override
    public Fragment createFragment()
    {
        return new LoginFragment();
    }

}
