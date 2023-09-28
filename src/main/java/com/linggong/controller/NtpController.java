package com.linggong.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class NtpController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @PostMapping("/startTiming")
    public void startTiming(@RequestBody TimingInfo timeInfo) {
        long currentTime = System.currentTimeMillis();
        long latency = currentTime - timeInfo.getStartTime();

        // Store latency in Redis
        stringRedisTemplate.opsForValue().set("latency", String.valueOf(latency));
    }

    @GetMapping("/getLatency")
    public String getLatency() {
        return stringRedisTemplate.opsForValue().get("latency");
    }
}