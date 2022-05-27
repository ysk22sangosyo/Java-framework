package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.IndexForm;
import com.example.entity.Product;

@Controller
public class IndexController {
    // 入力画面
    @RequestMapping("/index")
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        // プルダウンの内容を作成
        // (実際はDaoを使ってDBから取得)
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "鉛筆", 50));
        productList.add(new Product(102, "消しゴム", 100));

        // プルダウンの内容をmodelにセット
        model.addAttribute("productList", productList);
        // 入力画面へ
        return "index";
    }

    // 結果画面
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@ModelAttribute("index") IndexForm form, Model model) {
        // 選択したidを取得
        int id = form.getId();

        // idを元に、productオブジェクトを作成
        // (実際は、DBから取得した値を使う)
        Product product = null;
        switch (id) {
        case 101:
            product = new Product(101, "鉛筆", 50);
            break;
        case 102:
            product = new Product(102, "消しゴム", 100);
            break;
        }

        // productオブジェクトをmodelにセット
        model.addAttribute("product", product);
        model.addAttribute("msg", form.getName() +"さんが下記の商品を選択しました" );
        // 結果画面へ
        return "result";
    }
  

}
