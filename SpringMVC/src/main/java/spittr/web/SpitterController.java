package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spittr.Spitter;
import spittr.data.SpitterRepository;

import javax.servlet.http.Part;
import javax.validation.Valid;
import java.io.IOException;

/**
 * Created by KL on 2016/5/8.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;
    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(
            @RequestPart("profilePicture") Part profilePicture,
            @Valid Spitter spitter,
            Errors errors,
            RedirectAttributes model) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        try {
            profilePicture.write("E:\\code\\Java\\spring_in_action_toy_code\\SpringMVC\\web\\resources\\images\\"
                                + profilePicture.getName() + ".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        spitterRepository.save(spitter);
//        return "redirect:/spitter/" + spitter.getUsername();
        model.addAttribute("username", spitter.getUsername());
        //because of the Model data will not survive a redirection, so use flashAttributes
        //actually it is stored in session and will be cleaned by spring till the next request
        model.addFlashAttribute(spitter);
        return "redirect:/spitter/{username}";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(
            @PathVariable String username, Model model) {
        if(!model.containsAttribute("spitter")){
            Spitter spitter = spitterRepository.findByUsername(username);
            model.addAttribute(spitter);
        }
        return "profile";
    }

}
