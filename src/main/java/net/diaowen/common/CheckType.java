package net.diaowen.common;

/**
 * CheckType
 * @author keyuan(keyuan258@gmail.com)
 *定义了一些验证类型
 * https://github.com/wkeyuan/DWSurvey
 * http://dwsurvey.net
 */
public enum CheckType {
	NO("无验证", 0),
	EMAIL("Email", 1),
	STRLEN("字符长度", 2),
	UNSTRCN("禁止中文", 3),
	STRCN("仅许中文", 4),
	NUM("数值", 5),
	TELENUM("电话号码", 6),
	PHONENUM("手机号码", 7),
	DATE("日期", 8),
	IDENTCODE("身份证号", 9),
	ZIPCODE("邮政编码", 10),
	URL("网址", 11),
	TELE_PHONE_NUM("电话或手机号", 12),
	DIGITS("电话或手机号", 13);

	private String name;
	private int index;
	/**
	 * 构造函数
	 *
	 * @param name 名称
	 * @param index 索引
	 */
	CheckType(String name,int index){
		this.name=name;
		this.index=index;
	}
	/**
	 * 获取名称
	 *
	 * @return 名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 获取索引
	 *
	 * @return 索引
	 */
	public int getIndex() {
		return index;
	}
}
