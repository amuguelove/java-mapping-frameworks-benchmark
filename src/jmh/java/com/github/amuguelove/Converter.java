package com.github.amuguelove;

import com.github.amuguelove.model.destination.DestinationCode;
import com.github.amuguelove.model.destination.Order;
import com.github.amuguelove.model.source.SourceCode;
import com.github.amuguelove.model.source.SourceOrder;

public interface Converter {

    Order convert(SourceOrder sourceOrder);

    DestinationCode convert(SourceCode sourceCode);
}
