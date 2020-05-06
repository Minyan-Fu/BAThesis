package com.example.myapplication.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.myapplication.R;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class RoutineAdapter extends RecyclerView.Adapter<RoutineAdapter.ViewHolder> {
    private List<Routine> mRoutineList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView routineName;

        public ViewHolder(View view){
            super(view);
            routineName = (TextView) view.findViewById(R.id.routine_name);
        }
    }

    public RoutineAdapter(List<Routine> routineList){
        mRoutineList = routineList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.routine_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Routine routine = mRoutineList.get(position);
        holder.routineName.setText(routine.getName());
    }

    @Override
    public int getItemCount(){
        return mRoutineList.size();
    }

}
