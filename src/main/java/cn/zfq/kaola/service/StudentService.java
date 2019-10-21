package cn.zfq.kaola.service;

import cn.zfq.kaola.dao.StudentDao;
import cn.zfq.kaola.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public String selectByName(Student student) {
        Student student1 = studentDao.selectByName(student.getC_telephone());
        System.out.println(student1);
        if (student1 != null) {
            if (!student1.getC_pwd().equals(student.getC_pwd())) {
                return "2";
            } else {
                return "1";
            }

        } else {
            studentDao.insertStudent(student.getC_telephone(), student.getC_pwd());
            return "1";
        }


    }
//   public String insertStudent(Student student) {
//       Student student1 = studentDao.selectByName(student.getUserName());
//       if(student1 != null){
//
//          return "1";
//
//       } else {
//
//          studentDao.insertStudent(student.getUserName(),student.getPassWord());
//          return "0";
//
//       }
//
//   }
//   public String signInformation(Student student){
//       System.out.println("sign"+student.getUserName());
//       Student student1 = studentDao.selectByName(student.getUserName());
//       System.out.println(student1);
//       if(student1 != null){
//
//           if(student1.getIdCard().equals(student.getIdCard())){
//               return "0";
//
//           } else {
//
//               Student student2 = studentDao.signInformation(student.getStudentNumber(),
//                       student.getUserName(), student.getIdCard(), student.getTelNumber(), student.getSubject());
//               return "1";
//           }
//
//       } else {
//
//
//           return "2";
//
//       }
//
//   }
//   public Student searchInformation(Student student){
//       System.out.println("search:"+student);
//
//
//
//               return studentDao.searchInformation(student.getUserName(),student.getIdCard());
//
//
//
//   }
}
