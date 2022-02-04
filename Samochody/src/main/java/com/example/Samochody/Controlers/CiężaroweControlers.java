package com.example.Samochody.Controlers;

import com.example.Samochody.Services.CiężaroweServices;
import com.example.Samochody.domain.Ciężarowe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CiężaroweControlers {

    @Autowired
    CiężaroweServices ciężaroweServices;


    @RequestMapping ("/ciężarowe")
    public String getCiężarowe(Model model){
        List<Ciężarowe> allCiężarowe = ciężaroweServices.getAllCiężarowe();
        model.addAttribute("ciężarowe",allCiężarowe);
        return "ciężarowe";
    }
    @RequestMapping("/newciężarowe")
    public String createCiężarowe(Model model){
        model.addAttribute("ciężarowe",new Ciężarowe());
        return "ciężaroweform";
    }
    @RequestMapping(value = "/ciężarowe", method = RequestMethod.POST)
    public String saveCiężarowe(Ciężarowe ciężarowe){
        ciężaroweServices.saveCiężarowe(ciężarowe);
        return "redirect: /ciężarowe";
    }
}
