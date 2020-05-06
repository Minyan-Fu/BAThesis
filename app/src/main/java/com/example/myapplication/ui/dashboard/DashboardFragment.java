package com.example.myapplication.ui.dashboard;

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

public class DashboardFragment extends Fragment {

   private List<Device> deviceList = new ArrayList<>();

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
       // Inflate the layout for this fragment
       super.onCreateView(inflater,container,savedInstanceState);
       View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
       initDevice();
       RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.device_list);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
       recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
       DeviceAdapter adapter = new DeviceAdapter(deviceList);
       recyclerView.setAdapter(adapter);
       return root;
   }

   private void initDevice(){
       for (int i = 0; i<2; i++) {
           Device bike1 = new Device("Bike1");
           deviceList.add(bike1);
           Device bike2 = new Device("Bike2");
           deviceList.add(bike2);
           Device bike3 = new Device("Bike3");
           deviceList.add(bike3);
           Device car1 = new Device("Car1");
           deviceList.add(car1);
           Device car2 = new Device("Car2");
           deviceList.add(car2);
           Device car3 = new Device("Car3");
           deviceList.add(car3);
           Device bus1 = new Device("Bus1");
           deviceList.add(bus1);
           Device bus2 = new Device("Bus2");
           deviceList.add(bus2);
           Device bus3 = new Device("Bus3");
           deviceList.add(bus3);

       }
   }

}
