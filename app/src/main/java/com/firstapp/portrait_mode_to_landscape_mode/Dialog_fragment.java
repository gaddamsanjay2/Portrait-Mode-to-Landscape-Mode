package com.firstapp.portrait_mode_to_landscape_mode;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class Dialog_fragment extends DialogFragment {
    EditText functionaliy,equipement,workcenter,tasktype,description,breakdown,sympton,sympton_code;
    EditText plant,reported,ramcategory,ram_consequence;

    ArrayList<DataModel> dataModelArrayList;
    DataAdapter dataAdapter;

    RecyclerView recyclerView;

    ImageView barcode,barcode2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.custom_dialog,container,false);

        functionaliy=root.findViewById(R.id.finctionality);

        equipement=root.findViewById(R.id.equipment);


        workcenter=root.findViewById(R.id.workcenter);


        tasktype=root.findViewById(R.id.task);

        description=root.findViewById(R.id.description);


        breakdown=root.findViewById(R.id.break_down);

        sympton=root.findViewById(R.id.sympton);

        sympton_code=root.findViewById(R.id.sympton_code);

        plant=root.findViewById(R.id.plant);

        reported=root.findViewById(R.id.reported);

        ramcategory=root.findViewById(R.id.category);

        ram_consequence=root.findViewById(R.id.consequence_class);

        dataModelArrayList=new ArrayList<>();




        Button save=root.findViewById(R.id.save_data);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                processinsertdata(functionaliy.getText().toString(),equipement.getText().toString(),
                        workcenter.getText().toString(),description.getText().toString());

            }
        });

        return root;
    }

    private void processinsertdata(String fn, String equi, String work, String desc)
    {
        String result=new HelperClass(getContext()).addrecord(fn,equi,work,desc);
        functionaliy.setText("");
        equipement.setText("");
        workcenter.setText("");
        description.setText("");

        Toast.makeText(getContext(), ""+result, Toast.LENGTH_SHORT).show();
    }
}



