package back.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override  
    public void addResourceHandlers(ResourceHandlerRegistry registry) {  
  
    }  
   
    @Override  
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {  
        configurer.enable();  
    }  
  
    /** 
     * jsp视图解析器 
     * @return 
     */  
    @Bean  
    public InternalResourceViewResolver jspViewResolver() {  
        InternalResourceViewResolver bean = new InternalResourceViewResolver();  
        bean.setViewClass(org.springframework.web.servlet.view.JstlView.class);  
        bean.setPrefix("/WEB-INF/pages/");  
        bean.setSuffix(".jsp");  
        return bean;  
    }  
  
    /** 
     *  公共部分解析器 
     * @return 
     */  
    @Bean(name="multipartResolver")  
    public CommonsMultipartResolver commonsMultipartResolver(){  
        CommonsMultipartResolver common = new CommonsMultipartResolver();  
        common.setMaxUploadSize(10 * 1024 * 1024);//10M  
        return common;  
    }  
}
