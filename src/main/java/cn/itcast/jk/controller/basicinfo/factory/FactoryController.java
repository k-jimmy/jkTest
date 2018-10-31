package java.cn.itcast.jk.controller.basicinfo.factory;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.cn.itcast.jk.domain.Factory;
import java.cn.itcast.jk.service.FactoryService;
import java.util.List;

public class FactoryController extends cn.itcast.jk.controller.BaseController {
    @Resource
    FactoryService factoryService;
    //    列表
    @RequestMapping("/basicinfo/factory/list.action")
    public String list(Model model) {
        List<Factory> dataList=factoryService.find(null);
        model.addAttribute("dataList", dataList);
        return "/basicinfo/factory/jFactoryList.jsp";//转向页面
    }
}
