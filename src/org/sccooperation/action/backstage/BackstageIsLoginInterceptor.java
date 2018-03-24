package org.sccooperation.action.backstage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

class BackstageIsLoginInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
//		boolean bol = (ActionContext.getContext().getSession().get("backstageUser") == null);
//		if(ActionContext.getContext().getSession().get("backstageUser") == null) {
//			return "loginFalse";
//		}
		
		String result = arg0.invoke();
		
		return result;
	}

}
