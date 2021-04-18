package cn.ekgc.addrbook.transport.impl;

import cn.ekgc.addrbook.transport.UserTranSport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>用户功能传输层接口实现类</b>
 */
@RestController("userTranspost")
@RequestMapping("/user/trans")
public class UserTranspostImpl implements UserTranSport {
}
