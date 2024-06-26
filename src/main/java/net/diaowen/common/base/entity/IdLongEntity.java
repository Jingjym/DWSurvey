package net.diaowen.common.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 统一定义id的entity基类.
 *
 * 基类统一定义id的属性名称、数据类型、列名映射及生成策略.
 * 子类可重载getId()函数重定义id的列名映射和生成策略.
 *
 */
//JPA Entity基类的标识
@MappedSuperclass
public abstract class IdLongEntity {

	protected Long id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid-string")
	//@GeneratedValue(generator = "system-uuid")
    //@GenericGenerator(name = "system-uuid", strategy = "uuid")
    //@Column(length = 32)
	/**
	 * 获取ID。
	 *
	 * @return ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置ID。
	 *
	 * @param id ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
