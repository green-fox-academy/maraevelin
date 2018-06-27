package com.greenfoxacademy.dependency.useful_utilities_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @Autowired
  StudentService studentService;

  @GetMapping("useful")
  public String showUseful(Model model) {
    model.addAttribute("color", "Colored Background");
    model.addAttribute("email", "Email Validator");
    model.addAttribute("caesar", "Caesar Encoder/Decoder");
    return "useful";
  }

  @GetMapping("useful/colored")
  public String showColored(Model model) {
    model.addAttribute("random", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("useful/email")
  public String validateEmail(@RequestParam(name = "email") String emailParameter, Model model) {
    model.addAttribute("emailAsParameter", emailParameter);
    model.addAttribute("validateEmail", utilityService.validateEmail(emailParameter));
    return "email";
  }

  @GetMapping("useful/enconding")
  public String encodeText(@RequestParam() Model model) {

    return "encoding";
  }

  @GetMapping("useful/encode")
  public String encodingPage(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("codedtext", utilityService.caesar(text, number));
    return "caesar";
  }

  @GetMapping("useful/decode")
  public String decodingPage(@RequestParam("text") String text, @RequestParam("number") int number, Model model) {
    model.addAttribute("codedtext", utilityService.caesar(text, -number));
    return "caesar";
  }

  @GetMapping("gfa")
  public String showStudents(Model model) {
    model.addAttribute("counter", studentService.count());
    return "gfa";
  }

  @GetMapping("gfa/list")
  public String showList(Model model) {
    model.addAttribute("students", studentService.findAll());
    return "list";
  }

  @GetMapping("gfa/add")
  public String addGreenFoxAcademyStudent() {
    return "add";
  }

  @GetMapping("gfa/save")
  public String saveToGreenFoxAcademyStudentList(@RequestParam ("name") String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }


}
