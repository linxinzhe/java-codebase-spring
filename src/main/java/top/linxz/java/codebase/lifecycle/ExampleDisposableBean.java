package top.linxz.java.codebase.lifecycle;

import org.springframework.beans.factory.DisposableBean;

public class ExampleDisposableBean implements DisposableBean {

	@Override
	public void destroy() throws Exception {
		//do something
	}

}
