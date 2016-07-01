package com.passion.padc_totalapp.data.vos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by NayLinAung on 6/30/16.
 */
public class JobVO {

    private String jobTitle;

    private int companyLogoImage;

    private String companyName;

    private String location;

    public String getTime() {
        return time;
    }

    private String time;

    public JobVO(String jobTitle, String companyName, String location, int companyLogoImage, String time) {
        this.jobTitle = jobTitle;
        this.companyLogoImage = companyLogoImage;
        this.companyName = companyName;
        this.location = location;
        this.time = time;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getCompanyLogoImage() {
        return companyLogoImage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }
}
