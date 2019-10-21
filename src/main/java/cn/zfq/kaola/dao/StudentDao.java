package cn.zfq.kaola.dao;

import cn.zfq.kaola.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    Student selectByName(@Param("c_telephone") String c_telephone);

    int insertStudent(@Param("c_telephone") String c_telephone, @Param("c_pwd") String c_pwd);

    Student signInformation(@Param("studentNumber") String studentNumber, @Param("userName") String userName, @Param("idCard") String idCard, @Param("telNumber") String telNumber, @Param("subject") String subject);

    Student searchInformation(@Param("userName") String userName, @Param("idCard") String idCard);
}
