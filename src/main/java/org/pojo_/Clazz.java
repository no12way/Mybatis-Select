package org.pojo_;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public class Clazz {
    Long cid;
    String cname;
    List<Student> students;
    public Clazz(){}

    public Clazz(Long cid, String cname, List<Student> students) {
        this.cid = cid;
        this.cname = cname;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
