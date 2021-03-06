package com.autumnframework.common.dao.bomapper;

import com.autumnframework.common.model.bo.ResponseMsg;
import com.autumnframework.common.model.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_user
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int updateByPrimaryKey(User record);
    /**
     * 根据登陆用户名和状态查询用户信息
     * @param userLoginName
     * @param userStatus
     * @return
     */
    User selectUserByloginNameAndStatus(@Param("userLoginName") String userLoginName, @Param("userStatus") Long userStatus);

    /**
     * 获取所有的用户
     * @param start
     * @param limit
     * @return
     */
    List<User> selectAllUser(@Param("start") int start, @Param("limit") int limit);

    /**
     * 获取用户数量
     * @return
     */
    int getUserCount();

    /**
     * 判断用户是否存在
     * @param user_login_name
     * @return
     */
    int checkUserExist(String user_login_name);
    /**
     * 根据用户登录名改变用户状态
     * @param status
     * @param user_login_name
     * @return
     */
    int updateUserStatusByLoginName(@Param("status") int status, @Param("user_login_name") String user_login_name);



}