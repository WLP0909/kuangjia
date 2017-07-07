package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WLP on 2017/7/1.
 */
public class Emp {

    private String eid;
    private String ename;
    private String hiredate;
    private String photo;

    public String getEid() {
        return eid;
    }

    public String reID(){
        String eid ="";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String time = sdf.format(new Date());
        int id = (int)((Math.random()+1)*100);
        eid = time + id;
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public static void main(String[] args) {
        Emp emp = new Emp();
        System.out.println(emp.reID());
        System.out.println(emp.reID());
    }
}
