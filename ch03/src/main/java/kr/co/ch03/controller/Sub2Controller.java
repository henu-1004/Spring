package kr.co.ch03.controller;

import kr.co.ch03.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sub2Controller {

    @GetMapping("/sub2/register")
    public String register(){
        return "/sub2/register";
    }

    @PostMapping("/sub2/register")
    public String register(UserDTO userDTO){
        System.out.println("uid : "+userDTO.getUid());
        System.out.println("name : "+userDTO.getName());
        System.out.println("birth : "+userDTO.getBirth());
        System.out.println("age : "+userDTO.getAge());

        //redirect 시작 문자열로 처리
        return "redirect:/index";
    }
}
