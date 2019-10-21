//        package cn.zfq.kaola.controller;
//
//        import cn.zfq.kaola.entity.Student;
//import cn.zfq.kaola.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//        @Controller
//        public class InsertController {
//            @Autowired
//            StudentService studentService;
//
//            @RequestMapping(value = "insertStudent",method = RequestMethod.POST)
//            @ResponseBody
//            public  String insertStudent(@RequestBody Student student) {
//
//
//                      String res = String.valueOf(studentService.insertStudent(student));
//                      return res;
//
//           }
//
//        }
