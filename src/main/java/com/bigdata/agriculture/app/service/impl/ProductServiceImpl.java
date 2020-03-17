package com.bigdata.agriculture.app.service.impl;

import com.bigdata.agriculture.app.entity.Product;
import com.bigdata.agriculture.app.mapper.ProductMapper;
import com.bigdata.agriculture.app.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jdq
 * @since 2020-03-14
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
