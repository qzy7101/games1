package com.qf.pojo;

import javax.xml.crypto.Data;

public class Community1 {
    private int uid;
    private String uname;
    private String email;
    private int cid;
    private String cheadline;
    private int hits;
    private Data pubdate;
    private String details;
    private int rid;
    private String rname;
    private Data rtime;
    private String rdetails;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCheadline() {
        return cheadline;
    }

    public void setCheadline(String cheadline) {
        this.cheadline = cheadline;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Data getPubdate() {
        return pubdate;
    }

    public void setPubdate(Data pubdate) {
        this.pubdate = pubdate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Data getRtime() {
        return rtime;
    }

    public void setRtime(Data rtime) {
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
        return "Community1{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", cid=" + cid +
                ", cheadline='" + cheadline + '\'' +
                ", hits=" + hits +
                ", pubdate=" + pubdate +
                ", details='" + details + '\'' +
                ", rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rtime=" + rtime +
                ", rdetails='" + rdetails + '\'' +
                '}';
    }
}
