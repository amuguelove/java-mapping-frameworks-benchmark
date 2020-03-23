package com.github.amuguelove.dozer;

import com.github.amuguelove.Converter;
import com.github.amuguelove.model.destination.DestinationCode;
import com.github.amuguelove.model.destination.Order;
import com.github.amuguelove.model.source.SourceCode;
import com.github.amuguelove.model.source.SourceOrder;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerConverter implements Converter {

    private final Mapper mapper;

    public DozerConverter() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(DozerConverter.class.getResourceAsStream("/dozer-mapping.xml"));
        this.mapper = mapper;
    }

    @Override
    public Order convert(SourceOrder sourceOrder) {
        return mapper.map(sourceOrder, Order.class);
    }

    @Override
    public DestinationCode convert(SourceCode sourceCode) {
        return mapper.map(sourceCode, DestinationCode.class);
    }
}
