package net.diaowen.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 * 用于处理属性配置，但方法内被全部注释了
 * @author keyuan
 *
 */
public class DiaowenProperty extends
		PropertyPlaceholderConfigurer {

	// 存储URL前缀
	public static final String STORAGE_URL_PREFIX = null;

	// 调查URL模式，默认为"auto"
	public static final String SURVEYURL_MODE = "auto";

	// 网站URL，默认为"http://192.168.3.20:8080/#"
	public static final String WEBSITE_URL = "http://192.168.3.20:8080/#";


	// 许可描述
	public static final String LICENSE_DESC = null;

	// 许可组织
	public static final String LICENSE_ORGAN = null;

	// 许可邮件
	public static final String LICENSE_EMAIL = null;

	// 许可类型名称
	public static final String LICENSE_TYPENAME = null;

	// 许可域
	public static final String LICENSE_DOMAIN = null;

	// 许可创建日期
	public static final String LICENSE_CREATIONDATE = null;

	// 服务器ID
	public static final String LICENSE_SERVERID = null;

	// 许可ID
	public static final String LICENSE_ID = null;

	// 许可版本
	public static final String LICENSE_VERSION = null;

	// 许可评估
	public static final String LICENSE_EVALUATION = null;

	// 许可公钥
	public static final String LICENSE_PUBLICKEY = null;

	// 许可签名
	public static final String LICENSE_SIGN = null;

	/**
	 *处理属性方法，加载配置文件中的属性值到对应的静态变量中
	 * @param beanFactoryToProcess 可配置的可列表化的Bean工厂，允许对Bean定义进行修改
	 * @param props 属性文件中键值对的集合
	 * @throws BeansException 表明processProperties方法可能会抛出BeansException异常
	 */


	/**
	 *
	 */
	public void diaowenInit(){
		//不知道什么用
	}

}
