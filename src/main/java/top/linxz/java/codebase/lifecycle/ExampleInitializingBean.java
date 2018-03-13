package top.linxz.java.codebase.lifecycle;

import org.springframework.beans.factory.InitializingBean;

public class ExampleInitializingBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		//do something
	}

}
