package com.kgc.mapper;

import com.kgc.pojo.Qualities;

public interface QualitiesMapper {
    int updateQualities(Qualities qualities);
    int addQualities(Qualities qualities);
    Qualities getById(Integer productId);
}
