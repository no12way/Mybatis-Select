package org.pojo;

import org.apache.ibatis.annotations.Param;

public class Clazz {
    Long cid;
    String cname;
    public Clazz(){}
    public Clazz(Long cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
