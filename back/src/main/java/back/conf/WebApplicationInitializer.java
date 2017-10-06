package back.conf;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import dao.conf.DatabaseConfig;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	   /** 
     * 获取配置信息 
     * @return 
     */  
    @Override  
    protected Class<?>[] getRootConfigClasses() {  
        return new Class[] { BackConfig.class, DatabaseConfig.class, SecurityConfig.class };  
    }  
    @Override  
    protected Class<?>[] getServletConfigClasses() {  
        return new Class[] { MvcConfig.class };  
    }  
  
    @Override  
    protected String[] getServletMappings() {  
        return new String[] { "/" };  
    }  
  
    @Override  
    protected Filter[] getServletFilters() {  
        return null;  
    }  
}
