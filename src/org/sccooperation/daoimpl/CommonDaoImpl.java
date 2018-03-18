package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.sccooperation.dao.ICommonDao;

/**
 * 共有类接口的实现，注释在接口里
 * 
 * @author wlnsss
 */
public class CommonDaoImpl<T> extends BaseDaoImpl<T> implements ICommonDao<T> {

	/**
	 * 父接口有注释
	 * 
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */

	@SuppressWarnings("unchecked")
	public boolean isEnable(String table, int id, String state) throws Exception {

		// 思路一Update
		// hql语句
		String hql = "UPDATE " + table + " set state = ?0 " + "WHERE id = ?1";

		// 根據狀態取反
		int effectOfRows = -1;
		if (state.equals("1")) {
			effectOfRows = updateByFields(hql, "0", id);
		}
		if (state.equals("0")) {
			effectOfRows = updateByFields(hql, "1", id);
		}

		if (effectOfRows >= 0) {
			return true;
		} else {
			return false;
		}

		// 思路二反射
		// //调用基础类查找state字段的状态
		// List<T> resultList = find(hql,id);
		//
		// boolean listIsNull = resultList.isEmpty();
		//
		// if(listIsNull) {
		//
		// //为空返回失败
		// return false;
		// }else {
		//
		// @SuppressWarnings({ "unchecked", "rawtypes" })
		// //反射创建实例
		// Class clz = Class.forName("org.sccooperation.domain." + table);
		//
		// //创建实例
		// Object objInstance = clz.newInstance();
		//
		// Method m = objInstance.getClass().getDeclaredMethod("setState",
		// String.class);
		//
		// //init
		// String result = null;
		//
		// if(state == "1") {
		// //调用方法
		// result = (String) m.invoke(objInstance, "0");
		// }
		//
		// if(state == "0") {
		// result = (String) m.invoke(objInstance, "1");
		// }
		//
		// //保存
		// @SuppressWarnings("unused")
		// Serializable saveResult = save((T)objInstance);
		// }

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchByPageNo(String table, String keyword, int pageNo) {
		// TODO Auto-generated method stub

		// 反射机制获取该表的全部字段名
		// 先获取类的类类型
		Class<?> clz = null;
		try {
			clz = Class.forName(table);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 获取字段名数组
		Field[] field = clz.getDeclaredFields();

		// 字段名数组
		String[] name = new String[field.length];

		// 把Field类型转为String
		for (int i = 0; i < field.length; i++) {
			name[i] = field[i].getName();
		}

		// 组装hql
		String hql = "from " + table + " where ";
		
		//对应的keyword
		String[] keywordArr = new String[name.length];

		for (int i = 0; i < name.length; i++) {

			if (i != name.length - 1) {
				hql += name[i] + " like ?" + i + " or ";
			}else {
				hql += name[i] + " like ?" + i + " ";
			}
			
			keywordArr[i] = "%"+keyword+"%";
		}

		hql += " order by time desc";
		
		System.out.println(hql);

//		return findByPage("from Note as n where n.title like ?0 order by time desc", pageNo, 10, 10,
//				"%" + keyword + "%");
		return findByPageByArray(hql, pageNo, 10, 10, keywordArr);
	}

}
