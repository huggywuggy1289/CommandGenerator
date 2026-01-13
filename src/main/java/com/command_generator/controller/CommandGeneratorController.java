package com.command_generator.controller;

import com.command_generator.dto.EnchantmentRequest;
import com.command_generator.dto.MonsterRequest;
import com.command_generator.service.CommandGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

// CommandGeneratorController.java
@Controller
public class CommandGeneratorController {

    private final CommandGenerator commandGenerator;

    public CommandGeneratorController(CommandGenerator commandGenerator) {
        this.commandGenerator = commandGenerator;
    }

    @GetMapping("/") // 이제 도메인/ 접속 시 바로 작동합니다.
    public String index() {
        return "redirect:/command/form";
    }

    @GetMapping("/command/form") // 전체 경로를 다 적어줍니다.
    public String showForm() {
        return "command_form";
    }

    @PostMapping("/command/generate")
    public String generateCommand(@ModelAttribute EnchantmentRequest enchantmentRequest, Model model) {
        String command = commandGenerator.generate(enchantmentRequest);
        model.addAttribute("command", command);
        return "command_form";
    }

    @RequestMapping(value = "/command/kill", method = RequestMethod.POST)
    public String generateMonsterCommand(@ModelAttribute MonsterRequest monsterRequest, Model model) {
        // CommandGenerator 서비스 호출
        String command = commandGenerator.generateMonsterCommand(monsterRequest);
        // 모델에 command 추가
        model.addAttribute("command", command);
        // 같은 폼을 다시 보여줌
        return "command_form";
    }
}


