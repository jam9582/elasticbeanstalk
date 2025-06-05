package me.codetiny.elasticbeanstalk.controller;

import lombok.RequiredArgsConstructor;
import me.codetiny.elasticbeanstalk.dto.MenuDTO;
import me.codetiny.elasticbeanstalk.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService service;

    @GetMapping("/health")
    public String healthCheck() {
        return "cloud health check!!";
    }

    @GetMapping("/menus/{menuCode}")
    public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {

        MenuDTO resultMenu = service.findByMenuCode(menuCode);

        return resultMenu;
    }

}
