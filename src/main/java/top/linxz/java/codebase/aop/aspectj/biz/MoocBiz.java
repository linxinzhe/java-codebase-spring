package top.linxz.java.codebase.aop.aspectj.biz;

import top.linxz.java.codebase.aop.aspectj.MoocMethod;
import org.springframework.stereotype.Service;

@Service
public class MoocBiz {
	
	@MoocMethod("MoocBiz save with MoocMethod.")
	public String save(String arg) {
		System.out.println("MoocBiz save : " + arg);
//		throw new RuntimeException(" Save failed!");
		return " Save success!";
	}

}
