package Controller;

import Model.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private UserRepository personRepository;

    @GetMapping("/people")
    public String getAllPeople(Model model) {
        List<User> people = personRepository.findAll();
        model.addAttribute("people", people);
        return "people";
    }
}

