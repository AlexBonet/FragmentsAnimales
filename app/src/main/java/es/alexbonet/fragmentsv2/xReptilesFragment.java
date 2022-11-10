package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentXMamiferosBinding;
import es.alexbonet.fragmentsv2.databinding.FragmentXReptilesBinding;

public class xReptilesFragment extends Fragment {

    private FragmentXReptilesBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentXReptilesBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xReptilesFragment.this)
                        .navigate(R.id.action_xReptilesFragment_to_FirstFragment);
            }
        });

        binding.btnAnimal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xReptilesFragment.this)
                        .navigate(R.id.action_xReptilesFragment_to_xReptiles1Fragment);
            }
        });

        binding.btnAnimal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(xReptilesFragment.this)
                        .navigate(R.id.action_xReptilesFragment_to_xReptiles2Fragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}