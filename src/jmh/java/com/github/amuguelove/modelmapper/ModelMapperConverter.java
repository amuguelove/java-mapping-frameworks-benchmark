package com.github.amuguelove.modelmapper;

import com.github.amuguelove.Converter;
import com.github.amuguelove.model.destination.DestinationCode;
import com.github.amuguelove.model.destination.Order;
import com.github.amuguelove.model.source.SourceCode;
import com.github.amuguelove.model.source.SourceOrder;
import org.modelmapper.ModelMapper;

public class ModelMapperConverter implements Converter {

    private ModelMapper modelMapper;

    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
    }

    @Override
    public Order convert(SourceOrder sourceOrder) {
        return modelMapper.map(sourceOrder, Order.class);
    }

    @Override
    public DestinationCode convert(SourceCode sourceCode) {
        return modelMapper.map(sourceCode, DestinationCode.class);
    }
}
