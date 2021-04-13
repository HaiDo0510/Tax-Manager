package org.o7planning.controller;

import org.o7planning.entity.TaxpayerEntity;
import org.o7planning.repository.TaxpayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaxpayerController {

    @Autowired
    private TaxpayerRepository taxpayerRepository;

    @GetMapping(value = "/getALLTaxpayer")
    public String getAllTaxpayer(Model model){
        List<TaxpayerEntity> taxpayerEntityList = taxpayerRepository.findAll();
        model.addAttribute("listTaxpayer",taxpayerEntityList);
        return "admin/list-taxpayer";
    }

//    public List<TaxpayerEntity> demo(){
//        List<TaxpayerEntity> taxpayerEntityList = taxpayerRepository.findAll();
//        return taxpayerEntityList;
//    }

//    public String demo1(){
//        if(taxpayerRepository.findAll().equals(null)){
//            return "null";
//        } else {
//            return "nonull";
//        }
//    }

//    public static void main(String[] args) {
//        TaxpayerController t = new TaxpayerController();
////        List<TaxpayerEntity> taxpayerEntityList = t.demo();
////        for(TaxpayerEntity i:taxpayerEntityList){
////            i.toString();
////        }
//        System.out.println(t.demo1());
//    }
}
