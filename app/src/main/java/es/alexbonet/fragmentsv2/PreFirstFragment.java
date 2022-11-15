package es.alexbonet.fragmentsv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import es.alexbonet.fragmentsv2.databinding.FragmentSecondBinding;
import es.alexbonet.fragmentsv2.databinding.XfragmentPrefirstBinding;

public class PreFirstFragment extends Fragment {

    private XfragmentPrefirstBinding binding;
    private EditText inputUser;
    private EditText inputPswd;
    private String user, pswd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        binding = XfragmentPrefirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Action al firstFragment
                NavHostFragment.findNavController(PreFirstFragment.this)
                        .navigate(R.id.action_preFirstFragment_to_FirstFragment);

                user = binding.inputUser.getText().toString();
                pswd = binding.inputPswd.getText().toString();

                //Enviar datos a SecondFragment
                Bundle bundle = new Bundle();
                bundle.putString("bundleUser", user);
                bundle.putString("bundlePswd", pswd);

                getParentFragmentManager().setFragmentResult("key",bundle);


            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}