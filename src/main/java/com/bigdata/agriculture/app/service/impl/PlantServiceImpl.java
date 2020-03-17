package com.bigdata.agriculture.app.service.impl;

import com.bigdata.agriculture.app.entity.Plant;
import com.bigdata.agriculture.app.mapper.PlantMapper;
import com.bigdata.agriculture.app.service.IPlantService;
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
public class PlantServiceImpl extends ServiceImpl<PlantMapper, Plant> implements IPlantService {

}
