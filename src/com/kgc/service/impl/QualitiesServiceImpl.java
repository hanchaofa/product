package com.kgc.service.impl;

import com.kgc.mapper.QualitiesMapper;
import com.kgc.pojo.Qualities;
import com.kgc.service.QualitiesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QualitiesServiceImpl implements QualitiesService {
    @Resource
    QualitiesMapper qualitiesMapper;
    @Override
    public int updateQualities(Qualities qualities) {
        return qualitiesMapper.updateQualities(qualities);
    }

    @Override
    public int addQualities(Qualities qualities) {
        return qualitiesMapper.addQualities(qualities);
    }

    @Override
    public Qualities getById(Integer productId) {
        return qualitiesMapper.getById(productId);
    }
}
