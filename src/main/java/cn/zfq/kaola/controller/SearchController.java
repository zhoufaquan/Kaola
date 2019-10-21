//package cn.zfq.kaola.controller;
//
//import cn.zfq.kaola.entity.Student;
//import cn.zfq.kaola.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//public class SearchController {
//    @Autowired
//    StudentService studentService;
//    @RequestMapping(value = "search",method = RequestMethod.POST)
//    @ResponseBody
//    public String searchInformation(@RequestBody Student student){
//        System.out.println(student);
//        Student obj = studentService.searchInformation(student);
//        return obj.toString();
//
//    }
//}
