package com.hzb.feign;

import com.hzb.entity.Student;
import com.hzb.feign.Impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
