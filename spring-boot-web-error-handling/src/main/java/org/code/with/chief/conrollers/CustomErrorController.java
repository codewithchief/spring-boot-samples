package org.code.with.chief.conrollers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

	@GetMapping("/error")
	public String handleError(HttpServletRequest request, HttpServletResponse response) {
		
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");

		
		StringBuilder builder = new StringBuilder();
		builder.append("<html><body>")
		.append("<h1>Error Page</h1>")
		.append("<div>Exception : ")
		.append(exception == null ? "N/A" : exception.getMessage())
		.append("</div>")
		.append("<div> Status : ").append(statusCode).append("</div>")		
		.append("</body></html>");
		return builder.toString();
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
