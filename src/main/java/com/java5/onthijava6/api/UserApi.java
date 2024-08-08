package com.java5.onthijava6.api;

import com.java5.onthijava6.entity.User;
import com.java5.onthijava6.repository.UserRepo;
import com.java5.onthijava6.service.UserSevice;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserApi {
    private final UserSevice userService;

    @GetMapping("/getAllUser")
    public ResponseEntity<?> doGetAllUser(){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success",true);
            response.put("data",userService.getAllUser());
            response.put("message","Call api success");
        }catch (Exception e){
            response.put("success",false);
            response.put("data",null);
            response.put("message","Call api faile");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<?> doSaveUser(@RequestBody User user){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success",true);
            response.put("data",userService.saveUser(user));
            response.put("message","Call api success");
        }catch (Exception e){
            response.put("success",false);
            response.put("data",null);
            response.put("message","Call api faile");
        }
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> doSaveUser(@RequestParam("userId") String userId){
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("success",true);
            response.put("data",userService.deleteUser(userId));
            response.put("message","Call api success");
        }catch (Exception e){
            response.put("success",false);
            response.put("data",null);
            response.put("message","Call api faile");
        }
        return ResponseEntity.ok(response);
    }
}
