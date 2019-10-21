package cn.zfq.kaola.controller;

import cn.zfq.kaola.entity.Student;
import cn.zfq.kaola.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    //业务逻辑层注入到控制层（注入所需的外部资源）
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestBody Student student) {
        System.out.println(student);
        String strs = studentService.selectByName(student);
        System.out.println(strs);
        return strs;

    }
}
