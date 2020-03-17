package com.bigdata.agriculture.app.service.impl;

import com.bigdata.agriculture.app.entity.Information;
import com.bigdata.agriculture.app.mapper.InformationMapper;
import com.bigdata.agriculture.app.service.IInformationService;
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
public class InformationServiceImpl extends ServiceImpl<InformationMapper, Information> implements IInformationService {

}
