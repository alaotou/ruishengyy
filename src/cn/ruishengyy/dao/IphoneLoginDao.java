package cn.ruishengyy.dao;

import cn.ruishengyy.enitiy.UserInfo;

import java.util.List;

public interface IphoneLoginDao {
    /**
     * 查询符合该数据的有多少
     * @param phone  手机号
     * @return 有几条
     */
    int getuser(String phone);

    /**
     * 获取管理元数据
     * @param phone 手机号
     * @return 返回userinfo对象
     */
    List<UserInfo> getuserinfo(String phone);
}
