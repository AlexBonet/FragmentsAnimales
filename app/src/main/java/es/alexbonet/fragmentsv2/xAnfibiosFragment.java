package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentXAnfibiosBinding;
import es.alexbonet.fragmentsv2.databinding.FragmentXReptilesBinding;

public class xAnfibiosFragment extends Fragment {

    private FragmentXAnfibiosBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentXAnfibiosBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xAnfibiosFragment.this)
                        .navigate(R.id.action_xAnfibiosFragment_to_FirstFragment);
            }
        });

        binding.btnAnimal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xAnfibiosFragment.this)
                        .navigate(R.id.action_xAnfibiosFragment_to_xAnfibios1Fragment);
            }
        });

        binding.btnAnimal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xAnfibiosFragment.this)
                        .navigate(R.id.action_xAnfibiosFragment_to_xAnfibios2Fragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}