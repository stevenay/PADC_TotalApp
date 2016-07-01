package com.passion.padc_totalapp.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.passion.padc_totalapp.R;
import com.passion.padc_totalapp.data.vos.JobVO;

/**
 * Created by NayLinAung on 6/30/16.
 */
public class JobViewHolder extends RecyclerView.ViewHolder{

    private TextView tvJobTitle;
    private ImageView ivCompanyLogo;
    private TextView tvCompanyName;
    private TextView tvLocation;
    private TextView tvTime;
    private TextView tvStatus;

    public JobViewHolder(View view) {
        super(view);
        tvJobTitle = (TextView) view.findViewById(R.id.tv_job_title);
        ivCompanyLogo = (ImageView) view.findViewById(R.id.iv_company_logo);
        tvCompanyName = (TextView) view.findViewById(R.id.tv_company_name);
        tvLocation = (TextView) view.findViewById(R.id.tv_location);
        tvTime = (TextView) view.findViewById(R.id.tv_time);
        tvStatus = (TextView) view.findViewById(R.id.tv_status);
    }

    public void setData(JobVO job) {
        tvJobTitle.setText(job.getJobTitle());
        tvCompanyName.setText(job.getCompanyName());
        tvLocation.setText(job.getLocation());
        ivCompanyLogo.setImageResource(job.getCompanyLogoImage());
        if (job.getTime().equals("1day")) {
            tvTime.setVisibility(View.INVISIBLE);
            tvStatus.setVisibility(View.VISIBLE);
        }
        tvTime.setText(job.getTime());
    }
}
