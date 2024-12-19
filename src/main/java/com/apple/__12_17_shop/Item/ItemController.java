package com.apple.__12_17_shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("/ItemShop")
@Controller
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/main")
    public String list(Model model) {
        List<Item> items = this.itemService.findAll();
        model.addAttribute("items", items);
        return "Item_list";
    }

    @GetMapping("/add")
    public String listForm() {
        return "Item_add";
    }

    @PostMapping("/itemAdd")
    public String create(@ModelAttribute Item item) {

       this.itemService.create(item);
        return "redirect:/ItemShop/main";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable Integer id) {
        model.addAttribute("item", this.itemService.findId(id));
        return "Item_detail";
    }


}
