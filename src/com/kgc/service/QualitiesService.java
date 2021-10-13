package com.kgc.service;

import com.kgc.pojo.Qualities;

public interface QualitiesService {
    int updateQualities(Qualities qualities);
    int addQualities(Qualities qualities);
    Qualities getById(Integer productId);
}
