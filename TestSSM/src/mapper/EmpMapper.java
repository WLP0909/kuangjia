package mapper;

import domain.Emp;
import domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by WLP on 2017/7/1.
 */
@Mapper
public interface EmpMapper {

    //登录验证用户信息
    @Select("SELECT * FROM USER1 WHERE username = #{usernamae}")
    User login(String username);

    //查询所有员工信息
    @Select("SELECT * FROM employee")
    List<Emp> selectAll();

    //动态查询员工
    @SelectProvider(type = SelectByAny.class,method ="SelectSQL")
    List<Emp> selectByAny(String find);

    //根据ID查询员工
    @Select("SELECT * FROM EMPLOYEE WHERE eid = #{eid}")
    Emp selectById(String eid);

    @Delete("DELETE FROM EMPLOYEE WHERE eid=#{eid}")
    void delectEmp(String eid);

    @Insert("INSERT INTO employee(eid,ename,hiredate,photo) values(#{eid},#{ename},#{hiredate},#{photo})")
    void insertEmp(Emp emp);

    @Update("UPDATE EMPLOYEE SET ename =#{ename},photo=#{photo},hiredate=#{hiredate} WHERE eid=#{eid}")
    void updateEmp(Emp emp);
}
