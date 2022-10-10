package com.firstapp.portrait_mode_to_landscape_mode;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    Context context;
    List<DataModel>dataModelList;

    public DataAdapter(Context context, List<DataModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycler,null,false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.location.setText(dataModelList.get(i).getLocation());
        holder.equipement.setText(dataModelList.get(i).getEquipment());
        holder.work.setText(dataModelList.get(i).getWorkcenter());
        holder.description.setText(dataModelList.get(i).getDescription());


    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView location,equipement,work,description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            location=itemView.findViewById(R.id.recycler_location);
            equipement=itemView.findViewById(R.id.recycler_equipement);
            work=itemView.findViewById(R.id.recycler_work);

            description=itemView.findViewById(R.id.recycler_description);

        }
    }
}
