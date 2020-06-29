/**
 * 
 */
package org.my.site;

import org.my.core.CoreTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuxk
 *
 * @version 2020年6月29日 上午10:13:26
 *
 * @description:
 */
@Controller
public class WebController {

	@RequestMapping("/test")
	@ResponseBody
	public String test(Model model) {
		System.out.println("hello world");
		CoreTest coreTest = new CoreTest();
		return coreTest.show();

	}

}
