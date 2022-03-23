package uz.pdp.apteka_uz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.apteka_uz.dto.AptekaDto;
import uz.pdp.apteka_uz.dto.Response;
import uz.pdp.apteka_uz.entity.Apteka;
import uz.pdp.apteka_uz.service.AptekaService;

import java.util.List;

@Controller
@RequestMapping("/apteka")
public class AptekaController {

    final AptekaService aptekaServicel;

    public AptekaController(AptekaService aptekaServicel) {
        this.aptekaServicel = aptekaServicel;
    }

    @GetMapping("/add")
    public String aptekaPage(Model model){

        List<Apteka> aptekaList=aptekaServicel.getAll();
        model.addAttribute("aptekaList",aptekaList);
        return "addApteka";
    }


    @PostMapping("/add")
    public String saveApteka(@ModelAttribute AptekaDto aptekaDTO, Model model){
        Response response=aptekaServicel.save(aptekaDTO);
        model.addAttribute("message",response.getMessage());
        List<Apteka>aptekaList=aptekaServicel.getAll();
        model.addAttribute("aptekaList",aptekaList);
        return "addApteka";
    }
}
