package cn.ekgc.addrbook.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 */
public class Constants {
	private static Properties props=new Properties();
	static{
		try{
			//读取位于src下的addrbook.properties配置文件
			InputStream in=Constants.class.getClassLoader().getResourceAsStream("addrbook.properties");
			//使用Properties加载输入流
			props.load(in);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息:默认当前页码</b>
	 */
	public static final Integer PAGE_NUM=Integer.parseInt(props.getProperty("page.num"));

	/**
	 * <b>分页信息：默认每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE=Integer.getInteger(props.getProperty("page.size"));
}
