package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.sccooperation.dao.ICommonDao;

/**
 * ������ӿڵ�ʵ�֣�ע���ڽӿ���
 * 
 * @author wlnsss
 */
public class CommonDaoImpl<T> extends BaseDaoImpl<T> implements ICommonDao<T> {

	/**
	 * ���ӿ���ע��
	 * 
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */

	@SuppressWarnings("unchecked")
	public boolean isEnable(String table, int id, String state) throws Exception {

		// ˼·һUpdate
		// hql���
		String hql = "UPDATE " + table + " set state = ?0 " + "WHERE id = ?1";

		// ������Bȡ��
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

		// ˼·������
		// //���û��������state�ֶε�״̬
		// List<T> resultList = find(hql,id);
		//
		// boolean listIsNull = resultList.isEmpty();
		//
		// if(listIsNull) {
		//
		// //Ϊ�շ���ʧ��
		// return false;
		// }else {
		//
		// @SuppressWarnings({ "unchecked", "rawtypes" })
		// //���䴴��ʵ��
		// Class clz = Class.forName("org.sccooperation.domain." + table);
		//
		// //����ʵ��
		// Object objInstance = clz.newInstance();
		//
		// Method m = objInstance.getClass().getDeclaredMethod("setState",
		// String.class);
		//
		// //init
		// String result = null;
		//
		// if(state == "1") {
		// //���÷���
		// result = (String) m.invoke(objInstance, "0");
		// }
		//
		// if(state == "0") {
		// result = (String) m.invoke(objInstance, "1");
		// }
		//
		// //����
		// @SuppressWarnings("unused")
		// Serializable saveResult = save((T)objInstance);
		// }

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> searchByPageNo(String table, String keyword, int pageNo) {
		// TODO Auto-generated method stub

		// ������ƻ�ȡ�ñ��ȫ���ֶ���
		// �Ȼ�ȡ���������
		Class<?> clz = null;
		try {
			clz = Class.forName(table);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��ȡ�ֶ�������
		Field[] field = clz.getDeclaredFields();

		// �ֶ�������
		String[] name = new String[field.length];

		// ��Field����תΪString
		for (int i = 0; i < field.length; i++) {
			name[i] = field[i].getName();
		}

		// ��װhql
		String hql = "from " + table + " where ";
		
		//��Ӧ��keyword
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
