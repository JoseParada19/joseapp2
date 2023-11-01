package com.example.proyectojose;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link selecciondequipoF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class selecciondequipoF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public selecciondequipoF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment selecciondequipoF.
     */
    // TODO: Rename and change types and number of parameters
    public static selecciondequipoF newInstance(String param1, String param2) {
        selecciondequipoF fragment = new selecciondequipoF();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_selecciondequipo, container, false);

        Button botonIrfutsal = rootView.findViewById(R.id.a6aaa);
        Button botonirfutbol = rootView.findViewById(R.id.futbol12);
        Button botonirbasquet = rootView.findViewById(R.id.basquet12);
        Button botonhome = rootView.findViewById(R.id.homeme);

        botonhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor1, new HomeF());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        botonirbasquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor1, new crearequipobasquetF());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        botonirfutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor1, new crearequipofutbolF());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        botonIrfutsal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor1, new crearequipofutsalF());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return rootView;
    }
}