package com.youknowwho.demo2.fragments;

import android.support.v4.app.Fragment;

/**
 * Base fragment class for convenience. All fragments must extend this class.
 */
public class BaseFragment extends Fragment {

    /**
     * Child fragments should override this method to get a callback when the fragment is visible
     */
    public void refreshFragment() {
        //Implementation in child fragment

    }


}