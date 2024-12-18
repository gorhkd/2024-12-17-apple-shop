package com.apple.__12_17_shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("/list")
@Controller
public class ItemController {

    private final ItemRepository itemRepository;
    private final ItemService itemService;

    @GetMapping("/")
    public String list(Model model) {
        List<Item> items = this.itemRepository.findAll();
        model.addAttribute("items", items);
        return "Item_list";
    }

    @GetMapping("/form")
    public String listForm() {
        return "Item_form";
    }

    @PostMapping("/create")
    public String create(@RequestParam String title, @RequestParam Integer price) {
       this.itemService.create(title, price);
        return "redirect:/list";
    }

}
