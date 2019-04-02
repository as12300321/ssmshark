//package com.shark;
//
//import com.shark.dao.UserDAO;
//import com.shark.entity.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SharkApplicationTests {
//    @Autowired
//    private UserDAO userDAO;
//    @Test
//    public void contextLoads() {
//    }
//    @Test
//    public void testOperation(){
//        User user1 = new User();
//        user1.setUserName("jbw1");
//        user1.setPassWord("123456");
//        User user2 = new User();
//        user2.setUserName("jbw2");
//        user2.setPassWord("123456");
//
//        userDAO.addUser(user1);
//        userDAO.addUser(user2);
//
//        User resultUser1 = userDAO.selectUserByUserName("jbw1");
//        Assert.assertEquals("123456", resultUser1.getPassWord());
//
//        User resultUser2 = userDAO.selectUserByUserName("jbw2");
//        resultUser2.setPassWord("233333");
//        userDAO.updateUserPsdByName(resultUser2);
//        Assert.assertEquals("233333", userDAO.selectUserByUserName("jbw2").getPassWord());
//
//    }
//}
