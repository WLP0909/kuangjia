package mapper;

import domain.Emp;

import java.util.List;

/**
 * Created by WLP on 2017/7/1.
 */
public class SelectByAny {

    public String SelectSQL(String find){
        return new StringBuilder().append("SELECT * ")
                .append("FROM employee WHERE eid LIKE '%").append(find).append("%' ")
                .append(" OR ename LIKE '%").append(find).append("%' ")
                .append(" OR hiredate LIKE binary '%").append(find).append("%' ")
                .toString();
    }
}
