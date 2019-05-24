package com.qf.pojo;

import java.util.Date;

public class Community {
    private int cid;
    private String cheadline;
    private String uname;
    private int hits;
    private Date pubdate;
    private String details;

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Community{" +
                "cid=" + cid +
                ", cheadline='" + cheadline + '\'' +
                ", uname='" + uname + '\'' +
                ", hits=" + hits +
                ", pubdate=" + pubdate +
                ", details='" + details + '\'' +
                '}';
    }
}
