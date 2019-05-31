package com.qf.pojo;

import java.util.Date;

public class Reply {
    private int rid;
    private int cid;
    private String uname;
    private Date rtime;
    private String rdetails;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getRdetails() {
        return rdetails;
    }

    public void setRdetails(String rdetails) {
        this.rdetails = rdetails;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "rid=" + rid +
                ", cid=" + cid +
                ", uname='" + uname + '\'' +
                ", rtime=" + rtime +
                ", rdetails='" + rdetails + '\'' +
                '}';
    }
}
