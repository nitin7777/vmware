package com.example.vmware;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class OperationController {

    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public int add(@RequestBody Map<String, Object> data) {
        try {
            int x = Integer.valueOf((String) data.get("x"));
            int y = Integer.valueOf((String) data.get("y"));
            return (x + y);
        }
        catch(Exception e){
            return Integer.MAX_VALUE;
        }
    }

    @PostMapping(path="/diff", consumes = "application/json", produces = "application/json")
    public int diff(@RequestBody Map<String, Object> data) {
        try {
            int x = Integer.valueOf((String) data.get("x"));
            int y = Integer.valueOf((String) data.get("y"));
            return (x - y);
        }
        catch(Exception e){
            return Integer.MIN_VALUE;
        }
    }


}
