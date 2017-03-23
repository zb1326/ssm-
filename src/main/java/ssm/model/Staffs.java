package ssm.model;

import java.util.Date;

public class Staffs {
    private Integer id;

    private String name;

    private Integer age;

    private String pos;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos == null ? null : pos.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}