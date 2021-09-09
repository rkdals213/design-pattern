package abstract_factory.domain.userInfo.dao.mysql;

import abstract_factory.domain.userInfo.UserInfo;
import abstract_factory.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySql DB UserInfoID = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update into MySql DB UserInfoID = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete into MySql DB UserInfoID = " + userInfo.getUserId());
    }
}
