package com.szw.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.szw.pojo.BussElement;
import com.szw.service.BussElementService;

/**
 * 访问方式，如下：
 * http://127.0.0.1:8080/suzhiwei-test/BussElement/findByBussElement
 * @author suzhiwei
 *	要素
 */
@Controller
@RequestMapping("/BussElement")
public class BussElementControllers {
	@Autowired
	private BussElementService bussElementService;
	/**
	 * 要素展示
	 */
	@RequestMapping("/findByBussElement")
	@ResponseBody
	public Object findByBussElement(){
		List<BussElement> bussElementList = bussElementService.findByBussElement();
 		return bussElementList.get(0);
	}
	@RequestMapping("/tests")
	public String tests(HttpServletRequest request) {
		String parameter = request.getParameter("name");
		System.out.println(parameter);
		return "test";
	}
}
