package net.diaowen.common.base.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.diaowen.common.base.entity.User;
import net.diaowen.common.dao.BaseDaoImpl;
import net.diaowen.common.plugs.page.Page;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;


/**
 * @author keyuan(keyuan258@gmail.com)
 *
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 * 用户数据访问对象实现类，继承自BaseDaoImpl。
 *
 * @param User 用户类型
 * @param String 字符串类型
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao{

	@Override
	public void resetUserGroup(String groupId) {
		String sql="UPDATE t_user SET user_group_id = '' WHERE id = id";
		this.getSession().createSQLQuery(sql).executeUpdate();
	}

}
