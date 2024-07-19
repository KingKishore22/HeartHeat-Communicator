package com.kishorekings;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class Simple_Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub	
		Class arr1[]= {Java_Config.class};
		return arr1;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String arr[]= {"/"};
		return arr;
	}

}
