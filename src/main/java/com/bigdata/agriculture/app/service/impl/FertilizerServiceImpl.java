package com.bigdata.agriculture.app.service.impl;

import com.bigdata.agriculture.app.entity.Fertilizer;
import com.bigdata.agriculture.app.mapper.FertilizerMapper;
import com.bigdata.agriculture.app.service.IFertilizerService;
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
public class FertilizerServiceImpl extends ServiceImpl<FertilizerMapper, Fertilizer> implements IFertilizerService {

}
