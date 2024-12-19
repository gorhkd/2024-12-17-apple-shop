package com.apple.__12_17_shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@RequestMapping("/ItemShop")
@Controller
public class ItemController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

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

            Optional<Item> resualt = this.itemRepository.findById(id);
            if(resualt.isPresent()){
                model.addAttribute("item", resualt.get());
                return "Item_detail";
            } else {
                return "redirect:/ItemShop/main";
            }
    }






}
