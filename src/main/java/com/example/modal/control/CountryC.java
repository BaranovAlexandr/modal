package com.example.modal.control;

import com.example.modal.models.Country;
import com.example.modal.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryC {

    private CountryRepo countryRepo;

    @Autowired
    public CountryC(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }


    @GetMapping("/")
    public String showPage(Model model){
        model.addAttribute("countries", countryRepo.findAll());
        return "index";
    }

    @PostMapping("/save")
    public String save(Country country){
        countryRepo.save(country);
        return "redirect:/";
    }

    @DeleteMapping("/delete")
    public String delete(Integer id){
        countryRepo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Country findOne(Integer id){
        return countryRepo.findById(id).get();
    }
}
