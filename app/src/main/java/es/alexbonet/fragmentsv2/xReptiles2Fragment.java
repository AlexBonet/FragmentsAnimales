package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentXMamifero2Binding;
import es.alexbonet.fragmentsv2.databinding.FragmentXReptil1Binding;
import es.alexbonet.fragmentsv2.databinding.FragmentXReptil2Binding;

public class xReptiles2Fragment extends Fragment {

    private FragmentXReptil2Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentXReptil2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xReptiles2Fragment.this)
                        .navigate(R.id.action_xReptiles2Fragment_to_xReptilesFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}