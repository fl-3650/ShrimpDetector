package com.example.shrimpdetector;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class QuestionFragment extends Fragment {

    public QuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        Button buttonYes = view.findViewById(R.id.buttonYes);
        buttonYes.setOnClickListener(navigation -> NavHostFragment.findNavController(this)
                .navigate(R.id.action_questionFragment_to_yesFragment));

        Button buttonNo = view.findViewById(R.id.buttonNo);
        buttonNo.setOnClickListener(navigation -> NavHostFragment.findNavController(this)
                .navigate(R.id.action_questionFragment_to_noFragment));

        return view;
    }
}