# Java Mapping frameworks benchmark

运行：
```
./gradlew clean jmh
```


## 结果
Benchmark                                                                               Mode      Cnt       Score      Error   Units
JavaMappingFrameworksBenchmark.realLifeTest                                            thrpt        5    9225.671 ±  725.805  ops/ms
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark               thrpt        5      14.234 ±    0.912  ops/ms
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark           thrpt        5    8786.916 ±  700.900  ops/ms
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark               thrpt        5      15.840 ±    1.028  ops/ms
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark               thrpt        5     408.682 ±   23.486  ops/ms
JavaMappingFrameworksBenchmark.simpleTest                                              thrpt        5  129379.609 ± 9303.157  ops/ms
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark                   thrpt        5     768.121 ±   87.778  ops/ms
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark               thrpt        5  125411.120 ± 8957.740  ops/ms
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark                         thrpt        5    1082.585 ±  124.999  ops/ms
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark                   thrpt        5    2117.782 ±  134.305  ops/ms
JavaMappingFrameworksBenchmark.realLifeTest                                             avgt        5       0.031 ±    0.011   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark                avgt        5       0.065 ±    0.023   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark            avgt        5      ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark                avgt        5       0.054 ±    0.019   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark                avgt        5       0.003 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest                                               avgt        5       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark                    avgt        5       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark                avgt        5      ≈ 10⁻⁵              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark                          avgt        5       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark                    avgt        5      ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.realLifeTest                                           sample  4228883       0.023 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark              sample   836397       0.060 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.00        sample                0.055              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.50        sample                0.058              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.90        sample                0.060              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.95        sample                0.062              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.99        sample                0.104              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.999       sample                0.177              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p0.9999      sample                1.193              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark·p1.00        sample                2.122              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark          sample  1325495      ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.00    sample               ≈ 10⁻⁵              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.50    sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.90    sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.95    sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.99    sample               ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.999   sample                0.002              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p0.9999  sample                0.018              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark·p1.00    sample                1.133              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark              sample   894028       0.050 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.00        sample                0.046              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.50        sample                0.048              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.90        sample                0.050              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.95        sample                0.053              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.99        sample                0.093              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.999       sample                0.164              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p0.9999      sample                1.174              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark·p1.00        sample                2.126              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark              sample  1172963       0.003 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.00        sample                0.002              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.50        sample                0.003              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.90        sample                0.003              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.95        sample                0.003              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.99        sample                0.004              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.999       sample                0.024              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p0.9999      sample                0.085              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark·p1.00        sample                2.048              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.00                        sample               ≈ 10⁻⁵              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.50                        sample                0.003              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.90                        sample                0.058              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.95                        sample                0.059              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.99                        sample                0.070              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.999                       sample                0.145              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p0.9999                      sample                1.149              ms/op
JavaMappingFrameworksBenchmark.realLifeTest:realLifeTest·p1.00                        sample                2.126              ms/op
JavaMappingFrameworksBenchmark.simpleTest                                             sample  4949390       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark                  sample  1456982       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.00            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.50            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.90            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.95            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.99            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.999           sample                0.005              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p0.9999          sample                0.035              ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark·p1.00            sample                2.030              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark              sample  1354794      ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.00        sample               ≈ 10⁻⁶              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.50        sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.90        sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.95        sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.99        sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.999       sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p0.9999      sample                0.008              ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark·p1.00        sample                1.255              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark                        sample  1082047       0.001 ±    0.001   ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.00                  sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.50                  sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.90                  sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.95                  sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.99                  sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.999                 sample                0.005              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p0.9999                sample                0.031              ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark·p1.00                  sample                2.036              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark                  sample  1055567      ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.00            sample               ≈ 10⁻⁴              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.50            sample               ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.90            sample               ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.95            sample               ≈ 10⁻³              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.99            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.999           sample                0.003              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p0.9999          sample                0.024              ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark·p1.00            sample                2.050              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.00                            sample               ≈ 10⁻⁶              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.50                            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.90                            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.95                            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.99                            sample                0.001              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.999                           sample                0.004              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p0.9999                          sample                0.026              ms/op
JavaMappingFrameworksBenchmark.simpleTest:simpleTest·p1.00                            sample                2.050              ms/op
JavaMappingFrameworksBenchmark.realLifeTest                                               ss        5      11.248 ±   85.822   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:dozerMapperRealLifeBenchmark                  ss        5      12.554 ±   88.095   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:mapStructRealLifeMapperBenchmark              ss        5       0.498 ±    3.847   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:modelMapperRealLifeBenchmark                  ss        5      13.670 ±   96.471   ms/op
JavaMappingFrameworksBenchmark.realLifeTest:orikaMapperRealLifeBenchmark                  ss        5      18.271 ±  154.892   ms/op
JavaMappingFrameworksBenchmark.simpleTest                                                 ss        5       3.197 ±   26.898   ms/op
JavaMappingFrameworksBenchmark.simpleTest:dozerMapperSimpleBenchmark                      ss        5       6.557 ±   55.415   ms/op
JavaMappingFrameworksBenchmark.simpleTest:mapStructMapperSimpleBenchmark                  ss        5       0.296 ±    2.531   ms/op
JavaMappingFrameworksBenchmark.simpleTest:modelMapperBenchmark                            ss        5       3.399 ±   28.262   ms/op
JavaMappingFrameworksBenchmark.simpleTest:orikaMapperSimpleBenchmark                      ss        5       2.535 ±   21.384   ms/op
