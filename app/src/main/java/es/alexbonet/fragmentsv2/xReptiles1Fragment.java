package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentXMamifero1Binding;
import es.alexbonet.fragmentsv2.databinding.FragmentXReptil1Binding;

public class xReptiles1Fragment extends Fragment {

    private FragmentXReptil1Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentXReptil1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xReptiles1Fragment.this)
                        .navigate(R.id.action_xReptiles1Fragment_to_xReptilesFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}