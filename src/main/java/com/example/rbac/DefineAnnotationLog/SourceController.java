package com.example.rbac.DefineAnnotationLog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Created by zhanghl
 */
@Controller
public class SourceController {
    @MyLog
    @GetMapping("/sourceC/{source_name}")
    public String sourceC(@PathVariable("source_name") String sourceName) {
        return "你正在访问sourceC资源";
    }
}


