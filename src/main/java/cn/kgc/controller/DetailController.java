package cn.kgc.controller;

import cn.kgc.entity.Detail;
import cn.kgc.service.DetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Detail)表控制层
 *
 * @author makejava
 * @since 2021-01-15 15:03:14
 */
@Controller
@RequestMapping("/detail")
public class DetailController {
    /**
     * 服务对象
     */
    @Resource
    private DetailService detailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Detail selectOne(Integer id) {
        return this.detailService.queryById(id);
    }

    @RequestMapping("getAllDet")
    public String getAllDet(Model model,Detail detail){
        List<Detail> detailList=this.detailService.findAllDet(detail);
        model.addAttribute("detail",detailList);
        return "news";
    }
    @RequestMapping("titleAll")
    public String titleAll(Model model,String title){
        List<Detail> detail=this.detailService.findTitle(title);
        model.addAttribute("detail",detail);
        return "news";
    }
    @RequestMapping("toUp")
    public String toUp(Model model,Integer id){
        System.out.println(id);
        Detail detail=this.detailService.queryById(id);
        model.addAttribute("oneNews",detail);
        return "update";
    }
    @RequestMapping("doUp")
    public String doUP(Integer id,Integer categoryId,String title,String summary,String author,Model model){
        Detail detail=new Detail();
        detail.setId(id);
        detail.setCategoryid(categoryId);
        detail.setTitle(title);
        detail.setSummary(summary);
        detail.setAuthor(author);
        if (this.detailService.update(detail)!=null){
            return getAllDet(model,detail);
        } else {
            return "update";
        }
    }
}