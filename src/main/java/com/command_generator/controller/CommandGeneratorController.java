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
@RequestMapping("/command")
public class CommandGeneratorController {

    private final CommandGenerator commandGenerator;

    // CommandGenerator 서비스 주입
    @Autowired
    public CommandGeneratorController(CommandGenerator commandGenerator) {
        this.commandGenerator = commandGenerator;
    }

    @GetMapping("/form")
    public String showForm() {
        return "command_form";  // /src/main/resources/templates/command_form.html
    }

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    public String generateCommand(@ModelAttribute EnchantmentRequest enchantmentRequest, Model model) {
        String command = commandGenerator.generate(enchantmentRequest);
        System.out.println("Generated command: " + command);  // 생성된 명령어 출력
        model.addAttribute("command", command);
        return "command_form";
    }

    @RequestMapping(value = "/kill", method = RequestMethod.POST)
    public String generateMonsterCommand(@ModelAttribute MonsterRequest monsterRequest, Model model) {
        // CommandGenerator 서비스 호출
        String command = commandGenerator.generateMonsterCommand(monsterRequest);
        // 모델에 command 추가
        model.addAttribute("command", command);
        // 같은 폼을 다시 보여줌
        return "command_form";
    }
}


