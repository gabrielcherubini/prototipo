package fastmenu.gcherubini.android.prototipo.registrar;

import android.support.v4.app.Fragment;

import fastmenu.gcherubini.android.prototipo.superclasses.SingleFragmentActivity;

/**
 * Created by Gabriel on 23/08/2016.
 */
public class RegistrarActivity extends SingleFragmentActivity
{
    @Override
    public Fragment createFragment()
    {
        return new RegistrarFragment();
    }
}
