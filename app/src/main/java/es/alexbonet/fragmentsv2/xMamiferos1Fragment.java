package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentXMamifero1Binding;
import es.alexbonet.fragmentsv2.databinding.FragmentXMamiferosBinding;

public class xMamiferos1Fragment extends Fragment {

    private FragmentXMamifero1Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentXMamifero1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xMamiferos1Fragment.this)
                        .navigate(R.id.action_xMamiferos1Fragment_to_xMamiferosFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}