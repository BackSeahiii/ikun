package com.iweb.test1;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.impl.StudentDAOImpl;

/**
 * @author BackSea
 * @date 2024/7/22 下午2:47
 */
public class Test {
    //JDBC java database connection
    public static void main(String[] args) {
//        //驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功");
//        //获取jdbc连接
//        String url="jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String username="root";
//        String password="a12345";
//        Connection connection = null;
//        try{
//            connection = DriverManager.getConnection(url,username,password);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功");
//        try {
//            Statement s = connection.createStatement();
//            //准备一个sql语句
//            String sql = "INSERT INTO stu" +
//            "(NAME,gender,birthday,addr,qqnumber)"+ "VALUES" +
//                    "('不负责','女','2003-02-15','江苏宿迁',3124076825)";
//            //运行sql语句
//            s.execute(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // 驱动加载 连接获取 创建编译语句对象 执行语句
//            // 驱动加载 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        }
//        Student s1 = new Student(0,"无畏","男",new Date(0),"南京",110);
        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);
//        Student s2 = new Student(6,"白海","男",new Date(),"六合", 2675724148L);
//        studentDAO.update(s2);
//        studentDAO.delete(9);
        studentDAO.count();
    }
}
