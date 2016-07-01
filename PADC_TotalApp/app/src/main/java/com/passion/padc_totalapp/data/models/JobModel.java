package com.passion.padc_totalapp.data.models;

import android.content.Context;

import com.passion.padc_totalapp.R;
import com.passion.padc_totalapp.TotalApp;
import com.passion.padc_totalapp.data.vos.JobVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aung on 6/24/16.
 */
public class JobModel {

    private static JobModel objInstance;

    private List<JobVO> jobList;

    private JobModel() {
        jobList = setUpInitialJobs();
    }

    public static JobModel getInstance() {
        if (objInstance == null) {
            objInstance = new JobModel();
        }

        return objInstance;
    }

    private List<JobVO> setUpInitialJobs() {
        Context context = TotalApp.getContext();

        List<JobVO> jobList = new ArrayList<>();
        jobList.add(new JobVO("Developer / Senior Developer", "Standard Charter Bank", "Singapore", R.drawable.sc_logo, "1day"));
        jobList.add(new JobVO("Client Partner, Mobile Publisher Sales - Japen", "Facebook", "Singapore", R.drawable.facebook_logo, "1w"));
        jobList.add(new JobVO("SAP Partner Solution Center Head", "SAP", "Singapore", R.drawable.sap_logo, "3w"));
        jobList.add(new JobVO("Technial Architect - Marketing Cloud", "Saleforces", "Singapore", R.drawable.salesforce_logo, "3w"));
        return jobList;
    }

    public List<JobVO> getJobList() {
        return this.jobList;
    }

    public JobVO getJob(int index) {
        return jobList.get(index);
    }
}
