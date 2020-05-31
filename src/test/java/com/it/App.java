package com.it;

import helpesr.CommonHelper;
import helpesr.DashboardHelper;
import helpesr.LoginHelper;


public class App {
   public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;

    public App() {
        common=new CommonHelper();
        login= new LoginHelper();
        dashboard = new DashboardHelper();
    }

}
