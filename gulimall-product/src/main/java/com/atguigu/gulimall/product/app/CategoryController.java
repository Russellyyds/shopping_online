package com.atguigu.gulimall.product.app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.common.utils.R;

import javax.validation.Valid;


/**
 * 商品三级分类
 *
 * @author Russell
 * @email 954013384@qq.com
 * @date 2023-03-19 12:02:20
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分類以及子分類,以樹形結構組裝起來列表
     */
    @RequestMapping("/list/tree")
    //@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params){
       List<CategoryEntity> categoryEntities= categoryService.listWithTree();


        return R.ok().put("data", categoryEntities);
    }
//    @RequestMapping("/list")
//    //@RequiresPermissions("product:category:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = categoryService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
   // @RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@Valid @RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }


    @RequestMapping("/update/sort")
    //@RequiresPermissions("product:category:update")
    public R updateSort(@RequestBody CategoryEntity[] category){

        categoryService.updateBatchById(Arrays.asList(category));

        return R.ok();
    }
    /**
     * 修改
     */
//    @RequestMapping("/update")
//    //@RequiresPermissions("product:category:update")
//    public R update(@RequestBody CategoryEntity category){
//		categoryService.updateById(category);
//
//        return R.ok();
//    }
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
        categoryService.updateCascade(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
        //1.检查当前菜单是不是被别的地方引用
//		categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
