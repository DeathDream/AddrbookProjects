package cn.ekgc.addrbook.service.impl;

import cn.ekgc.addrbook.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>用户功能传输层接口实现类</b>
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
}
