package com.github.amuguelove;

import com.github.amuguelove.dozer.DozerConverter;
import com.github.amuguelove.mapstruct.MapStructConverter;
import com.github.amuguelove.model.destination.DestinationCode;
import com.github.amuguelove.model.destination.Order;
import com.github.amuguelove.model.source.AccountStatus;
import com.github.amuguelove.model.source.Address;
import com.github.amuguelove.model.source.DeliveryData;
import com.github.amuguelove.model.source.Discount;
import com.github.amuguelove.model.source.OrderStatus;
import com.github.amuguelove.model.source.PaymentType;
import com.github.amuguelove.model.source.Product;
import com.github.amuguelove.model.source.RefundPolicy;
import com.github.amuguelove.model.source.Review;
import com.github.amuguelove.model.source.Shop;
import com.github.amuguelove.model.source.SourceCode;
import com.github.amuguelove.model.source.SourceOrder;
import com.github.amuguelove.model.source.User;
import com.github.amuguelove.modelmapper.ModelMapperConverter;
import com.github.amuguelove.orika.OrikaConverter;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 2)   // 进行 fork 的次数，表示 JMH 会 fork 出1个进程来进行测试
@OutputTimeUnit(TimeUnit.MILLISECONDS)  // 基准测试结果的时间类型
@BenchmarkMode(Mode.All)        // 基准测试的模式
@Measurement(iterations = 3)    // 测试参数，iterations = 3 表示进行3轮测试
@State(Scope.Group)
public class JavaMappingFrameworksBenchmark {
    private SourceOrder sourceOrder = null;
    private SourceCode sourceCode = null;

    private static final OrikaConverter ORIKA_CONVERTER = new OrikaConverter();
    private static final ModelMapperConverter MODEL_MAPPER_CONVERTER = new ModelMapperConverter();
    private static final DozerConverter DOZER_CONVERTER = new DozerConverter();

    @Setup
    public void setUp() {
        User user = new User("John", "John@doe.com", AccountStatus.ACTIVE);
        RefundPolicy refundPolicy = new RefundPolicy(true, 30, Collections
                .singletonList("Refundable only if not used!"));

        Product product = new Product(BigDecimal.valueOf(10.99),
                100,
                "Sample Product",
                "Sample Product to be sold",
                true,
                refundPolicy
        );

        Discount discount = new Discount(Instant.now().toString(), Instant.now().toString(), BigDecimal.valueOf(5.99));
        Address deliveryAddress = new Address("Washington Street 5", "New York", "55045", "USA");
        DeliveryData deliveryData = new DeliveryData(deliveryAddress, true, "", 10);
        Address shopAddress = new Address("Roosvelt Street 9", "Boston", "55042", "USA");
        User reviewingUser = new User("John", "Johhny@John.com", AccountStatus.ACTIVE);
        User negativeReviewingUser = new User("Carl", "Carl@Coral.com", AccountStatus.ACTIVE);
        Review review = new Review(5, 5, 5, reviewingUser, "The best shop I've ever bought things in");

        Review negativeReview = new Review(1, 1, 1, negativeReviewingUser, "I will never buy anything again here!");

        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review);
        reviewList.add(negativeReview);
        Shop shop = new Shop("Super Shop", shopAddress, "www.super-shop.com", reviewList);

        sourceOrder = new SourceOrder(OrderStatus.CONFIRMED,
                Instant.now().toString(),
                Instant.MAX.toString(),
                PaymentType.TRANSFER,
                discount,
                deliveryData,
                user,
                Collections.singletonList(product),
                shop,
                1
        );

        sourceCode = new SourceCode("This is source code!");
    }

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Group("realLifeTest")
    public Order orikaMapperRealLifeBenchmark() {
        return ORIKA_CONVERTER.convert(sourceOrder);
    }

    @Benchmark
    @Group("realLifeTest")
    public Order modelMapperRealLifeBenchmark() {
        return MODEL_MAPPER_CONVERTER.convert(sourceOrder);
    }

    @Benchmark
    @Group("realLifeTest")
    public Order dozerMapperRealLifeBenchmark() {
        return DOZER_CONVERTER.convert(sourceOrder);
    }

    @Benchmark
    @Group("realLifeTest")
    public Order mapStructRealLifeMapperBenchmark() {
        return MapStructConverter.MAPPER.convert(sourceOrder);
    }

    @Benchmark
    @Group("simpleTest")
    public DestinationCode orikaMapperSimpleBenchmark() {
        return ORIKA_CONVERTER.convert(sourceCode);
    }

    @Benchmark
    @Group("simpleTest")
    public DestinationCode modelMapperBenchmark() {
        return MODEL_MAPPER_CONVERTER.convert(sourceCode);
    }

    @Benchmark
    @Group("simpleTest")
    public DestinationCode dozerMapperSimpleBenchmark() {
        return DOZER_CONVERTER.convert(sourceCode);
    }

    @Benchmark
    @Group("simpleTest")
    public DestinationCode mapStructMapperSimpleBenchmark() {
        return MapStructConverter.MAPPER.convert(sourceCode);
    }
}
