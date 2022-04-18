package com.knits.product.util;

import org.modelmapper.ModelMapper;

public class MapperUtil
{
    public static ModelMapper getPartialMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setSkipNullEnabled(true);
        return mapper;
    }
}
