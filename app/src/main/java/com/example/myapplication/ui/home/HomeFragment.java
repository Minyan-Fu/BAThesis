package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<Routine> routineList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater,container,savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initRoutine();
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.routine_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        RoutineAdapter adapter = new RoutineAdapter(routineList);
        recyclerView.setAdapter(adapter);
        return root;
    }

    private void initRoutine(){
        for (int i = 0; i<2; i++) {
            Routine routine1 = new Routine("routine1");
            routineList.add(routine1);
            Routine routine2 = new Routine("routine2");
            routineList.add(routine2);
            Routine routine3 = new Routine("routine3");
            routineList.add(routine3);
            Routine routine4 = new Routine("routine4");
            routineList.add(routine4);
            Routine routine5 = new Routine("routine5");
            routineList.add(routine5);
            Routine routine6 = new Routine("routine6");
            routineList.add(routine6);
            Routine routine7 = new Routine("routine7");
            routineList.add(routine7);
            Routine routine8 = new Routine("routine8");
            routineList.add(routine8);
            Routine routine9 = new Routine("routine9");
            routineList.add(routine9);
            Routine routine10 = new Routine("routine10");
            routineList.add(routine10);


        }
    }

}
