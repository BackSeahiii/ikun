package com.iweb.test;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.impl.StudentDAOImpl;
import com.iweb.pojo.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * 测试类 用于DAO接口测试
 *
 * @author BackSea
 * @Test 将指定方法标记为测试方法 可以不依赖与main方法直接运行
 * @Before 在所有测试方法运行之前执行的代码 一般用于环境初始化
 * @After 在所有测试方法运行之后执行的代码 一般用于资源回收
 * @date 2024/7/23 上午11:02
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;

    @Before
    public void init() {
        studentDAO = new StudentDAOImpl();
    }

    @Test
    public void testFindById() {
        ;
        Assert.assertNotNull(studentDAO.findById(1));
    }

    @Test
    public void testCount() {
        Assert.assertEquals(8L, (long) studentDAO.count());
    }

    @Test
    public void testFindAll() {
        Assert.assertNotNull(studentDAO.findAll());
    }

    @Test
    public void testInsert() {
        Student student = new Student(0, "白海", "男", new Date(), "六合", 2675724148L);
        Assert.assertFalse(studentDAO.insert(student));
    }

    @Test
    public void testFindByNameLike() {
        Assert.assertNotNull(studentDAO.findByNameLike("白"));
    }

    @Test
    public void testFindByNameWithLimit() {
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("白", 0, 1));
    }

    @Test
    public void testFindWithLimit() {
        Assert.assertNotNull(studentDAO.findWithLimit(2, 3));
    }
}
