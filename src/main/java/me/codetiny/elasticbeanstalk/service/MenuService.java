package me.codetiny.elasticbeanstalk.service;

import lombok.RequiredArgsConstructor;
import me.codetiny.elasticbeanstalk.dto.MenuDTO;
import me.codetiny.elasticbeanstalk.entity.Menu;
import me.codetiny.elasticbeanstalk.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository repository;
    private final ModelMapper modelMapper;

    public MenuDTO findByMenuCode(int menuCode) {

        Menu foundMenu = repository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

        return modelMapper.map(foundMenu , MenuDTO.class);
    }

}
