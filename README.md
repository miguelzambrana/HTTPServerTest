# HTTPServerTest
HTTPServerTest

## Comparing with wrk the following http libs:
- Spark
- SimpleFramework
- UndertowIO

## Using WRK for the tests
- More info in the [wrk site](https://github.com/wg/wrk)

## And, action!!!!
![Go go go!](http://orig09.deviantart.net/9b21/f/2013/018/6/b/my_first_full_body_fight_by_catasthrophy-d5rvgyz.gif)

### Spark
[Spark](http://sparkjava.com/)


```
miki@miki-Pepino:~/wrk$ ./wrk -t4 -c500 -d30s "http://localhost:8081/fastdata"
Running 30s test @ http://localhost:8081/fastdata
  4 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency    80.29ms  176.17ms   1.99s    89.75%
    Req/Sec    13.04k     3.72k   21.07k    68.35%
  1546353 requests in 30.04s, 436.52MB read
  Socket errors: connect 0, read 0, write 0, timeout 246
Requests/sec:  51474.08
Transfer/sec:     14.53MB
```

### SimpleFramework 
[Simple Framework](http://www.simpleframework.org/)

```
miki@miki-Pepino:~/wrk$ ./wrk -t4 -c500 -d30s "http://localhost:8080/fastdata"
Running 30s test @ http://localhost:8080/fastdata
  4 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.90ms    3.78ms 212.60ms   90.63%
    Req/Sec    18.12k     1.83k   23.89k    74.33%
  2165997 requests in 30.04s, 454.44MB read
Requests/sec:  72104.34
Transfer/sec:     15.13MB
```

### UndertowIO
[UndertowIO](http://undertow.io/)

```
miki@miki-Pepino:~/wrk$ ./wrk -t4 -c500 -d30s "http://localhost:8082/fastdata"
Running 30s test @ http://localhost:8082/fastdata
  4 threads and 500 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     2.85ms    5.82ms 259.93ms   94.24%
    Req/Sec    56.06k     8.84k   83.04k    76.84%
  6692640 requests in 30.03s, 1.68GB read
Requests/sec: 222888.38
Transfer/sec:     57.39MB
```

