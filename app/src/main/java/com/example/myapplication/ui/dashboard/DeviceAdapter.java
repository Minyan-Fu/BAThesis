package com.example.myapplication.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.myapplication.R;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class DeviceAdapter extends RecyclerView.Adapter<DeviceAdapter.ViewHolder> {
    private List<Device> mDeviceList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView deviceName;

        public ViewHolder(View view){
            super(view);
            deviceName = (TextView) view.findViewById(R.id.device_name);
        }
    }

    public DeviceAdapter(List<Device> deviceList){
        mDeviceList = deviceList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.device_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Device device = mDeviceList.get(position);
        holder.deviceName.setText(device.getName());
    }

    @Override
    public int getItemCount(){
        return mDeviceList.size();
    }

}
