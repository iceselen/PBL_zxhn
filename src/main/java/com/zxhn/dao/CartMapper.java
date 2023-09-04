package com.zxhn.dao;

import com.zxhn.pojo.Cart;
import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Param;

import java.util.List;

//购物车相关组件接口
public interface CartMapper {
    //根据组件删除
    int deleteByPrimaryKey(@Param("id") Integer id);
    //直接插入
    int insert(Cart record);
    //有选择的插入
    int insertSelective(Cart record);
    //根据组件查询对象
    Cart selectByPrimaryKey(Integer id);
    //有选择的根据组件更新
    int updateByPrimaryKeySelective(Cart record);
    //根据组件更新
    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId")Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@Param("userId") Integer userId,@Param("productIdList")List<String> productIdList);


    int checkedOrUncheckedProduct(@Param("userId") Integer userId,@Param("productId")Integer productId,@Param("checked") Integer checked);

    int selectCartProductCount(@Param("userId") Integer userId);


    List<Cart> selectCheckedCartByUserId(Integer userId);


}