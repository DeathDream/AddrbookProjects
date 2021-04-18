package cn.ekgc.addrbook.dao;

import cn.ekgc.addrbook.pojo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b>用户功能数据持久层接口实现类</b>
 */
@Repository
public interface UserDao {
	/**
	 * <b>根据用户信息查询用户列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User>findListByQuery(User query)throws Exception;

	/**
	 * <b>保存用户信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(User entity)throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(User entity)throws Exception;

	/**
	 * <b>根据用户id删除用户信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int deleteById(Long id)throws Exception;
}
