package cn.imnu.handler;

import cn.imnu.entity.Goods;
import cn.imnu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class AnnotationHandler {

    /**
     * 业务方法:ModelAndView完成数据的传递，视图的解析
     */
//    @RequestMapping("modelAndViewTest")
//    public ModelAndView modelAndViewTest(){
//        //创建ModelAndView对象
//        ModelAndView modelAndView = new ModelAndView();
//        //填充模型数据
//        modelAndView.addObject("name","Tom");
//        //添加逻辑视图
//        modelAndView.setViewName("show");
//        return modelAndView;
//    }

    /**
     * Model传值,String进行视图解析
     */
    @RequestMapping("/ModelTest")
    public String ModelTest(Model model){
        //填充模型数据
        model.addAttribute("name","Jerry");
        //设计逻辑视图
        return "show";
    }
    @RequestMapping("/MapTest")
    public String MapTest(Map<String,String> map){
        map.put("name","cat");
        return "show";
    }
    /**
     * 添加商品并展示
     */
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(Goods goods){
//        System.out.println(goods.getName()+"---"+goods.getPrice());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods",goods);
        modelAndView.setViewName("show");
        return modelAndView;
    }
    @RequestMapping("/login")
    public ModelAndView login(User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("User",user);
        modelAndView.setViewName("show");
        return modelAndView;
    }
}
