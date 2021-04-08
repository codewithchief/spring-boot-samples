package org.code.with.chief.error;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

public class CustomErrorAttributes extends DefaultErrorAttributes {

	@Autowired
	private ErrorAttributeOptions errorAttributeOptions;

	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
		return super.getErrorAttributes(webRequest, this.errorAttributeOptions);
	}

}
