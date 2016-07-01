package com.passion.padc_totalapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.passion.padc_totalapp.R;
import com.passion.padc_totalapp.TotalApp;
import com.passion.padc_totalapp.data.vos.JobVO;
import com.passion.padc_totalapp.views.holders.JobViewHolder;

import java.util.List;

/**
 * Created by aung on 6/26/16.
 */
public class JobAdapter extends RecyclerView.Adapter<JobViewHolder> {

    private LayoutInflater inflater;
    private List<JobVO> jobList;

    public JobAdapter(List<JobVO> jobList) {
        inflater = LayoutInflater.from(TotalApp.getContext());
        this.jobList = jobList;
    }

    @Override
    public JobViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_item_job, parent, false);
        final JobViewHolder jobVH = new JobViewHolder(view);
        return jobVH;
    }

    @Override
    public void onBindViewHolder(JobViewHolder holder, int position) {
        holder.setData(jobList.get(position));
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }
}
