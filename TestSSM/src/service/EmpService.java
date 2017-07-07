package service;

import domain.Emp;
import domain.User;
import mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by WLP on 2017/7/1.
 */
@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    public User login(String username){
        return empMapper.login(username);
    }

    public List<Emp> selectAll(){
        return empMapper.selectAll();
    }

    public Emp selectById(String eid){
        return empMapper.selectById(eid);
    }

    public List<Emp> findEmp(String find){
        return empMapper.selectByAny(find);
    }

    @Transactional
    public void insertEmp(Emp emp){
        empMapper.insertEmp(emp);
    }

    @Transactional
    public void deleteEmp(String eid){
        empMapper.delectEmp(eid);
    }

    @Transactional
    public void updateEmp(Emp emp){
        empMapper.updateEmp(emp);
    }
}
