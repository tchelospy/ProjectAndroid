package br.com.testwebserviceapi.ui.atividades;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import br.com.testwebserviceapi.R;

public class AtividadesFragment extends Fragment {

    private AtividadesViewModel atividadesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        atividadesViewModel =
                ViewModelProviders.of(this).get(AtividadesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_atividades, container, false);
        final TextView textView = root.findViewById(R.id.text_atividaes);
        atividadesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}