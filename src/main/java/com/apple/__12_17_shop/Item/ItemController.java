package com.apple.__12_17_shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RequiredArgsConstructor
@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> items = this.itemRepository.findAll();
        model.addAttribute("items", items);
        return "list";
    }

}
