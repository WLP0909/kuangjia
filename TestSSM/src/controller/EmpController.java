package controller;

import domain.Emp;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import service.EmpService;

import java.util.List;

/**
 * Created by WLP on 2017/7/1.
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    //用户登录验证
    @RequestMapping("/Log")
    public String login(User user, ModelMap modelMap){
        System.out.println(user.getUsername());
        User user1 = empService.login(user.getUsername());
        if (user1 != null && user1.getPassword().equals(user.getPassword())){
            List<Emp> emps = empService.selectAll();
            modelMap.addAttribute("emps",emps);
            return "index.jsp";
        }else {
            return "login.jsp";
        }
    }

    @RequestMapping("/Find")
    public String findEmp(String find,ModelMap modelMap){
        List<Emp> emps = empService.findEmp(find);
        modelMap.addAttribute("emps",emps);
        return "index.jsp";
    }

    @RequestMapping("/Ins")
    public String insertEmp(String eid, String ename, String hiredate,@RequestParam("photo1")MultipartFile file,ModelMap modelMap){
        Emp emp = new Emp();
        emp.setEid(eid);
        emp.setEname(ename);
        emp.setHiredate(hiredate);
        emp.setPhoto(file.getOriginalFilename());
        empService.insertEmp(emp);

        List<Emp> emps = empService.selectAll();
        modelMap.addAttribute("emps",emps);
        return "index.jsp";
    }

    @RequestMapping("/Del")
    public String deleteEmp(ModelMap modelMap,String eid){
        empService.deleteEmp(eid);

        List<Emp> emps = empService.selectAll();
        modelMap.addAttribute("emps",emps);
        return "index.jsp";
    }

    @RequestMapping("/Alt")
    public String updateEmp(String eid,ModelMap modelMap){
        Emp emp = empService.selectById(eid);
        modelMap.addAttribute("emp",emp);
        return "alter.jsp";
    }

    @RequestMapping("/Upd")
    public String alter(ModelMap modelMap,String eid, String ename, String hiredate, @RequestParam("photo1")MultipartFile file){
        Emp emp = new Emp();
        emp.setEid(eid);
        emp.setEname(ename);
        emp.setHiredate(hiredate);
        emp.setPhoto(file.getOriginalFilename());
        empService.updateEmp(emp);

        List<Emp> emps = empService.selectAll();
        modelMap.addAttribute("emps",emps);
        return "index.jsp";
    }
}
