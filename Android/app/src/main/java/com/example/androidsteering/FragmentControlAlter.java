package com.example.androidsteering;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

public class FragmentControlAlter extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.frag_control_alter, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        MainActivity activity = (MainActivity)getActivity();
        assert activity != null;
        activity.startUpdatingUIDigits();
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        MainActivity activity = (MainActivity)getActivity();
        assert activity != null;
        activity.stopUpdatingUIDigits();
    }
}
